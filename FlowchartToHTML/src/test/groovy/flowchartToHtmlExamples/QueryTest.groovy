package flowchartToHtmlExamples

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.junit.jupiter.api.Test

import flowchartToHtmlExamples.MultipleTargets
import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF
import yamtl.utils.EMFComparator

class QueryTest extends YAMTLModule {

	final BASE_PATH = 'model'

	@Test
	def void testQuery() {
		// model transformation execution example
		def mm = YAMTLModule.loadMetamodel(BASE_PATH + '/flowchart.ecore') as EPackage
		def query = new Query(mm)
		query.selectedExecutionPhases = ExecutionPhase.MATCH_ONLY
		query.loadInputModels(['in': BASE_PATH + '/wakeup.xmi'])
		query.execute()
	}
}
