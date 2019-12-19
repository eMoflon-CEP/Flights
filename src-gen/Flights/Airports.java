/**
 */
package Flights;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Airports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Flights.Airports#getAirports <em>Airports</em>}</li>
 * </ul>
 *
 * @see Flights.FlightsPackage#getAirports()
 * @model
 * @generated
 */
public interface Airports extends EObject {
	/**
	 * Returns the value of the '<em><b>Airports</b></em>' containment reference list.
	 * The list contents are of type {@link Flights.Airport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Airports</em>' containment reference list.
	 * @see Flights.FlightsPackage#getAirports_Airports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Airport> getAirports();

} // Airports
