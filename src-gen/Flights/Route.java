/**
 */
package Flights;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Flights.Route#getDuration <em>Duration</em>}</li>
 *   <li>{@link Flights.Route#getFlights <em>Flights</em>}</li>
 *   <li>{@link Flights.Route#getSrc <em>Src</em>}</li>
 *   <li>{@link Flights.Route#getTrg <em>Trg</em>}</li>
 * </ul>
 *
 * @see Flights.FlightsPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends FlightObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see Flights.FlightsPackage#getRoute_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link Flights.Route#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Flights</b></em>' reference list.
	 * The list contents are of type {@link Flights.Flight}.
	 * It is bidirectional and its opposite is '{@link Flights.Flight#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flights</em>' reference list.
	 * @see Flights.FlightsPackage#getRoute_Flights()
	 * @see Flights.Flight#getRoute
	 * @model opposite="route"
	 * @generated
	 */
	EList<Flight> getFlights();

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Flights.Airport#getOutgoingRoutes <em>Outgoing Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Airport)
	 * @see Flights.FlightsPackage#getRoute_Src()
	 * @see Flights.Airport#getOutgoingRoutes
	 * @model opposite="outgoingRoutes" required="true"
	 * @generated
	 */
	Airport getSrc();

	/**
	 * Sets the value of the '{@link Flights.Route#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Airport value);

	/**
	 * Returns the value of the '<em><b>Trg</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Flights.Airport#getIncomingRoutes <em>Incoming Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trg</em>' reference.
	 * @see #setTrg(Airport)
	 * @see Flights.FlightsPackage#getRoute_Trg()
	 * @see Flights.Airport#getIncomingRoutes
	 * @model opposite="incomingRoutes" required="true"
	 * @generated
	 */
	Airport getTrg();

	/**
	 * Sets the value of the '{@link Flights.Route#getTrg <em>Trg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trg</em>' reference.
	 * @see #getTrg()
	 * @generated
	 */
	void setTrg(Airport value);

} // Route
