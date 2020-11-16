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

import org.eclipse.sirius.sample.multiactivity.MultiactivityPackage;
import org.eclipse.sirius.sample.multiactivity.Packageable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.impl.PackageImpl#getPackageables <em>Packageables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends PackageableImpl implements org.eclipse.sirius.sample.multiactivity.Package {
	/**
	 * The cached value of the '{@link #getPackageables() <em>Packageables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageables()
	 * @generated
	 * @ordered
	 */
	protected EList<Packageable> packageables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultiactivityPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Packageable> getPackageables() {
		if (packageables == null) {
			packageables = new EObjectContainmentEList<Packageable>(Packageable.class, this,
					MultiactivityPackage.PACKAGE__PACKAGEABLES);
		}
		return packageables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MultiactivityPackage.PACKAGE__PACKAGEABLES:
			return ((InternalEList<?>) getPackageables()).basicRemove(otherEnd, msgs);
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
		case MultiactivityPackage.PACKAGE__PACKAGEABLES:
			return getPackageables();
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
		case MultiactivityPackage.PACKAGE__PACKAGEABLES:
			getPackageables().clear();
			getPackageables().addAll((Collection<? extends Packageable>) newValue);
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
		case MultiactivityPackage.PACKAGE__PACKAGEABLES:
			getPackageables().clear();
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
		case MultiactivityPackage.PACKAGE__PACKAGEABLES:
			return packageables != null && !packageables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
