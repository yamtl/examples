/**
 */
package projectManagement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectManagement.Issue#getIssueID <em>Issue ID</em>}</li>
 *   <li>{@link projectManagement.Issue#getSummary <em>Summary</em>}</li>
 *   <li>{@link projectManagement.Issue#getType <em>Type</em>}</li>
 *   <li>{@link projectManagement.Issue#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see projectManagement.ProjectManagementPackage#getIssue()
 * @model
 * @generated
 */
public interface Issue extends EObject {
	/**
	 * Returns the value of the '<em><b>Issue ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue ID</em>' attribute.
	 * @see #setIssueID(String)
	 * @see projectManagement.ProjectManagementPackage#getIssue_IssueID()
	 * @model
	 * @generated
	 */
	String getIssueID();

	/**
	 * Sets the value of the '{@link projectManagement.Issue#getIssueID <em>Issue ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue ID</em>' attribute.
	 * @see #getIssueID()
	 * @generated
	 */
	void setIssueID(String value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see projectManagement.ProjectManagementPackage#getIssue_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link projectManagement.Issue#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link projectManagement.IssueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see projectManagement.IssueType
	 * @see #setType(IssueType)
	 * @see projectManagement.ProjectManagementPackage#getIssue_Type()
	 * @model
	 * @generated
	 */
	IssueType getType();

	/**
	 * Sets the value of the '{@link projectManagement.Issue#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see projectManagement.IssueType
	 * @see #getType()
	 * @generated
	 */
	void setType(IssueType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link projectManagement.IssueStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see projectManagement.IssueStatus
	 * @see #setStatus(IssueStatus)
	 * @see projectManagement.ProjectManagementPackage#getIssue_Status()
	 * @model
	 * @generated
	 */
	IssueStatus getStatus();

	/**
	 * Sets the value of the '{@link projectManagement.Issue#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see projectManagement.IssueStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(IssueStatus value);

} // Issue
