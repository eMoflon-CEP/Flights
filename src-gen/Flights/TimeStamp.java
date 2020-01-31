/**
 */
package Flights;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Stamp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Flights.TimeStamp#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see Flights.FlightsPackage#getTimeStamp()
 * @model
 * @generated
 */
public interface TimeStamp extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(long)
	 * @see Flights.FlightsPackage#getTimeStamp_Time()
	 * @model required="true"
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link Flights.TimeStamp#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);

} // TimeStamp
