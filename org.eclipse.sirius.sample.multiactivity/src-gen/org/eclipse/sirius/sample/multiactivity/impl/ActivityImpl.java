/**
 */
package org.eclipse.sirius.sample.multiactivity.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.multiactivity.Activity;
import org.eclipse.sirius.sample.multiactivity.Layout;
import org.eclipse.sirius.sample.multiactivity.MultiactivityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.impl.ActivityImpl#getLayouts <em>Layouts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends PackageableImpl implements Activity {
	/**
	 * The cached value of the '{@link #getLayouts() <em>Layouts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayouts()
	 * @generated
	 * @ordered
	 */
	protected EList<Layout> layouts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultiactivityPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Layout> getLayouts() {
		if (layouts == null) {
			layouts = new EObjectContainmentEList<Layout>(Layout.class, this, MultiactivityPackage.ACTIVITY__LAYOUTS);
		}
		return layouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MultiactivityPackage.ACTIVITY__LAYOUTS:
			return ((InternalEList<?>) getLayouts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MultiactivityPackage.ACTIVITY__LAYOUTS:
			return getLayouts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MultiactivityPackage.ACTIVITY__LAYOUTS:
			getLayouts().clear();
			getLayouts().addAll((Collection<? extends Layout>) newValue);
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
		case MultiactivityPackage.ACTIVITY__LAYOUTS:
			getLayouts().clear();
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
		case MultiactivityPackage.ACTIVITY__LAYOUTS:
			return layouts != null && !layouts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl
