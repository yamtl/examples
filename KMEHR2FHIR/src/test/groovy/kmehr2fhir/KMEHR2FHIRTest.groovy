package kmehr2fhir

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.junit.jupiter.api.Test

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF
import yamtl.utils.EMFComparator

//Check out dependencies in build.gradle for a possible fix
import org.hl7.emf.fhir.FhirPackage;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.DocumentRoot;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage; 

class KMEHR2FHIRTest extends YAMTLModule {
	final BASE_PATH = 'model'
	
	@Test
	def void testLinkedList() {
		
		
		//The following code should be fixed so that it loads the metamodels from the imported packages instead of local location
		def src_metamodel = YAMTLModule.loadMetamodel(BASE_PATH + '/flowchart.ecore') as EPackage
        def tgt_metamodel = YAMTLModule.loadMetamodel(BASE_PATH + '/html.ecore') as EPackage

        def xform = new KMEHR2FHIR(src_metamodel, tgt_metamodel)
//        xform.loadInputModels(['in': BASE_PATH + '/wakeup.xmi'])
//        xform.execute()
//        xform.saveOutputModels(['out': BASE_PATH + '/baseOutput.xmi'])
		
	}

}
