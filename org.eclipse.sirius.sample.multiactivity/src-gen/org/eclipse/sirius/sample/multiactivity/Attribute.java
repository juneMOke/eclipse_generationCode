/**
 */
package org.eclipse.sirius.sample.multiactivity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.Attribute#isDisplayInList <em>Display In List</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.Attribute#isDisplayInDetail <em>Display In Detail</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.multiactivity.Attribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.multiactivity.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Display In List</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display In List</em>' attribute.
	 * @see #setDisplayInList(boolean)
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getAttribute_DisplayInList()
	 * @model default="true"
	 * @generated
	 */
	boolean isDisplayInList();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.multiactivity.Attribute#isDisplayInList <em>Display In List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display In List</em>' attribute.
	 * @see #isDisplayInList()
	 * @generated
	 */
	void setDisplayInList(boolean value);

	/**
	 * Returns the value of the '<em><b>Display In Detail</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display In Detail</em>' attribute.
	 * @see #setDisplayInDetail(boolean)
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getAttribute_DisplayInDetail()
	 * @model default="true"
	 * @generated
	 */
	boolean isDisplayInDetail();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.multiactivity.Attribute#isDisplayInDetail <em>Display In Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display In Detail</em>' attribute.
	 * @see #isDisplayInDetail()
	 * @generated
	 */
	void setDisplayInDetail(boolean value);

} // Attribute
