package flowchartToHtmlExamples

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.junit.jupiter.api.Test
import java.lang.Integer

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions
import yamtl.utils.EMFComparator

class QueryTest extends YAMTLModule {

	final BASE_PATH = 'model'

	@Test
	def void testQuery() {
		// model transformation execution
		def srcRes = YAMTLModule.preloadMetamodel(BASE_PATH + '/flowchart.ecore')

		def xform = new Query(srcRes.contents[0])
		xform.selectedExecutionPhases = ExecutionPhase.MATCH_ONLY
		xform.loadInputModels(['in': BASE_PATH + '/wakeup.xmi'])
		xform.execute()
		
		// test assertion
		def transitionsProcessed = xform.count
		EMFComparator comparator = new EMFComparator();
		// Load the expected model using the identical output metamodel from the transformation.
		// Essentially, use the same in-memory metamodel.
		//xform.loadMetamodelResource(tgtRes)
		int expectedTransitions = 5
		def resultCheck =  Integer.compare(expectedTransitions, transitionsProcessed)		
		def assertionResult = (resultCheck == 0)? true:false
		assertTrue(assertionResult);
	}
}
