/**
 */
package Flights;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Flights.Planes#getPlanes <em>Planes</em>}</li>
 * </ul>
 *
 * @see Flights.FlightsPackage#getPlanes()
 * @model
 * @generated
 */
public interface Planes extends EObject {
	/**
	 * Returns the value of the '<em><b>Planes</b></em>' containment reference list.
	 * The list contents are of type {@link Flights.Plane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planes</em>' containment reference list.
	 * @see Flights.FlightsPackage#getPlanes_Planes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plane> getPlanes();

} // Planes
