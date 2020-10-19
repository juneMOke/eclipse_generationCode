/**
 */
package org.eclipse.sirius.sample.multiactivity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.Application#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.multiactivity.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getApplication_Activities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivities();

} // Application
