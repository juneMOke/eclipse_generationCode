/**
 */
package org.eclipse.sirius.sample.multiactivity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityFactory
 * @model kind="package"
 * @generated
 */
public interface MultiactivityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "multiactivity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/multiactivity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "multiactivity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MultiactivityPackage eINSTANCE = org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.multiactivity.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.multiactivity.impl.ActivityImpl
	 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.multiactivity.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.multiactivity.impl.LayoutImpl
	 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.multiactivity.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.multiactivity.impl.ViewImpl
	 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.multiactivity.impl.NewActivityButtonImpl <em>New Activity Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.multiactivity.impl.NewActivityButtonImpl
	 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getNewActivityButton()
	 * @generated
	 */
	int NEW_ACTIVITY_BUTTON = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.multiactivity.impl.PopupMessageButtonImpl <em>Popup Message Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.multiactivity.impl.PopupMessageButtonImpl
	 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getPopupMessageButton()
	 * @generated
	 */
	int POPUP_MESSAGE_BUTTON = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.multiactivity.impl.TextViewImpl <em>Text View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.multiactivity.impl.TextViewImpl
	 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getTextView()
	 * @generated
	 */
	int TEXT_VIEW = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.multiactivity.impl.PopupTimeButtonImpl <em>Popup Time Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.multiactivity.impl.PopupTimeButtonImpl
	 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getPopupTimeButton()
	 * @generated
	 */
	int POPUP_TIME_BUTTON = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.multiactivity.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.multiactivity.impl.NamedElementImpl
	 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.multiactivity.impl.PackageableImpl <em>Packageable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.multiactivity.impl.PackageableImpl
	 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getPackageable()
	 * @generated
	 */
	int PACKAGEABLE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Packageable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Packageable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = PACKAGEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Layouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LAYOUTS = PACKAGEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = PACKAGEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = PACKAGEABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__VIEWS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = 1;

	/**
	 * The feature id for the '<em><b>Id view</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ID_VIEW = 2;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ACTIVITY_BUTTON__CONTENT = VIEW__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ACTIVITY_BUTTON__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Id view</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ACTIVITY_BUTTON__ID_VIEW = VIEW__ID_VIEW;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ACTIVITY_BUTTON__ACTIVITY = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>New Activity Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ACTIVITY_BUTTON_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>New Activity Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ACTIVITY_BUTTON_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_MESSAGE_BUTTON__CONTENT = VIEW__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_MESSAGE_BUTTON__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Id view</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_MESSAGE_BUTTON__ID_VIEW = VIEW__ID_VIEW;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_MESSAGE_BUTTON__MESSAGE = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Popup Message Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_MESSAGE_BUTTON_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Popup Message Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_MESSAGE_BUTTON_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__CONTENT = VIEW__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Id view</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__ID_VIEW = VIEW__ID_VIEW;

	/**
	 * The number of structural features of the '<em>Text View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_TIME_BUTTON__CONTENT = VIEW__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_TIME_BUTTON__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Id view</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_TIME_BUTTON__ID_VIEW = VIEW__ID_VIEW;

	/**
	 * The number of structural features of the '<em>Popup Time Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_TIME_BUTTON_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Popup Time Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_TIME_BUTTON_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.multiactivity.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.multiactivity.impl.ApplicationImpl
	 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 7;

	/**
	 * The feature id for the '<em><b>Namedelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAMEDELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.multiactivity.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.multiactivity.impl.PackageImpl
	 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = PACKAGEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Packageables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGEABLES = PACKAGEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = PACKAGEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = PACKAGEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.multiactivity.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.multiactivity.impl.PrimitiveTypeImpl
	 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = PACKAGEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Property Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__PROPERTY_KIND = PACKAGEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = PACKAGEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = PACKAGEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.multiactivity.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.multiactivity.impl.AttributeImpl
	 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.multiactivity.Type <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.multiactivity.Type
	 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.multiactivity.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.multiactivity.impl.EntityImpl
	 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = PACKAGEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = PACKAGEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = PACKAGEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = PACKAGEABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.multiactivity.impl.ListDeclarationImpl <em>List Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.multiactivity.impl.ListDeclarationImpl
	 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getListDeclaration()
	 * @generated
	 */
	int LIST_DECLARATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DECLARATION__NAME = PACKAGEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DECLARATION__ENTITY = PACKAGEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DECLARATION_FEATURE_COUNT = PACKAGEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DECLARATION_OPERATION_COUNT = PACKAGEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.multiactivity.impl.ListViewImpl <em>List View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.multiactivity.impl.ListViewImpl
	 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getListView()
	 * @generated
	 */
	int LIST_VIEW = 16;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__CONTENT = VIEW__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Id view</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__ID_VIEW = VIEW__ID_VIEW;

	/**
	 * The feature id for the '<em><b>Listdeclaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__LISTDECLARATION = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__DISPLAY_DETAIL = VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Allowed Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__ALLOWED_CREATION = VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allow Deletion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__ALLOW_DELETION = VIEW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attributes Display In List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__ATTRIBUTES_DISPLAY_IN_LIST = VIEW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attributes Display In Detail</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__ATTRIBUTES_DISPLAY_IN_DETAIL = VIEW_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>List View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>List View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.multiactivity.PropertyKind <em>Property Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.multiactivity.PropertyKind
	 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getPropertyKind()
	 * @generated
	 */
	int PROPERTY_KIND = 17;

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.multiactivity.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.multiactivity.Activity#getLayouts <em>Layouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layouts</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.Activity#getLayouts()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Layouts();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.multiactivity.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.multiactivity.Layout#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.Layout#getViews()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Views();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.multiactivity.Layout#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.Layout#getName()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.multiactivity.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.multiactivity.View#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.View#getContent()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.multiactivity.View#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.View#getName()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.multiactivity.View#getId_view <em>Id view</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id view</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.View#getId_view()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Id_view();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.multiactivity.NewActivityButton <em>New Activity Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Activity Button</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.NewActivityButton
	 * @generated
	 */
	EClass getNewActivityButton();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.multiactivity.NewActivityButton#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.NewActivityButton#getActivity()
	 * @see #getNewActivityButton()
	 * @generated
	 */
	EReference getNewActivityButton_Activity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.multiactivity.PopupMessageButton <em>Popup Message Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Popup Message Button</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.PopupMessageButton
	 * @generated
	 */
	EClass getPopupMessageButton();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.multiactivity.PopupMessageButton#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.PopupMessageButton#getMessage()
	 * @see #getPopupMessageButton()
	 * @generated
	 */
	EAttribute getPopupMessageButton_Message();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.multiactivity.TextView <em>Text View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text View</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.TextView
	 * @generated
	 */
	EClass getTextView();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.multiactivity.PopupTimeButton <em>Popup Time Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Popup Time Button</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.PopupTimeButton
	 * @generated
	 */
	EClass getPopupTimeButton();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.multiactivity.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.multiactivity.Application#getNamedelements <em>Namedelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namedelements</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.Application#getNamedelements()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Namedelements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.multiactivity.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.multiactivity.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.multiactivity.Packageable <em>Packageable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packageable</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.Packageable
	 * @generated
	 */
	EClass getPackageable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.multiactivity.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.multiactivity.Package#getPackageables <em>Packageables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packageables</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.Package#getPackageables()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Packageables();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.multiactivity.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.multiactivity.PrimitiveType#getPropertyKind <em>Property Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Kind</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.PrimitiveType#getPropertyKind()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_PropertyKind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.multiactivity.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.multiactivity.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.multiactivity.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.multiactivity.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.multiactivity.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.multiactivity.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.multiactivity.ListDeclaration <em>List Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Declaration</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.ListDeclaration
	 * @generated
	 */
	EClass getListDeclaration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.multiactivity.ListDeclaration#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.ListDeclaration#getEntity()
	 * @see #getListDeclaration()
	 * @generated
	 */
	EReference getListDeclaration_Entity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.multiactivity.ListView <em>List View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List View</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.ListView
	 * @generated
	 */
	EClass getListView();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.multiactivity.ListView#getListdeclaration <em>Listdeclaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Listdeclaration</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.ListView#getListdeclaration()
	 * @see #getListView()
	 * @generated
	 */
	EReference getListView_Listdeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.multiactivity.ListView#isDisplayDetail <em>Display Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Detail</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.ListView#isDisplayDetail()
	 * @see #getListView()
	 * @generated
	 */
	EAttribute getListView_DisplayDetail();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.multiactivity.ListView#isAllowedCreation <em>Allowed Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowed Creation</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.ListView#isAllowedCreation()
	 * @see #getListView()
	 * @generated
	 */
	EAttribute getListView_AllowedCreation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.multiactivity.ListView#isAllowDeletion <em>Allow Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Deletion</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.ListView#isAllowDeletion()
	 * @see #getListView()
	 * @generated
	 */
	EAttribute getListView_AllowDeletion();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.multiactivity.ListView#getAttributesDisplayInDetail <em>Attributes Display In Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes Display In Detail</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.ListView#getAttributesDisplayInDetail()
	 * @see #getListView()
	 * @generated
	 */
	EReference getListView_AttributesDisplayInDetail();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.multiactivity.ListView#getAttributesDisplayInList <em>Attributes Display In List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes Display In List</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.ListView#getAttributesDisplayInList()
	 * @see #getListView()
	 * @generated
	 */
	EReference getListView_AttributesDisplayInList();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.sample.multiactivity.PropertyKind <em>Property Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Kind</em>'.
	 * @see org.eclipse.sirius.sample.multiactivity.PropertyKind
	 * @generated
	 */
	EEnum getPropertyKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MultiactivityFactory getMultiactivityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.multiactivity.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.multiactivity.impl.ActivityImpl
		 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Layouts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__LAYOUTS = eINSTANCE.getActivity_Layouts();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.multiactivity.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.multiactivity.impl.LayoutImpl
		 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__VIEWS = eINSTANCE.getLayout_Views();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__NAME = eINSTANCE.getLayout_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.multiactivity.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.multiactivity.impl.ViewImpl
		 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__CONTENT = eINSTANCE.getView_Content();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__NAME = eINSTANCE.getView_Name();

		/**
		 * The meta object literal for the '<em><b>Id view</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__ID_VIEW = eINSTANCE.getView_Id_view();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.multiactivity.impl.NewActivityButtonImpl <em>New Activity Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.multiactivity.impl.NewActivityButtonImpl
		 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getNewActivityButton()
		 * @generated
		 */
		EClass NEW_ACTIVITY_BUTTON = eINSTANCE.getNewActivityButton();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_ACTIVITY_BUTTON__ACTIVITY = eINSTANCE.getNewActivityButton_Activity();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.multiactivity.impl.PopupMessageButtonImpl <em>Popup Message Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.multiactivity.impl.PopupMessageButtonImpl
		 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getPopupMessageButton()
		 * @generated
		 */
		EClass POPUP_MESSAGE_BUTTON = eINSTANCE.getPopupMessageButton();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPUP_MESSAGE_BUTTON__MESSAGE = eINSTANCE.getPopupMessageButton_Message();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.multiactivity.impl.TextViewImpl <em>Text View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.multiactivity.impl.TextViewImpl
		 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getTextView()
		 * @generated
		 */
		EClass TEXT_VIEW = eINSTANCE.getTextView();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.multiactivity.impl.PopupTimeButtonImpl <em>Popup Time Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.multiactivity.impl.PopupTimeButtonImpl
		 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getPopupTimeButton()
		 * @generated
		 */
		EClass POPUP_TIME_BUTTON = eINSTANCE.getPopupTimeButton();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.multiactivity.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.multiactivity.impl.ApplicationImpl
		 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Namedelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__NAMEDELEMENTS = eINSTANCE.getApplication_Namedelements();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.multiactivity.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.multiactivity.impl.NamedElementImpl
		 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.multiactivity.impl.PackageableImpl <em>Packageable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.multiactivity.impl.PackageableImpl
		 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getPackageable()
		 * @generated
		 */
		EClass PACKAGEABLE = eINSTANCE.getPackageable();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.multiactivity.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.multiactivity.impl.PackageImpl
		 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Packageables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGEABLES = eINSTANCE.getPackage_Packageables();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.multiactivity.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.multiactivity.impl.PrimitiveTypeImpl
		 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Property Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__PROPERTY_KIND = eINSTANCE.getPrimitiveType_PropertyKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.multiactivity.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.multiactivity.impl.AttributeImpl
		 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.multiactivity.Type <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.multiactivity.Type
		 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.multiactivity.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.multiactivity.impl.EntityImpl
		 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.multiactivity.impl.ListDeclarationImpl <em>List Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.multiactivity.impl.ListDeclarationImpl
		 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getListDeclaration()
		 * @generated
		 */
		EClass LIST_DECLARATION = eINSTANCE.getListDeclaration();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_DECLARATION__ENTITY = eINSTANCE.getListDeclaration_Entity();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.multiactivity.impl.ListViewImpl <em>List View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.multiactivity.impl.ListViewImpl
		 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getListView()
		 * @generated
		 */
		EClass LIST_VIEW = eINSTANCE.getListView();

		/**
		 * The meta object literal for the '<em><b>Listdeclaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_VIEW__LISTDECLARATION = eINSTANCE.getListView_Listdeclaration();

		/**
		 * The meta object literal for the '<em><b>Display Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_VIEW__DISPLAY_DETAIL = eINSTANCE.getListView_DisplayDetail();

		/**
		 * The meta object literal for the '<em><b>Allowed Creation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_VIEW__ALLOWED_CREATION = eINSTANCE.getListView_AllowedCreation();

		/**
		 * The meta object literal for the '<em><b>Allow Deletion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_VIEW__ALLOW_DELETION = eINSTANCE.getListView_AllowDeletion();

		/**
		 * The meta object literal for the '<em><b>Attributes Display In Detail</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_VIEW__ATTRIBUTES_DISPLAY_IN_DETAIL = eINSTANCE.getListView_AttributesDisplayInDetail();

		/**
		 * The meta object literal for the '<em><b>Attributes Display In List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_VIEW__ATTRIBUTES_DISPLAY_IN_LIST = eINSTANCE.getListView_AttributesDisplayInList();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.multiactivity.PropertyKind <em>Property Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.multiactivity.PropertyKind
		 * @see org.eclipse.sirius.sample.multiactivity.impl.MultiactivityPackageImpl#getPropertyKind()
		 * @generated
		 */
		EEnum PROPERTY_KIND = eINSTANCE.getPropertyKind();

	}

} //MultiactivityPackage
