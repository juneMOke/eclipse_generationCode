/**
 */
package org.eclipse.sirius.sample.multiactivity.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.sirius.sample.multiactivity.ListDeclaration;
import org.eclipse.sirius.sample.multiactivity.ListView;
import org.eclipse.sirius.sample.multiactivity.MultiactivityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.impl.ListViewImpl#getListdeclaration <em>Listdeclaration</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.impl.ListViewImpl#isDisplayDetail <em>Display Detail</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.impl.ListViewImpl#isAllowedCreation <em>Allowed Creation</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.impl.ListViewImpl#isAllowDeletion <em>Allow Deletion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListViewImpl extends ViewImpl implements ListView {
	/**
	 * The cached value of the '{@link #getListdeclaration() <em>Listdeclaration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListdeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<ListDeclaration> listdeclaration;

	/**
	 * The default value of the '{@link #isDisplayDetail() <em>Display Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayDetail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPLAY_DETAIL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDisplayDetail() <em>Display Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayDetail()
	 * @generated
	 * @ordered
	 */
	protected boolean displayDetail = DISPLAY_DETAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowedCreation() <em>Allowed Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowedCreation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOWED_CREATION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAllowedCreation() <em>Allowed Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowedCreation()
	 * @generated
	 * @ordered
	 */
	protected boolean allowedCreation = ALLOWED_CREATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowDeletion() <em>Allow Deletion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowDeletion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_DELETION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAllowDeletion() <em>Allow Deletion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowDeletion()
	 * @generated
	 * @ordered
	 */
	protected boolean allowDeletion = ALLOW_DELETION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultiactivityPackage.Literals.LIST_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListDeclaration> getListdeclaration() {
		if (listdeclaration == null) {
			listdeclaration = new EObjectResolvingEList<ListDeclaration>(ListDeclaration.class, this,
					MultiactivityPackage.LIST_VIEW__LISTDECLARATION);
		}
		return listdeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisplayDetail() {
		return displayDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayDetail(boolean newDisplayDetail) {
		boolean oldDisplayDetail = displayDetail;
		displayDetail = newDisplayDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiactivityPackage.LIST_VIEW__DISPLAY_DETAIL,
					oldDisplayDetail, displayDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowedCreation() {
		return allowedCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowedCreation(boolean newAllowedCreation) {
		boolean oldAllowedCreation = allowedCreation;
		allowedCreation = newAllowedCreation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiactivityPackage.LIST_VIEW__ALLOWED_CREATION,
					oldAllowedCreation, allowedCreation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowDeletion() {
		return allowDeletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowDeletion(boolean newAllowDeletion) {
		boolean oldAllowDeletion = allowDeletion;
		allowDeletion = newAllowDeletion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiactivityPackage.LIST_VIEW__ALLOW_DELETION,
					oldAllowDeletion, allowDeletion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MultiactivityPackage.LIST_VIEW__LISTDECLARATION:
			return getListdeclaration();
		case MultiactivityPackage.LIST_VIEW__DISPLAY_DETAIL:
			return isDisplayDetail();
		case MultiactivityPackage.LIST_VIEW__ALLOWED_CREATION:
			return isAllowedCreation();
		case MultiactivityPackage.LIST_VIEW__ALLOW_DELETION:
			return isAllowDeletion();
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
		case MultiactivityPackage.LIST_VIEW__LISTDECLARATION:
			getListdeclaration().clear();
			getListdeclaration().addAll((Collection<? extends ListDeclaration>) newValue);
			return;
		case MultiactivityPackage.LIST_VIEW__DISPLAY_DETAIL:
			setDisplayDetail((Boolean) newValue);
			return;
		case MultiactivityPackage.LIST_VIEW__ALLOWED_CREATION:
			setAllowedCreation((Boolean) newValue);
			return;
		case MultiactivityPackage.LIST_VIEW__ALLOW_DELETION:
			setAllowDeletion((Boolean) newValue);
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
		case MultiactivityPackage.LIST_VIEW__LISTDECLARATION:
			getListdeclaration().clear();
			return;
		case MultiactivityPackage.LIST_VIEW__DISPLAY_DETAIL:
			setDisplayDetail(DISPLAY_DETAIL_EDEFAULT);
			return;
		case MultiactivityPackage.LIST_VIEW__ALLOWED_CREATION:
			setAllowedCreation(ALLOWED_CREATION_EDEFAULT);
			return;
		case MultiactivityPackage.LIST_VIEW__ALLOW_DELETION:
			setAllowDeletion(ALLOW_DELETION_EDEFAULT);
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
		case MultiactivityPackage.LIST_VIEW__LISTDECLARATION:
			return listdeclaration != null && !listdeclaration.isEmpty();
		case MultiactivityPackage.LIST_VIEW__DISPLAY_DETAIL:
			return displayDetail != DISPLAY_DETAIL_EDEFAULT;
		case MultiactivityPackage.LIST_VIEW__ALLOWED_CREATION:
			return allowedCreation != ALLOWED_CREATION_EDEFAULT;
		case MultiactivityPackage.LIST_VIEW__ALLOW_DELETION:
			return allowDeletion != ALLOW_DELETION_EDEFAULT;
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
		result.append(" (displayDetail: ");
		result.append(displayDetail);
		result.append(", allowedCreation: ");
		result.append(allowedCreation);
		result.append(", allowDeletion: ");
		result.append(allowDeletion);
		result.append(')');
		return result.toString();
	}

} //ListViewImpl
