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

} // Travel
