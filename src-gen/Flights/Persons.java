/**
 */
package Flights;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persons</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Flights.Persons#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see Flights.FlightsPackage#getPersons()
 * @model
 * @generated
 */
public interface Persons extends EObject {
	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link Flights.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see Flights.FlightsPackage#getPersons_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

} // Persons
