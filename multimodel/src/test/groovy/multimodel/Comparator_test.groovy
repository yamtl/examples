package multimodel;

import org.eclipse.emf.ecore.EPackage
import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.assertTrue

import yamtl.core.YAMTLModule;
import yamtl.groovy.YAMTLGroovyExtensions
import yamtl.utils.EMFComparator

public class Comparator_test extends YAMTLModule {
	
	@Test
	public void test_comparator() {
		def resSM = Comparator.preloadMetamodel("model-test/multimodel/CD.ecore")
		def pk = resSM.contents.get(0) as EPackage
		
		def embedding = new Comparator(pk)
		YAMTLGroovyExtensions.init( embedding )
		
		embedding.loadInputModels(['model1': 'model-test/multimodel/cd_model1.xmi', 'model2': 'model-test/multimodel/cd_model2.xmi'])
		
		embedding.execute()
		
		embedding.saveOutputModels(['out': 'model-test/multimodel/cd_output.xmi'])
		
		def actualModel = embedding.getOutputModel('out')
		
		EMFComparator comparator = new EMFComparator();
		def expectedRes = embedding.loadModel('model-test/multimodel/cd_expected.xmi', false)
		def assertionResult =  comparator.equals(expectedRes.getContents(), actualModel.getContents())
		assertTrue(assertionResult);
	}
}
