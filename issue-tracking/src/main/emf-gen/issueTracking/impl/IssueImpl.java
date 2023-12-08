/**
 */
package issueTracking.impl;

import issueTracking.Comment;
import issueTracking.Issue;
import issueTracking.IssueTrackingPackage;
import issueTracking.Status;
import issueTracking.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link issueTracking.impl.IssueImpl#getID <em>ID</em>}</li>
 *   <li>{@link issueTracking.impl.IssueImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link issueTracking.impl.IssueImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link issueTracking.impl.IssueImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link issueTracking.impl.IssueImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link issueTracking.impl.IssueImpl#getReportedBy <em>Reported By</em>}</li>
 *   <li>{@link issueTracking.impl.IssueImpl#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link issueTracking.impl.IssueImpl#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueImpl extends MinimalEObjectImpl.Container implements Issue {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status STATUS_EDEFAULT = Status.OPEN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReportedBy() <em>Reported By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportedBy()
	 * @generated
	 * @ordered
	 */
	protected User reportedBy;

	/**
	 * The cached value of the '{@link #getAssignedTo() <em>Assigned To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<User> assignedTo;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IssueTrackingPackage.Literals.ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssueTrackingPackage.ISSUE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssueTrackingPackage.ISSUE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssueTrackingPackage.ISSUE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssueTrackingPackage.ISSUE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssueTrackingPackage.ISSUE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getReportedBy() {
		if (reportedBy != null && reportedBy.eIsProxy()) {
			InternalEObject oldReportedBy = (InternalEObject)reportedBy;
			reportedBy = (User)eResolveProxy(oldReportedBy);
			if (reportedBy != oldReportedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IssueTrackingPackage.ISSUE__REPORTED_BY, oldReportedBy, reportedBy));
			}
		}
		return reportedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetReportedBy() {
		return reportedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportedBy(User newReportedBy, NotificationChain msgs) {
		User oldReportedBy = reportedBy;
		reportedBy = newReportedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IssueTrackingPackage.ISSUE__REPORTED_BY, oldReportedBy, newReportedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReportedBy(User newReportedBy) {
		if (newReportedBy != reportedBy) {
			NotificationChain msgs = null;
			if (reportedBy != null)
				msgs = ((InternalEObject)reportedBy).eInverseRemove(this, IssueTrackingPackage.USER__REPORTED_ISSUES, User.class, msgs);
			if (newReportedBy != null)
				msgs = ((InternalEObject)newReportedBy).eInverseAdd(this, IssueTrackingPackage.USER__REPORTED_ISSUES, User.class, msgs);
			msgs = basicSetReportedBy(newReportedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssueTrackingPackage.ISSUE__REPORTED_BY, newReportedBy, newReportedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getAssignedTo() {
		if (assignedTo == null) {
			assignedTo = new EObjectWithInverseResolvingEList.ManyInverse<User>(User.class, this, IssueTrackingPackage.ISSUE__ASSIGNED_TO, IssueTrackingPackage.USER__ASSIGNED_ISSUES);
		}
		return assignedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectContainmentWithInverseEList<Comment>(Comment.class, this, IssueTrackingPackage.ISSUE__COMMENTS, IssueTrackingPackage.COMMENT__ISSUE);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IssueTrackingPackage.ISSUE__REPORTED_BY:
				if (reportedBy != null)
					msgs = ((InternalEObject)reportedBy).eInverseRemove(this, IssueTrackingPackage.USER__REPORTED_ISSUES, User.class, msgs);
				return basicSetReportedBy((User)otherEnd, msgs);
			case IssueTrackingPackage.ISSUE__ASSIGNED_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignedTo()).basicAdd(otherEnd, msgs);
			case IssueTrackingPackage.ISSUE__COMMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComments()).basicAdd(otherEnd, msgs);
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
			case IssueTrackingPackage.ISSUE__REPORTED_BY:
				return basicSetReportedBy(null, msgs);
			case IssueTrackingPackage.ISSUE__ASSIGNED_TO:
				return ((InternalEList<?>)getAssignedTo()).basicRemove(otherEnd, msgs);
			case IssueTrackingPackage.ISSUE__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IssueTrackingPackage.ISSUE__ID:
				return getID();
			case IssueTrackingPackage.ISSUE__TITLE:
				return getTitle();
			case IssueTrackingPackage.ISSUE__DESCRIPTION:
				return getDescription();
			case IssueTrackingPackage.ISSUE__PRIORITY:
				return getPriority();
			case IssueTrackingPackage.ISSUE__STATUS:
				return getStatus();
			case IssueTrackingPackage.ISSUE__REPORTED_BY:
				if (resolve) return getReportedBy();
				return basicGetReportedBy();
			case IssueTrackingPackage.ISSUE__ASSIGNED_TO:
				return getAssignedTo();
			case IssueTrackingPackage.ISSUE__COMMENTS:
				return getComments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IssueTrackingPackage.ISSUE__ID:
				setID((String)newValue);
				return;
			case IssueTrackingPackage.ISSUE__TITLE:
				setTitle((String)newValue);
				return;
			case IssueTrackingPackage.ISSUE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IssueTrackingPackage.ISSUE__PRIORITY:
				setPriority((String)newValue);
				return;
			case IssueTrackingPackage.ISSUE__STATUS:
				setStatus((Status)newValue);
				return;
			case IssueTrackingPackage.ISSUE__REPORTED_BY:
				setReportedBy((User)newValue);
				return;
			case IssueTrackingPackage.ISSUE__ASSIGNED_TO:
				getAssignedTo().clear();
				getAssignedTo().addAll((Collection<? extends User>)newValue);
				return;
			case IssueTrackingPackage.ISSUE__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
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
			case IssueTrackingPackage.ISSUE__ID:
				setID(ID_EDEFAULT);
				return;
			case IssueTrackingPackage.ISSUE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case IssueTrackingPackage.ISSUE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IssueTrackingPackage.ISSUE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case IssueTrackingPackage.ISSUE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case IssueTrackingPackage.ISSUE__REPORTED_BY:
				setReportedBy((User)null);
				return;
			case IssueTrackingPackage.ISSUE__ASSIGNED_TO:
				getAssignedTo().clear();
				return;
			case IssueTrackingPackage.ISSUE__COMMENTS:
				getComments().clear();
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
			case IssueTrackingPackage.ISSUE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IssueTrackingPackage.ISSUE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case IssueTrackingPackage.ISSUE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IssueTrackingPackage.ISSUE__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case IssueTrackingPackage.ISSUE__STATUS:
				return status != STATUS_EDEFAULT;
			case IssueTrackingPackage.ISSUE__REPORTED_BY:
				return reportedBy != null;
			case IssueTrackingPackage.ISSUE__ASSIGNED_TO:
				return assignedTo != null && !assignedTo.isEmpty();
			case IssueTrackingPackage.ISSUE__COMMENTS:
				return comments != null && !comments.isEmpty();
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", priority: ");
		result.append(priority);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //IssueImpl
