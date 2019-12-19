/**
 */
package Flights.util;

import Flights.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Flights.FlightsPackage
 * @generated
 */
public class FlightsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FlightsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlightsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FlightsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightsSwitch<Adapter> modelSwitch = new FlightsSwitch<Adapter>() {
		@Override
		public Adapter caseFlightModel(FlightModel object) {
			return createFlightModelAdapter();
		}

		@Override
		public Adapter caseFlightObject(FlightObject object) {
			return createFlightObjectAdapter();
		}

		@Override
		public Adapter caseFlightContainer(FlightContainer object) {
			return createFlightContainerAdapter();
		}

		@Override
		public Adapter caseFlight(Flight object) {
			return createFlightAdapter();
		}

		@Override
		public Adapter caseBookings(Bookings object) {
			return createBookingsAdapter();
		}

		@Override
		public Adapter caseBooking(Booking object) {
			return createBookingAdapter();
		}

		@Override
		public Adapter caseRoutes(Routes object) {
			return createRoutesAdapter();
		}

		@Override
		public Adapter caseRoute(Route object) {
			return createRouteAdapter();
		}

		@Override
		public Adapter caseTravel(Travel object) {
			return createTravelAdapter();
		}

		@Override
		public Adapter casePersons(Persons object) {
			return createPersonsAdapter();
		}

		@Override
		public Adapter casePerson(Person object) {
			return createPersonAdapter();
		}

		@Override
		public Adapter caseAirports(Airports object) {
			return createAirportsAdapter();
		}

		@Override
		public Adapter caseAirport(Airport object) {
			return createAirportAdapter();
		}

		@Override
		public Adapter casePlanes(Planes object) {
			return createPlanesAdapter();
		}

		@Override
		public Adapter casePlane(Plane object) {
			return createPlaneAdapter();
		}

		@Override
		public Adapter caseGate(Gate object) {
			return createGateAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link Flights.FlightModel <em>Flight Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Flights.FlightModel
	 * @generated
	 */
	public Adapter createFlightModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Flights.FlightObject <em>Flight Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Flights.FlightObject
	 * @generated
	 */
	public Adapter createFlightObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Flights.FlightContainer <em>Flight Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Flights.FlightContainer
	 * @generated
	 */
	public Adapter createFlightContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Flights.Flight <em>Flight</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Flights.Flight
	 * @generated
	 */
	public Adapter createFlightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Flights.Bookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Flights.Bookings
	 * @generated
	 */
	public Adapter createBookingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Flights.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Flights.Booking
	 * @generated
	 */
	public Adapter createBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Flights.Routes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Flights.Routes
	 * @generated
	 */
	public Adapter createRoutesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Flights.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Flights.Route
	 * @generated
	 */
	public Adapter createRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Flights.Travel <em>Travel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Flights.Travel
	 * @generated
	 */
	public Adapter createTravelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Flights.Persons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Flights.Persons
	 * @generated
	 */
	public Adapter createPersonsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Flights.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Flights.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Flights.Airports <em>Airports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Flights.Airports
	 * @generated
	 */
	public Adapter createAirportsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Flights.Airport <em>Airport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Flights.Airport
	 * @generated
	 */
	public Adapter createAirportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Flights.Planes <em>Planes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Flights.Planes
	 * @generated
	 */
	public Adapter createPlanesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Flights.Plane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Flights.Plane
	 * @generated
	 */
	public Adapter createPlaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Flights.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Flights.Gate
	 * @generated
	 */
	public Adapter createGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FlightsAdapterFactory
