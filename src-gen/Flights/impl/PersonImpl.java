/**
 */
package Flights.impl;

import Flights.FlightsPackage;
import Flights.Person;
import Flights.Travel;
import Flights.TravelState;

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
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Flights.impl.PersonImpl#getTravelState <em>Travel State</em>}</li>
 *   <li>{@link Flights.impl.PersonImpl#getTravels <em>Travels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends FlightObjectImpl implements Person {
	/**
	 * The default value of the '{@link #getTravelState() <em>Travel State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelState()
	 * @generated
	 * @ordered
	 */
	protected static final TravelState TRAVEL_STATE_EDEFAULT = TravelState.UNKNOWN;

	/**
	 * The cached value of the '{@link #getTravelState() <em>Travel State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelState()
	 * @generated
	 * @ordered
	 */
	protected TravelState travelState = TRAVEL_STATE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlightsPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TravelState getTravelState() {
		return travelState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTravelState(TravelState newTravelState) {
		TravelState oldTravelState = travelState;
		travelState = newTravelState == null ? TRAVEL_STATE_EDEFAULT : newTravelState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlightsPackage.PERSON__TRAVEL_STATE, oldTravelState,
					travelState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Travel> getTravels() {
		if (travels == null) {
			travels = new EObjectWithInverseResolvingEList<Travel>(Travel.class, this, FlightsPackage.PERSON__TRAVELS,
					FlightsPackage.TRAVEL__PERSON);
		}
		return travels;
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
		case FlightsPackage.PERSON__TRAVELS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTravels()).basicAdd(otherEnd, msgs);
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
		case FlightsPackage.PERSON__TRAVELS:
			return ((InternalEList<?>) getTravels()).basicRemove(otherEnd, msgs);
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
		case FlightsPackage.PERSON__TRAVEL_STATE:
			return getTravelState();
		case FlightsPackage.PERSON__TRAVELS:
			return getTravels();
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
		case FlightsPackage.PERSON__TRAVEL_STATE:
			setTravelState((TravelState) newValue);
			return;
		case FlightsPackage.PERSON__TRAVELS:
			getTravels().clear();
			getTravels().addAll((Collection<? extends Travel>) newValue);
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
		case FlightsPackage.PERSON__TRAVEL_STATE:
			setTravelState(TRAVEL_STATE_EDEFAULT);
			return;
		case FlightsPackage.PERSON__TRAVELS:
			getTravels().clear();
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
		case FlightsPackage.PERSON__TRAVEL_STATE:
			return travelState != TRAVEL_STATE_EDEFAULT;
		case FlightsPackage.PERSON__TRAVELS:
			return travels != null && !travels.isEmpty();
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
		result.append(" (travelState: ");
		result.append(travelState);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
