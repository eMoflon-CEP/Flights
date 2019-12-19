/**
 */
package Flights.impl;

import Flights.Airports;
import Flights.Bookings;
import Flights.FlightContainer;
import Flights.FlightModel;
import Flights.FlightsPackage;
import Flights.Persons;
import Flights.Planes;
import Flights.Routes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Flights.impl.FlightModelImpl#getFlights <em>Flights</em>}</li>
 *   <li>{@link Flights.impl.FlightModelImpl#getBookings <em>Bookings</em>}</li>
 *   <li>{@link Flights.impl.FlightModelImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link Flights.impl.FlightModelImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link Flights.impl.FlightModelImpl#getAirports <em>Airports</em>}</li>
 *   <li>{@link Flights.impl.FlightModelImpl#getPlanes <em>Planes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightModelImpl extends MinimalEObjectImpl.Container implements FlightModel {
	/**
	 * The cached value of the '{@link #getFlights() <em>Flights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlights()
	 * @generated
	 * @ordered
	 */
	protected FlightContainer flights;

	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	protected Bookings bookings;

	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected Persons persons;

	/**
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected Routes routes;

	/**
	 * The cached value of the '{@link #getAirports() <em>Airports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirports()
	 * @generated
	 * @ordered
	 */
	protected Airports airports;

	/**
	 * The cached value of the '{@link #getPlanes() <em>Planes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanes()
	 * @generated
	 * @ordered
	 */
	protected Planes planes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlightsPackage.Literals.FLIGHT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightContainer getFlights() {
		return flights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlights(FlightContainer newFlights, NotificationChain msgs) {
		FlightContainer oldFlights = flights;
		flights = newFlights;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FlightsPackage.FLIGHT_MODEL__FLIGHTS, oldFlights, newFlights);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlights(FlightContainer newFlights) {
		if (newFlights != flights) {
			NotificationChain msgs = null;
			if (flights != null)
				msgs = ((InternalEObject) flights).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FlightsPackage.FLIGHT_MODEL__FLIGHTS, null, msgs);
			if (newFlights != null)
				msgs = ((InternalEObject) newFlights).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FlightsPackage.FLIGHT_MODEL__FLIGHTS, null, msgs);
			msgs = basicSetFlights(newFlights, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlightsPackage.FLIGHT_MODEL__FLIGHTS, newFlights,
					newFlights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bookings getBookings() {
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBookings(Bookings newBookings, NotificationChain msgs) {
		Bookings oldBookings = bookings;
		bookings = newBookings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FlightsPackage.FLIGHT_MODEL__BOOKINGS, oldBookings, newBookings);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBookings(Bookings newBookings) {
		if (newBookings != bookings) {
			NotificationChain msgs = null;
			if (bookings != null)
				msgs = ((InternalEObject) bookings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FlightsPackage.FLIGHT_MODEL__BOOKINGS, null, msgs);
			if (newBookings != null)
				msgs = ((InternalEObject) newBookings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FlightsPackage.FLIGHT_MODEL__BOOKINGS, null, msgs);
			msgs = basicSetBookings(newBookings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlightsPackage.FLIGHT_MODEL__BOOKINGS, newBookings,
					newBookings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Persons getPersons() {
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersons(Persons newPersons, NotificationChain msgs) {
		Persons oldPersons = persons;
		persons = newPersons;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FlightsPackage.FLIGHT_MODEL__PERSONS, oldPersons, newPersons);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersons(Persons newPersons) {
		if (newPersons != persons) {
			NotificationChain msgs = null;
			if (persons != null)
				msgs = ((InternalEObject) persons).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FlightsPackage.FLIGHT_MODEL__PERSONS, null, msgs);
			if (newPersons != null)
				msgs = ((InternalEObject) newPersons).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FlightsPackage.FLIGHT_MODEL__PERSONS, null, msgs);
			msgs = basicSetPersons(newPersons, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlightsPackage.FLIGHT_MODEL__PERSONS, newPersons,
					newPersons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Routes getRoutes() {
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoutes(Routes newRoutes, NotificationChain msgs) {
		Routes oldRoutes = routes;
		routes = newRoutes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FlightsPackage.FLIGHT_MODEL__ROUTES, oldRoutes, newRoutes);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoutes(Routes newRoutes) {
		if (newRoutes != routes) {
			NotificationChain msgs = null;
			if (routes != null)
				msgs = ((InternalEObject) routes).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FlightsPackage.FLIGHT_MODEL__ROUTES, null, msgs);
			if (newRoutes != null)
				msgs = ((InternalEObject) newRoutes).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FlightsPackage.FLIGHT_MODEL__ROUTES, null, msgs);
			msgs = basicSetRoutes(newRoutes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlightsPackage.FLIGHT_MODEL__ROUTES, newRoutes,
					newRoutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Airports getAirports() {
		return airports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAirports(Airports newAirports, NotificationChain msgs) {
		Airports oldAirports = airports;
		airports = newAirports;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FlightsPackage.FLIGHT_MODEL__AIRPORTS, oldAirports, newAirports);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAirports(Airports newAirports) {
		if (newAirports != airports) {
			NotificationChain msgs = null;
			if (airports != null)
				msgs = ((InternalEObject) airports).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FlightsPackage.FLIGHT_MODEL__AIRPORTS, null, msgs);
			if (newAirports != null)
				msgs = ((InternalEObject) newAirports).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FlightsPackage.FLIGHT_MODEL__AIRPORTS, null, msgs);
			msgs = basicSetAirports(newAirports, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlightsPackage.FLIGHT_MODEL__AIRPORTS, newAirports,
					newAirports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planes getPlanes() {
		return planes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanes(Planes newPlanes, NotificationChain msgs) {
		Planes oldPlanes = planes;
		planes = newPlanes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FlightsPackage.FLIGHT_MODEL__PLANES, oldPlanes, newPlanes);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlanes(Planes newPlanes) {
		if (newPlanes != planes) {
			NotificationChain msgs = null;
			if (planes != null)
				msgs = ((InternalEObject) planes).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FlightsPackage.FLIGHT_MODEL__PLANES, null, msgs);
			if (newPlanes != null)
				msgs = ((InternalEObject) newPlanes).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FlightsPackage.FLIGHT_MODEL__PLANES, null, msgs);
			msgs = basicSetPlanes(newPlanes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlightsPackage.FLIGHT_MODEL__PLANES, newPlanes,
					newPlanes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FlightsPackage.FLIGHT_MODEL__FLIGHTS:
			return basicSetFlights(null, msgs);
		case FlightsPackage.FLIGHT_MODEL__BOOKINGS:
			return basicSetBookings(null, msgs);
		case FlightsPackage.FLIGHT_MODEL__PERSONS:
			return basicSetPersons(null, msgs);
		case FlightsPackage.FLIGHT_MODEL__ROUTES:
			return basicSetRoutes(null, msgs);
		case FlightsPackage.FLIGHT_MODEL__AIRPORTS:
			return basicSetAirports(null, msgs);
		case FlightsPackage.FLIGHT_MODEL__PLANES:
			return basicSetPlanes(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FlightsPackage.FLIGHT_MODEL__FLIGHTS:
			return getFlights();
		case FlightsPackage.FLIGHT_MODEL__BOOKINGS:
			return getBookings();
		case FlightsPackage.FLIGHT_MODEL__PERSONS:
			return getPersons();
		case FlightsPackage.FLIGHT_MODEL__ROUTES:
			return getRoutes();
		case FlightsPackage.FLIGHT_MODEL__AIRPORTS:
			return getAirports();
		case FlightsPackage.FLIGHT_MODEL__PLANES:
			return getPlanes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FlightsPackage.FLIGHT_MODEL__FLIGHTS:
			setFlights((FlightContainer) newValue);
			return;
		case FlightsPackage.FLIGHT_MODEL__BOOKINGS:
			setBookings((Bookings) newValue);
			return;
		case FlightsPackage.FLIGHT_MODEL__PERSONS:
			setPersons((Persons) newValue);
			return;
		case FlightsPackage.FLIGHT_MODEL__ROUTES:
			setRoutes((Routes) newValue);
			return;
		case FlightsPackage.FLIGHT_MODEL__AIRPORTS:
			setAirports((Airports) newValue);
			return;
		case FlightsPackage.FLIGHT_MODEL__PLANES:
			setPlanes((Planes) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FlightsPackage.FLIGHT_MODEL__FLIGHTS:
			setFlights((FlightContainer) null);
			return;
		case FlightsPackage.FLIGHT_MODEL__BOOKINGS:
			setBookings((Bookings) null);
			return;
		case FlightsPackage.FLIGHT_MODEL__PERSONS:
			setPersons((Persons) null);
			return;
		case FlightsPackage.FLIGHT_MODEL__ROUTES:
			setRoutes((Routes) null);
			return;
		case FlightsPackage.FLIGHT_MODEL__AIRPORTS:
			setAirports((Airports) null);
			return;
		case FlightsPackage.FLIGHT_MODEL__PLANES:
			setPlanes((Planes) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FlightsPackage.FLIGHT_MODEL__FLIGHTS:
			return flights != null;
		case FlightsPackage.FLIGHT_MODEL__BOOKINGS:
			return bookings != null;
		case FlightsPackage.FLIGHT_MODEL__PERSONS:
			return persons != null;
		case FlightsPackage.FLIGHT_MODEL__ROUTES:
			return routes != null;
		case FlightsPackage.FLIGHT_MODEL__AIRPORTS:
			return airports != null;
		case FlightsPackage.FLIGHT_MODEL__PLANES:
			return planes != null;
		}
		return super.eIsSet(featureID);
	}

} //FlightModelImpl
