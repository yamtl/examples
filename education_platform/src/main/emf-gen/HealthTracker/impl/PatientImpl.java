/**
 */
package HealthTracker.impl;

import HealthTracker.HealthTrackerPackage;
import HealthTracker.Patient;
import HealthTracker.PhysicalActivity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HealthTracker.impl.PatientImpl#getPatientID <em>Patient ID</em>}</li>
 *   <li>{@link HealthTracker.impl.PatientImpl#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientImpl extends MinimalEObjectImpl.Container implements Patient {
	/**
	 * The default value of the '{@link #getPatientID() <em>Patient ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientID()
	 * @generated
	 * @ordered
	 */
	protected static final int PATIENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPatientID() <em>Patient ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientID()
	 * @generated
	 * @ordered
	 */
	protected int patientID = PATIENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalActivity> activities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthTrackerPackage.Literals.PATIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPatientID() {
		return patientID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatientID(int newPatientID) {
		int oldPatientID = patientID;
		patientID = newPatientID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthTrackerPackage.PATIENT__PATIENT_ID, oldPatientID, patientID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalActivity> getActivities() {
		if (activities == null) {
			activities = new EObjectContainmentWithInverseEList<PhysicalActivity>(PhysicalActivity.class, this, HealthTrackerPackage.PATIENT__ACTIVITIES, HealthTrackerPackage.PHYSICAL_ACTIVITY__PATIENT);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HealthTrackerPackage.PATIENT__ACTIVITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivities()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HealthTrackerPackage.PATIENT__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HealthTrackerPackage.PATIENT__PATIENT_ID:
				return getPatientID();
			case HealthTrackerPackage.PATIENT__ACTIVITIES:
				return getActivities();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HealthTrackerPackage.PATIENT__PATIENT_ID:
				setPatientID((Integer)newValue);
				return;
			case HealthTrackerPackage.PATIENT__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends PhysicalActivity>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HealthTrackerPackage.PATIENT__PATIENT_ID:
				setPatientID(PATIENT_ID_EDEFAULT);
				return;
			case HealthTrackerPackage.PATIENT__ACTIVITIES:
				getActivities().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HealthTrackerPackage.PATIENT__PATIENT_ID:
				return patientID != PATIENT_ID_EDEFAULT;
			case HealthTrackerPackage.PATIENT__ACTIVITIES:
				return activities != null && !activities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (patientID: ");
		result.append(patientID);
		result.append(')');
		return result.toString();
	}

} //PatientImpl
