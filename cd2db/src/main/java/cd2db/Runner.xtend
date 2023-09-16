package cd2db

class Runner {
	def public static void main(String[] args) {
		var String inputModelPath = '''src/main/java/cd2db/sourceModel.xmi'''
		
		val xform = new cd2db

		// PREPARE MODELS
		xform.loadInputModels(#{'cd' -> inputModelPath})
		
		// EXECUTE TRAFO 
		xform.execute()
		
		// STORE MODELS
		var String outputModelPath = '''src/main/java/cd2db/targetInitial.xmi'''
		xform.saveOutputModels(#{'db' -> outputModelPath})
		
		// PRINT STATS
		println(xform.toStringStats)
	}
}