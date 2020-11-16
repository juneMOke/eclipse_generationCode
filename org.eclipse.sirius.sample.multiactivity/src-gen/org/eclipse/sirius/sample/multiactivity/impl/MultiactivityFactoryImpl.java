/**
 */
package org.eclipse.sirius.sample.multiactivity.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.sirius.sample.multiactivity.Activity;
import org.eclipse.sirius.sample.multiactivity.Application;
import org.eclipse.sirius.sample.multiactivity.Attribute;
import org.eclipse.sirius.sample.multiactivity.Entity;
import org.eclipse.sirius.sample.multiactivity.Layout;
import org.eclipse.sirius.sample.multiactivity.ListDeclaration;
import org.eclipse.sirius.sample.multiactivity.ListView;
import org.eclipse.sirius.sample.multiactivity.MultiactivityFactory;
import org.eclipse.sirius.sample.multiactivity.MultiactivityPackage;
import org.eclipse.sirius.sample.multiactivity.NewActivityButton;
import org.eclipse.sirius.sample.multiactivity.PopupMessageButton;
import org.eclipse.sirius.sample.multiactivity.PopupTimeButton;
import org.eclipse.sirius.sample.multiactivity.PrimitiveType;
import org.eclipse.sirius.sample.multiactivity.PropertyKind;
import org.eclipse.sirius.sample.multiactivity.TextView;

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
		case MultiactivityPackage.PACKAGE:
			return createPackage();
		case MultiactivityPackage.PRIMITIVE_TYPE:
			return createPrimitiveType();
		case MultiactivityPackage.ENTITY:
			return createEntity();
		case MultiactivityPackage.ATTRIBUTE:
			return createAttribute();
		case MultiactivityPackage.LIST_DECLARATION:
			return createListDeclaration();
		case MultiactivityPackage.LIST_VIEW:
			return createListView();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case MultiactivityPackage.PROPERTY_KIND:
			return createPropertyKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case MultiactivityPackage.PROPERTY_KIND:
			return convertPropertyKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public org.eclipse.sirius.sample.multiactivity.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListDeclaration createListDeclaration() {
		ListDeclarationImpl listDeclaration = new ListDeclarationImpl();
		return listDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListView createListView() {
		ListViewImpl listView = new ListViewImpl();
		return listView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyKind createPropertyKindFromString(EDataType eDataType, String initialValue) {
		PropertyKind result = PropertyKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
