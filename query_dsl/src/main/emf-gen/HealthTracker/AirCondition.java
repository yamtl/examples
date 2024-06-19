/**
 */
package HealthTracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Air Condition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see HealthTracker.HealthTrackerPackage#getAirCondition()
 * @model
 * @generated
 */
public enum AirCondition implements Enumerator {
	/**
	 * The '<em><b>Sunny</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUNNY_VALUE
	 * @generated
	 * @ordered
	 */
	SUNNY(0, "Sunny", "Sunny"),

	/**
	 * The '<em><b>Cloudy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUDY_VALUE
	 * @generated
	 * @ordered
	 */
	CLOUDY(1, "Cloudy", "Cloudy"),

	/**
	 * The '<em><b>Rainy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAINY_VALUE
	 * @generated
	 * @ordered
	 */
	RAINY(2, "Rainy", "Rainy");

	/**
	 * The '<em><b>Sunny</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUNNY
	 * @model name="Sunny"
	 * @generated
	 * @ordered
	 */
	public static final int SUNNY_VALUE = 0;

	/**
	 * The '<em><b>Cloudy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUDY
	 * @model name="Cloudy"
	 * @generated
	 * @ordered
	 */
	public static final int CLOUDY_VALUE = 1;

	/**
	 * The '<em><b>Rainy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAINY
	 * @model name="Rainy"
	 * @generated
	 * @ordered
	 */
	public static final int RAINY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Air Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AirCondition[] VALUES_ARRAY =
		new AirCondition[] {
			SUNNY,
			CLOUDY,
			RAINY,
		};

	/**
	 * A public read-only list of all the '<em><b>Air Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AirCondition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Air Condition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AirCondition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AirCondition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Air Condition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AirCondition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AirCondition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Air Condition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AirCondition get(int value) {
		switch (value) {
			case SUNNY_VALUE: return SUNNY;
			case CLOUDY_VALUE: return CLOUDY;
			case RAINY_VALUE: return RAINY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AirCondition(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AirCondition
