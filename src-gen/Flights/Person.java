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
 *   <li>{@link Flights.Person#getBookings <em>Bookings</em>}</li>
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
	 * Returns the value of the '<em><b>Bookings</b></em>' reference list.
	 * The list contents are of type {@link Flights.Booking}.
	 * It is bidirectional and its opposite is '{@link Flights.Booking#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings</em>' reference list.
	 * @see Flights.FlightsPackage#getPerson_Bookings()
	 * @see Flights.Booking#getPersons
	 * @model opposite="persons"
	 * @generated
	 */
	EList<Booking> getBookings();

} // Person
