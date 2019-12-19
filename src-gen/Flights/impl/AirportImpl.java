/**
 */
package Flights.impl;

import Flights.Airport;
import Flights.FlightsPackage;
import Flights.Gate;
import Flights.Route;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Airport</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Flights.impl.AirportImpl#getGates <em>Gates</em>}</li>
 *   <li>{@link Flights.impl.AirportImpl#getSize <em>Size</em>}</li>
 *   <li>{@link Flights.impl.AirportImpl#getOutgoingRoutes <em>Outgoing Routes</em>}</li>
 *   <li>{@link Flights.impl.AirportImpl#getIncomingRoutes <em>Incoming Routes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AirportImpl extends FlightObjectImpl implements Airport {
	/**
	 * The cached value of the '{@link #getGates() <em>Gates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGates()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> gates;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected double size = SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutgoingRoutes() <em>Outgoing Routes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> outgoingRoutes;

	/**
	 * The cached value of the '{@link #getIncomingRoutes() <em>Incoming Routes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> incomingRoutes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AirportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlightsPackage.Literals.AIRPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gate> getGates() {
		if (gates == null) {
			gates = new EObjectContainmentEList<Gate>(Gate.class, this, FlightsPackage.AIRPORT__GATES);
		}
		return gates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(double newSize) {
		double oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlightsPackage.AIRPORT__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Route> getOutgoingRoutes() {
		if (outgoingRoutes == null) {
			outgoingRoutes = new EObjectWithInverseResolvingEList<Route>(Route.class, this,
					FlightsPackage.AIRPORT__OUTGOING_ROUTES, FlightsPackage.ROUTE__SRC);
		}
		return outgoingRoutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Route> getIncomingRoutes() {
		if (incomingRoutes == null) {
			incomingRoutes = new EObjectWithInverseResolvingEList<Route>(Route.class, this,
					FlightsPackage.AIRPORT__INCOMING_ROUTES, FlightsPackage.ROUTE__TRG);
		}
		return incomingRoutes;
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
		case FlightsPackage.AIRPORT__OUTGOING_ROUTES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingRoutes()).basicAdd(otherEnd, msgs);
		case FlightsPackage.AIRPORT__INCOMING_ROUTES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingRoutes()).basicAdd(otherEnd, msgs);
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
		case FlightsPackage.AIRPORT__GATES:
			return ((InternalEList<?>) getGates()).basicRemove(otherEnd, msgs);
		case FlightsPackage.AIRPORT__OUTGOING_ROUTES:
			return ((InternalEList<?>) getOutgoingRoutes()).basicRemove(otherEnd, msgs);
		case FlightsPackage.AIRPORT__INCOMING_ROUTES:
			return ((InternalEList<?>) getIncomingRoutes()).basicRemove(otherEnd, msgs);
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
		case FlightsPackage.AIRPORT__GATES:
			return getGates();
		case FlightsPackage.AIRPORT__SIZE:
			return getSize();
		case FlightsPackage.AIRPORT__OUTGOING_ROUTES:
			return getOutgoingRoutes();
		case FlightsPackage.AIRPORT__INCOMING_ROUTES:
			return getIncomingRoutes();
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
		case FlightsPackage.AIRPORT__GATES:
			getGates().clear();
			getGates().addAll((Collection<? extends Gate>) newValue);
			return;
		case FlightsPackage.AIRPORT__SIZE:
			setSize((Double) newValue);
			return;
		case FlightsPackage.AIRPORT__OUTGOING_ROUTES:
			getOutgoingRoutes().clear();
			getOutgoingRoutes().addAll((Collection<? extends Route>) newValue);
			return;
		case FlightsPackage.AIRPORT__INCOMING_ROUTES:
			getIncomingRoutes().clear();
			getIncomingRoutes().addAll((Collection<? extends Route>) newValue);
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
		case FlightsPackage.AIRPORT__GATES:
			getGates().clear();
			return;
		case FlightsPackage.AIRPORT__SIZE:
			setSize(SIZE_EDEFAULT);
			return;
		case FlightsPackage.AIRPORT__OUTGOING_ROUTES:
			getOutgoingRoutes().clear();
			return;
		case FlightsPackage.AIRPORT__INCOMING_ROUTES:
			getIncomingRoutes().clear();
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
		case FlightsPackage.AIRPORT__GATES:
			return gates != null && !gates.isEmpty();
		case FlightsPackage.AIRPORT__SIZE:
			return size != SIZE_EDEFAULT;
		case FlightsPackage.AIRPORT__OUTGOING_ROUTES:
			return outgoingRoutes != null && !outgoingRoutes.isEmpty();
		case FlightsPackage.AIRPORT__INCOMING_ROUTES:
			return incomingRoutes != null && !incomingRoutes.isEmpty();
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
		result.append(" (size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //AirportImpl
