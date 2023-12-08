/**
 */
package issueTracking.impl;

import issueTracking.Comment;
import issueTracking.Issue;
import issueTracking.IssueTrackingPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link issueTracking.impl.CommentImpl#getCommentID <em>Comment ID</em>}</li>
 *   <li>{@link issueTracking.impl.CommentImpl#getText <em>Text</em>}</li>
 *   <li>{@link issueTracking.impl.CommentImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link issueTracking.impl.CommentImpl#getIssue <em>Issue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentImpl extends MinimalEObjectImpl.Container implements Comment {
	/**
	 * The default value of the '{@link #getCommentID() <em>Comment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentID()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentID() <em>Comment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentID()
	 * @generated
	 * @ordered
	 */
	protected String commentID = COMMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IssueTrackingPackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommentID() {
		return commentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommentID(String newCommentID) {
		String oldCommentID = commentID;
		commentID = newCommentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssueTrackingPackage.COMMENT__COMMENT_ID, oldCommentID, commentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssueTrackingPackage.COMMENT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(Date newTimestamp) {
		Date oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssueTrackingPackage.COMMENT__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Issue getIssue() {
		if (eContainerFeatureID() != IssueTrackingPackage.COMMENT__ISSUE) return null;
		return (Issue)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssue(Issue newIssue, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIssue, IssueTrackingPackage.COMMENT__ISSUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssue(Issue newIssue) {
		if (newIssue != eInternalContainer() || (eContainerFeatureID() != IssueTrackingPackage.COMMENT__ISSUE && newIssue != null)) {
			if (EcoreUtil.isAncestor(this, newIssue))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIssue != null)
				msgs = ((InternalEObject)newIssue).eInverseAdd(this, IssueTrackingPackage.ISSUE__COMMENTS, Issue.class, msgs);
			msgs = basicSetIssue(newIssue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssueTrackingPackage.COMMENT__ISSUE, newIssue, newIssue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IssueTrackingPackage.COMMENT__ISSUE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIssue((Issue)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IssueTrackingPackage.COMMENT__ISSUE:
				return basicSetIssue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case IssueTrackingPackage.COMMENT__ISSUE:
				return eInternalContainer().eInverseRemove(this, IssueTrackingPackage.ISSUE__COMMENTS, Issue.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IssueTrackingPackage.COMMENT__COMMENT_ID:
				return getCommentID();
			case IssueTrackingPackage.COMMENT__TEXT:
				return getText();
			case IssueTrackingPackage.COMMENT__TIMESTAMP:
				return getTimestamp();
			case IssueTrackingPackage.COMMENT__ISSUE:
				return getIssue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IssueTrackingPackage.COMMENT__COMMENT_ID:
				setCommentID((String)newValue);
				return;
			case IssueTrackingPackage.COMMENT__TEXT:
				setText((String)newValue);
				return;
			case IssueTrackingPackage.COMMENT__TIMESTAMP:
				setTimestamp((Date)newValue);
				return;
			case IssueTrackingPackage.COMMENT__ISSUE:
				setIssue((Issue)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IssueTrackingPackage.COMMENT__COMMENT_ID:
				setCommentID(COMMENT_ID_EDEFAULT);
				return;
			case IssueTrackingPackage.COMMENT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case IssueTrackingPackage.COMMENT__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case IssueTrackingPackage.COMMENT__ISSUE:
				setIssue((Issue)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IssueTrackingPackage.COMMENT__COMMENT_ID:
				return COMMENT_ID_EDEFAULT == null ? commentID != null : !COMMENT_ID_EDEFAULT.equals(commentID);
			case IssueTrackingPackage.COMMENT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case IssueTrackingPackage.COMMENT__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case IssueTrackingPackage.COMMENT__ISSUE:
				return getIssue() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (CommentID: ");
		result.append(commentID);
		result.append(", Text: ");
		result.append(text);
		result.append(", Timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //CommentImpl
