package flowchartToHtmlExamples

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThrows;

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

class TransientNonUniqueTest extends YAMTLModule {

    final BASE_PATH = 'model'

	@Test
	def void testTransient() {
		// model transformation execution
		def srcRes = YAMTLModule.preloadMetamodel(BASE_PATH + '/flowchart.ecore')
		def tgtRes = YAMTLModule.preloadMetamodel(BASE_PATH + '/html.ecore')

		def xform = new TransientNonUnique(srcRes.contents[0], tgtRes.contents[0])
		xform.loadInputModels(['in': BASE_PATH + '/wakeup.xmi'])
		
		def exception = assertThrows(RuntimeException) {
			xform.execute()
		}
		assertTrue(exception.message.contains("enables at least two different rules"))
	}
}
