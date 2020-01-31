/**
 */
package Flights.util;

import Flights.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Flights.FlightsPackage
 * @generated
 */
public class FlightsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FlightsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlightsSwitch() {
		if (modelPackage == null) {
			modelPackage = FlightsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case FlightsPackage.FLIGHT_MODEL: {
			FlightModel flightModel = (FlightModel) theEObject;
			T result = caseFlightModel(flightModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FlightsPackage.FLIGHT_OBJECT: {
			FlightObject flightObject = (FlightObject) theEObject;
			T result = caseFlightObject(flightObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FlightsPackage.FLIGHT_CONTAINER: {
			FlightContainer flightContainer = (FlightContainer) theEObject;
			T result = caseFlightContainer(flightContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FlightsPackage.FLIGHT: {
			Flight flight = (Flight) theEObject;
			T result = caseFlight(flight);
			if (result == null)
				result = caseFlightObject(flight);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FlightsPackage.BOOKINGS: {
			Bookings bookings = (Bookings) theEObject;
			T result = caseBookings(bookings);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FlightsPackage.BOOKING: {
			Booking booking = (Booking) theEObject;
			T result = caseBooking(booking);
			if (result == null)
				result = caseFlightObject(booking);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FlightsPackage.ROUTES: {
			Routes routes = (Routes) theEObject;
			T result = caseRoutes(routes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FlightsPackage.ROUTE: {
			Route route = (Route) theEObject;
			T result = caseRoute(route);
			if (result == null)
				result = caseFlightObject(route);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FlightsPackage.TRAVEL: {
			Travel travel = (Travel) theEObject;
			T result = caseTravel(travel);
			if (result == null)
				result = caseFlightObject(travel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FlightsPackage.PERSONS: {
			Persons persons = (Persons) theEObject;
			T result = casePersons(persons);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FlightsPackage.PERSON: {
			Person person = (Person) theEObject;
			T result = casePerson(person);
			if (result == null)
				result = caseFlightObject(person);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FlightsPackage.AIRPORTS: {
			Airports airports = (Airports) theEObject;
			T result = caseAirports(airports);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FlightsPackage.AIRPORT: {
			Airport airport = (Airport) theEObject;
			T result = caseAirport(airport);
			if (result == null)
				result = caseFlightObject(airport);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FlightsPackage.PLANES: {
			Planes planes = (Planes) theEObject;
			T result = casePlanes(planes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FlightsPackage.PLANE: {
			Plane plane = (Plane) theEObject;
			T result = casePlane(plane);
			if (result == null)
				result = caseFlightObject(plane);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FlightsPackage.GATE: {
			Gate gate = (Gate) theEObject;
			T result = caseGate(gate);
			if (result == null)
				result = caseFlightObject(gate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FlightsPackage.TIME_STAMP: {
			TimeStamp timeStamp = (TimeStamp) theEObject;
			T result = caseTimeStamp(timeStamp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightModel(FlightModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightObject(FlightObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightContainer(FlightContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlight(Flight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bookings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bookings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookings(Bookings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooking(Booking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Routes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Routes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoutes(Routes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoute(Route object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Travel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Travel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTravel(Travel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persons</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persons</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersons(Persons object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Airports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Airports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAirports(Airports object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Airport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Airport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAirport(Airport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanes(Planes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlane(Plane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGate(Gate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Stamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Stamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeStamp(TimeStamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FlightsSwitch
