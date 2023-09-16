package cd2db

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.assertTrue

import yamtl.utils.EMFComparator

class Cd2dbTest {
	@Test
	def void testCD2DB() {
		var String inputModelPath = '''src/main/java/cd2db/sourceModel.xmi'''
		
		val xform = new cd2db

		// PREPARE MODELS
		xform.loadInputModels(#{'cd' -> inputModelPath})
		
		// EXECUTE TRAFO 
		xform.execute()
		
		// STORE MODELS
		var String outputModelPath = '''src/main/java/cd2db/targetInitial.xmi'''
		val actualRes = xform.getOutputModel('db')
		
		
		val expectedRes = xform.loadModel('''src/main/java/cd2db/targetInitial_expected.xmi''', true)
		
		val comparator = new EMFComparator()
		assertTrue(comparator.equals(expectedRes.contents, actualRes.contents))
	}
}