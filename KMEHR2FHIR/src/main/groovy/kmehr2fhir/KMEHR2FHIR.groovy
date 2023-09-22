package kmehr2fhir

import org.eclipse.emf.ecore.EPackage
import org.hl7.emf.fhir.BundleType
import org.hl7.emf.fhir.BundleTypeEnum

import static yamtl.dsl.Rule.*
import static yamtl.dsl.Helper.*
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
					//t.bundle = s.kmehrmessage.folder.find{f -> f.patient !== null}

					def kmehrBundle = s.kmehrmessage.folder.find{f -> f.patient !== null} as Bundle
					t.bundle = fetch(kmehrBundle)
				}),
			rule('Folder')
				.in("s", kmehrPk.FolderType)
				.filter({
					s.patient !== null
				})
				.out("bt", fhirPk.BundleType, {
					(bt as BundleType).value = BundleTypeEnum.DOCUMENT
				})
				.out("t", fhirPk.Bundle, {
					t.type = bt

					def inputElements = [s.transaction, s.patient]

					inputElements.addAll(s.transaction.collect{tr -> tr.txAuthor()})

					inputElements.addAll(s.transaction.collect{tr -> tr.item.collect{i -> i.hcpartyContent()}.flatten()})

					def sequence = []
					inputElements.addAll(s.transaction.collect{tr -> tr.item.select{i -> i.isMedication()}.collect{i -> sequence.addAll(i.posology, i)}}.flatten());

					inputElements.addAll(s.transaction
						.collect{tr -> tr.item.select{i -> i.isAllergy() || i.isIntolerance()}}.flatten());
					  inputElements.addAll(s.transaction
						.collect{tr -> tr.item.select{i -> i.isActiveProblem()}}.flatten());
					  inputElements.addAll(s.transaction
						.collect{tr -> tr.item.select{i -> i.isVaccine()}}.flatten());
					  inputElements.addAll(s.transaction
						.collect{tr | tr.item.select{i -> i.isInactiveProblem()}}.flatten());

					t.entry.addAll(inputElements
						.flatten()
						.collect{i -> i.equivalents('CompositionBundleEntry', 'PatientBundleEntry', 'OrganizationBundleEntry', 'PractitionerBundleEntry', 'MedicationBundleEntry', 'PosologyBundleEntry', 'AllergyIntoleranceBundleEntry', 'ConditionBundleEntry', 'ImmunizationBundleEntry')}.flatten()
						.select{e -> e.isKindOf(fhirPk.BundleEntry)});
				})
			/*
			rule('SumEHRTransaction')
				.in("f", kmehrPk.FolderType)
				.in("s", kmehrPk.TransactionType)
				.filter {
					(f as FolderType).transaction.contains(s) && s.cd.exists{cd -> cd.value = 'sumehr'}
				}
				.out("cid", fhirPk.Id, {
					cid.value = s.uuid
				})
				.out("patRef", fhirPk.Reference, {
					patRef.reference = fhirPk.FhirString('Patient/' + f.patient.uuid)
				})
				.out("cStatus", fhirPk.CompositionStatus, {
					if (s.iscomplete) {
						cStatus = s.isvalidated ? fhirPk.CompositionStatusEnum.final : fhirPk.CompositionStatusEnum.preliminary
					} else {
						cStatus = fhirPk.CompositionStatusEnum.partial
					}
				})
				.out("dateTime", fhirPk.DateTime, {
					dateTime.value = fhirPk..xmlTypeFactory.createDateTime(s.date.toXMLFormat() + 'T' + s.time.toXMLFormat())
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
				*/


		])
	}
}
