/**
 */
package Flights;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Flights.Plane#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link Flights.Plane#getFlights <em>Flights</em>}</li>
 * </ul>
 *
 * @see Flights.FlightsPackage#getPlane()
 * @model
 * @generated
 */
public interface Plane extends FlightObject {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see Flights.FlightsPackage#getPlane_Capacity()
	 * @model
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link Flights.Plane#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Flights</b></em>' reference list.
	 * The list contents are of type {@link Flights.Flight}.
	 * It is bidirectional and its opposite is '{@link Flights.Flight#getPlane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flights</em>' reference list.
	 * @see Flights.FlightsPackage#getPlane_Flights()
	 * @see Flights.Flight#getPlane
	 * @model opposite="plane"
	 * @generated
	 */
	EList<Flight> getFlights();

} // Plane
