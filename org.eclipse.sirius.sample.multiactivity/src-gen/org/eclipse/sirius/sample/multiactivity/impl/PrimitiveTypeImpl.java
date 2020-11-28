/**
 */
package org.eclipse.sirius.sample.multiactivity.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.sirius.sample.multiactivity.MultiactivityPackage;
import org.eclipse.sirius.sample.multiactivity.PrimitiveType;
import org.eclipse.sirius.sample.multiactivity.PropertyKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.impl.PrimitiveTypeImpl#getPropertyKind <em>Property Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveTypeImpl extends PackageableImpl implements PrimitiveType {
	/**
	 * The default value of the '{@link #getPropertyKind() <em>Property Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyKind()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyKind PROPERTY_KIND_EDEFAULT = PropertyKind.INT;
	/**
	 * The cached value of the '{@link #getPropertyKind() <em>Property Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyKind()
	 * @generated
	 * @ordered
	 */
	protected PropertyKind propertyKind = PROPERTY_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultiactivityPackage.Literals.PRIMITIVE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyKind getPropertyKind() {
		return propertyKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyKind(PropertyKind newPropertyKind) {
		PropertyKind oldPropertyKind = propertyKind;
		propertyKind = newPropertyKind == null ? PROPERTY_KIND_EDEFAULT : newPropertyKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiactivityPackage.PRIMITIVE_TYPE__PROPERTY_KIND,
					oldPropertyKind, propertyKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MultiactivityPackage.PRIMITIVE_TYPE__PROPERTY_KIND:
			return getPropertyKind();
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
		case MultiactivityPackage.PRIMITIVE_TYPE__PROPERTY_KIND:
			setPropertyKind((PropertyKind) newValue);
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
		case MultiactivityPackage.PRIMITIVE_TYPE__PROPERTY_KIND:
			setPropertyKind(PROPERTY_KIND_EDEFAULT);
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
		case MultiactivityPackage.PRIMITIVE_TYPE__PROPERTY_KIND:
			return propertyKind != PROPERTY_KIND_EDEFAULT;
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
		result.append(" (propertyKind: ");
		result.append(propertyKind);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		return getPropertyKind().getName();
	}

} //PrimitiveTypeImpl
