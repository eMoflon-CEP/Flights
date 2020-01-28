/**
 */
package Flights.impl;

import Flights.Airport;
import Flights.Flight;
import Flights.FlightsPackage;
import Flights.Route;

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
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Flights.impl.RouteImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link Flights.impl.RouteImpl#getFlights <em>Flights</em>}</li>
 *   <li>{@link Flights.impl.RouteImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link Flights.impl.RouteImpl#getTrg <em>Trg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteImpl extends FlightObjectImpl implements Route {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlights() <em>Flights</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlights()
	 * @generated
	 * @ordered
	 */
	protected EList<Flight> flights;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected Airport src;

	/**
	 * The cached value of the '{@link #getTrg() <em>Trg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrg()
	 * @generated
	 * @ordered
	 */
	protected Airport trg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlightsPackage.Literals.ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlightsPackage.ROUTE__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Flight> getFlights() {
		if (flights == null) {
			flights = new EObjectWithInverseResolvingEList<Flight>(Flight.class, this, FlightsPackage.ROUTE__FLIGHTS,
					FlightsPackage.FLIGHT__ROUTE);
		}
		return flights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Airport getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject) src;
			src = (Airport) eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlightsPackage.ROUTE__SRC, oldSrc, src));
			}
		}
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Airport basicGetSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrc(Airport newSrc, NotificationChain msgs) {
		Airport oldSrc = src;
		src = newSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlightsPackage.ROUTE__SRC,
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
	public void setSrc(Airport newSrc) {
		if (newSrc != src) {
			NotificationChain msgs = null;
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, FlightsPackage.AIRPORT__OUTGOING_ROUTES,
						Airport.class, msgs);
			if (newSrc != null)
				msgs = ((InternalEObject) newSrc).eInverseAdd(this, FlightsPackage.AIRPORT__OUTGOING_ROUTES,
						Airport.class, msgs);
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlightsPackage.ROUTE__SRC, newSrc, newSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Airport getTrg() {
		if (trg != null && trg.eIsProxy()) {
			InternalEObject oldTrg = (InternalEObject) trg;
			trg = (Airport) eResolveProxy(oldTrg);
			if (trg != oldTrg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlightsPackage.ROUTE__TRG, oldTrg, trg));
			}
		}
		return trg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Airport basicGetTrg() {
		return trg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrg(Airport newTrg, NotificationChain msgs) {
		Airport oldTrg = trg;
		trg = newTrg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlightsPackage.ROUTE__TRG,
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
	public void setTrg(Airport newTrg) {
		if (newTrg != trg) {
			NotificationChain msgs = null;
			if (trg != null)
				msgs = ((InternalEObject) trg).eInverseRemove(this, FlightsPackage.AIRPORT__INCOMING_ROUTES,
						Airport.class, msgs);
			if (newTrg != null)
				msgs = ((InternalEObject) newTrg).eInverseAdd(this, FlightsPackage.AIRPORT__INCOMING_ROUTES,
						Airport.class, msgs);
			msgs = basicSetTrg(newTrg, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlightsPackage.ROUTE__TRG, newTrg, newTrg));
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
		case FlightsPackage.ROUTE__FLIGHTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFlights()).basicAdd(otherEnd, msgs);
		case FlightsPackage.ROUTE__SRC:
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, FlightsPackage.AIRPORT__OUTGOING_ROUTES,
						Airport.class, msgs);
			return basicSetSrc((Airport) otherEnd, msgs);
		case FlightsPackage.ROUTE__TRG:
			if (trg != null)
				msgs = ((InternalEObject) trg).eInverseRemove(this, FlightsPackage.AIRPORT__INCOMING_ROUTES,
						Airport.class, msgs);
			return basicSetTrg((Airport) otherEnd, msgs);
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
		case FlightsPackage.ROUTE__FLIGHTS:
			return ((InternalEList<?>) getFlights()).basicRemove(otherEnd, msgs);
		case FlightsPackage.ROUTE__SRC:
			return basicSetSrc(null, msgs);
		case FlightsPackage.ROUTE__TRG:
			return basicSetTrg(null, msgs);
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
		case FlightsPackage.ROUTE__DURATION:
			return getDuration();
		case FlightsPackage.ROUTE__FLIGHTS:
			return getFlights();
		case FlightsPackage.ROUTE__SRC:
			if (resolve)
				return getSrc();
			return basicGetSrc();
		case FlightsPackage.ROUTE__TRG:
			if (resolve)
				return getTrg();
			return basicGetTrg();
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
		case FlightsPackage.ROUTE__DURATION:
			setDuration((Integer) newValue);
			return;
		case FlightsPackage.ROUTE__FLIGHTS:
			getFlights().clear();
			getFlights().addAll((Collection<? extends Flight>) newValue);
			return;
		case FlightsPackage.ROUTE__SRC:
			setSrc((Airport) newValue);
			return;
		case FlightsPackage.ROUTE__TRG:
			setTrg((Airport) newValue);
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
		case FlightsPackage.ROUTE__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case FlightsPackage.ROUTE__FLIGHTS:
			getFlights().clear();
			return;
		case FlightsPackage.ROUTE__SRC:
			setSrc((Airport) null);
			return;
		case FlightsPackage.ROUTE__TRG:
			setTrg((Airport) null);
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
		case FlightsPackage.ROUTE__DURATION:
			return duration != DURATION_EDEFAULT;
		case FlightsPackage.ROUTE__FLIGHTS:
			return flights != null && !flights.isEmpty();
		case FlightsPackage.ROUTE__SRC:
			return src != null;
		case FlightsPackage.ROUTE__TRG:
			return trg != null;
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //RouteImpl
