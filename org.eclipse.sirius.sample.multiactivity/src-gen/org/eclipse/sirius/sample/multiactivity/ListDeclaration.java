/**
 */
package org.eclipse.sirius.sample.multiactivity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.ListDeclaration#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getListDeclaration()
 * @model
 * @generated
 */
public interface ListDeclaration extends Packageable {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getListDeclaration_Entity()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.multiactivity.ListDeclaration#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // ListDeclaration
