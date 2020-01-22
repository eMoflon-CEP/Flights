/**
 */
package Flights;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Travel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Flights.Travel#getFlights <em>Flights</em>}</li>
 *   <li>{@link Flights.Travel#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @see Flights.FlightsPackage#getTravel()
 * @model
 * @generated
 */
public interface Travel extends FlightObject {
	/**
	 * Returns the value of the '<em><b>Flights</b></em>' reference list.
	 * The list contents are of type {@link Flights.Flight}.
	 * It is bidirectional and its opposite is '{@link Flights.Flight#getTravels <em>Travels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flights</em>' reference list.
	 * @see Flights.FlightsPackage#getTravel_Flights()
	 * @see Flights.Flight#getTravels
	 * @model opposite="travels"
	 * @generated
	 */
	EList<Flight> getFlights();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Flights.Person#getTravels <em>Travels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see Flights.FlightsPackage#getTravel_Person()
	 * @see Flights.Person#getTravels
	 * @model opposite="travels"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link Flights.Travel#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

} // Travel
