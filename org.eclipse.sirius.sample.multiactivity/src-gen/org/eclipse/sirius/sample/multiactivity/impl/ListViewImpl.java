/**
 */
package org.eclipse.sirius.sample.multiactivity.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.sirius.sample.multiactivity.Attribute;
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
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.impl.ListViewImpl#getAttributesDisplayInList <em>Attributes Display In List</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.impl.ListViewImpl#getAttributesDisplayInDetail <em>Attributes Display In Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListViewImpl extends ViewImpl implements ListView {
	/**
	 * The cached value of the '{@link #getListdeclaration() <em>Listdeclaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListdeclaration()
	 * @generated
	 * @ordered
	 */
	protected ListDeclaration listdeclaration;

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
	 * The cached value of the '{@link #getAttributesDisplayInList() <em>Attributes Display In List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributesDisplayInList()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributesDisplayInList;

	/**
	 * The cached value of the '{@link #getAttributesDisplayInDetail() <em>Attributes Display In Detail</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributesDisplayInDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributesDisplayInDetail;

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
	public ListDeclaration getListdeclaration() {
		if (listdeclaration != null && listdeclaration.eIsProxy()) {
			InternalEObject oldListdeclaration = (InternalEObject) listdeclaration;
			listdeclaration = (ListDeclaration) eResolveProxy(oldListdeclaration);
			if (listdeclaration != oldListdeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MultiactivityPackage.LIST_VIEW__LISTDECLARATION, oldListdeclaration, listdeclaration));
			}
		}
		return listdeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListDeclaration basicGetListdeclaration() {
		return listdeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListdeclaration(ListDeclaration newListdeclaration) {
		ListDeclaration oldListdeclaration = listdeclaration;
		listdeclaration = newListdeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiactivityPackage.LIST_VIEW__LISTDECLARATION,
					oldListdeclaration, listdeclaration));
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
	public EList<Attribute> getAttributesDisplayInDetail() {
		if (attributesDisplayInDetail == null) {
			attributesDisplayInDetail = new EObjectResolvingEList<Attribute>(Attribute.class, this,
					MultiactivityPackage.LIST_VIEW__ATTRIBUTES_DISPLAY_IN_DETAIL);
		}
		return attributesDisplayInDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttributesDisplayInList() {
		if (attributesDisplayInList == null) {
			attributesDisplayInList = new EObjectResolvingEList<Attribute>(Attribute.class, this,
					MultiactivityPackage.LIST_VIEW__ATTRIBUTES_DISPLAY_IN_LIST);
		}
		return attributesDisplayInList;
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
			if (resolve)
				return getListdeclaration();
			return basicGetListdeclaration();
		case MultiactivityPackage.LIST_VIEW__DISPLAY_DETAIL:
			return isDisplayDetail();
		case MultiactivityPackage.LIST_VIEW__ALLOWED_CREATION:
			return isAllowedCreation();
		case MultiactivityPackage.LIST_VIEW__ALLOW_DELETION:
			return isAllowDeletion();
		case MultiactivityPackage.LIST_VIEW__ATTRIBUTES_DISPLAY_IN_LIST:
			return getAttributesDisplayInList();
		case MultiactivityPackage.LIST_VIEW__ATTRIBUTES_DISPLAY_IN_DETAIL:
			return getAttributesDisplayInDetail();
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
			setListdeclaration((ListDeclaration) newValue);
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
		case MultiactivityPackage.LIST_VIEW__ATTRIBUTES_DISPLAY_IN_LIST:
			getAttributesDisplayInList().clear();
			getAttributesDisplayInList().addAll((Collection<? extends Attribute>) newValue);
			return;
		case MultiactivityPackage.LIST_VIEW__ATTRIBUTES_DISPLAY_IN_DETAIL:
			getAttributesDisplayInDetail().clear();
			getAttributesDisplayInDetail().addAll((Collection<? extends Attribute>) newValue);
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
			setListdeclaration((ListDeclaration) null);
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
		case MultiactivityPackage.LIST_VIEW__ATTRIBUTES_DISPLAY_IN_LIST:
			getAttributesDisplayInList().clear();
			return;
		case MultiactivityPackage.LIST_VIEW__ATTRIBUTES_DISPLAY_IN_DETAIL:
			getAttributesDisplayInDetail().clear();
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
			return listdeclaration != null;
		case MultiactivityPackage.LIST_VIEW__DISPLAY_DETAIL:
			return displayDetail != DISPLAY_DETAIL_EDEFAULT;
		case MultiactivityPackage.LIST_VIEW__ALLOWED_CREATION:
			return allowedCreation != ALLOWED_CREATION_EDEFAULT;
		case MultiactivityPackage.LIST_VIEW__ALLOW_DELETION:
			return allowDeletion != ALLOW_DELETION_EDEFAULT;
		case MultiactivityPackage.LIST_VIEW__ATTRIBUTES_DISPLAY_IN_LIST:
			return attributesDisplayInList != null && !attributesDisplayInList.isEmpty();
		case MultiactivityPackage.LIST_VIEW__ATTRIBUTES_DISPLAY_IN_DETAIL:
			return attributesDisplayInDetail != null && !attributesDisplayInDetail.isEmpty();
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
