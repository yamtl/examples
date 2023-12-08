/**
 */
package projectManagement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectManagement.Feature#getFeatureID <em>Feature ID</em>}</li>
 *   <li>{@link projectManagement.Feature#getName <em>Name</em>}</li>
 *   <li>{@link projectManagement.Feature#getDescription <em>Description</em>}</li>
 *   <li>{@link projectManagement.Feature#getRelatedIssues <em>Related Issues</em>}</li>
 * </ul>
 *
 * @see projectManagement.ProjectManagementPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature ID</em>' attribute.
	 * @see #setFeatureID(String)
	 * @see projectManagement.ProjectManagementPackage#getFeature_FeatureID()
	 * @model
	 * @generated
	 */
	String getFeatureID();

	/**
	 * Sets the value of the '{@link projectManagement.Feature#getFeatureID <em>Feature ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature ID</em>' attribute.
	 * @see #getFeatureID()
	 * @generated
	 */
	void setFeatureID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projectManagement.ProjectManagementPackage#getFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projectManagement.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see projectManagement.ProjectManagementPackage#getFeature_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link projectManagement.Feature#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Related Issues</b></em>' containment reference list.
	 * The list contents are of type {@link projectManagement.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Issues</em>' containment reference list.
	 * @see projectManagement.ProjectManagementPackage#getFeature_RelatedIssues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Issue> getRelatedIssues();

} // Feature
