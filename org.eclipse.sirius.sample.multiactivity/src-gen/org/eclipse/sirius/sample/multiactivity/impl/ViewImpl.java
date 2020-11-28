/**
 */
package org.eclipse.sirius.sample.multiactivity.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.multiactivity.MultiactivityPackage;
import org.eclipse.sirius.sample.multiactivity.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.impl.ViewImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.impl.ViewImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.impl.ViewImpl#getId_view <em>Id view</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ViewImpl extends MinimalEObjectImpl.Container implements View {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;
	/**
	 * The number use to generate view's id .
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #setId_view()
	 * @generated NOT
	 * @ordered
	 */
	protected static int ID_NUMBER = 0;

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
	 * The default value of the '{@link #getId_view() <em>Id view</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_view()
	 * @generated
	 * @ordered
	 */

	protected static final String ID_VIEW_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId_view() <em>Id view</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_view()
	 * @generated
	 * @ordered
	 */
	protected String id_view = ID_VIEW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultiactivityPackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiactivityPackage.VIEW__CONTENT, oldContent,
					content));
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
	 * @generated NOT
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiactivityPackage.VIEW__NAME, oldName, name));
		setId_view("");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId_view() {
		return id_view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setId_view(String newId_view) {
		ID_NUMBER += 1;
		String oldId_view = id_view;
		id_view = getName() + ID_NUMBER;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiactivityPackage.VIEW__ID_VIEW, oldId_view,
					id_view));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MultiactivityPackage.VIEW__CONTENT:
			return getContent();
		case MultiactivityPackage.VIEW__NAME:
			return getName();
		case MultiactivityPackage.VIEW__ID_VIEW:
			return getId_view();
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
		case MultiactivityPackage.VIEW__CONTENT:
			setContent((String) newValue);
			return;
		case MultiactivityPackage.VIEW__NAME:
			setName((String) newValue);
			return;
		case MultiactivityPackage.VIEW__ID_VIEW:
			setId_view((String) newValue);
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
		case MultiactivityPackage.VIEW__CONTENT:
			setContent(CONTENT_EDEFAULT);
			return;
		case MultiactivityPackage.VIEW__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MultiactivityPackage.VIEW__ID_VIEW:
			setId_view(ID_VIEW_EDEFAULT);
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
		case MultiactivityPackage.VIEW__CONTENT:
			return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
		case MultiactivityPackage.VIEW__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MultiactivityPackage.VIEW__ID_VIEW:
			return ID_VIEW_EDEFAULT == null ? id_view != null : !ID_VIEW_EDEFAULT.equals(id_view);
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
		result.append(" (content: ");
		result.append(content);
		result.append(", name: ");
		result.append(name);
		result.append(", id_view: ");
		result.append(id_view);
		result.append(')');
		return result.toString();
	}

} //ViewImpl
