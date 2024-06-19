/**
 */
package HealthTracker.impl;

import HealthTracker.AirCondition;
import HealthTracker.AirQuality;
import HealthTracker.HealthTrackerPackage;
import HealthTracker.Intensity;
import HealthTracker.Patient;
import HealthTracker.PhysicalActivity;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HealthTracker.impl.PhysicalActivityImpl#getDate <em>Date</em>}</li>
 *   <li>{@link HealthTracker.impl.PhysicalActivityImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link HealthTracker.impl.PhysicalActivityImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link HealthTracker.impl.PhysicalActivityImpl#getIntensity <em>Intensity</em>}</li>
 *   <li>{@link HealthTracker.impl.PhysicalActivityImpl#getAirQuality <em>Air Quality</em>}</li>
 *   <li>{@link HealthTracker.impl.PhysicalActivityImpl#getAirCondition <em>Air Condition</em>}</li>
 *   <li>{@link HealthTracker.impl.PhysicalActivityImpl#getPatient <em>Patient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalActivityImpl extends MinimalEObjectImpl.Container implements PhysicalActivity {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected double distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntensity() <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final Intensity INTENSITY_EDEFAULT = Intensity.HIGH;

	/**
	 * The cached value of the '{@link #getIntensity() <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensity()
	 * @generated
	 * @ordered
	 */
	protected Intensity intensity = INTENSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAirQuality() <em>Air Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirQuality()
	 * @generated
	 * @ordered
	 */
	protected static final AirQuality AIR_QUALITY_EDEFAULT = AirQuality.GOOD;

	/**
	 * The cached value of the '{@link #getAirQuality() <em>Air Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirQuality()
	 * @generated
	 * @ordered
	 */
	protected AirQuality airQuality = AIR_QUALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAirCondition() <em>Air Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirCondition()
	 * @generated
	 * @ordered
	 */
	protected static final AirCondition AIR_CONDITION_EDEFAULT = AirCondition.SUNNY;

	/**
	 * The cached value of the '{@link #getAirCondition() <em>Air Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirCondition()
	 * @generated
	 * @ordered
	 */
	protected AirCondition airCondition = AIR_CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthTrackerPackage.Literals.PHYSICAL_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthTrackerPackage.PHYSICAL_ACTIVITY__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistance(double newDistance) {
		double oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthTrackerPackage.PHYSICAL_ACTIVITY__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthTrackerPackage.PHYSICAL_ACTIVITY__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Intensity getIntensity() {
		return intensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntensity(Intensity newIntensity) {
		Intensity oldIntensity = intensity;
		intensity = newIntensity == null ? INTENSITY_EDEFAULT : newIntensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthTrackerPackage.PHYSICAL_ACTIVITY__INTENSITY, oldIntensity, intensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirQuality getAirQuality() {
		return airQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAirQuality(AirQuality newAirQuality) {
		AirQuality oldAirQuality = airQuality;
		airQuality = newAirQuality == null ? AIR_QUALITY_EDEFAULT : newAirQuality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthTrackerPackage.PHYSICAL_ACTIVITY__AIR_QUALITY, oldAirQuality, airQuality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirCondition getAirCondition() {
		return airCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAirCondition(AirCondition newAirCondition) {
		AirCondition oldAirCondition = airCondition;
		airCondition = newAirCondition == null ? AIR_CONDITION_EDEFAULT : newAirCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthTrackerPackage.PHYSICAL_ACTIVITY__AIR_CONDITION, oldAirCondition, airCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Patient getPatient() {
		if (eContainerFeatureID() != HealthTrackerPackage.PHYSICAL_ACTIVITY__PATIENT) return null;
		return (Patient)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Patient newPatient, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPatient, HealthTrackerPackage.PHYSICAL_ACTIVITY__PATIENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatient(Patient newPatient) {
		if (newPatient != eInternalContainer() || (eContainerFeatureID() != HealthTrackerPackage.PHYSICAL_ACTIVITY__PATIENT && newPatient != null)) {
			if (EcoreUtil.isAncestor(this, newPatient))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, HealthTrackerPackage.PATIENT__ACTIVITIES, Patient.class, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthTrackerPackage.PHYSICAL_ACTIVITY__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__PATIENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPatient((Patient)otherEnd, msgs);
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
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__PATIENT:
				return basicSetPatient(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__PATIENT:
				return eInternalContainer().eInverseRemove(this, HealthTrackerPackage.PATIENT__ACTIVITIES, Patient.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__DATE:
				return getDate();
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__DISTANCE:
				return getDistance();
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__DURATION:
				return getDuration();
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__INTENSITY:
				return getIntensity();
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__AIR_QUALITY:
				return getAirQuality();
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__AIR_CONDITION:
				return getAirCondition();
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__PATIENT:
				return getPatient();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__DATE:
				setDate((Date)newValue);
				return;
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__DISTANCE:
				setDistance((Double)newValue);
				return;
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__DURATION:
				setDuration((Integer)newValue);
				return;
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__INTENSITY:
				setIntensity((Intensity)newValue);
				return;
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__AIR_QUALITY:
				setAirQuality((AirQuality)newValue);
				return;
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__AIR_CONDITION:
				setAirCondition((AirCondition)newValue);
				return;
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__PATIENT:
				setPatient((Patient)newValue);
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
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__INTENSITY:
				setIntensity(INTENSITY_EDEFAULT);
				return;
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__AIR_QUALITY:
				setAirQuality(AIR_QUALITY_EDEFAULT);
				return;
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__AIR_CONDITION:
				setAirCondition(AIR_CONDITION_EDEFAULT);
				return;
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__PATIENT:
				setPatient((Patient)null);
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
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__DURATION:
				return duration != DURATION_EDEFAULT;
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__INTENSITY:
				return intensity != INTENSITY_EDEFAULT;
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__AIR_QUALITY:
				return airQuality != AIR_QUALITY_EDEFAULT;
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__AIR_CONDITION:
				return airCondition != AIR_CONDITION_EDEFAULT;
			case HealthTrackerPackage.PHYSICAL_ACTIVITY__PATIENT:
				return getPatient() != null;
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
		result.append(" (date: ");
		result.append(date);
		result.append(", distance: ");
		result.append(distance);
		result.append(", duration: ");
		result.append(duration);
		result.append(", intensity: ");
		result.append(intensity);
		result.append(", airQuality: ");
		result.append(airQuality);
		result.append(", airCondition: ");
		result.append(airCondition);
		result.append(')');
		return result.toString();
	}

} //PhysicalActivityImpl
