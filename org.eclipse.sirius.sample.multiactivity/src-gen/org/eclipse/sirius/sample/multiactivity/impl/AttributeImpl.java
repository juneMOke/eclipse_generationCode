/**
 */
package org.eclipse.sirius.sample.multiactivity.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.multiactivity.Attribute;
import org.eclipse.sirius.sample.multiactivity.MultiactivityPackage;
import org.eclipse.sirius.sample.multiactivity.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.impl.AttributeImpl#isDisplayInList <em>Display In List</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.impl.AttributeImpl#isDisplayInDetail <em>Display In Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisplayInList() <em>Display In List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayInList()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPLAY_IN_LIST_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDisplayInList() <em>Display In List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayInList()
	 * @generated
	 * @ordered
	 */
	protected boolean displayInList = DISPLAY_IN_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisplayInDetail() <em>Display In Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayInDetail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPLAY_IN_DETAIL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDisplayInDetail() <em>Display In Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayInDetail()
	 * @generated
	 * @ordered
	 */
	protected boolean displayInDetail = DISPLAY_IN_DETAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultiactivityPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Type) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MultiactivityPackage.ATTRIBUTE__TYPE,
							oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiactivityPackage.ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiactivityPackage.ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisplayInList() {
		return displayInList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayInList(boolean newDisplayInList) {
		boolean oldDisplayInList = displayInList;
		displayInList = newDisplayInList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiactivityPackage.ATTRIBUTE__DISPLAY_IN_LIST,
					oldDisplayInList, displayInList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisplayInDetail() {
		return displayInDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayInDetail(boolean newDisplayInDetail) {
		boolean oldDisplayInDetail = displayInDetail;
		displayInDetail = newDisplayInDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiactivityPackage.ATTRIBUTE__DISPLAY_IN_DETAIL,
					oldDisplayInDetail, displayInDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MultiactivityPackage.ATTRIBUTE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case MultiactivityPackage.ATTRIBUTE__NAME:
			return getName();
		case MultiactivityPackage.ATTRIBUTE__DISPLAY_IN_LIST:
			return isDisplayInList();
		case MultiactivityPackage.ATTRIBUTE__DISPLAY_IN_DETAIL:
			return isDisplayInDetail();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MultiactivityPackage.ATTRIBUTE__TYPE:
			setType((Type) newValue);
			return;
		case MultiactivityPackage.ATTRIBUTE__NAME:
			setName((String) newValue);
			return;
		case MultiactivityPackage.ATTRIBUTE__DISPLAY_IN_LIST:
			setDisplayInList((Boolean) newValue);
			return;
		case MultiactivityPackage.ATTRIBUTE__DISPLAY_IN_DETAIL:
			setDisplayInDetail((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MultiactivityPackage.ATTRIBUTE__TYPE:
			setType((Type) null);
			return;
		case MultiactivityPackage.ATTRIBUTE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MultiactivityPackage.ATTRIBUTE__DISPLAY_IN_LIST:
			setDisplayInList(DISPLAY_IN_LIST_EDEFAULT);
			return;
		case MultiactivityPackage.ATTRIBUTE__DISPLAY_IN_DETAIL:
			setDisplayInDetail(DISPLAY_IN_DETAIL_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MultiactivityPackage.ATTRIBUTE__TYPE:
			return type != null;
		case MultiactivityPackage.ATTRIBUTE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MultiactivityPackage.ATTRIBUTE__DISPLAY_IN_LIST:
			return displayInList != DISPLAY_IN_LIST_EDEFAULT;
		case MultiactivityPackage.ATTRIBUTE__DISPLAY_IN_DETAIL:
			return displayInDetail != DISPLAY_IN_DETAIL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", displayInList: ");
		result.append(displayInList);
		result.append(", displayInDetail: ");
		result.append(displayInDetail);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
