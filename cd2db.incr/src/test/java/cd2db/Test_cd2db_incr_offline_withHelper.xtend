package cd2db

import java.sql.Timestamp
import java.util.List
import yamtl.core.YAMTLModule.ExecutionMode
import yamtl.core.YAMTLModule.IncrementalGranularity
import yamtl.utils.EMFComparator

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.assertTrue

class Test_cd2db_incr_offline_withHelper {
	@Test
	def void testDelta1() {
		var String inputModelPath = '''src/main/java/cd2db/sourceModel.xmi'''
				
		// TODO: delta2 is not loading correctly probably due to the reference to the source model
		for (deltaName: #['delta1', 'delta3', 'delta4', 'delta5', 'delta6']) {
			// DELTA PROPAGATION
			var String forwardDeltaPath
			var String outputModelPath
	
			val xform = new cd2db_attribute_helper()
			xform.adviseWithinThisNamespaceExpressions(List.of("CD.impl.*"));
			xform.executionMode = ExecutionMode.INCREMENTAL
			
			// PREPARE MODELS
			xform.loadInputModels(#{'cd' -> inputModelPath})
					
			// EXECUTE TRAFO 
			xform.execute()
			
			println('''PROCESSING «deltaName»''')
			forwardDeltaPath = '''src/main/java/cd2db/deltas/«deltaName».forward.xmi'''
			xform.loadDelta('cd', deltaName, forwardDeltaPath)
			xform.applyAndPropagateDelta('cd', deltaName)
	
	
			outputModelPath = '''src/main/java/cd2db/output/targetModel.«deltaName».output.xmi'''
			xform.saveOutputModels(#{'db' -> outputModelPath})
	
			val actualRes = xform.getOutputModel('db')
			val expectedRes = xform.loadModel('''src/main/java/cd2db/output/targetModel.«deltaName».expected.xmi''', true)
			val comparator = new EMFComparator()
			assertTrue(comparator.equals(expectedRes.contents, actualRes.contents))

		}
			
	}
}