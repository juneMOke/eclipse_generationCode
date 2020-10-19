/**
 */
package org.eclipse.sirius.sample.multiactivity;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage
 * @generated
 */
public interface MultiactivityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MultiactivityFactory eINSTANCE = org.eclipse.sirius.sample.multiactivity.impl.MultiactivityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layout</em>'.
	 * @generated
	 */
	Layout createLayout();

	/**
	 * Returns a new object of class '<em>New Activity Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Activity Button</em>'.
	 * @generated
	 */
	NewActivityButton createNewActivityButton();

	/**
	 * Returns a new object of class '<em>Popup Message Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Popup Message Button</em>'.
	 * @generated
	 */
	PopupMessageButton createPopupMessageButton();

	/**
	 * Returns a new object of class '<em>Text View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text View</em>'.
	 * @generated
	 */
	TextView createTextView();

	/**
	 * Returns a new object of class '<em>Popup Time Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Popup Time Button</em>'.
	 * @generated
	 */
	PopupTimeButton createPopupTimeButton();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MultiactivityPackage getMultiactivityPackage();

} //MultiactivityFactory
