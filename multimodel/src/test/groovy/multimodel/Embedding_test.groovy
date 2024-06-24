package multimodel;

import static org.junit.jupiter.api.Assertions.assertTrue
import static org.junit.jupiter.api.Assertions.assertFalse

import org.eclipse.emf.ecore.EPackage
import org.junit.jupiter.api.Test

import yamtl.core.YAMTLModule.ExecutionPhase
import yamtl.groovy.YAMTLGroovyExtensions

public class Embedding_test  {
	
	@Test
	public void testEmbedding() {
		def resSM = Embedding.preloadMetamodel("model-test/multimodel/CD.ecore")
		def pk = resSM.contents.get(0) as EPackage
		
		def embedding = new Embedding(pk)
		embedding.selectedExecutionPhases = ExecutionPhase.MATCH_ONLY
		
		embedding.loadInputModels(['model1': 'model-test/multimodel/cd_model1.xmi', 'model2': 'model-test/multimodel/cd_model2.xmi'])
		embedding.execute()
		
		assertTrue(embedding.inconsistencyList.isEmpty(), "model1 is an embedding of model2")
	}
	
	
	@Test
	public void testNonEmbedding() {
		def resSM = Embedding.preloadMetamodel("model-test/multimodel/CD.ecore")
		def pk = resSM.contents.get(0) as EPackage
		
		def embedding = new Embedding(pk)
		embedding.selectedExecutionPhases = ExecutionPhase.MATCH_ONLY
		YAMTLGroovyExtensions.init( embedding )
		embedding.loadInputModels(['model1': 'model-test/multimodel/cd_model2.xmi', 'model2': 'model-test/multimodel/cd_model1.xmi'])

		embedding.execute()

		assertFalse(embedding.inconsistencyList.isEmpty(), "model2 is not an embedding of model1")
	}
}
