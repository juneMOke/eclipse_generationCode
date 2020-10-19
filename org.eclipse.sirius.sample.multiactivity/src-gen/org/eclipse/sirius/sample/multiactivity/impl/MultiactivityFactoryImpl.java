/**
 */
package org.eclipse.sirius.sample.multiactivity.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.sirius.sample.multiactivity.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiactivityFactoryImpl extends EFactoryImpl implements MultiactivityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultiactivityFactory init() {
		try {
			MultiactivityFactory theMultiactivityFactory = (MultiactivityFactory) EPackage.Registry.INSTANCE
					.getEFactory(MultiactivityPackage.eNS_URI);
			if (theMultiactivityFactory != null) {
				return theMultiactivityFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MultiactivityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiactivityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MultiactivityPackage.ACTIVITY:
			return createActivity();
		case MultiactivityPackage.LAYOUT:
			return createLayout();
		case MultiactivityPackage.NEW_ACTIVITY_BUTTON:
			return createNewActivityButton();
		case MultiactivityPackage.POPUP_MESSAGE_BUTTON:
			return createPopupMessageButton();
		case MultiactivityPackage.TEXT_VIEW:
			return createTextView();
		case MultiactivityPackage.POPUP_TIME_BUTTON:
			return createPopupTimeButton();
		case MultiactivityPackage.APPLICATION:
			return createApplication();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Layout createLayout() {
		LayoutImpl layout = new LayoutImpl();
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NewActivityButton createNewActivityButton() {
		NewActivityButtonImpl newActivityButton = new NewActivityButtonImpl();
		return newActivityButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PopupMessageButton createPopupMessageButton() {
		PopupMessageButtonImpl popupMessageButton = new PopupMessageButtonImpl();
		return popupMessageButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextView createTextView() {
		TextViewImpl textView = new TextViewImpl();
		return textView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PopupTimeButton createPopupTimeButton() {
		PopupTimeButtonImpl popupTimeButton = new PopupTimeButtonImpl();
		return popupTimeButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiactivityPackage getMultiactivityPackage() {
		return (MultiactivityPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MultiactivityPackage getPackage() {
		return MultiactivityPackage.eINSTANCE;
	}

} //MultiactivityFactoryImpl
