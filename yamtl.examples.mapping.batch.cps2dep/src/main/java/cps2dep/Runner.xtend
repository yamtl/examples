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
		// prepare models
		// this will normally be outside the trafo declaration
		xform.loadInputModels(#{'cps' -> inputModelPath})
		
		val cpsRes = xform.getModelResource('cps')
		xform.mapping = TraceabilityFactory.eINSTANCE.createCPSToDeployment => [
			it.cps = cpsRes.contents.head as CyberPhysicalSystem
		]
		
		xform.execute()
		xform.getTraceModel()
		
		var String outputModelPath = '''src/main/resources/cps2dep/output/clientServer_000001.deployment.xmi'''
		xform.saveOutputModels(#{'dep' -> outputModelPath})
		
		var String outputTraceModelPath = '''src/main/resources/cps2dep/output/clientServer_000001.traceability.xmi'''
		println("save traceability: " + outputTraceModelPath)
		xform.saveTraceModel(outputTraceModelPath)
	}
}