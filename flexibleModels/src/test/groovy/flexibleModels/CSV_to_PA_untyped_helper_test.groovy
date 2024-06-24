package flexibleModels;

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.assertTrue

import yamtl.groovy.YAMTLGroovyExtensions
import yamtl.utils.EMFComparator

class CSV_to_PA_untyped_helper_test {
	
	@Test
	public void test_CSV_to_PA_untyped_helper_test() {
		
		def BASE_PATH = "models/physicalActivity"
		def FILE_NAME = "dataset_2"
		
		def inputPath = "${BASE_PATH}/${FILE_NAME}.csv" as String
		def xform = new CSV_to_PA_untyped_helper()
		
		// PREPARE MODELS
		// Parses a CSV file and stores it as a runtime model in the YAMTL registry
		xform.loadInputModels(['csv': inputPath])
		
		// EXECUTE TRAFO 
		xform.execute()
		
		// STORE MODELS
		String outputModelPath = "src/main/groovy/flexibleModels/output_${FILE_NAME}.xmi"
		xform.saveOutputModels(['pa': outputModelPath])
		
		// PRINT STATS
		println(xform.toStringStats())
		
//		// GENERATE BOILERPLATE CODE
//		// println(xform.generateBoilerplateCode())
		
		def actualModel = xform.getOutputModel('pa')
		
		EMFComparator comparator = new EMFComparator();
		def expectedRes = xform.loadModel('src/main/groovy/flexibleModels/untyped_expected_2.xmi', false)
		def assertionResult =  comparator.equals(expectedRes.getContents(), actualModel.getContents())
		assertTrue(assertionResult);
	}
}
