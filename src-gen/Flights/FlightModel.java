/**
 */
package Flights;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Flights.FlightModel#getFlights <em>Flights</em>}</li>
 *   <li>{@link Flights.FlightModel#getBookings <em>Bookings</em>}</li>
 *   <li>{@link Flights.FlightModel#getPersons <em>Persons</em>}</li>
 *   <li>{@link Flights.FlightModel#getRoutes <em>Routes</em>}</li>
 *   <li>{@link Flights.FlightModel#getAirports <em>Airports</em>}</li>
 *   <li>{@link Flights.FlightModel#getPlanes <em>Planes</em>}</li>
 *   <li>{@link Flights.FlightModel#getGlobalTime <em>Global Time</em>}</li>
 * </ul>
 *
 * @see Flights.FlightsPackage#getFlightModel()
 * @model
 * @generated
 */
public interface FlightModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Flights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flights</em>' containment reference.
	 * @see #setFlights(FlightContainer)
	 * @see Flights.FlightsPackage#getFlightModel_Flights()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FlightContainer getFlights();

	/**
	 * Sets the value of the '{@link Flights.FlightModel#getFlights <em>Flights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flights</em>' containment reference.
	 * @see #getFlights()
	 * @generated
	 */
	void setFlights(FlightContainer value);

	/**
	 * Returns the value of the '<em><b>Bookings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings</em>' containment reference.
	 * @see #setBookings(Bookings)
	 * @see Flights.FlightsPackage#getFlightModel_Bookings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Bookings getBookings();

	/**
	 * Sets the value of the '{@link Flights.FlightModel#getBookings <em>Bookings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bookings</em>' containment reference.
	 * @see #getBookings()
	 * @generated
	 */
	void setBookings(Bookings value);

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference.
	 * @see #setPersons(Persons)
	 * @see Flights.FlightsPackage#getFlightModel_Persons()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Persons getPersons();

	/**
	 * Sets the value of the '{@link Flights.FlightModel#getPersons <em>Persons</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persons</em>' containment reference.
	 * @see #getPersons()
	 * @generated
	 */
	void setPersons(Persons value);

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference.
	 * @see #setRoutes(Routes)
	 * @see Flights.FlightsPackage#getFlightModel_Routes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Routes getRoutes();

	/**
	 * Sets the value of the '{@link Flights.FlightModel#getRoutes <em>Routes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routes</em>' containment reference.
	 * @see #getRoutes()
	 * @generated
	 */
	void setRoutes(Routes value);

	/**
	 * Returns the value of the '<em><b>Airports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Airports</em>' containment reference.
	 * @see #setAirports(Airports)
	 * @see Flights.FlightsPackage#getFlightModel_Airports()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Airports getAirports();

	/**
	 * Sets the value of the '{@link Flights.FlightModel#getAirports <em>Airports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Airports</em>' containment reference.
	 * @see #getAirports()
	 * @generated
	 */
	void setAirports(Airports value);

	/**
	 * Returns the value of the '<em><b>Planes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planes</em>' containment reference.
	 * @see #setPlanes(Planes)
	 * @see Flights.FlightsPackage#getFlightModel_Planes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Planes getPlanes();

	/**
	 * Sets the value of the '{@link Flights.FlightModel#getPlanes <em>Planes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planes</em>' containment reference.
	 * @see #getPlanes()
	 * @generated
	 */
	void setPlanes(Planes value);

	/**
	 * Returns the value of the '<em><b>Global Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Time</em>' containment reference.
	 * @see #setGlobalTime(TimeStamp)
	 * @see Flights.FlightsPackage#getFlightModel_GlobalTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeStamp getGlobalTime();

	/**
	 * Sets the value of the '{@link Flights.FlightModel#getGlobalTime <em>Global Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Time</em>' containment reference.
	 * @see #getGlobalTime()
	 * @generated
	 */
	void setGlobalTime(TimeStamp value);

} // FlightModel
