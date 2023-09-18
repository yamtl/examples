package kmehr2fhir

import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF

class KMEHR2FHIR extends YAMTLModule {
	public KMEHR2FHIR(EPackage kmehrPk, EPackage fhirPk) {
		/*
		 *  adds EMF extensions to interpret 
		 *  - getters/setters of an EObject: t.name instead of t.getName()
		 *  - reference to classifiers inside an EPackage: llPk.Node instead of llPk.getEClassifier('Node')
		 */
		YAMTLGroovyExtensions_dynamicEMF.init(this)

		/*
		 * declares in, out, inOut parameters for a model transformation		
		 */
		header().in('in', kmehrPk).out('out', fhirPk)
		
		/*
		 * rule declaration
		 */
		ruleStore([
			rule('DocumentRoot')
				.in('s', kmehrPk.DocumentRoot)
				.out('t', fhirPk.DocumentRoot, {
					t.bundle = s.kmehrmessage.folder.find(f | f.patient.isDefined())
				}),
			rule('Folder')
				.in("s", kmehrPk.FolderType)
				.filter({
					s.patient.isDefined()
				})
				.out("bt", fhirPk.BundleType, {
					bt.value = fhirPk.BundleTypeEnum.document
				})
				.out("t", fhirPk.Bundle, {
					t.type = bt
					
					def inputElements = [s.transaction, s.patient]
					
					inputElements.addAll(s.transaction.collect(tr | tr.txAuthor()))
					
					inputElemenets.addAll(s.transaction.collect(tr, tr.item.collect(i | i.hcpartyContent())))
					
					def sequence = []
					inputElements.addAll(s.transaction.collect(tr | tr.item.select(i | i.isMedication()).collect(i | sequence.addAll(i.posology, i))));
					
					inputElements.addAll(s.transaction
						.collect(tr | tr.item.select(i | i.isAllergy() || i.isIntolerance())));
					  inputElements.addAll(s.transaction
						.collect(tr | tr.item.select(i | i.isActiveProblem())));
					  inputElements.addAll(s.transaction
						.collect(tr | tr.item.select(i | i.isVaccine())));
					  inputElements.addAll(s.transaction
						.collect(tr | tr.item.select(i | i.isInactiveProblem())));
					
					t.entry.addAll(inputElements
						.flatten()
						.collect(i | i.equivalents('CompositionBundleEntry', 'PatientBundleEntry', 'OrganizationBundleEntry', 'PractitionerBundleEntry', 'MedicationBundleEntry', 'PosologyBundleEntry', 'AllergyIntoleranceBundleEntry', 'ConditionBundleEntry', 'ImmunizationBundleEntry')).flatten()
						.select(e | e.isKindOf(fhirPk.BundleEntry)));
				})
				
				
		])
	}
}
