/**
 */
package Flights;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bookings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Flights.Bookings#getBookings <em>Bookings</em>}</li>
 *   <li>{@link Flights.Bookings#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see Flights.FlightsPackage#getBookings()
 * @model
 * @generated
 */
public interface Bookings extends EObject {
	/**
	 * Returns the value of the '<em><b>Bookings</b></em>' containment reference list.
	 * The list contents are of type {@link Flights.Booking}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings</em>' containment reference list.
	 * @see Flights.FlightsPackage#getBookings_Bookings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Booking> getBookings();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' reference list.
	 * The list contents are of type {@link Flights.Person}.
	 * It is bidirectional and its opposite is '{@link Flights.Person#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' reference list.
	 * @see Flights.FlightsPackage#getBookings_Persons()
	 * @see Flights.Person#getBookings
	 * @model opposite="bookings"
	 * @generated
	 */
	EList<Person> getPersons();

} // Bookings
