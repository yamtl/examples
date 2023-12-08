/**
 */
package issueTracking;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue Tracker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link issueTracking.IssueTracker#getUsers <em>Users</em>}</li>
 *   <li>{@link issueTracking.IssueTracker#getIssues <em>Issues</em>}</li>
 * </ul>
 *
 * @see issueTracking.IssueTrackingPackage#getIssueTracker()
 * @model
 * @generated
 */
public interface IssueTracker extends EObject {
	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link issueTracking.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see issueTracking.IssueTrackingPackage#getIssueTracker_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' containment reference list.
	 * The list contents are of type {@link issueTracking.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' containment reference list.
	 * @see issueTracking.IssueTrackingPackage#getIssueTracker_Issues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Issue> getIssues();

} // IssueTracker
