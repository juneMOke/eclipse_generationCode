/**
 */
package org.eclipse.sirius.sample.multiactivity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.ListDeclaration#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getListDeclaration()
 * @model
 * @generated
 */
public interface ListDeclaration extends Packageable {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.multiactivity.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getListDeclaration_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

} // ListDeclaration
