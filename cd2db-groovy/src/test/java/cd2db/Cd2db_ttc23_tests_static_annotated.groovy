package cd2db

import static org.junit.jupiter.api.Assertions.assertTrue

import java.util.stream.Stream

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

import Changes.ChangesPackage
import Changes.ModelChangeSet
import atl.research.class_.Class_Package
import atl.research.relational_.Relational_Package
import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions
import yamtl.utils.EMFComparator

class Cd2db_ttc23_tests_static_annotated {
	ResourceSet resourceSet;
	// Register source, change, and target metamodels in global registry
	def CH = ChangesPackage.eINSTANCE
	def CD = Class_Package.eINSTANCE
	def DB = Relational_Package.eINSTANCE
	
	
	@BeforeEach
	void setup() {
		resourceSet = new ResourceSetImpl()
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				'xmi',
				new XMIResourceFactoryImpl()
		)
	}
	
	def applyChanges(Resource changes) {
		if (changes.contents.size() > 0) {
			def change = changes.contents.get(0) as ModelChangeSet
			change.changes.each { c ->
				println("Applying change $c")
				c.apply()
			}
		}
	}
		
	private static Stream<Arguments> provideTestArguments() {
	    return (1..13).collect { i ->
	        [
	            Arguments.of("correctness${i}" as String, false),
	            Arguments.of("correctness${i}" as String, true)
	        ]
	    }.flatten().stream()
	}
	
	@ParameterizedTest
	@MethodSource("provideTestArguments")
	void runTest(String testName, boolean incrementalMode) {
		def inputModelPath = "src/main/resources/models/${testName}/class.xmi"
		def changeModelPath = "src/main/resources/models/${testName}/change.xmi"
		
		def expectedModelPath = "src/main/resources/models/${testName}/expected1.xmi"
		if (testName == 'correctness2' || testName == 'correctness11')
			expectedModelPath = "src/main/resources/models/${testName}/expected2.xmi"
			
		def outputBatchModelPath = "src/main/resources/models/${testName}/outputBatch.xmi"
		def outputIncrModelPath = "src/main/resources/models/${testName}/outputIncr.xmi"
		
		def source = resourceSet.getResource(URI.createFileURI(new File(inputModelPath).getAbsolutePath()), true)
		def changes = resourceSet.getResource(URI.createFileURI(new File(changeModelPath).getAbsolutePath()), true)
		EcoreUtil.resolveAll(resourceSet)
	
		def xform = new CD2DB_static_annotated()
		xform.setEnableCorrectnessCheck(false)
		
		if (incrementalMode) {
			xform.adviseWithinThisNamespaceExpressions(['atl.research.class_..*'])
			xform.setExecutionMode(YAMTLModule.ExecutionMode.INCREMENTAL)
		} else {
			applyChanges(changes)	
		}
		
		xform.loadInputResources(['cd': source])
		xform.execute()
		
		if (incrementalMode) {
			xform.adaptInputModel('cd')
			applyChanges(changes)
			xform.propagateDelta('cd')
			xform.saveOutputModels(['db': outputIncrModelPath as String], ['Table', 'Type'])
		} else {
			xform.saveOutputModels(['db': outputBatchModelPath as String], ['Table', 'Type'])
		}
		
		def actualModel = (xform as YAMTLModule).getModelResource('db')
		EMFComparator comparator = new EMFComparator()
		def expectedRes = xform.loadModel(expectedModelPath, false)
		def assertionResult =  comparator.equals(expectedRes.getContents(), actualModel.getContents())
		assertTrue(assertionResult);
	}
	
}
