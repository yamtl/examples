package kmehr2fhir

import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.util.FhirResourceFactoryImpl
import org.junit.jupiter.api.Test

import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage; 
import be.fgov.ehealth.standards.kmehr.schema.kmehr.util.KmehrResourceFactoryImpl
import yamtl.core.YAMTLModule

class KMEHR2FHIRTest extends YAMTLModule {
	final BASE_PATH = 'model'
	
	@Test
	def void testLoad() {
		
		
        def xform = new KMEHR2FHIR(KmehrPackage.eINSTANCE, FhirPackage.eINSTANCE)
		xform.registerResourceFactory("kmehr", new KmehrResourceFactoryImpl())
		xform.registerResourceFactory("fhir", new FhirResourceFactoryImpl())
        xform.loadInputModels(['in': BASE_PATH + '/sumehr_example.kmehr'])
        xform.execute()
        xform.saveOutputModels(['out': BASE_PATH + '/output.xmi'])
		
	}

}
