/**
 */
package Flights;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Flights.Gate#getPosition <em>Position</em>}</li>
 *   <li>{@link Flights.Gate#getOutgoingFlights <em>Outgoing Flights</em>}</li>
 *   <li>{@link Flights.Gate#getIncomingFlights <em>Incoming Flights</em>}</li>
 * </ul>
 *
 * @see Flights.FlightsPackage#getGate()
 * @model
 * @generated
 */
public interface Gate extends FlightObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see Flights.FlightsPackage#getGate_Position()
	 * @model
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link Flights.Gate#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * Returns the value of the '<em><b>Outgoing Flights</b></em>' reference list.
	 * The list contents are of type {@link Flights.Flight}.
	 * It is bidirectional and its opposite is '{@link Flights.Flight#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Flights</em>' reference list.
	 * @see Flights.FlightsPackage#getGate_OutgoingFlights()
	 * @see Flights.Flight#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<Flight> getOutgoingFlights();

	/**
	 * Returns the value of the '<em><b>Incoming Flights</b></em>' reference list.
	 * The list contents are of type {@link Flights.Flight}.
	 * It is bidirectional and its opposite is '{@link Flights.Flight#getTrg <em>Trg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Flights</em>' reference list.
	 * @see Flights.FlightsPackage#getGate_IncomingFlights()
	 * @see Flights.Flight#getTrg
	 * @model opposite="trg"
	 * @generated
	 */
	EList<Flight> getIncomingFlights();

} // Gate
