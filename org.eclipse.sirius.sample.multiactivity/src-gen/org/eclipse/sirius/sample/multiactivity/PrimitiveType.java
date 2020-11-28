/**
 */
package org.eclipse.sirius.sample.multiactivity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.multiactivity.PrimitiveType#getPropertyKind <em>Property Kind</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends Packageable, Type {

	/**
	 * Returns the value of the '<em><b>Property Kind</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.eclipse.sirius.sample.multiactivity.PropertyKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Kind</em>' attribute.
	 * @see org.eclipse.sirius.sample.multiactivity.PropertyKind
	 * @see #setPropertyKind(PropertyKind)
	 * @see org.eclipse.sirius.sample.multiactivity.MultiactivityPackage#getPrimitiveType_PropertyKind()
	 * @model default="" transient="true"
	 * @generated
	 */
	PropertyKind getPropertyKind();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.multiactivity.PrimitiveType#getPropertyKind <em>Property Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Kind</em>' attribute.
	 * @see org.eclipse.sirius.sample.multiactivity.PropertyKind
	 * @see #getPropertyKind()
	 * @generated
	 */
	void setPropertyKind(PropertyKind value);
} // PrimitiveType
