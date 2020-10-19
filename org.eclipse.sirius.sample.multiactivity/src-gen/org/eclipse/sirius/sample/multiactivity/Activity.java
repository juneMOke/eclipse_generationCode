/**
 */
package org.eclipse.sirius.sample.multiactivity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.Activity#getLayouts <em>Layouts</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.Activity#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Layouts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.multiactivity.Layout}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layouts</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getActivity_Layouts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Layout> getLayouts();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.multiactivity.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Activity
