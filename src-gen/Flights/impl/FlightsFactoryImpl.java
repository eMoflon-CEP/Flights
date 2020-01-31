/**
 */
package Flights.impl;

import Flights.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlightsFactoryImpl extends EFactoryImpl implements FlightsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FlightsFactory init() {
		try {
			FlightsFactory theFlightsFactory = (FlightsFactory) EPackage.Registry.INSTANCE
					.getEFactory(FlightsPackage.eNS_URI);
			if (theFlightsFactory != null) {
				return theFlightsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FlightsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlightsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FlightsPackage.FLIGHT_MODEL:
			return createFlightModel();
		case FlightsPackage.FLIGHT_CONTAINER:
			return createFlightContainer();
		case FlightsPackage.FLIGHT:
			return createFlight();
		case FlightsPackage.BOOKINGS:
			return createBookings();
		case FlightsPackage.BOOKING:
			return createBooking();
		case FlightsPackage.ROUTES:
			return createRoutes();
		case FlightsPackage.ROUTE:
			return createRoute();
		case FlightsPackage.TRAVEL:
			return createTravel();
		case FlightsPackage.PERSONS:
			return createPersons();
		case FlightsPackage.PERSON:
			return createPerson();
		case FlightsPackage.AIRPORTS:
			return createAirports();
		case FlightsPackage.AIRPORT:
			return createAirport();
		case FlightsPackage.PLANES:
			return createPlanes();
		case FlightsPackage.PLANE:
			return createPlane();
		case FlightsPackage.GATE:
			return createGate();
		case FlightsPackage.TIME_STAMP:
			return createTimeStamp();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case FlightsPackage.TRAVEL_STATE:
			return createTravelStateFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case FlightsPackage.TRAVEL_STATE:
			return convertTravelStateToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightModel createFlightModel() {
		FlightModelImpl flightModel = new FlightModelImpl();
		return flightModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightContainer createFlightContainer() {
		FlightContainerImpl flightContainer = new FlightContainerImpl();
		return flightContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Flight createFlight() {
		FlightImpl flight = new FlightImpl();
		return flight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bookings createBookings() {
		BookingsImpl bookings = new BookingsImpl();
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Booking createBooking() {
		BookingImpl booking = new BookingImpl();
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Routes createRoutes() {
		RoutesImpl routes = new RoutesImpl();
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Route createRoute() {
		RouteImpl route = new RouteImpl();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Travel createTravel() {
		TravelImpl travel = new TravelImpl();
		return travel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Persons createPersons() {
		PersonsImpl persons = new PersonsImpl();
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Airports createAirports() {
		AirportsImpl airports = new AirportsImpl();
		return airports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Airport createAirport() {
		AirportImpl airport = new AirportImpl();
		return airport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planes createPlanes() {
		PlanesImpl planes = new PlanesImpl();
		return planes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Plane createPlane() {
		PlaneImpl plane = new PlaneImpl();
		return plane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gate createGate() {
		GateImpl gate = new GateImpl();
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeStamp createTimeStamp() {
		TimeStampImpl timeStamp = new TimeStampImpl();
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelState createTravelStateFromString(EDataType eDataType, String initialValue) {
		TravelState result = TravelState.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTravelStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightsPackage getFlightsPackage() {
		return (FlightsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FlightsPackage getPackage() {
		return FlightsPackage.eINSTANCE;
	}

} //FlightsFactoryImpl
