/**
 */
package issueTracking;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link issueTracking.User#getUserID <em>User ID</em>}</li>
 *   <li>{@link issueTracking.User#getName <em>Name</em>}</li>
 *   <li>{@link issueTracking.User#getEmail <em>Email</em>}</li>
 *   <li>{@link issueTracking.User#getReportedIssues <em>Reported Issues</em>}</li>
 *   <li>{@link issueTracking.User#getAssignedIssues <em>Assigned Issues</em>}</li>
 * </ul>
 *
 * @see issueTracking.IssueTrackingPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(String)
	 * @see issueTracking.IssueTrackingPackage#getUser_UserID()
	 * @model
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link issueTracking.User#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see issueTracking.IssueTrackingPackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link issueTracking.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see issueTracking.IssueTrackingPackage#getUser_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link issueTracking.User#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Reported Issues</b></em>' reference list.
	 * The list contents are of type {@link issueTracking.Issue}.
	 * It is bidirectional and its opposite is '{@link issueTracking.Issue#getReportedBy <em>Reported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reported Issues</em>' reference list.
	 * @see issueTracking.IssueTrackingPackage#getUser_ReportedIssues()
	 * @see issueTracking.Issue#getReportedBy
	 * @model opposite="reportedBy"
	 * @generated
	 */
	EList<Issue> getReportedIssues();

	/**
	 * Returns the value of the '<em><b>Assigned Issues</b></em>' reference list.
	 * The list contents are of type {@link issueTracking.Issue}.
	 * It is bidirectional and its opposite is '{@link issueTracking.Issue#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Issues</em>' reference list.
	 * @see issueTracking.IssueTrackingPackage#getUser_AssignedIssues()
	 * @see issueTracking.Issue#getAssignedTo
	 * @model opposite="assignedTo"
	 * @generated
	 */
	EList<Issue> getAssignedIssues();

} // User
