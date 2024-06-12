package cd2db;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.Test;

import Changes.ChangesPackage;
import Changes.ModelChange;
import Changes.ModelChangeSet;
import atl.research.class_.Class_Package;
import atl.research.relational_.Relational_Package;
import yamtl.core.YAMTLModule;
import yamtl.utils.EMFComparator;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ttc23_tests {
	
	public void assertModelCorrectness(YAMTLModule xform, String outDomain, String expectedPath) {
		EMFComparator comparator = new EMFComparator();
		// Load the expected model using the identical output metamodel from the transformation.
		// Essentially, use the same in-memory metamodel.
		
		var expectedRes = xform.loadModel(expectedPath, false);
		
		var actualModel = xform.getModelResource(outDomain);
		var assertionResult =  comparator.equals(expectedRes.getContents(), actualModel.getContents());
		assertTrue(assertionResult);
	}
	
    @Test
	public void ttc23_tests() {
		String inputModelPath = "models/correctness5/class.xmi";
		String changePath = "models/correctness5/change.xmi";
		String expected = "models/correctness5/expected3.xmi";
		
		
	    ResourceSet resourceSet = new ResourceSetImpl();
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
	            "xmi",
	            new XMIResourceFactoryImpl()
	    );
	
	    // Register source, change and target metamodels in global registry
	    EPackage e;
	    e = Class_Package.eINSTANCE;
	    e = Relational_Package.eINSTANCE;
	    e = ChangesPackage.eINSTANCE;
	
	    var source = resourceSet.getResource(URI.createFileURI(inputModelPath), true);
	    var changes = resourceSet.getResource(URI.createFileURI(changePath), true);
	    EcoreUtil.resolveAll(resourceSet);
	
	
	    CD2DB xform = new CD2DB();
	    xform.adviseWithinThisNamespaceExpressions(List.of("atl.research.class_..*"));
	    xform.setExecutionMode(YAMTLModule.ExecutionMode.INCREMENTAL);
	
	    xform.loadInputResources(Map.of("cd", source));
	    xform.execute();
	
	    
	    xform.saveOutputModels(Map.of("db", "./out_after_batch.xmi"), List.of("Table", "Type"));
	
	    assertModelCorrectness(xform, "db", expected);
	    

//	    xform.adaptInputModel("cd");
//	
//	    if (changes.getContents().size() > 0) {
//	        ModelChangeSet change = (ModelChangeSet) changes.getContents().get(0);
//	        for (ModelChange c : change.getChanges()) {
//	            System.out.println("Applying change " + c);
//	            c.apply();
//	        }
//	    }
//	
//	    xform.propagateDelta("cd");
//	
//	    xform.saveOutputModels(Map.of("db", "out_after_prop.xmi"), List.of("Table", "Type"));
	}
}

