package cd2db

import yamtl.core.YAMTLModule.ExtentTypeModifier

class Runner {
	def public static void main(String[] args) {
		var String inputModelPath = '''src/main/java/cd2db/sourceModel.xmi'''
		
		val xform = new cd2db
		xform.stageUpperBound = 1
		xform.extentTypeModifier = ExtentTypeModifier.LIST

		// PREPARE MODELS
		xform.loadInputModels(#{'cd' -> inputModelPath})
		
		// EXECUTE TRAFO 
		xform.execute()
		
		// STORE MODELS
		var String outputModelPath = '''src/main/java/cd2db/targetInitial2.xmi'''
		xform.saveOutputModels(#{'db' -> outputModelPath})
		
		// PRINT STATS
		println(xform.toStringStats)
	}
}