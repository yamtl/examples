/**
 */
package HealthTracker.impl;

import HealthTracker.AirCondition;
import HealthTracker.AirQuality;
import HealthTracker.HealthTrackerFactory;
import HealthTracker.HealthTrackerPackage;
import HealthTracker.Intensity;
import HealthTracker.Patient;
import HealthTracker.PhysicalActivity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HealthTrackerPackageImpl extends EPackageImpl implements HealthTrackerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum intensityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum airQualityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum airConditionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see HealthTracker.HealthTrackerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HealthTrackerPackageImpl() {
		super(eNS_URI, HealthTrackerFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link HealthTrackerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HealthTrackerPackage init() {
		if (isInited) return (HealthTrackerPackage)EPackage.Registry.INSTANCE.getEPackage(HealthTrackerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHealthTrackerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HealthTrackerPackageImpl theHealthTrackerPackage = registeredHealthTrackerPackage instanceof HealthTrackerPackageImpl ? (HealthTrackerPackageImpl)registeredHealthTrackerPackage : new HealthTrackerPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theHealthTrackerPackage.createPackageContents();

		// Initialize created meta-data
		theHealthTrackerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHealthTrackerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HealthTrackerPackage.eNS_URI, theHealthTrackerPackage);
		return theHealthTrackerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatient() {
		return patientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_PatientID() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Activities() {
		return (EReference)patientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicalActivity() {
		return physicalActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysicalActivity_Date() {
		return (EAttribute)physicalActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysicalActivity_Distance() {
		return (EAttribute)physicalActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysicalActivity_Duration() {
		return (EAttribute)physicalActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysicalActivity_Intensity() {
		return (EAttribute)physicalActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysicalActivity_AirQuality() {
		return (EAttribute)physicalActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysicalActivity_AirCondition() {
		return (EAttribute)physicalActivityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPhysicalActivity_Patient() {
		return (EReference)physicalActivityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIntensity() {
		return intensityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAirQuality() {
		return airQualityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAirCondition() {
		return airConditionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthTrackerFactory getHealthTrackerFactory() {
		return (HealthTrackerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		patientEClass = createEClass(PATIENT);
		createEAttribute(patientEClass, PATIENT__PATIENT_ID);
		createEReference(patientEClass, PATIENT__ACTIVITIES);

		physicalActivityEClass = createEClass(PHYSICAL_ACTIVITY);
		createEAttribute(physicalActivityEClass, PHYSICAL_ACTIVITY__DATE);
		createEAttribute(physicalActivityEClass, PHYSICAL_ACTIVITY__DISTANCE);
		createEAttribute(physicalActivityEClass, PHYSICAL_ACTIVITY__DURATION);
		createEAttribute(physicalActivityEClass, PHYSICAL_ACTIVITY__INTENSITY);
		createEAttribute(physicalActivityEClass, PHYSICAL_ACTIVITY__AIR_QUALITY);
		createEAttribute(physicalActivityEClass, PHYSICAL_ACTIVITY__AIR_CONDITION);
		createEReference(physicalActivityEClass, PHYSICAL_ACTIVITY__PATIENT);

		// Create enums
		intensityEEnum = createEEnum(INTENSITY);
		airQualityEEnum = createEEnum(AIR_QUALITY);
		airConditionEEnum = createEEnum(AIR_CONDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(patientEClass, Patient.class, "Patient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatient_PatientID(), ecorePackage.getEInt(), "patientID", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Activities(), this.getPhysicalActivity(), this.getPhysicalActivity_Patient(), "activities", null, 0, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalActivityEClass, PhysicalActivity.class, "PhysicalActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalActivity_Date(), ecorePackage.getEDate(), "date", null, 0, 1, PhysicalActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalActivity_Distance(), ecorePackage.getEDouble(), "distance", null, 0, 1, PhysicalActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalActivity_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, PhysicalActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalActivity_Intensity(), this.getIntensity(), "intensity", null, 0, 1, PhysicalActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalActivity_AirQuality(), this.getAirQuality(), "airQuality", null, 0, 1, PhysicalActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalActivity_AirCondition(), this.getAirCondition(), "airCondition", null, 0, 1, PhysicalActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalActivity_Patient(), this.getPatient(), this.getPatient_Activities(), "patient", null, 1, 1, PhysicalActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(intensityEEnum, Intensity.class, "Intensity");
		addEEnumLiteral(intensityEEnum, Intensity.HIGH);
		addEEnumLiteral(intensityEEnum, Intensity.MODERATE);
		addEEnumLiteral(intensityEEnum, Intensity.LOW);

		initEEnum(airQualityEEnum, AirQuality.class, "AirQuality");
		addEEnumLiteral(airQualityEEnum, AirQuality.GOOD);
		addEEnumLiteral(airQualityEEnum, AirQuality.MODERATE);
		addEEnumLiteral(airQualityEEnum, AirQuality.POOR);

		initEEnum(airConditionEEnum, AirCondition.class, "AirCondition");
		addEEnumLiteral(airConditionEEnum, AirCondition.SUNNY);
		addEEnumLiteral(airConditionEEnum, AirCondition.CLOUDY);
		addEEnumLiteral(airConditionEEnum, AirCondition.RAINY);

		// Create resource
		createResource(eNS_URI);
	}

} //HealthTrackerPackageImpl
