/**
 */
package Flights;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Travel State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Flights.FlightsPackage#getTravelState()
 * @model
 * @generated
 */
public enum TravelState implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "unknown", "unknown"),

	/**
	 * The '<em><b>Checked In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKED_IN_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKED_IN(1, "checkedIn", "checkedIn"),

	/**
	 * The '<em><b>Luggage Dropped Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUGGAGE_DROPPED_OF_VALUE
	 * @generated
	 * @ordered
	 */
	LUGGAGE_DROPPED_OF(2, "luggageDroppedOf", "luggageDroppedOf"),

	/**
	 * The '<em><b>On Board</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_BOARD_VALUE
	 * @generated
	 * @ordered
	 */
	ON_BOARD(3, "onBoard", "onBoard");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>Checked In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKED_IN
	 * @model name="checkedIn"
	 * @generated
	 * @ordered
	 */
	public static final int CHECKED_IN_VALUE = 1;

	/**
	 * The '<em><b>Luggage Dropped Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUGGAGE_DROPPED_OF
	 * @model name="luggageDroppedOf"
	 * @generated
	 * @ordered
	 */
	public static final int LUGGAGE_DROPPED_OF_VALUE = 2;

	/**
	 * The '<em><b>On Board</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_BOARD
	 * @model name="onBoard"
	 * @generated
	 * @ordered
	 */
	public static final int ON_BOARD_VALUE = 3;

	/**
	 * An array of all the '<em><b>Travel State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TravelState[] VALUES_ARRAY = new TravelState[] { UNKNOWN, CHECKED_IN, LUGGAGE_DROPPED_OF,
			ON_BOARD, };

	/**
	 * A public read-only list of all the '<em><b>Travel State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TravelState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Travel State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TravelState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TravelState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Travel State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TravelState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TravelState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Travel State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TravelState get(int value) {
		switch (value) {
		case UNKNOWN_VALUE:
			return UNKNOWN;
		case CHECKED_IN_VALUE:
			return CHECKED_IN;
		case LUGGAGE_DROPPED_OF_VALUE:
			return LUGGAGE_DROPPED_OF;
		case ON_BOARD_VALUE:
			return ON_BOARD;
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
	private TravelState(int value, String name, String literal) {
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

} //TravelState
