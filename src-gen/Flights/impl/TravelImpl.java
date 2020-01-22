/**
 */
package Flights.impl;

import Flights.Flight;
import Flights.FlightsPackage;
import Flights.Person;
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
 * An implementation of the model object '<em><b>Travel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Flights.impl.TravelImpl#getFlights <em>Flights</em>}</li>
 *   <li>{@link Flights.impl.TravelImpl#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TravelImpl extends FlightObjectImpl implements Travel {
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
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TravelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlightsPackage.Literals.TRAVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Flight> getFlights() {
		if (flights == null) {
			flights = new EObjectWithInverseResolvingEList.ManyInverse<Flight>(Flight.class, this,
					FlightsPackage.TRAVEL__FLIGHTS, FlightsPackage.FLIGHT__TRAVELS);
		}
		return flights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getPerson() {
		if (person != null && person.eIsProxy()) {
			InternalEObject oldPerson = (InternalEObject) person;
			person = (Person) eResolveProxy(oldPerson);
			if (person != oldPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlightsPackage.TRAVEL__PERSON, oldPerson,
							person));
			}
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FlightsPackage.TRAVEL__PERSON, oldPerson, newPerson);
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
	public void setPerson(Person newPerson) {
		if (newPerson != person) {
			NotificationChain msgs = null;
			if (person != null)
				msgs = ((InternalEObject) person).eInverseRemove(this, FlightsPackage.PERSON__TRAVELS, Person.class,
						msgs);
			if (newPerson != null)
				msgs = ((InternalEObject) newPerson).eInverseAdd(this, FlightsPackage.PERSON__TRAVELS, Person.class,
						msgs);
			msgs = basicSetPerson(newPerson, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlightsPackage.TRAVEL__PERSON, newPerson, newPerson));
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
		case FlightsPackage.TRAVEL__FLIGHTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFlights()).basicAdd(otherEnd, msgs);
		case FlightsPackage.TRAVEL__PERSON:
			if (person != null)
				msgs = ((InternalEObject) person).eInverseRemove(this, FlightsPackage.PERSON__TRAVELS, Person.class,
						msgs);
			return basicSetPerson((Person) otherEnd, msgs);
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
		case FlightsPackage.TRAVEL__FLIGHTS:
			return ((InternalEList<?>) getFlights()).basicRemove(otherEnd, msgs);
		case FlightsPackage.TRAVEL__PERSON:
			return basicSetPerson(null, msgs);
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
		case FlightsPackage.TRAVEL__FLIGHTS:
			return getFlights();
		case FlightsPackage.TRAVEL__PERSON:
			if (resolve)
				return getPerson();
			return basicGetPerson();
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
		case FlightsPackage.TRAVEL__FLIGHTS:
			getFlights().clear();
			getFlights().addAll((Collection<? extends Flight>) newValue);
			return;
		case FlightsPackage.TRAVEL__PERSON:
			setPerson((Person) newValue);
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
		case FlightsPackage.TRAVEL__FLIGHTS:
			getFlights().clear();
			return;
		case FlightsPackage.TRAVEL__PERSON:
			setPerson((Person) null);
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
		case FlightsPackage.TRAVEL__FLIGHTS:
			return flights != null && !flights.isEmpty();
		case FlightsPackage.TRAVEL__PERSON:
			return person != null;
		}
		return super.eIsSet(featureID);
	}

} //TravelImpl
