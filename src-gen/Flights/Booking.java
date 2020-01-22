/**
 */
package Flights;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Flights.Booking#getTravels <em>Travels</em>}</li>
 *   <li>{@link Flights.Booking#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see Flights.FlightsPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends FlightObject {
	/**
	 * Returns the value of the '<em><b>Travels</b></em>' containment reference list.
	 * The list contents are of type {@link Flights.Travel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travels</em>' containment reference list.
	 * @see Flights.FlightsPackage#getBooking_Travels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Travel> getTravels();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' reference list.
	 * The list contents are of type {@link Flights.Person}.
	 * It is bidirectional and its opposite is '{@link Flights.Person#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' reference list.
	 * @see Flights.FlightsPackage#getBooking_Persons()
	 * @see Flights.Person#getBookings
	 * @model opposite="bookings"
	 * @generated
	 */
	EList<Person> getPersons();

} // Booking
