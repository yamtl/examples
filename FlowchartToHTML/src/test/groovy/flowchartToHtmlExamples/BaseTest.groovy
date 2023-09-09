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
        def srcRes = YAMTLModule.preloadMetamodel(BASE_PATH + '/flowchart.ecore') 
        def tgtRes = YAMTLModule.preloadMetamodel(BASE_PATH + '/html.ecore') 

        def xform = new Base(srcRes.contents[0], tgtRes.contents[0])
		YAMTLGroovyExtensions.init(this)
        xform.loadInputModels(['in': BASE_PATH + '/wakeup.xmi'])
        xform.execute()
        xform.saveOutputModels(['out': BASE_PATH + '/baseOutput.xmi'])
		
		// test assertion
		def actualModel = xform.getOutputModel('out') 
		EMFComparator comparator = new EMFComparator()
		// Load the expected model using the identical output metamodel from the transformation.
		// Essentially, use the same in-memory metamodel.
		xform.loadMetamodelResource(tgtRes) 
		def expectedResource = xform.loadModel(BASE_PATH + '/baseExpectedOutput.xmi', false)
		def assertionResult =  comparator.equals(expectedResource.getContents(), actualModel.getContents()) 
		assertTrue(assertionResult);
    }
}