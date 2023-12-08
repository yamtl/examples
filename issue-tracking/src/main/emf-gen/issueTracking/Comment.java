/**
 */
package issueTracking;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link issueTracking.Comment#getCommentID <em>Comment ID</em>}</li>
 *   <li>{@link issueTracking.Comment#getText <em>Text</em>}</li>
 *   <li>{@link issueTracking.Comment#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link issueTracking.Comment#getIssue <em>Issue</em>}</li>
 * </ul>
 *
 * @see issueTracking.IssueTrackingPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment ID</em>' attribute.
	 * @see #setCommentID(String)
	 * @see issueTracking.IssueTrackingPackage#getComment_CommentID()
	 * @model
	 * @generated
	 */
	String getCommentID();

	/**
	 * Sets the value of the '{@link issueTracking.Comment#getCommentID <em>Comment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment ID</em>' attribute.
	 * @see #getCommentID()
	 * @generated
	 */
	void setCommentID(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see issueTracking.IssueTrackingPackage#getComment_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link issueTracking.Comment#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see issueTracking.IssueTrackingPackage#getComment_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link issueTracking.Comment#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Issue</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link issueTracking.Issue#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue</em>' container reference.
	 * @see #setIssue(Issue)
	 * @see issueTracking.IssueTrackingPackage#getComment_Issue()
	 * @see issueTracking.Issue#getComments
	 * @model opposite="comments" required="true" transient="false"
	 * @generated
	 */
	Issue getIssue();

	/**
	 * Sets the value of the '{@link issueTracking.Comment#getIssue <em>Issue</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue</em>' container reference.
	 * @see #getIssue()
	 * @generated
	 */
	void setIssue(Issue value);

} // Comment
