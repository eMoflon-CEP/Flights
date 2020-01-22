/**
 */
package Flights.impl;

import Flights.Flight;
import Flights.FlightsPackage;
import Flights.Gate;
import Flights.Plane;
import Flights.Route;
import Flights.Travel;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Flights.impl.FlightImpl#getDeparture <em>Departure</em>}</li>
 *   <li>{@link Flights.impl.FlightImpl#getArrival <em>Arrival</em>}</li>
 *   <li>{@link Flights.impl.FlightImpl#getTravels <em>Travels</em>}</li>
 *   <li>{@link Flights.impl.FlightImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link Flights.impl.FlightImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link Flights.impl.FlightImpl#getTrg <em>Trg</em>}</li>
 *   <li>{@link Flights.impl.FlightImpl#getPlane <em>Plane</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightImpl extends FlightObjectImpl implements Flight {
	/**
	 * The default value of the '{@link #getDeparture() <em>Departure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeparture()
	 * @generated
	 * @ordered
	 */
	protected static final long DEPARTURE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDeparture() <em>Departure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeparture()
	 * @generated
	 * @ordered
	 */
	protected long departure = DEPARTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrival() <em>Arrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrival()
	 * @generated
	 * @ordered
	 */
	protected static final long ARRIVAL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getArrival() <em>Arrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrival()
	 * @generated
	 * @ordered
	 */
	protected long arrival = ARRIVAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTravels() <em>Travels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravels()
	 * @generated
	 * @ordered
	 */
	protected EList<Travel> travels;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected Route route;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected Gate src;

	/**
	 * The cached value of the '{@link #getTrg() <em>Trg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrg()
	 * @generated
	 * @ordered
	 */
	protected Gate trg;

	/**
	 * The cached value of the '{@link #getPlane() <em>Plane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlane()
	 * @generated
	 * @ordered
	 */
	protected Plane plane;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlightsPackage.Literals.FLIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDeparture() {
		return departure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeparture(long newDeparture) {
		long oldDeparture = departure;
		departure = newDeparture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlightsPackage.FLIGHT__DEPARTURE, oldDeparture,
					departure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getArrival() {
		return arrival;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArrival(long newArrival) {
		long oldArrival = arrival;
		arrival = newArrival;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlightsPackage.FLIGHT__ARRIVAL, oldArrival, arrival));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Travel> getTravels() {
		if (travels == null) {
			travels = new EObjectWithInverseResolvingEList.ManyInverse<Travel>(Travel.class, this,
					FlightsPackage.FLIGHT__TRAVELS, FlightsPackage.TRAVEL__FLIGHTS);
		}
		return travels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Route getRoute() {
		if (route != null && route.eIsProxy()) {
			InternalEObject oldRoute = (InternalEObject) route;
			route = (Route) eResolveProxy(oldRoute);
			if (route != oldRoute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlightsPackage.FLIGHT__ROUTE, oldRoute,
							route));
			}
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route basicGetRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoute(Route newRoute, NotificationChain msgs) {
		Route oldRoute = route;
		route = newRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlightsPackage.FLIGHT__ROUTE,
					oldRoute, newRoute);
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
	public void setRoute(Route newRoute) {
		if (newRoute != route) {
			NotificationChain msgs = null;
			if (route != null)
				msgs = ((InternalEObject) route).eInverseRemove(this, FlightsPackage.ROUTE__FLIGHTS, Route.class, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject) newRoute).eInverseAdd(this, FlightsPackage.ROUTE__FLIGHTS, Route.class, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlightsPackage.FLIGHT__ROUTE, newRoute, newRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gate getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject) src;
			src = (Gate) eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlightsPackage.FLIGHT__SRC, oldSrc, src));
			}
		}
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate basicGetSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrc(Gate newSrc, NotificationChain msgs) {
		Gate oldSrc = src;
		src = newSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlightsPackage.FLIGHT__SRC,
					oldSrc, newSrc);
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
	public void setSrc(Gate newSrc) {
		if (newSrc != src) {
			NotificationChain msgs = null;
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, FlightsPackage.GATE__OUTGOING_FLIGHTS, Gate.class,
						msgs);
			if (newSrc != null)
				msgs = ((InternalEObject) newSrc).eInverseAdd(this, FlightsPackage.GATE__OUTGOING_FLIGHTS, Gate.class,
						msgs);
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlightsPackage.FLIGHT__SRC, newSrc, newSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gate getTrg() {
		if (trg != null && trg.eIsProxy()) {
			InternalEObject oldTrg = (InternalEObject) trg;
			trg = (Gate) eResolveProxy(oldTrg);
			if (trg != oldTrg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlightsPackage.FLIGHT__TRG, oldTrg, trg));
			}
		}
		return trg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate basicGetTrg() {
		return trg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrg(Gate newTrg, NotificationChain msgs) {
		Gate oldTrg = trg;
		trg = newTrg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlightsPackage.FLIGHT__TRG,
					oldTrg, newTrg);
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
	public void setTrg(Gate newTrg) {
		if (newTrg != trg) {
			NotificationChain msgs = null;
			if (trg != null)
				msgs = ((InternalEObject) trg).eInverseRemove(this, FlightsPackage.GATE__INCOMING_FLIGHTS, Gate.class,
						msgs);
			if (newTrg != null)
				msgs = ((InternalEObject) newTrg).eInverseAdd(this, FlightsPackage.GATE__INCOMING_FLIGHTS, Gate.class,
						msgs);
			msgs = basicSetTrg(newTrg, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlightsPackage.FLIGHT__TRG, newTrg, newTrg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Plane getPlane() {
		if (plane != null && plane.eIsProxy()) {
			InternalEObject oldPlane = (InternalEObject) plane;
			plane = (Plane) eResolveProxy(oldPlane);
			if (plane != oldPlane) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlightsPackage.FLIGHT__PLANE, oldPlane,
							plane));
			}
		}
		return plane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plane basicGetPlane() {
		return plane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlane(Plane newPlane, NotificationChain msgs) {
		Plane oldPlane = plane;
		plane = newPlane;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlightsPackage.FLIGHT__PLANE,
					oldPlane, newPlane);
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
	public void setPlane(Plane newPlane) {
		if (newPlane != plane) {
			NotificationChain msgs = null;
			if (plane != null)
				msgs = ((InternalEObject) plane).eInverseRemove(this, FlightsPackage.PLANE__FLIGHTS, Plane.class, msgs);
			if (newPlane != null)
				msgs = ((InternalEObject) newPlane).eInverseAdd(this, FlightsPackage.PLANE__FLIGHTS, Plane.class, msgs);
			msgs = basicSetPlane(newPlane, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlightsPackage.FLIGHT__PLANE, newPlane, newPlane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FlightsPackage.FLIGHT__TRAVELS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTravels()).basicAdd(otherEnd, msgs);
		case FlightsPackage.FLIGHT__ROUTE:
			if (route != null)
				msgs = ((InternalEObject) route).eInverseRemove(this, FlightsPackage.ROUTE__FLIGHTS, Route.class, msgs);
			return basicSetRoute((Route) otherEnd, msgs);
		case FlightsPackage.FLIGHT__SRC:
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, FlightsPackage.GATE__OUTGOING_FLIGHTS, Gate.class,
						msgs);
			return basicSetSrc((Gate) otherEnd, msgs);
		case FlightsPackage.FLIGHT__TRG:
			if (trg != null)
				msgs = ((InternalEObject) trg).eInverseRemove(this, FlightsPackage.GATE__INCOMING_FLIGHTS, Gate.class,
						msgs);
			return basicSetTrg((Gate) otherEnd, msgs);
		case FlightsPackage.FLIGHT__PLANE:
			if (plane != null)
				msgs = ((InternalEObject) plane).eInverseRemove(this, FlightsPackage.PLANE__FLIGHTS, Plane.class, msgs);
			return basicSetPlane((Plane) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FlightsPackage.FLIGHT__TRAVELS:
			return ((InternalEList<?>) getTravels()).basicRemove(otherEnd, msgs);
		case FlightsPackage.FLIGHT__ROUTE:
			return basicSetRoute(null, msgs);
		case FlightsPackage.FLIGHT__SRC:
			return basicSetSrc(null, msgs);
		case FlightsPackage.FLIGHT__TRG:
			return basicSetTrg(null, msgs);
		case FlightsPackage.FLIGHT__PLANE:
			return basicSetPlane(null, msgs);
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
		case FlightsPackage.FLIGHT__DEPARTURE:
			return getDeparture();
		case FlightsPackage.FLIGHT__ARRIVAL:
			return getArrival();
		case FlightsPackage.FLIGHT__TRAVELS:
			return getTravels();
		case FlightsPackage.FLIGHT__ROUTE:
			if (resolve)
				return getRoute();
			return basicGetRoute();
		case FlightsPackage.FLIGHT__SRC:
			if (resolve)
				return getSrc();
			return basicGetSrc();
		case FlightsPackage.FLIGHT__TRG:
			if (resolve)
				return getTrg();
			return basicGetTrg();
		case FlightsPackage.FLIGHT__PLANE:
			if (resolve)
				return getPlane();
			return basicGetPlane();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FlightsPackage.FLIGHT__DEPARTURE:
			setDeparture((Long) newValue);
			return;
		case FlightsPackage.FLIGHT__ARRIVAL:
			setArrival((Long) newValue);
			return;
		case FlightsPackage.FLIGHT__TRAVELS:
			getTravels().clear();
			getTravels().addAll((Collection<? extends Travel>) newValue);
			return;
		case FlightsPackage.FLIGHT__ROUTE:
			setRoute((Route) newValue);
			return;
		case FlightsPackage.FLIGHT__SRC:
			setSrc((Gate) newValue);
			return;
		case FlightsPackage.FLIGHT__TRG:
			setTrg((Gate) newValue);
			return;
		case FlightsPackage.FLIGHT__PLANE:
			setPlane((Plane) newValue);
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
		case FlightsPackage.FLIGHT__DEPARTURE:
			setDeparture(DEPARTURE_EDEFAULT);
			return;
		case FlightsPackage.FLIGHT__ARRIVAL:
			setArrival(ARRIVAL_EDEFAULT);
			return;
		case FlightsPackage.FLIGHT__TRAVELS:
			getTravels().clear();
			return;
		case FlightsPackage.FLIGHT__ROUTE:
			setRoute((Route) null);
			return;
		case FlightsPackage.FLIGHT__SRC:
			setSrc((Gate) null);
			return;
		case FlightsPackage.FLIGHT__TRG:
			setTrg((Gate) null);
			return;
		case FlightsPackage.FLIGHT__PLANE:
			setPlane((Plane) null);
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
		case FlightsPackage.FLIGHT__DEPARTURE:
			return departure != DEPARTURE_EDEFAULT;
		case FlightsPackage.FLIGHT__ARRIVAL:
			return arrival != ARRIVAL_EDEFAULT;
		case FlightsPackage.FLIGHT__TRAVELS:
			return travels != null && !travels.isEmpty();
		case FlightsPackage.FLIGHT__ROUTE:
			return route != null;
		case FlightsPackage.FLIGHT__SRC:
			return src != null;
		case FlightsPackage.FLIGHT__TRG:
			return trg != null;
		case FlightsPackage.FLIGHT__PLANE:
			return plane != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (departure: ");
		result.append(departure);
		result.append(", arrival: ");
		result.append(arrival);
		result.append(')');
		return result.toString();
	}

} //FlightImpl
