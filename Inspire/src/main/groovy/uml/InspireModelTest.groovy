package uml;

import static yamtl.dsl.Rule.*

import org.eclipse.uml2.uml.UMLPackage

import yamtl.core.YAMTLModule;
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF

public class InspireModelTest extends YAMTLModule {
	def UML = UMLPackage.eINSTANCE;
	public InspireModelTest() {
		YAMTLGroovyExtensions_dynamicEMF.init(this)
		header().in("in", UMLPackage.eINSTANCE).out("out", UMLPackage.eINSTANCE)
		ruleStore([
            rule('Transition')
                .in('c', UML.property)
                .query()
				.endWith{
					println("processed: ${c.name} : ${c.type?.name}")
				}
        ])
	}
	
	public static void main(String[] args) {
		def xform = new InspireModelTest()
		
		/* 
		 * Model taken from https://inspire.ec.europa.eu/portfolio/data-models:
		 *
		 * Distribution that contains only those data models that are contained in the amendment to the 
		 * Implementing Rules for Annex II+III themes, including the updates of the Annex I data themes.
		 * 
		 * I had to change the namespace of UML2 in order for the UML2 classifiers to match those used
		 * in the model. There are elements that cannot be parsed, possibly due to the way the model was
		 * exported. For example:
		 * - some properties cannot be parsed
		 * - there are values for integers that are given as strings, like value="dimension"
		 * 
		 * For now, ignore those errors as warnings and work with those elements that are parsed.
		 * 
		 */
		
		xform.loadInputModels(["in":"./model/INSPIRE_Consolidated_UML_Model_ANNEX I-II-III-Only_IR_2023.2.uml"])
		def res = xform.getModelResource("in")
		xform.selectedExecutionPhases = ExecutionPhase.MATCH_ONLY
		xform.execute()
	}
}
