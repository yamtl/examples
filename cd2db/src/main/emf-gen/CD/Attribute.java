/**
 */
package CD;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CD.Attribute#getMultiValued <em>Multi Valued</em>}</li>
 *   <li>{@link CD.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link CD.Attribute#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see CD.CDPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends NamedElt {
	/**
	 * Returns the value of the '<em><b>Multi Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Valued</em>' attribute.
	 * @see #setMultiValued(Boolean)
	 * @see CD.CDPackage#getAttribute_MultiValued()
	 * @model dataType="CD.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getMultiValued();

	/**
	 * Sets the value of the '{@link CD.Attribute#getMultiValued <em>Multi Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Valued</em>' attribute.
	 * @see #getMultiValued()
	 * @generated
	 */
	void setMultiValued(Boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Classifier)
	 * @see CD.CDPackage#getAttribute_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getType();

	/**
	 * Sets the value of the '{@link CD.Attribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Classifier value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CD.Class#getAttr <em>Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(CD.Class)
	 * @see CD.CDPackage#getAttribute_Owner()
	 * @see CD.Class#getAttr
	 * @model opposite="attr" required="true" transient="false" ordered="false"
	 * @generated
	 */
	CD.Class getOwner();

	/**
	 * Sets the value of the '{@link CD.Attribute#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(CD.Class value);

} // Attribute
