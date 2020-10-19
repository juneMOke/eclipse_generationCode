/**
 */
package org.eclipse.sirius.sample.multiactivity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.Layout#getViews <em>Views</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.Layout#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends EObject {
	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.multiactivity.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getLayout_Views()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getViews();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getLayout_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.multiactivity.Layout#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Layout
