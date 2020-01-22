/**
 */
package Flights.impl;

import Flights.Booking;
import Flights.FlightsPackage;
import Flights.Person;
import Flights.Travel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Flights.impl.BookingImpl#getTravels <em>Travels</em>}</li>
 *   <li>{@link Flights.impl.BookingImpl#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingImpl extends FlightObjectImpl implements Booking {
	/**
	 * The cached value of the '{@link #getTravels() <em>Travels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravels()
	 * @generated
	 * @ordered
	 */
	protected EList<Travel> travels;

	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlightsPackage.Literals.BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Travel> getTravels() {
		if (travels == null) {
			travels = new EObjectContainmentEList<Travel>(Travel.class, this, FlightsPackage.BOOKING__TRAVELS);
		}
		return travels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectWithInverseResolvingEList.ManyInverse<Person>(Person.class, this,
					FlightsPackage.BOOKING__PERSONS, FlightsPackage.PERSON__BOOKINGS);
		}
		return persons;
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
		case FlightsPackage.BOOKING__PERSONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPersons()).basicAdd(otherEnd, msgs);
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
		case FlightsPackage.BOOKING__TRAVELS:
			return ((InternalEList<?>) getTravels()).basicRemove(otherEnd, msgs);
		case FlightsPackage.BOOKING__PERSONS:
			return ((InternalEList<?>) getPersons()).basicRemove(otherEnd, msgs);
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
		case FlightsPackage.BOOKING__TRAVELS:
			return getTravels();
		case FlightsPackage.BOOKING__PERSONS:
			return getPersons();
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
		case FlightsPackage.BOOKING__TRAVELS:
			getTravels().clear();
			getTravels().addAll((Collection<? extends Travel>) newValue);
			return;
		case FlightsPackage.BOOKING__PERSONS:
			getPersons().clear();
			getPersons().addAll((Collection<? extends Person>) newValue);
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
		case FlightsPackage.BOOKING__TRAVELS:
			getTravels().clear();
			return;
		case FlightsPackage.BOOKING__PERSONS:
			getPersons().clear();
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
		case FlightsPackage.BOOKING__TRAVELS:
			return travels != null && !travels.isEmpty();
		case FlightsPackage.BOOKING__PERSONS:
			return persons != null && !persons.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BookingImpl
