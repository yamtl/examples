package cd2db

import java.sql.Timestamp
import yamtl.core.YAMTLModule.ExecutionMode
import yamtl.core.YAMTLModule.ExtentTypeModifier

class Runner_incr_delta1 {
	def public static void main(String[] args) {
		var String inputModelPath = '''src/main/java/cd2db/sourceModel.xmi'''
		
		val xform = new cd2db
		xform.extentTypeModifier = ExtentTypeModifier.LIST
		xform.executionMode = ExecutionMode.INCREMENTAL
		
		// PREPARE MODELS
		xform.loadInputModels(#{'cd' -> inputModelPath})
				
		// EXECUTE TRAFO 
		xform.execute()
		
		// DELTA PROPAGATION
		var String forwardDeltaPath
		var String deltaName
		var String outputModelPath
		
		deltaName = 'delta1'
		println('''PROCESSING «deltaName»''')
		forwardDeltaPath = '''src/main/java/cd2db/deltas/«deltaName».forward.xmi'''
		xform.loadDelta('cd', deltaName, forwardDeltaPath, new Timestamp(System.nanoTime()))
		xform.propagateDelta('cd', deltaName)
		outputModelPath = '''src/main/java/cd2db/output/targetModel.«deltaName».xmi'''
		xform.saveOutputModels(#{'db' -> outputModelPath})
		
		// PRINT STATS
		println(xform.toStringStats)
	}
}