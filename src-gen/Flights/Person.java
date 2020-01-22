/**
 */
package Flights;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Flights.Person#getTravelState <em>Travel State</em>}</li>
 *   <li>{@link Flights.Person#getTravels <em>Travels</em>}</li>
 * </ul>
 *
 * @see Flights.FlightsPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends FlightObject {
	/**
	 * Returns the value of the '<em><b>Travel State</b></em>' attribute.
	 * The literals are from the enumeration {@link Flights.TravelState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel State</em>' attribute.
	 * @see Flights.TravelState
	 * @see #setTravelState(TravelState)
	 * @see Flights.FlightsPackage#getPerson_TravelState()
	 * @model
	 * @generated
	 */
	TravelState getTravelState();

	/**
	 * Sets the value of the '{@link Flights.Person#getTravelState <em>Travel State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel State</em>' attribute.
	 * @see Flights.TravelState
	 * @see #getTravelState()
	 * @generated
	 */
	void setTravelState(TravelState value);

	/**
	 * Returns the value of the '<em><b>Travels</b></em>' reference list.
	 * The list contents are of type {@link Flights.Travel}.
	 * It is bidirectional and its opposite is '{@link Flights.Travel#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travels</em>' reference list.
	 * @see Flights.FlightsPackage#getPerson_Travels()
	 * @see Flights.Travel#getPerson
	 * @model opposite="person"
	 * @generated
	 */
	EList<Travel> getTravels();

} // Person
