/**
 */
package Flights;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Flights.Flight#getTravels <em>Travels</em>}</li>
 *   <li>{@link Flights.Flight#getRoute <em>Route</em>}</li>
 *   <li>{@link Flights.Flight#getSrc <em>Src</em>}</li>
 *   <li>{@link Flights.Flight#getTrg <em>Trg</em>}</li>
 *   <li>{@link Flights.Flight#getPlane <em>Plane</em>}</li>
 *   <li>{@link Flights.Flight#getDeparture <em>Departure</em>}</li>
 *   <li>{@link Flights.Flight#getArrival <em>Arrival</em>}</li>
 * </ul>
 *
 * @see Flights.FlightsPackage#getFlight()
 * @model
 * @generated
 */
public interface Flight extends FlightObject {
	/**
	 * Returns the value of the '<em><b>Departure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure</em>' containment reference.
	 * @see #setDeparture(TimeStamp)
	 * @see Flights.FlightsPackage#getFlight_Departure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeStamp getDeparture();

	/**
	 * Sets the value of the '{@link Flights.Flight#getDeparture <em>Departure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure</em>' containment reference.
	 * @see #getDeparture()
	 * @generated
	 */
	void setDeparture(TimeStamp value);

	/**
	 * Returns the value of the '<em><b>Arrival</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival</em>' containment reference.
	 * @see #setArrival(TimeStamp)
	 * @see Flights.FlightsPackage#getFlight_Arrival()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeStamp getArrival();

	/**
	 * Sets the value of the '{@link Flights.Flight#getArrival <em>Arrival</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival</em>' containment reference.
	 * @see #getArrival()
	 * @generated
	 */
	void setArrival(TimeStamp value);

	/**
	 * Returns the value of the '<em><b>Travels</b></em>' reference list.
	 * The list contents are of type {@link Flights.Travel}.
	 * It is bidirectional and its opposite is '{@link Flights.Travel#getFlights <em>Flights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travels</em>' reference list.
	 * @see Flights.FlightsPackage#getFlight_Travels()
	 * @see Flights.Travel#getFlights
	 * @model opposite="flights"
	 * @generated
	 */
	EList<Travel> getTravels();

	/**
	 * Returns the value of the '<em><b>Route</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Flights.Route#getFlights <em>Flights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' reference.
	 * @see #setRoute(Route)
	 * @see Flights.FlightsPackage#getFlight_Route()
	 * @see Flights.Route#getFlights
	 * @model opposite="flights" required="true"
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link Flights.Flight#getRoute <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Flights.Gate#getOutgoingFlights <em>Outgoing Flights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Gate)
	 * @see Flights.FlightsPackage#getFlight_Src()
	 * @see Flights.Gate#getOutgoingFlights
	 * @model opposite="outgoingFlights" required="true"
	 * @generated
	 */
	Gate getSrc();

	/**
	 * Sets the value of the '{@link Flights.Flight#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Gate value);

	/**
	 * Returns the value of the '<em><b>Trg</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Flights.Gate#getIncomingFlights <em>Incoming Flights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trg</em>' reference.
	 * @see #setTrg(Gate)
	 * @see Flights.FlightsPackage#getFlight_Trg()
	 * @see Flights.Gate#getIncomingFlights
	 * @model opposite="incomingFlights" required="true"
	 * @generated
	 */
	Gate getTrg();

	/**
	 * Sets the value of the '{@link Flights.Flight#getTrg <em>Trg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trg</em>' reference.
	 * @see #getTrg()
	 * @generated
	 */
	void setTrg(Gate value);

	/**
	 * Returns the value of the '<em><b>Plane</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Flights.Plane#getFlights <em>Flights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plane</em>' reference.
	 * @see #setPlane(Plane)
	 * @see Flights.FlightsPackage#getFlight_Plane()
	 * @see Flights.Plane#getFlights
	 * @model opposite="flights" required="true"
	 * @generated
	 */
	Plane getPlane();

	/**
	 * Sets the value of the '{@link Flights.Flight#getPlane <em>Plane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plane</em>' reference.
	 * @see #getPlane()
	 * @generated
	 */
	void setPlane(Plane value);

} // Flight
