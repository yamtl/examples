package kmehr2fhir

import static yamtl.dsl.Helper.*
import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage
import org.hl7.emf.fhir.FHIRTypesEnum
import org.hl7.emf.fhir.String

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
//			rule('DocumentRoot')
//				.in('s', kmehrPk.DocumentRoot)
//				.out('t', fhirPk.DocumentRoot, {
//					//t.bundle = s.kmehrmessage.folder.find{f -> f.patient !== null}
//
//					def kmehrBundle = s.kmehrmessage.folder.find{f -> f.patient !== null} as Bundle
//					t.bundle = fetch(kmehrBundle)
//				}),
//			rule('Folder')
//				.in("s", kmehrPk.FolderType)
//				.filter({
//					s.patient !== null
//				})
//				.out("bt", fhirPk.BundleType, {
//					(bt as BundleType).value = BundleTypeEnum.DOCUMENT
//				})
//				.out("t", fhirPk.Bundle, {
//					t.type = bt
//
//					def inputElements = [s.transaction, s.patient] as EList 
//
//					inputElements.addAll(s.transaction.collect{tr -> tr.author})
//					
// 
//					inputElements.addAll(s.transaction.collect{tr -> tr.item.collect{i -> i.content.hcparty}.flatten()})
//					def sequence = [] as EList
//					inputElements.addAll(s.transaction.collect{tr -> tr.item.findAll{i -> i.content.medicinalproduct}.collect{i -> sequence.addAll(i.posology, i)}}.flatten());
//
//					inputElements.addAll(s.transaction
//						.collect{tr -> tr.item.cd.findAll{i -> i.value == "allergy" || i.value == "intolerance"}}.flatten());
//					  inputElements.addAll(s.transaction
//						.collect{tr -> tr.item.cd.findAll{i -> i.value == "active"}}.flatten());
//					  inputElements.addAll(s.transaction
//						.collect{tr -> tr.item.cd.findAll{i -> i.value == "vaccine"}}.flatten());
//					  inputElements.addAll(s.transaction
//						.collect{tr -> tr.item.cd.findAll{i -> i.value == "active"}}.flatten());
////					inputElements.collect{e -> this.BundleEntry(e)}.flatten();
////					inputElements.findAll{e -> e !== null}.flatten();
//					
//					//Need a fix for the fetch/equivalents() operation below
//					t.entry.addAll(inputElements //)						
//						.flatten()
//						.collect{i -> fetch(['CompositionBundleEntry', 'PatientBundleEntry', 'OrganizationBundleEntry', 'PractitionerBundleEntry', 'MedicationBundleEntry', 'PosologyBundleEntry', 'AllergyIntoleranceBundleEntry', 'ConditionBundleEntry', 'ImmunizationBundleEntry'])}.flatten()
//						.findAll{e -> e.isKindOf(fhirPk.BundleEntry)}
//						); 
//					
//				})
			
			rule('SumEHRTransaction')
				.in("f", kmehrPk.FolderType)
				.in("s", kmehrPk.TransactionType)
//				.filter {
//					(f as FolderType).transaction.contains(s) && s.cd.contains{cd -> cd.value = 'sumehr'}
//				}
				.out("cid", fhirPk.Id, {
					cid.value = s.id
				})
				.out("patRef", fhirPk.Reference, {
					def patientDetails = 'Patient/' + f.patient.id.value.toString()
					patRef.reference = FhirString(['obj': patientDetails]) as String
				})
				.out("cStatus", fhirPk.CompositionStatus, {
					if (s.iscomplete) {
						cStatus = s.isvalidated ? fhirPk.CompositionStatusEnum.final : fhirPk.CompositionStatusEnum.preliminary
					} else {
						cStatus = fhirPk.CompositionStatusEnum.partial
					}
				})
				.out("dateTime", fhirPk.DateTime, {
					dateTime.value = fhirPk.xmlTypeFactory.createDateTime(s.date.toXMLFormat() + 'T' + s.time.toXMLFormat())
				})
				.out("t", fhirPk.Composition, {
					t.id = cid
					t.identifier = [fhirPk.CompositionIdentifier(s)]
					t.type = fhirPk.CodeableConcept(fhirPk.CodingWithDisplay('http://loinc.org', '60591-5', 'Patient summary Document'))
					t.subject = [patRef]
					t.status = cStatus
					t.date = dateTime
					t.section = [
									fhirPk.MedicationSection(s),
									fhirPk.AllergyIntoleranceSection(s),
									fhirPk.ActiveProblemSection(s),
									fhirPk.ImmunizationSection(s),
									fhirPk.HistorySection(s)
					]
				})
				


		])
		
		helperStore([
				staticOperation('FhirString', { argsMap ->
			        //returns the argument 'obj'
					
					//fhirS = new String;
					
					//def fhirString = argsmap.obj as FHIRTypesEnum.STRING
					//def fhirString = argsMap.obj as String
					
					String fhirS;
					fhirS.value = argsMap.obj.name
					
			        return fhirS.toString()
			    }),
			])
	}
}
