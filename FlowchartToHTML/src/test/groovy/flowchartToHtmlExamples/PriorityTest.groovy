package flowchartToHtmlExamples

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.junit.jupiter.api.Test

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions
import yamtl.utils.EMFComparator

class PriorityTest extends YAMTLModule {

	final BASE_PATH = 'model'

	@Test
	def void testPriorityTest() {
		// model transformation execution
		def srcRes = YAMTLModule.preloadMetamodel(BASE_PATH + '/flowchart.ecore')
		def tgtRes = YAMTLModule.preloadMetamodel(BASE_PATH + '/html.ecore')

		def xform = new Priority(srcRes.contents[0], tgtRes.contents[0])
		xform.loadInputModels(['in': BASE_PATH + '/wakeup.xmi'])
		xform.execute()
		xform.saveOutputModels(['out': BASE_PATH + '/priorityOutput.xmi'])
		
		// test assertion
		def actualModel = xform.getOutputModel('out')
		EMFComparator comparator = new EMFComparator();
		// Load the expected model using the identical output metamodel from the transformation.
		// Essentially, use the same in-memory metamodel.
		xform.loadMetamodelResource(tgtRes)
		def expectedResource = xform.loadModel(BASE_PATH + '/priorityExpectedOutput.xmi', false)
		def assertionResult =  comparator.equals(expectedResource.getContents(), actualModel.getContents())
		assertTrue(assertionResult);
	}
}
