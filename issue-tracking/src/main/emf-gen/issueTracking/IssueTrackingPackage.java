/**
 */
package issueTracking;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see issueTracking.IssueTrackingFactory
 * @model kind="package"
 * @generated
 */
public interface IssueTrackingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "issueTracking";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "yamtl.issue";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "i";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IssueTrackingPackage eINSTANCE = issueTracking.impl.IssueTrackingPackageImpl.init();

	/**
	 * The meta object id for the '{@link issueTracking.impl.IssueTrackerImpl <em>Issue Tracker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see issueTracking.impl.IssueTrackerImpl
	 * @see issueTracking.impl.IssueTrackingPackageImpl#getIssueTracker()
	 * @generated
	 */
	int ISSUE_TRACKER = 0;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TRACKER__USERS = 0;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TRACKER__ISSUES = 1;

	/**
	 * The number of structural features of the '<em>Issue Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TRACKER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Issue Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TRACKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link issueTracking.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see issueTracking.impl.UserImpl
	 * @see issueTracking.impl.IssueTrackingPackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Reported Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__REPORTED_ISSUES = 3;

	/**
	 * The feature id for the '<em><b>Assigned Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ASSIGNED_ISSUES = 4;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link issueTracking.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see issueTracking.impl.IssueImpl
	 * @see issueTracking.impl.IssueTrackingPackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__PRIORITY = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__STATUS = 4;

	/**
	 * The feature id for the '<em><b>Reported By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__REPORTED_BY = 5;

	/**
	 * The feature id for the '<em><b>Assigned To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ASSIGNED_TO = 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__COMMENTS = 7;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link issueTracking.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see issueTracking.impl.CommentImpl
	 * @see issueTracking.impl.IssueTrackingPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Comment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ISSUE = 3;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link issueTracking.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see issueTracking.Status
	 * @see issueTracking.impl.IssueTrackingPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 4;


	/**
	 * Returns the meta object for class '{@link issueTracking.IssueTracker <em>Issue Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Tracker</em>'.
	 * @see issueTracking.IssueTracker
	 * @generated
	 */
	EClass getIssueTracker();

	/**
	 * Returns the meta object for the containment reference list '{@link issueTracking.IssueTracker#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see issueTracking.IssueTracker#getUsers()
	 * @see #getIssueTracker()
	 * @generated
	 */
	EReference getIssueTracker_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link issueTracking.IssueTracker#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issues</em>'.
	 * @see issueTracking.IssueTracker#getIssues()
	 * @see #getIssueTracker()
	 * @generated
	 */
	EReference getIssueTracker_Issues();

	/**
	 * Returns the meta object for class '{@link issueTracking.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see issueTracking.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link issueTracking.User#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see issueTracking.User#getUserID()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserID();

	/**
	 * Returns the meta object for the attribute '{@link issueTracking.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see issueTracking.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link issueTracking.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see issueTracking.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the reference list '{@link issueTracking.User#getReportedIssues <em>Reported Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reported Issues</em>'.
	 * @see issueTracking.User#getReportedIssues()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_ReportedIssues();

	/**
	 * Returns the meta object for the reference list '{@link issueTracking.User#getAssignedIssues <em>Assigned Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned Issues</em>'.
	 * @see issueTracking.User#getAssignedIssues()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_AssignedIssues();

	/**
	 * Returns the meta object for class '{@link issueTracking.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see issueTracking.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for the attribute '{@link issueTracking.Issue#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see issueTracking.Issue#getID()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_ID();

	/**
	 * Returns the meta object for the attribute '{@link issueTracking.Issue#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see issueTracking.Issue#getTitle()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Title();

	/**
	 * Returns the meta object for the attribute '{@link issueTracking.Issue#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see issueTracking.Issue#getDescription()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Description();

	/**
	 * Returns the meta object for the attribute '{@link issueTracking.Issue#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see issueTracking.Issue#getPriority()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Priority();

	/**
	 * Returns the meta object for the attribute '{@link issueTracking.Issue#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see issueTracking.Issue#getStatus()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Status();

	/**
	 * Returns the meta object for the reference '{@link issueTracking.Issue#getReportedBy <em>Reported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reported By</em>'.
	 * @see issueTracking.Issue#getReportedBy()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_ReportedBy();

	/**
	 * Returns the meta object for the reference list '{@link issueTracking.Issue#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned To</em>'.
	 * @see issueTracking.Issue#getAssignedTo()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_AssignedTo();

	/**
	 * Returns the meta object for the containment reference list '{@link issueTracking.Issue#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see issueTracking.Issue#getComments()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Comments();

	/**
	 * Returns the meta object for class '{@link issueTracking.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see issueTracking.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link issueTracking.Comment#getCommentID <em>Comment ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment ID</em>'.
	 * @see issueTracking.Comment#getCommentID()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_CommentID();

	/**
	 * Returns the meta object for the attribute '{@link issueTracking.Comment#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see issueTracking.Comment#getText()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Text();

	/**
	 * Returns the meta object for the attribute '{@link issueTracking.Comment#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see issueTracking.Comment#getTimestamp()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Timestamp();

	/**
	 * Returns the meta object for the container reference '{@link issueTracking.Comment#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Issue</em>'.
	 * @see issueTracking.Comment#getIssue()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Issue();

	/**
	 * Returns the meta object for enum '{@link issueTracking.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see issueTracking.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IssueTrackingFactory getIssueTrackingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link issueTracking.impl.IssueTrackerImpl <em>Issue Tracker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see issueTracking.impl.IssueTrackerImpl
		 * @see issueTracking.impl.IssueTrackingPackageImpl#getIssueTracker()
		 * @generated
		 */
		EClass ISSUE_TRACKER = eINSTANCE.getIssueTracker();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_TRACKER__USERS = eINSTANCE.getIssueTracker_Users();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_TRACKER__ISSUES = eINSTANCE.getIssueTracker_Issues();

		/**
		 * The meta object literal for the '{@link issueTracking.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see issueTracking.impl.UserImpl
		 * @see issueTracking.impl.IssueTrackingPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_ID = eINSTANCE.getUser_UserID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Reported Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__REPORTED_ISSUES = eINSTANCE.getUser_ReportedIssues();

		/**
		 * The meta object literal for the '<em><b>Assigned Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ASSIGNED_ISSUES = eINSTANCE.getUser_AssignedIssues();

		/**
		 * The meta object literal for the '{@link issueTracking.impl.IssueImpl <em>Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see issueTracking.impl.IssueImpl
		 * @see issueTracking.impl.IssueTrackingPackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__ID = eINSTANCE.getIssue_ID();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__TITLE = eINSTANCE.getIssue_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__DESCRIPTION = eINSTANCE.getIssue_Description();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__PRIORITY = eINSTANCE.getIssue_Priority();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__STATUS = eINSTANCE.getIssue_Status();

		/**
		 * The meta object literal for the '<em><b>Reported By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__REPORTED_BY = eINSTANCE.getIssue_ReportedBy();

		/**
		 * The meta object literal for the '<em><b>Assigned To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__ASSIGNED_TO = eINSTANCE.getIssue_AssignedTo();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__COMMENTS = eINSTANCE.getIssue_Comments();

		/**
		 * The meta object literal for the '{@link issueTracking.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see issueTracking.impl.CommentImpl
		 * @see issueTracking.impl.IssueTrackingPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Comment ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__COMMENT_ID = eINSTANCE.getComment_CommentID();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__TEXT = eINSTANCE.getComment_Text();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__TIMESTAMP = eINSTANCE.getComment_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Issue</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__ISSUE = eINSTANCE.getComment_Issue();

		/**
		 * The meta object literal for the '{@link issueTracking.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see issueTracking.Status
		 * @see issueTracking.impl.IssueTrackingPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

	}

} //IssueTrackingPackage
