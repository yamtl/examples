package flowchartToHtmlExamples
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.EPackage
import org.junit.jupiter.api.Test

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions
import yamtl.utils.EMFComparator

class BaseTest extends YAMTLModule {
    final BASE_PATH = 'model'

    @Test
    def void testBase() {
        // model transformation execution example
        def src_metamodel = YAMTLModule.loadMetamodel(BASE_PATH + '/flowchart.ecore') as EPackage
        def tgt_metamodel = YAMTLModule.loadMetamodel(BASE_PATH + '/html.ecore') as EPackage

        def xform = new Base(src_metamodel, tgt_metamodel)
		YAMTLGroovyExtensions.init(this)
        xform.loadInputModels(['in': BASE_PATH + '/wakeup.xmi'])
        xform.execute()
        xform.saveOutputModels(['out': BASE_PATH + '/baseOutput.xmi'])
		
		// test assertion
		def actualModel = xform.getOutputModel('out')
		EMFComparator comparator = new EMFComparator();
		xform.loadMetamodel(BASE_PATH + '/html.ecore', true)
		def expectedResource = xform.loadModel(BASE_PATH + '/baseExpectedOutput.xmi', false)
		assertTrue( comparator.equals(expectedResource.getContents(), actualModel.getContents()) );
    }
}