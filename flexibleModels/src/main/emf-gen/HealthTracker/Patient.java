/**
 */
package HealthTracker;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HealthTracker.Patient#getPatientID <em>Patient ID</em>}</li>
 *   <li>{@link HealthTracker.Patient#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see HealthTracker.HealthTrackerPackage#getPatient()
 * @model
 * @generated
 */
public interface Patient extends EObject {
	/**
	 * Returns the value of the '<em><b>Patient ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient ID</em>' attribute.
	 * @see #setPatientID(int)
	 * @see HealthTracker.HealthTrackerPackage#getPatient_PatientID()
	 * @model
	 * @generated
	 */
	int getPatientID();

	/**
	 * Sets the value of the '{@link HealthTracker.Patient#getPatientID <em>Patient ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient ID</em>' attribute.
	 * @see #getPatientID()
	 * @generated
	 */
	void setPatientID(int value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link HealthTracker.PhysicalActivity}.
	 * It is bidirectional and its opposite is '{@link HealthTracker.PhysicalActivity#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see HealthTracker.HealthTrackerPackage#getPatient_Activities()
	 * @see HealthTracker.PhysicalActivity#getPatient
	 * @model opposite="patient" containment="true"
	 * @generated
	 */
	EList<PhysicalActivity> getActivities();

} // Patient
