/**
 */
package Flights;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Flights.FlightContainer#getFlights <em>Flights</em>}</li>
 * </ul>
 *
 * @see Flights.FlightsPackage#getFlightContainer()
 * @model
 * @generated
 */
public interface FlightContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Flights</b></em>' containment reference list.
	 * The list contents are of type {@link Flights.Flight}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flights</em>' containment reference list.
	 * @see Flights.FlightsPackage#getFlightContainer_Flights()
	 * @model containment="true"
	 * @generated
	 */
	EList<Flight> getFlights();

} // FlightContainer
