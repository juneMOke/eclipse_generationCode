/**
 */
package org.eclipse.sirius.sample.multiactivity.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.sirius.sample.multiactivity.Activity;
import org.eclipse.sirius.sample.multiactivity.Application;
import org.eclipse.sirius.sample.multiactivity.Attribute;
import org.eclipse.sirius.sample.multiactivity.Entity;
import org.eclipse.sirius.sample.multiactivity.Layout;
import org.eclipse.sirius.sample.multiactivity.ListDeclaration;
import org.eclipse.sirius.sample.multiactivity.ListView;
import org.eclipse.sirius.sample.multiactivity.MultiactivityPackage;
import org.eclipse.sirius.sample.multiactivity.NamedElement;
import org.eclipse.sirius.sample.multiactivity.NewActivityButton;
import org.eclipse.sirius.sample.multiactivity.Packageable;
import org.eclipse.sirius.sample.multiactivity.PopupMessageButton;
import org.eclipse.sirius.sample.multiactivity.PopupTimeButton;
import org.eclipse.sirius.sample.multiactivity.PrimitiveType;
import org.eclipse.sirius.sample.multiactivity.TextView;
import org.eclipse.sirius.sample.multiactivity.Type;
import org.eclipse.sirius.sample.multiactivity.View;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage
 * @generated
 */
public class MultiactivitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MultiactivityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiactivitySwitch() {
		if (modelPackage == null) {
			modelPackage = MultiactivityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MultiactivityPackage.ACTIVITY: {
			Activity activity = (Activity) theEObject;
			T result = caseActivity(activity);
			if (result == null)
				result = casePackageable(activity);
			if (result == null)
				result = caseNamedElement(activity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MultiactivityPackage.LAYOUT: {
			Layout layout = (Layout) theEObject;
			T result = caseLayout(layout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MultiactivityPackage.VIEW: {
			View view = (View) theEObject;
			T result = caseView(view);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MultiactivityPackage.NEW_ACTIVITY_BUTTON: {
			NewActivityButton newActivityButton = (NewActivityButton) theEObject;
			T result = caseNewActivityButton(newActivityButton);
			if (result == null)
				result = caseView(newActivityButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MultiactivityPackage.POPUP_MESSAGE_BUTTON: {
			PopupMessageButton popupMessageButton = (PopupMessageButton) theEObject;
			T result = casePopupMessageButton(popupMessageButton);
			if (result == null)
				result = caseView(popupMessageButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MultiactivityPackage.TEXT_VIEW: {
			TextView textView = (TextView) theEObject;
			T result = caseTextView(textView);
			if (result == null)
				result = caseView(textView);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MultiactivityPackage.POPUP_TIME_BUTTON: {
			PopupTimeButton popupTimeButton = (PopupTimeButton) theEObject;
			T result = casePopupTimeButton(popupTimeButton);
			if (result == null)
				result = caseView(popupTimeButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MultiactivityPackage.APPLICATION: {
			Application application = (Application) theEObject;
			T result = caseApplication(application);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MultiactivityPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MultiactivityPackage.PACKAGEABLE: {
			Packageable packageable = (Packageable) theEObject;
			T result = casePackageable(packageable);
			if (result == null)
				result = caseNamedElement(packageable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MultiactivityPackage.PACKAGE: {
			org.eclipse.sirius.sample.multiactivity.Package package_ = (org.eclipse.sirius.sample.multiactivity.Package) theEObject;
			T result = casePackage(package_);
			if (result == null)
				result = casePackageable(package_);
			if (result == null)
				result = caseNamedElement(package_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MultiactivityPackage.PRIMITIVE_TYPE: {
			PrimitiveType primitiveType = (PrimitiveType) theEObject;
			T result = casePrimitiveType(primitiveType);
			if (result == null)
				result = casePackageable(primitiveType);
			if (result == null)
				result = caseType(primitiveType);
			if (result == null)
				result = caseNamedElement(primitiveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MultiactivityPackage.ENTITY: {
			Entity entity = (Entity) theEObject;
			T result = caseEntity(entity);
			if (result == null)
				result = casePackageable(entity);
			if (result == null)
				result = caseType(entity);
			if (result == null)
				result = caseNamedElement(entity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MultiactivityPackage.ATTRIBUTE: {
			Attribute attribute = (Attribute) theEObject;
			T result = caseAttribute(attribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MultiactivityPackage.TYPE: {
			Type type = (Type) theEObject;
			T result = caseType(type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MultiactivityPackage.LIST_DECLARATION: {
			ListDeclaration listDeclaration = (ListDeclaration) theEObject;
			T result = caseListDeclaration(listDeclaration);
			if (result == null)
				result = casePackageable(listDeclaration);
			if (result == null)
				result = caseNamedElement(listDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MultiactivityPackage.LIST_VIEW: {
			ListView listView = (ListView) theEObject;
			T result = caseListView(listView);
			if (result == null)
				result = caseView(listView);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayout(Layout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Activity Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Activity Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewActivityButton(NewActivityButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Popup Message Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Popup Message Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopupMessageButton(PopupMessageButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextView(TextView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Popup Time Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Popup Time Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopupTimeButton(PopupTimeButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packageable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packageable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageable(Packageable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(org.eclipse.sirius.sample.multiactivity.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListDeclaration(ListDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListView(ListView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MultiactivitySwitch
