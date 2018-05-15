package cps2dep

import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.CyberPhysicalSystem
import org.eclipse.viatra.examples.cps.traceability.TraceabilityFactory
import yamtl.core.YAMTLModule.ExtentTypeModifier

class Runner {
	def public static void main(String[] args) {
		var String inputModelPath = '''src/main/resources/cps2dep/input/clientServer_000001.cyberphysicalsystem.xmi'''
		
		val xform = new Cps2DepYAMTL
		xform.stageUpperBound = 1
		xform.extentTypeModifier = ExtentTypeModifier.LIST

		// PREPARE MODELS
		xform.loadInputModels(#{'cps' -> inputModelPath})
		
		val cpsRes = xform.getModelResource('cps')
		xform.mapping = TraceabilityFactory.eINSTANCE.createCPSToDeployment => [
			it.cps = cpsRes.contents.head as CyberPhysicalSystem
		]
		
		// EXECUTE TRAFO AND EXTRACT TRACEABILITY MODEL
		xform.execute()
		xform.getTraceModel()
		
		// STORE MODELS
		var String outputModelPath = '''src/main/resources/cps2dep/output/clientServer_000001.deployment.xmi'''
		xform.saveOutputModels(#{'dep' -> outputModelPath})
		
		var String outputTraceModelPath = '''src/main/resources/cps2dep/output/clientServer_000001.traceability.xmi'''
		xform.saveTraceModel(outputTraceModelPath)
		
		// PRINT STATS
		println(xform.toStringStats)
	}
}