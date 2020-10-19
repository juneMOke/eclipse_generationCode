/**
 */
package org.eclipse.sirius.sample.multiactivity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Activity Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.NewActivityButton#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getNewActivityButton()
 * @model
 * @generated
 */
public interface NewActivityButton extends View {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getNewActivityButton_Activity()
	 * @model required="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.multiactivity.NewActivityButton#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // NewActivityButton
