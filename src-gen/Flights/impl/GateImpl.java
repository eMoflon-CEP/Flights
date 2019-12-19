/**
 */
package Flights.impl;

import Flights.Flight;
import Flights.FlightsPackage;
import Flights.Gate;

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
 * An implementation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Flights.impl.GateImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link Flights.impl.GateImpl#getOutgoingFlights <em>Outgoing Flights</em>}</li>
 *   <li>{@link Flights.impl.GateImpl#getIncomingFlights <em>Incoming Flights</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GateImpl extends FlightObjectImpl implements Gate {
	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected int position = POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutgoingFlights() <em>Outgoing Flights</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingFlights()
	 * @generated
	 * @ordered
	 */
	protected EList<Flight> outgoingFlights;

	/**
	 * The cached value of the '{@link #getIncomingFlights() <em>Incoming Flights</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingFlights()
	 * @generated
	 * @ordered
	 */
	protected EList<Flight> incomingFlights;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlightsPackage.Literals.GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(int newPosition) {
		int oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlightsPackage.GATE__POSITION, oldPosition,
					position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Flight> getOutgoingFlights() {
		if (outgoingFlights == null) {
			outgoingFlights = new EObjectWithInverseResolvingEList<Flight>(Flight.class, this,
					FlightsPackage.GATE__OUTGOING_FLIGHTS, FlightsPackage.FLIGHT__SRC);
		}
		return outgoingFlights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Flight> getIncomingFlights() {
		if (incomingFlights == null) {
			incomingFlights = new EObjectWithInverseResolvingEList<Flight>(Flight.class, this,
					FlightsPackage.GATE__INCOMING_FLIGHTS, FlightsPackage.FLIGHT__TRG);
		}
		return incomingFlights;
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
		case FlightsPackage.GATE__OUTGOING_FLIGHTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingFlights()).basicAdd(otherEnd, msgs);
		case FlightsPackage.GATE__INCOMING_FLIGHTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingFlights()).basicAdd(otherEnd, msgs);
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
		case FlightsPackage.GATE__OUTGOING_FLIGHTS:
			return ((InternalEList<?>) getOutgoingFlights()).basicRemove(otherEnd, msgs);
		case FlightsPackage.GATE__INCOMING_FLIGHTS:
			return ((InternalEList<?>) getIncomingFlights()).basicRemove(otherEnd, msgs);
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
		case FlightsPackage.GATE__POSITION:
			return getPosition();
		case FlightsPackage.GATE__OUTGOING_FLIGHTS:
			return getOutgoingFlights();
		case FlightsPackage.GATE__INCOMING_FLIGHTS:
			return getIncomingFlights();
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
		case FlightsPackage.GATE__POSITION:
			setPosition((Integer) newValue);
			return;
		case FlightsPackage.GATE__OUTGOING_FLIGHTS:
			getOutgoingFlights().clear();
			getOutgoingFlights().addAll((Collection<? extends Flight>) newValue);
			return;
		case FlightsPackage.GATE__INCOMING_FLIGHTS:
			getIncomingFlights().clear();
			getIncomingFlights().addAll((Collection<? extends Flight>) newValue);
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
		case FlightsPackage.GATE__POSITION:
			setPosition(POSITION_EDEFAULT);
			return;
		case FlightsPackage.GATE__OUTGOING_FLIGHTS:
			getOutgoingFlights().clear();
			return;
		case FlightsPackage.GATE__INCOMING_FLIGHTS:
			getIncomingFlights().clear();
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
		case FlightsPackage.GATE__POSITION:
			return position != POSITION_EDEFAULT;
		case FlightsPackage.GATE__OUTGOING_FLIGHTS:
			return outgoingFlights != null && !outgoingFlights.isEmpty();
		case FlightsPackage.GATE__INCOMING_FLIGHTS:
			return incomingFlights != null && !incomingFlights.isEmpty();
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
		result.append(" (position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //GateImpl
