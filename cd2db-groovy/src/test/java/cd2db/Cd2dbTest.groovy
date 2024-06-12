package cd2db

import static org.junit.jupiter.api.Assertions.assertTrue

import org.eclipse.emf.ecore.EPackage
import org.junit.jupiter.api.Test

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions
import yamtl.utils.EMFComparator

class Cd2dbTest {
    @Test
    void test_CD2DB_simple() {
        String inputModelPath = 'src/main/java/cd2db/sourceModel.xmi'

		def cdRes = YAMTLModule.preloadMetamodel('src/main/resources/metamodels/CD.emf')
		def relRes = YAMTLModule.preloadMetamodel('src/main/resources/metamodels/Relational.emf')
        def xform = new CD2DB_simple(cdRes.contents[0] as EPackage, relRes.contents[0] as EPackage)
		YAMTLGroovyExtensions.init(xform)
		
		
		
        // PREPARE MODELS
        xform.loadInputModels(['cd': inputModelPath])

        // EXECUTE TRAFO
        xform.execute()

        // STORE MODELS
        String outputModelPath = 'src/main/java/cd2db/targetInitial.xmi'
		def actualModel = xform.getOutputModel('db')

		EMFComparator comparator = new EMFComparator();
		// Load the expected model using the identical output metamodel from the transformation.
		// Essentially, use the same in-memory metamodel.
		xform.loadMetamodelResource(relRes)
		def expectedRes = xform.loadModel('src/main/java/cd2db/targetInitial_expected.xmi', false)
		def assertionResult =  comparator.equals(expectedRes.getContents(), actualModel.getContents())
		assertTrue(assertionResult);
    }
}
