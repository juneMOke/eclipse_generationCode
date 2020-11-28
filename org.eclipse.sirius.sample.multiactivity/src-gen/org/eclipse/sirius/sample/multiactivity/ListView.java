/**
 */
package org.eclipse.sirius.sample.multiactivity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.ListView#getListdeclaration <em>Listdeclaration</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.ListView#isDisplayDetail <em>Display Detail</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.ListView#isAllowedCreation <em>Allowed Creation</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.ListView#isAllowDeletion <em>Allow Deletion</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.ListView#getAttributesDisplayInList <em>Attributes Display In List</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.ListView#getAttributesDisplayInDetail <em>Attributes Display In Detail</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getListView()
 * @model
 * @generated
 */
public interface ListView extends View {
	/**
	 * Returns the value of the '<em><b>Listdeclaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listdeclaration</em>' reference.
	 * @see #setListdeclaration(ListDeclaration)
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getListView_Listdeclaration()
	 * @model required="true"
	 * @generated
	 */
	ListDeclaration getListdeclaration();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.multiactivity.ListView#getListdeclaration <em>Listdeclaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listdeclaration</em>' reference.
	 * @see #getListdeclaration()
	 * @generated
	 */
	void setListdeclaration(ListDeclaration value);

	/**
	 * Returns the value of the '<em><b>Display Detail</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Detail</em>' attribute.
	 * @see #setDisplayDetail(boolean)
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getListView_DisplayDetail()
	 * @model default="true"
	 * @generated
	 */
	boolean isDisplayDetail();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.multiactivity.ListView#isDisplayDetail <em>Display Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Detail</em>' attribute.
	 * @see #isDisplayDetail()
	 * @generated
	 */
	void setDisplayDetail(boolean value);

	/**
	 * Returns the value of the '<em><b>Allowed Creation</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Creation</em>' attribute.
	 * @see #setAllowedCreation(boolean)
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getListView_AllowedCreation()
	 * @model default="true"
	 * @generated
	 */
	boolean isAllowedCreation();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.multiactivity.ListView#isAllowedCreation <em>Allowed Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Creation</em>' attribute.
	 * @see #isAllowedCreation()
	 * @generated
	 */
	void setAllowedCreation(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Deletion</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Deletion</em>' attribute.
	 * @see #setAllowDeletion(boolean)
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getListView_AllowDeletion()
	 * @model default="true"
	 * @generated
	 */
	boolean isAllowDeletion();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.multiactivity.ListView#isAllowDeletion <em>Allow Deletion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Deletion</em>' attribute.
	 * @see #isAllowDeletion()
	 * @generated
	 */
	void setAllowDeletion(boolean value);

	/**
	 * Returns the value of the '<em><b>Attributes Display In Detail</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.multiactivity.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes Display In Detail</em>' reference list.
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getListView_AttributesDisplayInDetail()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributesDisplayInDetail();

	/**
	 * Returns the value of the '<em><b>Attributes Display In List</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.multiactivity.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes Display In List</em>' reference list.
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getListView_AttributesDisplayInList()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributesDisplayInList();

} // ListView
