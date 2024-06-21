package cd2db;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import Changes.ChangesPackage;
import Changes.ModelChangeSet;
import atl.research.class_.Class_Package;
import atl.research.relational_.Relational_Package;
import yamtl.core.YAMTLModule;
import yamtl.utils.EMFComparator;


public class CD2DB_ttc23_tests {
    private ResourceSet resourceSet;
    // Register source, change, and target metamodels in global registry
    private final ChangesPackage CH = ChangesPackage.eINSTANCE;
    private final Class_Package CD = Class_Package.eINSTANCE;
    private final Relational_Package DB = Relational_Package.eINSTANCE;

    @BeforeEach
    public void setup() {
        resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                "xmi",
                new XMIResourceFactoryImpl()
        );
    }

    private void applyChanges(Resource changes) {
        if (changes.getContents().size() > 0) {
            ModelChangeSet change = (ModelChangeSet) changes.getContents().get(0);
            change.getChanges().forEach(c -> {
                System.out.println("Applying change " + c);
                c.apply();
            });
        }
    }

    private static Stream<Arguments> provideTestArguments() {
        return Stream.of(
            IntStream.rangeClosed(1, 13).boxed()
                    .flatMap(i -> Stream.of(
                            Arguments.of("correctness" + i, false),
                            Arguments.of("correctness" + i, true)
                    ))
                    .toArray(Arguments[]::new)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestArguments")
    public void runTest(String testName, boolean incrementalMode) {
        String inputModelPath = "src/main/resources/models/" + testName + "/class.xmi";
        String changeModelPath = "src/main/resources/models/" + testName + "/change.xmi";
        String expectedModelPath = "src/main/resources/models/" + testName + "/expected1.xmi";
        
        if (testName.equals("correctness2") || testName.equals("correctness11")) {
            expectedModelPath = "src/main/resources/models/" + testName + "/expected2.xmi";
        }

        String outputBatchModelPath = "src/main/resources/models/" + testName + "/outputBatch.xmi";
        String outputIncrModelPath = "src/main/resources/models/" + testName + "/outputIncr.xmi";

        Resource source = resourceSet.getResource(URI.createFileURI(new File(inputModelPath).getAbsolutePath()), true);
        Resource changes = resourceSet.getResource(URI.createFileURI(new File(changeModelPath).getAbsolutePath()), true);
        EcoreUtil.resolveAll(resourceSet);

        CD2DB_ttc23 xform = new CD2DB_ttc23();
        xform.setEnableCorrectnessCheck(false);

        if (incrementalMode) {
            xform.adviseWithinThisNamespaceExpressions(List.of("atl.research.class_..*"));
            xform.setExecutionMode(YAMTLModule.ExecutionMode.INCREMENTAL);
        } else {
            applyChanges(changes);
        }

        xform.loadInputResources(Map.of("cd", source));
        xform.execute();

        if (incrementalMode) {
            xform.adaptInputModel("cd");
            applyChanges(changes);
            xform.propagateDelta("cd");
            xform.saveOutputModels(Map.of("db", outputIncrModelPath), List.of("Table", "Type"));
        } else {
            xform.saveOutputModels(Map.of("db", outputBatchModelPath), List.of("Table", "Type"));
        }

        Resource actualModel = ((YAMTLModule) xform).getModelResource("db");
        EMFComparator comparator = new EMFComparator();
        Resource expectedRes = xform.loadModel(expectedModelPath, false);
        boolean assertionResult = comparator.equals(expectedRes.getContents(), actualModel.getContents());
        assertTrue(assertionResult);
    }
}
