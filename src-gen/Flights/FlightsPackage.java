/**
 */
package Flights;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Flights.FlightsFactory
 * @model kind="package"
 * @generated
 */
public interface FlightsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Flights";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/Flights/model/Flights.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Flights";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlightsPackage eINSTANCE = Flights.impl.FlightsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Flights.impl.FlightModelImpl <em>Flight Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Flights.impl.FlightModelImpl
	 * @see Flights.impl.FlightsPackageImpl#getFlightModel()
	 * @generated
	 */
	int FLIGHT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Flights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_MODEL__FLIGHTS = 0;

	/**
	 * The feature id for the '<em><b>Bookings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_MODEL__BOOKINGS = 1;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_MODEL__PERSONS = 2;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_MODEL__ROUTES = 3;

	/**
	 * The feature id for the '<em><b>Airports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_MODEL__AIRPORTS = 4;

	/**
	 * The feature id for the '<em><b>Planes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_MODEL__PLANES = 5;

	/**
	 * The feature id for the '<em><b>Global Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_MODEL__GLOBAL_TIME = 6;

	/**
	 * The number of structural features of the '<em>Flight Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_MODEL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Flight Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Flights.impl.FlightObjectImpl <em>Flight Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Flights.impl.FlightObjectImpl
	 * @see Flights.impl.FlightsPackageImpl#getFlightObject()
	 * @generated
	 */
	int FLIGHT_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_OBJECT__ID = 0;

	/**
	 * The number of structural features of the '<em>Flight Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Flight Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Flights.impl.FlightContainerImpl <em>Flight Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Flights.impl.FlightContainerImpl
	 * @see Flights.impl.FlightsPackageImpl#getFlightContainer()
	 * @generated
	 */
	int FLIGHT_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Flights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_CONTAINER__FLIGHTS = 0;

	/**
	 * The number of structural features of the '<em>Flight Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Flight Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Flights.impl.FlightImpl <em>Flight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Flights.impl.FlightImpl
	 * @see Flights.impl.FlightsPackageImpl#getFlight()
	 * @generated
	 */
	int FLIGHT = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__ID = FLIGHT_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Travels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__TRAVELS = FLIGHT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__ROUTE = FLIGHT_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__SRC = FLIGHT_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__TRG = FLIGHT_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Plane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__PLANE = FLIGHT_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Departure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__DEPARTURE = FLIGHT_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Arrival</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__ARRIVAL = FLIGHT_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Flight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_FEATURE_COUNT = FLIGHT_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Flight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_OPERATION_COUNT = FLIGHT_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Flights.impl.BookingsImpl <em>Bookings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Flights.impl.BookingsImpl
	 * @see Flights.impl.FlightsPackageImpl#getBookings()
	 * @generated
	 */
	int BOOKINGS = 4;

	/**
	 * The feature id for the '<em><b>Bookings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS__BOOKINGS = 0;

	/**
	 * The number of structural features of the '<em>Bookings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bookings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Flights.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Flights.impl.BookingImpl
	 * @see Flights.impl.FlightsPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ID = FLIGHT_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Travels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__TRAVELS = FLIGHT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = FLIGHT_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = FLIGHT_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Flights.impl.RoutesImpl <em>Routes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Flights.impl.RoutesImpl
	 * @see Flights.impl.FlightsPackageImpl#getRoutes()
	 * @generated
	 */
	int ROUTES = 6;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTES__ROUTES = 0;

	/**
	 * The number of structural features of the '<em>Routes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Routes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Flights.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Flights.impl.RouteImpl
	 * @see Flights.impl.FlightsPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__ID = FLIGHT_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__DURATION = FLIGHT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flights</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__FLIGHTS = FLIGHT_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__SRC = FLIGHT_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__TRG = FLIGHT_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = FLIGHT_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = FLIGHT_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Flights.impl.TravelImpl <em>Travel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Flights.impl.TravelImpl
	 * @see Flights.impl.FlightsPackageImpl#getTravel()
	 * @generated
	 */
	int TRAVEL = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL__ID = FLIGHT_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Flights</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL__FLIGHTS = FLIGHT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL__PERSON = FLIGHT_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Travel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_FEATURE_COUNT = FLIGHT_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Travel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_OPERATION_COUNT = FLIGHT_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Flights.impl.PersonsImpl <em>Persons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Flights.impl.PersonsImpl
	 * @see Flights.impl.FlightsPackageImpl#getPersons()
	 * @generated
	 */
	int PERSONS = 9;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS__PERSONS = 0;

	/**
	 * The number of structural features of the '<em>Persons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Persons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Flights.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Flights.impl.PersonImpl
	 * @see Flights.impl.FlightsPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = FLIGHT_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Travel State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TRAVEL_STATE = FLIGHT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Travels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TRAVELS = FLIGHT_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = FLIGHT_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = FLIGHT_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Flights.impl.AirportsImpl <em>Airports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Flights.impl.AirportsImpl
	 * @see Flights.impl.FlightsPackageImpl#getAirports()
	 * @generated
	 */
	int AIRPORTS = 11;

	/**
	 * The feature id for the '<em><b>Airports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORTS__AIRPORTS = 0;

	/**
	 * The number of structural features of the '<em>Airports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Airports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Flights.impl.AirportImpl <em>Airport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Flights.impl.AirportImpl
	 * @see Flights.impl.FlightsPackageImpl#getAirport()
	 * @generated
	 */
	int AIRPORT = 12;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__ID = FLIGHT_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__GATES = FLIGHT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__SIZE = FLIGHT_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Routes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__OUTGOING_ROUTES = FLIGHT_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming Routes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__INCOMING_ROUTES = FLIGHT_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Airport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT_FEATURE_COUNT = FLIGHT_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Airport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT_OPERATION_COUNT = FLIGHT_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Flights.impl.PlanesImpl <em>Planes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Flights.impl.PlanesImpl
	 * @see Flights.impl.FlightsPackageImpl#getPlanes()
	 * @generated
	 */
	int PLANES = 13;

	/**
	 * The feature id for the '<em><b>Planes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANES__PLANES = 0;

	/**
	 * The number of structural features of the '<em>Planes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Planes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Flights.impl.PlaneImpl <em>Plane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Flights.impl.PlaneImpl
	 * @see Flights.impl.FlightsPackageImpl#getPlane()
	 * @generated
	 */
	int PLANE = 14;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__ID = FLIGHT_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__CAPACITY = FLIGHT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flights</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__FLIGHTS = FLIGHT_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_FEATURE_COUNT = FLIGHT_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Plane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_OPERATION_COUNT = FLIGHT_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Flights.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Flights.impl.GateImpl
	 * @see Flights.impl.FlightsPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 15;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__ID = FLIGHT_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__POSITION = FLIGHT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Flights</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__OUTGOING_FLIGHTS = FLIGHT_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming Flights</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__INCOMING_FLIGHTS = FLIGHT_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = FLIGHT_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_OPERATION_COUNT = FLIGHT_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Flights.impl.TimeStampImpl <em>Time Stamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Flights.impl.TimeStampImpl
	 * @see Flights.impl.FlightsPackageImpl#getTimeStamp()
	 * @generated
	 */
	int TIME_STAMP = 16;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP__TIME = 0;

	/**
	 * The number of structural features of the '<em>Time Stamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Time Stamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Flights.TravelState <em>Travel State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Flights.TravelState
	 * @see Flights.impl.FlightsPackageImpl#getTravelState()
	 * @generated
	 */
	int TRAVEL_STATE = 17;

	/**
	 * Returns the meta object for class '{@link Flights.FlightModel <em>Flight Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flight Model</em>'.
	 * @see Flights.FlightModel
	 * @generated
	 */
	EClass getFlightModel();

	/**
	 * Returns the meta object for the containment reference '{@link Flights.FlightModel#getFlights <em>Flights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flights</em>'.
	 * @see Flights.FlightModel#getFlights()
	 * @see #getFlightModel()
	 * @generated
	 */
	EReference getFlightModel_Flights();

	/**
	 * Returns the meta object for the containment reference '{@link Flights.FlightModel#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bookings</em>'.
	 * @see Flights.FlightModel#getBookings()
	 * @see #getFlightModel()
	 * @generated
	 */
	EReference getFlightModel_Bookings();

	/**
	 * Returns the meta object for the containment reference '{@link Flights.FlightModel#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persons</em>'.
	 * @see Flights.FlightModel#getPersons()
	 * @see #getFlightModel()
	 * @generated
	 */
	EReference getFlightModel_Persons();

	/**
	 * Returns the meta object for the containment reference '{@link Flights.FlightModel#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Routes</em>'.
	 * @see Flights.FlightModel#getRoutes()
	 * @see #getFlightModel()
	 * @generated
	 */
	EReference getFlightModel_Routes();

	/**
	 * Returns the meta object for the containment reference '{@link Flights.FlightModel#getAirports <em>Airports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Airports</em>'.
	 * @see Flights.FlightModel#getAirports()
	 * @see #getFlightModel()
	 * @generated
	 */
	EReference getFlightModel_Airports();

	/**
	 * Returns the meta object for the containment reference '{@link Flights.FlightModel#getPlanes <em>Planes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Planes</em>'.
	 * @see Flights.FlightModel#getPlanes()
	 * @see #getFlightModel()
	 * @generated
	 */
	EReference getFlightModel_Planes();

	/**
	 * Returns the meta object for the containment reference '{@link Flights.FlightModel#getGlobalTime <em>Global Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Time</em>'.
	 * @see Flights.FlightModel#getGlobalTime()
	 * @see #getFlightModel()
	 * @generated
	 */
	EReference getFlightModel_GlobalTime();

	/**
	 * Returns the meta object for class '{@link Flights.FlightObject <em>Flight Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flight Object</em>'.
	 * @see Flights.FlightObject
	 * @generated
	 */
	EClass getFlightObject();

	/**
	 * Returns the meta object for the attribute '{@link Flights.FlightObject#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Flights.FlightObject#getID()
	 * @see #getFlightObject()
	 * @generated
	 */
	EAttribute getFlightObject_ID();

	/**
	 * Returns the meta object for class '{@link Flights.FlightContainer <em>Flight Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flight Container</em>'.
	 * @see Flights.FlightContainer
	 * @generated
	 */
	EClass getFlightContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link Flights.FlightContainer#getFlights <em>Flights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flights</em>'.
	 * @see Flights.FlightContainer#getFlights()
	 * @see #getFlightContainer()
	 * @generated
	 */
	EReference getFlightContainer_Flights();

	/**
	 * Returns the meta object for class '{@link Flights.Flight <em>Flight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flight</em>'.
	 * @see Flights.Flight
	 * @generated
	 */
	EClass getFlight();

	/**
	 * Returns the meta object for the containment reference '{@link Flights.Flight#getDeparture <em>Departure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Departure</em>'.
	 * @see Flights.Flight#getDeparture()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_Departure();

	/**
	 * Returns the meta object for the containment reference '{@link Flights.Flight#getArrival <em>Arrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrival</em>'.
	 * @see Flights.Flight#getArrival()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_Arrival();

	/**
	 * Returns the meta object for the reference list '{@link Flights.Flight#getTravels <em>Travels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Travels</em>'.
	 * @see Flights.Flight#getTravels()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_Travels();

	/**
	 * Returns the meta object for the reference '{@link Flights.Flight#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route</em>'.
	 * @see Flights.Flight#getRoute()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_Route();

	/**
	 * Returns the meta object for the reference '{@link Flights.Flight#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see Flights.Flight#getSrc()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_Src();

	/**
	 * Returns the meta object for the reference '{@link Flights.Flight#getTrg <em>Trg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trg</em>'.
	 * @see Flights.Flight#getTrg()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_Trg();

	/**
	 * Returns the meta object for the reference '{@link Flights.Flight#getPlane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plane</em>'.
	 * @see Flights.Flight#getPlane()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_Plane();

	/**
	 * Returns the meta object for class '{@link Flights.Bookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bookings</em>'.
	 * @see Flights.Bookings
	 * @generated
	 */
	EClass getBookings();

	/**
	 * Returns the meta object for the containment reference list '{@link Flights.Bookings#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bookings</em>'.
	 * @see Flights.Bookings#getBookings()
	 * @see #getBookings()
	 * @generated
	 */
	EReference getBookings_Bookings();

	/**
	 * Returns the meta object for class '{@link Flights.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see Flights.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the containment reference list '{@link Flights.Booking#getTravels <em>Travels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Travels</em>'.
	 * @see Flights.Booking#getTravels()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Travels();

	/**
	 * Returns the meta object for class '{@link Flights.Routes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routes</em>'.
	 * @see Flights.Routes
	 * @generated
	 */
	EClass getRoutes();

	/**
	 * Returns the meta object for the containment reference list '{@link Flights.Routes#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routes</em>'.
	 * @see Flights.Routes#getRoutes()
	 * @see #getRoutes()
	 * @generated
	 */
	EReference getRoutes_Routes();

	/**
	 * Returns the meta object for class '{@link Flights.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see Flights.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the attribute '{@link Flights.Route#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see Flights.Route#getDuration()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Duration();

	/**
	 * Returns the meta object for the reference list '{@link Flights.Route#getFlights <em>Flights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flights</em>'.
	 * @see Flights.Route#getFlights()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Flights();

	/**
	 * Returns the meta object for the reference '{@link Flights.Route#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see Flights.Route#getSrc()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Src();

	/**
	 * Returns the meta object for the reference '{@link Flights.Route#getTrg <em>Trg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trg</em>'.
	 * @see Flights.Route#getTrg()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Trg();

	/**
	 * Returns the meta object for class '{@link Flights.Travel <em>Travel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travel</em>'.
	 * @see Flights.Travel
	 * @generated
	 */
	EClass getTravel();

	/**
	 * Returns the meta object for the reference list '{@link Flights.Travel#getFlights <em>Flights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flights</em>'.
	 * @see Flights.Travel#getFlights()
	 * @see #getTravel()
	 * @generated
	 */
	EReference getTravel_Flights();

	/**
	 * Returns the meta object for the reference '{@link Flights.Travel#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see Flights.Travel#getPerson()
	 * @see #getTravel()
	 * @generated
	 */
	EReference getTravel_Person();

	/**
	 * Returns the meta object for class '{@link Flights.Persons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persons</em>'.
	 * @see Flights.Persons
	 * @generated
	 */
	EClass getPersons();

	/**
	 * Returns the meta object for the containment reference list '{@link Flights.Persons#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see Flights.Persons#getPersons()
	 * @see #getPersons()
	 * @generated
	 */
	EReference getPersons_Persons();

	/**
	 * Returns the meta object for class '{@link Flights.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see Flights.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link Flights.Person#getTravelState <em>Travel State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel State</em>'.
	 * @see Flights.Person#getTravelState()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_TravelState();

	/**
	 * Returns the meta object for the reference list '{@link Flights.Person#getTravels <em>Travels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Travels</em>'.
	 * @see Flights.Person#getTravels()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Travels();

	/**
	 * Returns the meta object for class '{@link Flights.Airports <em>Airports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Airports</em>'.
	 * @see Flights.Airports
	 * @generated
	 */
	EClass getAirports();

	/**
	 * Returns the meta object for the containment reference list '{@link Flights.Airports#getAirports <em>Airports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Airports</em>'.
	 * @see Flights.Airports#getAirports()
	 * @see #getAirports()
	 * @generated
	 */
	EReference getAirports_Airports();

	/**
	 * Returns the meta object for class '{@link Flights.Airport <em>Airport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Airport</em>'.
	 * @see Flights.Airport
	 * @generated
	 */
	EClass getAirport();

	/**
	 * Returns the meta object for the containment reference list '{@link Flights.Airport#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see Flights.Airport#getGates()
	 * @see #getAirport()
	 * @generated
	 */
	EReference getAirport_Gates();

	/**
	 * Returns the meta object for the attribute '{@link Flights.Airport#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see Flights.Airport#getSize()
	 * @see #getAirport()
	 * @generated
	 */
	EAttribute getAirport_Size();

	/**
	 * Returns the meta object for the reference list '{@link Flights.Airport#getOutgoingRoutes <em>Outgoing Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Routes</em>'.
	 * @see Flights.Airport#getOutgoingRoutes()
	 * @see #getAirport()
	 * @generated
	 */
	EReference getAirport_OutgoingRoutes();

	/**
	 * Returns the meta object for the reference list '{@link Flights.Airport#getIncomingRoutes <em>Incoming Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Routes</em>'.
	 * @see Flights.Airport#getIncomingRoutes()
	 * @see #getAirport()
	 * @generated
	 */
	EReference getAirport_IncomingRoutes();

	/**
	 * Returns the meta object for class '{@link Flights.Planes <em>Planes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planes</em>'.
	 * @see Flights.Planes
	 * @generated
	 */
	EClass getPlanes();

	/**
	 * Returns the meta object for the containment reference list '{@link Flights.Planes#getPlanes <em>Planes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Planes</em>'.
	 * @see Flights.Planes#getPlanes()
	 * @see #getPlanes()
	 * @generated
	 */
	EReference getPlanes_Planes();

	/**
	 * Returns the meta object for class '{@link Flights.Plane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plane</em>'.
	 * @see Flights.Plane
	 * @generated
	 */
	EClass getPlane();

	/**
	 * Returns the meta object for the attribute '{@link Flights.Plane#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see Flights.Plane#getCapacity()
	 * @see #getPlane()
	 * @generated
	 */
	EAttribute getPlane_Capacity();

	/**
	 * Returns the meta object for the reference list '{@link Flights.Plane#getFlights <em>Flights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flights</em>'.
	 * @see Flights.Plane#getFlights()
	 * @see #getPlane()
	 * @generated
	 */
	EReference getPlane_Flights();

	/**
	 * Returns the meta object for class '{@link Flights.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see Flights.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the attribute '{@link Flights.Gate#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see Flights.Gate#getPosition()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_Position();

	/**
	 * Returns the meta object for the reference list '{@link Flights.Gate#getOutgoingFlights <em>Outgoing Flights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Flights</em>'.
	 * @see Flights.Gate#getOutgoingFlights()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_OutgoingFlights();

	/**
	 * Returns the meta object for the reference list '{@link Flights.Gate#getIncomingFlights <em>Incoming Flights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Flights</em>'.
	 * @see Flights.Gate#getIncomingFlights()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_IncomingFlights();

	/**
	 * Returns the meta object for class '{@link Flights.TimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Stamp</em>'.
	 * @see Flights.TimeStamp
	 * @generated
	 */
	EClass getTimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link Flights.TimeStamp#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see Flights.TimeStamp#getTime()
	 * @see #getTimeStamp()
	 * @generated
	 */
	EAttribute getTimeStamp_Time();

	/**
	 * Returns the meta object for enum '{@link Flights.TravelState <em>Travel State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Travel State</em>'.
	 * @see Flights.TravelState
	 * @generated
	 */
	EEnum getTravelState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlightsFactory getFlightsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Flights.impl.FlightModelImpl <em>Flight Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Flights.impl.FlightModelImpl
		 * @see Flights.impl.FlightsPackageImpl#getFlightModel()
		 * @generated
		 */
		EClass FLIGHT_MODEL = eINSTANCE.getFlightModel();

		/**
		 * The meta object literal for the '<em><b>Flights</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT_MODEL__FLIGHTS = eINSTANCE.getFlightModel_Flights();

		/**
		 * The meta object literal for the '<em><b>Bookings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT_MODEL__BOOKINGS = eINSTANCE.getFlightModel_Bookings();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT_MODEL__PERSONS = eINSTANCE.getFlightModel_Persons();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT_MODEL__ROUTES = eINSTANCE.getFlightModel_Routes();

		/**
		 * The meta object literal for the '<em><b>Airports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT_MODEL__AIRPORTS = eINSTANCE.getFlightModel_Airports();

		/**
		 * The meta object literal for the '<em><b>Planes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT_MODEL__PLANES = eINSTANCE.getFlightModel_Planes();

		/**
		 * The meta object literal for the '<em><b>Global Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT_MODEL__GLOBAL_TIME = eINSTANCE.getFlightModel_GlobalTime();

		/**
		 * The meta object literal for the '{@link Flights.impl.FlightObjectImpl <em>Flight Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Flights.impl.FlightObjectImpl
		 * @see Flights.impl.FlightsPackageImpl#getFlightObject()
		 * @generated
		 */
		EClass FLIGHT_OBJECT = eINSTANCE.getFlightObject();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_OBJECT__ID = eINSTANCE.getFlightObject_ID();

		/**
		 * The meta object literal for the '{@link Flights.impl.FlightContainerImpl <em>Flight Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Flights.impl.FlightContainerImpl
		 * @see Flights.impl.FlightsPackageImpl#getFlightContainer()
		 * @generated
		 */
		EClass FLIGHT_CONTAINER = eINSTANCE.getFlightContainer();

		/**
		 * The meta object literal for the '<em><b>Flights</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT_CONTAINER__FLIGHTS = eINSTANCE.getFlightContainer_Flights();

		/**
		 * The meta object literal for the '{@link Flights.impl.FlightImpl <em>Flight</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Flights.impl.FlightImpl
		 * @see Flights.impl.FlightsPackageImpl#getFlight()
		 * @generated
		 */
		EClass FLIGHT = eINSTANCE.getFlight();

		/**
		 * The meta object literal for the '<em><b>Departure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__DEPARTURE = eINSTANCE.getFlight_Departure();

		/**
		 * The meta object literal for the '<em><b>Arrival</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__ARRIVAL = eINSTANCE.getFlight_Arrival();

		/**
		 * The meta object literal for the '<em><b>Travels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__TRAVELS = eINSTANCE.getFlight_Travels();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__ROUTE = eINSTANCE.getFlight_Route();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__SRC = eINSTANCE.getFlight_Src();

		/**
		 * The meta object literal for the '<em><b>Trg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__TRG = eINSTANCE.getFlight_Trg();

		/**
		 * The meta object literal for the '<em><b>Plane</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__PLANE = eINSTANCE.getFlight_Plane();

		/**
		 * The meta object literal for the '{@link Flights.impl.BookingsImpl <em>Bookings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Flights.impl.BookingsImpl
		 * @see Flights.impl.FlightsPackageImpl#getBookings()
		 * @generated
		 */
		EClass BOOKINGS = eINSTANCE.getBookings();

		/**
		 * The meta object literal for the '<em><b>Bookings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKINGS__BOOKINGS = eINSTANCE.getBookings_Bookings();

		/**
		 * The meta object literal for the '{@link Flights.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Flights.impl.BookingImpl
		 * @see Flights.impl.FlightsPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Travels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__TRAVELS = eINSTANCE.getBooking_Travels();

		/**
		 * The meta object literal for the '{@link Flights.impl.RoutesImpl <em>Routes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Flights.impl.RoutesImpl
		 * @see Flights.impl.FlightsPackageImpl#getRoutes()
		 * @generated
		 */
		EClass ROUTES = eINSTANCE.getRoutes();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTES__ROUTES = eINSTANCE.getRoutes_Routes();

		/**
		 * The meta object literal for the '{@link Flights.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Flights.impl.RouteImpl
		 * @see Flights.impl.FlightsPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__DURATION = eINSTANCE.getRoute_Duration();

		/**
		 * The meta object literal for the '<em><b>Flights</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__FLIGHTS = eINSTANCE.getRoute_Flights();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__SRC = eINSTANCE.getRoute_Src();

		/**
		 * The meta object literal for the '<em><b>Trg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__TRG = eINSTANCE.getRoute_Trg();

		/**
		 * The meta object literal for the '{@link Flights.impl.TravelImpl <em>Travel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Flights.impl.TravelImpl
		 * @see Flights.impl.FlightsPackageImpl#getTravel()
		 * @generated
		 */
		EClass TRAVEL = eINSTANCE.getTravel();

		/**
		 * The meta object literal for the '<em><b>Flights</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL__FLIGHTS = eINSTANCE.getTravel_Flights();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL__PERSON = eINSTANCE.getTravel_Person();

		/**
		 * The meta object literal for the '{@link Flights.impl.PersonsImpl <em>Persons</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Flights.impl.PersonsImpl
		 * @see Flights.impl.FlightsPackageImpl#getPersons()
		 * @generated
		 */
		EClass PERSONS = eINSTANCE.getPersons();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONS__PERSONS = eINSTANCE.getPersons_Persons();

		/**
		 * The meta object literal for the '{@link Flights.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Flights.impl.PersonImpl
		 * @see Flights.impl.FlightsPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Travel State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__TRAVEL_STATE = eINSTANCE.getPerson_TravelState();

		/**
		 * The meta object literal for the '<em><b>Travels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__TRAVELS = eINSTANCE.getPerson_Travels();

		/**
		 * The meta object literal for the '{@link Flights.impl.AirportsImpl <em>Airports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Flights.impl.AirportsImpl
		 * @see Flights.impl.FlightsPackageImpl#getAirports()
		 * @generated
		 */
		EClass AIRPORTS = eINSTANCE.getAirports();

		/**
		 * The meta object literal for the '<em><b>Airports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIRPORTS__AIRPORTS = eINSTANCE.getAirports_Airports();

		/**
		 * The meta object literal for the '{@link Flights.impl.AirportImpl <em>Airport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Flights.impl.AirportImpl
		 * @see Flights.impl.FlightsPackageImpl#getAirport()
		 * @generated
		 */
		EClass AIRPORT = eINSTANCE.getAirport();

		/**
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIRPORT__GATES = eINSTANCE.getAirport_Gates();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRPORT__SIZE = eINSTANCE.getAirport_Size();

		/**
		 * The meta object literal for the '<em><b>Outgoing Routes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIRPORT__OUTGOING_ROUTES = eINSTANCE.getAirport_OutgoingRoutes();

		/**
		 * The meta object literal for the '<em><b>Incoming Routes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIRPORT__INCOMING_ROUTES = eINSTANCE.getAirport_IncomingRoutes();

		/**
		 * The meta object literal for the '{@link Flights.impl.PlanesImpl <em>Planes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Flights.impl.PlanesImpl
		 * @see Flights.impl.FlightsPackageImpl#getPlanes()
		 * @generated
		 */
		EClass PLANES = eINSTANCE.getPlanes();

		/**
		 * The meta object literal for the '<em><b>Planes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANES__PLANES = eINSTANCE.getPlanes_Planes();

		/**
		 * The meta object literal for the '{@link Flights.impl.PlaneImpl <em>Plane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Flights.impl.PlaneImpl
		 * @see Flights.impl.FlightsPackageImpl#getPlane()
		 * @generated
		 */
		EClass PLANE = eINSTANCE.getPlane();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANE__CAPACITY = eINSTANCE.getPlane_Capacity();

		/**
		 * The meta object literal for the '<em><b>Flights</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANE__FLIGHTS = eINSTANCE.getPlane_Flights();

		/**
		 * The meta object literal for the '{@link Flights.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Flights.impl.GateImpl
		 * @see Flights.impl.FlightsPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__POSITION = eINSTANCE.getGate_Position();

		/**
		 * The meta object literal for the '<em><b>Outgoing Flights</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__OUTGOING_FLIGHTS = eINSTANCE.getGate_OutgoingFlights();

		/**
		 * The meta object literal for the '<em><b>Incoming Flights</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__INCOMING_FLIGHTS = eINSTANCE.getGate_IncomingFlights();

		/**
		 * The meta object literal for the '{@link Flights.impl.TimeStampImpl <em>Time Stamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Flights.impl.TimeStampImpl
		 * @see Flights.impl.FlightsPackageImpl#getTimeStamp()
		 * @generated
		 */
		EClass TIME_STAMP = eINSTANCE.getTimeStamp();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STAMP__TIME = eINSTANCE.getTimeStamp_Time();

		/**
		 * The meta object literal for the '{@link Flights.TravelState <em>Travel State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Flights.TravelState
		 * @see Flights.impl.FlightsPackageImpl#getTravelState()
		 * @generated
		 */
		EEnum TRAVEL_STATE = eINSTANCE.getTravelState();

	}

} //FlightsPackage
