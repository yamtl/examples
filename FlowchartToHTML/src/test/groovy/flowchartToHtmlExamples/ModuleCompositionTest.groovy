package flowchartToHtmlExamples
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.junit.jupiter.api.Test

import flowchartToHtmlExamples.LazyExample
import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF
import yamtl.utils.EMFComparator

class ModuleCompositionTest extends YAMTLModule {
	final BASE_PATH = 'model'

	@Test
	def void testModuleComposition() {
		// model transformation execution example
		def sRes = YAMTLModule.preloadMetamodel(BASE_PATH + '/flowchart.ecore') as EPackage
		def tRes = YAMTLModule.preloadMetamodel(BASE_PATH + '/html.ecore') as EPackage

		def xform = new ModuleComposition(sRes.contents[0], tRes.contents[0])
		xform.loadInputModels(['in': BASE_PATH + '/wakeup_with_subflow.xmi'])
		xform.execute()
		xform.saveOutputModels(['out': BASE_PATH + '/moduleCompositionOutput.xmi'])
	}
}
