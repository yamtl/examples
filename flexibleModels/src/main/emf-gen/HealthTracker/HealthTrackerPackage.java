/**
 */
package HealthTracker;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see HealthTracker.HealthTrackerFactory
 * @model kind="package"
 * @generated
 */
public interface HealthTrackerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HealthTracker";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "yamtl.healthTracker";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ht";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HealthTrackerPackage eINSTANCE = HealthTracker.impl.HealthTrackerPackageImpl.init();

	/**
	 * The meta object id for the '{@link HealthTracker.impl.PatientImpl <em>Patient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HealthTracker.impl.PatientImpl
	 * @see HealthTracker.impl.HealthTrackerPackageImpl#getPatient()
	 * @generated
	 */
	int PATIENT = 0;

	/**
	 * The feature id for the '<em><b>Patient ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__PATIENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__ACTIVITIES = 1;

	/**
	 * The number of structural features of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link HealthTracker.impl.PhysicalActivityImpl <em>Physical Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HealthTracker.impl.PhysicalActivityImpl
	 * @see HealthTracker.impl.HealthTrackerPackageImpl#getPhysicalActivity()
	 * @generated
	 */
	int PHYSICAL_ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTIVITY__DATE = 0;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTIVITY__DISTANCE = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTIVITY__DURATION = 2;

	/**
	 * The feature id for the '<em><b>Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTIVITY__INTENSITY = 3;

	/**
	 * The feature id for the '<em><b>Air Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTIVITY__AIR_QUALITY = 4;

	/**
	 * The feature id for the '<em><b>Air Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTIVITY__AIR_CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTIVITY__PATIENT = 6;

	/**
	 * The number of structural features of the '<em>Physical Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTIVITY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Physical Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link HealthTracker.Intensity <em>Intensity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HealthTracker.Intensity
	 * @see HealthTracker.impl.HealthTrackerPackageImpl#getIntensity()
	 * @generated
	 */
	int INTENSITY = 2;

	/**
	 * The meta object id for the '{@link HealthTracker.AirQuality <em>Air Quality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HealthTracker.AirQuality
	 * @see HealthTracker.impl.HealthTrackerPackageImpl#getAirQuality()
	 * @generated
	 */
	int AIR_QUALITY = 3;

	/**
	 * The meta object id for the '{@link HealthTracker.AirCondition <em>Air Condition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HealthTracker.AirCondition
	 * @see HealthTracker.impl.HealthTrackerPackageImpl#getAirCondition()
	 * @generated
	 */
	int AIR_CONDITION = 4;


	/**
	 * Returns the meta object for class '{@link HealthTracker.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient</em>'.
	 * @see HealthTracker.Patient
	 * @generated
	 */
	EClass getPatient();

	/**
	 * Returns the meta object for the attribute '{@link HealthTracker.Patient#getPatientID <em>Patient ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient ID</em>'.
	 * @see HealthTracker.Patient#getPatientID()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_PatientID();

	/**
	 * Returns the meta object for the containment reference list '{@link HealthTracker.Patient#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see HealthTracker.Patient#getActivities()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Activities();

	/**
	 * Returns the meta object for class '{@link HealthTracker.PhysicalActivity <em>Physical Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Activity</em>'.
	 * @see HealthTracker.PhysicalActivity
	 * @generated
	 */
	EClass getPhysicalActivity();

	/**
	 * Returns the meta object for the attribute '{@link HealthTracker.PhysicalActivity#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see HealthTracker.PhysicalActivity#getDate()
	 * @see #getPhysicalActivity()
	 * @generated
	 */
	EAttribute getPhysicalActivity_Date();

	/**
	 * Returns the meta object for the attribute '{@link HealthTracker.PhysicalActivity#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see HealthTracker.PhysicalActivity#getDistance()
	 * @see #getPhysicalActivity()
	 * @generated
	 */
	EAttribute getPhysicalActivity_Distance();

	/**
	 * Returns the meta object for the attribute '{@link HealthTracker.PhysicalActivity#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see HealthTracker.PhysicalActivity#getDuration()
	 * @see #getPhysicalActivity()
	 * @generated
	 */
	EAttribute getPhysicalActivity_Duration();

	/**
	 * Returns the meta object for the attribute '{@link HealthTracker.PhysicalActivity#getIntensity <em>Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intensity</em>'.
	 * @see HealthTracker.PhysicalActivity#getIntensity()
	 * @see #getPhysicalActivity()
	 * @generated
	 */
	EAttribute getPhysicalActivity_Intensity();

	/**
	 * Returns the meta object for the attribute '{@link HealthTracker.PhysicalActivity#getAirQuality <em>Air Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Air Quality</em>'.
	 * @see HealthTracker.PhysicalActivity#getAirQuality()
	 * @see #getPhysicalActivity()
	 * @generated
	 */
	EAttribute getPhysicalActivity_AirQuality();

	/**
	 * Returns the meta object for the attribute '{@link HealthTracker.PhysicalActivity#getAirCondition <em>Air Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Air Condition</em>'.
	 * @see HealthTracker.PhysicalActivity#getAirCondition()
	 * @see #getPhysicalActivity()
	 * @generated
	 */
	EAttribute getPhysicalActivity_AirCondition();

	/**
	 * Returns the meta object for the container reference '{@link HealthTracker.PhysicalActivity#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Patient</em>'.
	 * @see HealthTracker.PhysicalActivity#getPatient()
	 * @see #getPhysicalActivity()
	 * @generated
	 */
	EReference getPhysicalActivity_Patient();

	/**
	 * Returns the meta object for enum '{@link HealthTracker.Intensity <em>Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Intensity</em>'.
	 * @see HealthTracker.Intensity
	 * @generated
	 */
	EEnum getIntensity();

	/**
	 * Returns the meta object for enum '{@link HealthTracker.AirQuality <em>Air Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Air Quality</em>'.
	 * @see HealthTracker.AirQuality
	 * @generated
	 */
	EEnum getAirQuality();

	/**
	 * Returns the meta object for enum '{@link HealthTracker.AirCondition <em>Air Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Air Condition</em>'.
	 * @see HealthTracker.AirCondition
	 * @generated
	 */
	EEnum getAirCondition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HealthTrackerFactory getHealthTrackerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link HealthTracker.impl.PatientImpl <em>Patient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HealthTracker.impl.PatientImpl
		 * @see HealthTracker.impl.HealthTrackerPackageImpl#getPatient()
		 * @generated
		 */
		EClass PATIENT = eINSTANCE.getPatient();

		/**
		 * The meta object literal for the '<em><b>Patient ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__PATIENT_ID = eINSTANCE.getPatient_PatientID();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__ACTIVITIES = eINSTANCE.getPatient_Activities();

		/**
		 * The meta object literal for the '{@link HealthTracker.impl.PhysicalActivityImpl <em>Physical Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HealthTracker.impl.PhysicalActivityImpl
		 * @see HealthTracker.impl.HealthTrackerPackageImpl#getPhysicalActivity()
		 * @generated
		 */
		EClass PHYSICAL_ACTIVITY = eINSTANCE.getPhysicalActivity();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_ACTIVITY__DATE = eINSTANCE.getPhysicalActivity_Date();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_ACTIVITY__DISTANCE = eINSTANCE.getPhysicalActivity_Distance();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_ACTIVITY__DURATION = eINSTANCE.getPhysicalActivity_Duration();

		/**
		 * The meta object literal for the '<em><b>Intensity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_ACTIVITY__INTENSITY = eINSTANCE.getPhysicalActivity_Intensity();

		/**
		 * The meta object literal for the '<em><b>Air Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_ACTIVITY__AIR_QUALITY = eINSTANCE.getPhysicalActivity_AirQuality();

		/**
		 * The meta object literal for the '<em><b>Air Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_ACTIVITY__AIR_CONDITION = eINSTANCE.getPhysicalActivity_AirCondition();

		/**
		 * The meta object literal for the '<em><b>Patient</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_ACTIVITY__PATIENT = eINSTANCE.getPhysicalActivity_Patient();

		/**
		 * The meta object literal for the '{@link HealthTracker.Intensity <em>Intensity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HealthTracker.Intensity
		 * @see HealthTracker.impl.HealthTrackerPackageImpl#getIntensity()
		 * @generated
		 */
		EEnum INTENSITY = eINSTANCE.getIntensity();

		/**
		 * The meta object literal for the '{@link HealthTracker.AirQuality <em>Air Quality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HealthTracker.AirQuality
		 * @see HealthTracker.impl.HealthTrackerPackageImpl#getAirQuality()
		 * @generated
		 */
		EEnum AIR_QUALITY = eINSTANCE.getAirQuality();

		/**
		 * The meta object literal for the '{@link HealthTracker.AirCondition <em>Air Condition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HealthTracker.AirCondition
		 * @see HealthTracker.impl.HealthTrackerPackageImpl#getAirCondition()
		 * @generated
		 */
		EEnum AIR_CONDITION = eINSTANCE.getAirCondition();

	}

} //HealthTrackerPackage
