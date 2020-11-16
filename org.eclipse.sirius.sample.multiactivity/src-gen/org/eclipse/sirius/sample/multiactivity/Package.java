/**
 */
package org.eclipse.sirius.sample.multiactivity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.Package#getPackageables <em>Packageables</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends Packageable {
	/**
	 * Returns the value of the '<em><b>Packageables</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.multiactivity.Packageable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packageables</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getPackage_Packageables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Packageable> getPackageables();

} // Package
