/**
 */
package HealthTracker;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HealthTracker.PhysicalActivity#getDate <em>Date</em>}</li>
 *   <li>{@link HealthTracker.PhysicalActivity#getDistance <em>Distance</em>}</li>
 *   <li>{@link HealthTracker.PhysicalActivity#getDuration <em>Duration</em>}</li>
 *   <li>{@link HealthTracker.PhysicalActivity#getIntensity <em>Intensity</em>}</li>
 *   <li>{@link HealthTracker.PhysicalActivity#getAirQuality <em>Air Quality</em>}</li>
 *   <li>{@link HealthTracker.PhysicalActivity#getAirCondition <em>Air Condition</em>}</li>
 *   <li>{@link HealthTracker.PhysicalActivity#getPatient <em>Patient</em>}</li>
 * </ul>
 *
 * @see HealthTracker.HealthTrackerPackage#getPhysicalActivity()
 * @model
 * @generated
 */
public interface PhysicalActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see HealthTracker.HealthTrackerPackage#getPhysicalActivity_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link HealthTracker.PhysicalActivity#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(double)
	 * @see HealthTracker.HealthTrackerPackage#getPhysicalActivity_Distance()
	 * @model
	 * @generated
	 */
	double getDistance();

	/**
	 * Sets the value of the '{@link HealthTracker.PhysicalActivity#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see HealthTracker.HealthTrackerPackage#getPhysicalActivity_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link HealthTracker.PhysicalActivity#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Intensity</b></em>' attribute.
	 * The literals are from the enumeration {@link HealthTracker.Intensity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intensity</em>' attribute.
	 * @see HealthTracker.Intensity
	 * @see #setIntensity(Intensity)
	 * @see HealthTracker.HealthTrackerPackage#getPhysicalActivity_Intensity()
	 * @model
	 * @generated
	 */
	Intensity getIntensity();

	/**
	 * Sets the value of the '{@link HealthTracker.PhysicalActivity#getIntensity <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intensity</em>' attribute.
	 * @see HealthTracker.Intensity
	 * @see #getIntensity()
	 * @generated
	 */
	void setIntensity(Intensity value);

	/**
	 * Returns the value of the '<em><b>Air Quality</b></em>' attribute.
	 * The literals are from the enumeration {@link HealthTracker.AirQuality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air Quality</em>' attribute.
	 * @see HealthTracker.AirQuality
	 * @see #setAirQuality(AirQuality)
	 * @see HealthTracker.HealthTrackerPackage#getPhysicalActivity_AirQuality()
	 * @model
	 * @generated
	 */
	AirQuality getAirQuality();

	/**
	 * Sets the value of the '{@link HealthTracker.PhysicalActivity#getAirQuality <em>Air Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Quality</em>' attribute.
	 * @see HealthTracker.AirQuality
	 * @see #getAirQuality()
	 * @generated
	 */
	void setAirQuality(AirQuality value);

	/**
	 * Returns the value of the '<em><b>Air Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link HealthTracker.AirCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air Condition</em>' attribute.
	 * @see HealthTracker.AirCondition
	 * @see #setAirCondition(AirCondition)
	 * @see HealthTracker.HealthTrackerPackage#getPhysicalActivity_AirCondition()
	 * @model
	 * @generated
	 */
	AirCondition getAirCondition();

	/**
	 * Sets the value of the '{@link HealthTracker.PhysicalActivity#getAirCondition <em>Air Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Condition</em>' attribute.
	 * @see HealthTracker.AirCondition
	 * @see #getAirCondition()
	 * @generated
	 */
	void setAirCondition(AirCondition value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link HealthTracker.Patient#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' container reference.
	 * @see #setPatient(Patient)
	 * @see HealthTracker.HealthTrackerPackage#getPhysicalActivity_Patient()
	 * @see HealthTracker.Patient#getActivities
	 * @model opposite="activities" required="true" transient="false"
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link HealthTracker.PhysicalActivity#getPatient <em>Patient</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' container reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

} // PhysicalActivity
