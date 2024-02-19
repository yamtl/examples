package ecore_subtyping_compare;

import java.util.Map;

import org.eclipse.emf.ecore.EcorePackage;

import subtyping.EMFSubtyping;
import yamtl.core.YAMTLModule;

public class EMFSubtyping_EcoreCompare_1_0_0_vs_1_0_2 extends YAMTLModule {
	
	public EMFSubtyping_EcoreCompare_1_0_0_vs_1_0_2() {
		header().in("in",EcorePackage.eINSTANCE);
	}
    
	public static void main(String...args) {
		var modelName1 = "model1";
		var modelName1_filePath = "./model/containers.ecore";
		var modelName2 = "model2";
		var modelName2_filePath = "./model/containers_1_0_2.ecore";
		var COMPLEMENT_PATH = "./_supertype_uncovered.ecore";
		
		var ecoreSubtyping = new EMFSubtyping();
		ecoreSubtyping.multipleInheritance = false;
		ecoreSubtyping.loadModels(Map.of(modelName1, modelName1_filePath, modelName2, modelName2_filePath));
		
		println("INFO: empty classes in the complement meatmodel are ignored as they do not contribute information.");
		
		var matches = ecoreSubtyping.isSubtypeOf("model2", null, "model1", null);
		if (!matches) {						
			println("Elements in model1 that are not in model2:");
			EMFSubtyping_EcoreCompare_1_0_0_vs_1_0_2 countEngine = new EMFSubtyping_EcoreCompare_1_0_0_vs_1_0_2();
			countEngine.selectedExecutionPhases = ExecutionPhase.HELPER_ONLY;
			countEngine.loadInputModels(Map.of("in", COMPLEMENT_PATH));
			countEngine.execute();
			println("classes:\t" + countEngine.allInstances(EcorePackage.eINSTANCE.getEClass()).size());
			println("attributes:\t" + countEngine.allInstances(EcorePackage.eINSTANCE.getEAttribute()).size());
			println("references:\t" + countEngine.allInstances(EcorePackage.eINSTANCE.getEReference()).size());
		}
		
		matches = ecoreSubtyping.isSubtypeOf("model1", null, "model2", null);
		if (!matches) {						
			println("Elements in model2 that are not in model1:");
			EMFSubtyping_EcoreCompare_1_0_0_vs_1_0_2 countEngine = new EMFSubtyping_EcoreCompare_1_0_0_vs_1_0_2();
			countEngine.selectedExecutionPhases = ExecutionPhase.HELPER_ONLY;
			countEngine.loadInputModels(Map.of("in", COMPLEMENT_PATH));
			countEngine.execute();
			println("classes:\t" + countEngine.allInstances(EcorePackage.eINSTANCE.getEClass()).size());
			println("attributes:\t" + countEngine.allInstances(EcorePackage.eINSTANCE.getEAttribute()).size());
			println("references:\t" + countEngine.allInstances(EcorePackage.eINSTANCE.getEReference()).size());
		}
		
		
	}
	
	private static void println(Object text) {
		System.out.println(text);
	}
	
}
