/**
 */
package Flights.impl;

import Flights.Booking;
import Flights.Bookings;
import Flights.FlightsPackage;
import Flights.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bookings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Flights.impl.BookingsImpl#getBookings <em>Bookings</em>}</li>
 *   <li>{@link Flights.impl.BookingsImpl#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingsImpl extends MinimalEObjectImpl.Container implements Bookings {
	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> bookings;

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
	protected BookingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlightsPackage.Literals.BOOKINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Booking> getBookings() {
		if (bookings == null) {
			bookings = new EObjectContainmentEList<Booking>(Booking.class, this, FlightsPackage.BOOKINGS__BOOKINGS);
		}
		return bookings;
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
					FlightsPackage.BOOKINGS__PERSONS, FlightsPackage.PERSON__BOOKINGS);
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
		case FlightsPackage.BOOKINGS__PERSONS:
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
		case FlightsPackage.BOOKINGS__BOOKINGS:
			return ((InternalEList<?>) getBookings()).basicRemove(otherEnd, msgs);
		case FlightsPackage.BOOKINGS__PERSONS:
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
		case FlightsPackage.BOOKINGS__BOOKINGS:
			return getBookings();
		case FlightsPackage.BOOKINGS__PERSONS:
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
		case FlightsPackage.BOOKINGS__BOOKINGS:
			getBookings().clear();
			getBookings().addAll((Collection<? extends Booking>) newValue);
			return;
		case FlightsPackage.BOOKINGS__PERSONS:
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
		case FlightsPackage.BOOKINGS__BOOKINGS:
			getBookings().clear();
			return;
		case FlightsPackage.BOOKINGS__PERSONS:
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
		case FlightsPackage.BOOKINGS__BOOKINGS:
			return bookings != null && !bookings.isEmpty();
		case FlightsPackage.BOOKINGS__PERSONS:
			return persons != null && !persons.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BookingsImpl
