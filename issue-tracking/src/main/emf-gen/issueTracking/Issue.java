/**
 */
package issueTracking;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link issueTracking.Issue#getID <em>ID</em>}</li>
 *   <li>{@link issueTracking.Issue#getTitle <em>Title</em>}</li>
 *   <li>{@link issueTracking.Issue#getDescription <em>Description</em>}</li>
 *   <li>{@link issueTracking.Issue#getPriority <em>Priority</em>}</li>
 *   <li>{@link issueTracking.Issue#getStatus <em>Status</em>}</li>
 *   <li>{@link issueTracking.Issue#getReportedBy <em>Reported By</em>}</li>
 *   <li>{@link issueTracking.Issue#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link issueTracking.Issue#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @see issueTracking.IssueTrackingPackage#getIssue()
 * @model
 * @generated
 */
public interface Issue extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see issueTracking.IssueTrackingPackage#getIssue_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link issueTracking.Issue#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see issueTracking.IssueTrackingPackage#getIssue_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link issueTracking.Issue#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see issueTracking.IssueTrackingPackage#getIssue_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link issueTracking.Issue#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(String)
	 * @see issueTracking.IssueTrackingPackage#getIssue_Priority()
	 * @model
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link issueTracking.Issue#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link issueTracking.Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see issueTracking.Status
	 * @see #setStatus(Status)
	 * @see issueTracking.IssueTrackingPackage#getIssue_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link issueTracking.Issue#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see issueTracking.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Reported By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link issueTracking.User#getReportedIssues <em>Reported Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reported By</em>' reference.
	 * @see #setReportedBy(User)
	 * @see issueTracking.IssueTrackingPackage#getIssue_ReportedBy()
	 * @see issueTracking.User#getReportedIssues
	 * @model opposite="reportedIssues" required="true"
	 * @generated
	 */
	User getReportedBy();

	/**
	 * Sets the value of the '{@link issueTracking.Issue#getReportedBy <em>Reported By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reported By</em>' reference.
	 * @see #getReportedBy()
	 * @generated
	 */
	void setReportedBy(User value);

	/**
	 * Returns the value of the '<em><b>Assigned To</b></em>' reference list.
	 * The list contents are of type {@link issueTracking.User}.
	 * It is bidirectional and its opposite is '{@link issueTracking.User#getAssignedIssues <em>Assigned Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned To</em>' reference list.
	 * @see issueTracking.IssueTrackingPackage#getIssue_AssignedTo()
	 * @see issueTracking.User#getAssignedIssues
	 * @model opposite="assignedIssues"
	 * @generated
	 */
	EList<User> getAssignedTo();

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link issueTracking.Comment}.
	 * It is bidirectional and its opposite is '{@link issueTracking.Comment#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see issueTracking.IssueTrackingPackage#getIssue_Comments()
	 * @see issueTracking.Comment#getIssue
	 * @model opposite="issue" containment="true"
	 * @generated
	 */
	EList<Comment> getComments();

} // Issue
