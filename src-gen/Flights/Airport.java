/**
 */
package Flights;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Airport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Flights.Airport#getGates <em>Gates</em>}</li>
 *   <li>{@link Flights.Airport#getSize <em>Size</em>}</li>
 *   <li>{@link Flights.Airport#getOutgoingRoutes <em>Outgoing Routes</em>}</li>
 *   <li>{@link Flights.Airport#getIncomingRoutes <em>Incoming Routes</em>}</li>
 * </ul>
 *
 * @see Flights.FlightsPackage#getAirport()
 * @model
 * @generated
 */
public interface Airport extends FlightObject {
	/**
	 * Returns the value of the '<em><b>Gates</b></em>' containment reference list.
	 * The list contents are of type {@link Flights.Gate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gates</em>' containment reference list.
	 * @see Flights.FlightsPackage#getAirport_Gates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gate> getGates();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(double)
	 * @see Flights.FlightsPackage#getAirport_Size()
	 * @model default="1.0"
	 * @generated
	 */
	double getSize();

	/**
	 * Sets the value of the '{@link Flights.Airport#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(double value);

	/**
	 * Returns the value of the '<em><b>Outgoing Routes</b></em>' reference list.
	 * The list contents are of type {@link Flights.Route}.
	 * It is bidirectional and its opposite is '{@link Flights.Route#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Routes</em>' reference list.
	 * @see Flights.FlightsPackage#getAirport_OutgoingRoutes()
	 * @see Flights.Route#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<Route> getOutgoingRoutes();

	/**
	 * Returns the value of the '<em><b>Incoming Routes</b></em>' reference list.
	 * The list contents are of type {@link Flights.Route}.
	 * It is bidirectional and its opposite is '{@link Flights.Route#getTrg <em>Trg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Routes</em>' reference list.
	 * @see Flights.FlightsPackage#getAirport_IncomingRoutes()
	 * @see Flights.Route#getTrg
	 * @model opposite="trg"
	 * @generated
	 */
	EList<Route> getIncomingRoutes();

} // Airport
