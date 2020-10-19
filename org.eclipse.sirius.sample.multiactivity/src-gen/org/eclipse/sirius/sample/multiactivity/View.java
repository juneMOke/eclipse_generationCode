/**
 */
package org.eclipse.sirius.sample.multiactivity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.View#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getView()
 * @model abstract="true"
 * @generated
 */
public interface View extends EObject {

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getView_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.multiactivity.View#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);
} // View
