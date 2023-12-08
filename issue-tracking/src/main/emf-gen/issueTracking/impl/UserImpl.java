/**
 */
package issueTracking.impl;

import issueTracking.Issue;
import issueTracking.IssueTrackingPackage;
import issueTracking.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link issueTracking.impl.UserImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link issueTracking.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link issueTracking.impl.UserImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link issueTracking.impl.UserImpl#getReportedIssues <em>Reported Issues</em>}</li>
 *   <li>{@link issueTracking.impl.UserImpl#getAssignedIssues <em>Assigned Issues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected String userID = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReportedIssues() <em>Reported Issues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportedIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> reportedIssues;

	/**
	 * The cached value of the '{@link #getAssignedIssues() <em>Assigned Issues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> assignedIssues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IssueTrackingPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserID() {
		return userID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserID(String newUserID) {
		String oldUserID = userID;
		userID = newUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssueTrackingPackage.USER__USER_ID, oldUserID, userID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssueTrackingPackage.USER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IssueTrackingPackage.USER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Issue> getReportedIssues() {
		if (reportedIssues == null) {
			reportedIssues = new EObjectWithInverseResolvingEList<Issue>(Issue.class, this, IssueTrackingPackage.USER__REPORTED_ISSUES, IssueTrackingPackage.ISSUE__REPORTED_BY);
		}
		return reportedIssues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Issue> getAssignedIssues() {
		if (assignedIssues == null) {
			assignedIssues = new EObjectWithInverseResolvingEList.ManyInverse<Issue>(Issue.class, this, IssueTrackingPackage.USER__ASSIGNED_ISSUES, IssueTrackingPackage.ISSUE__ASSIGNED_TO);
		}
		return assignedIssues;
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
			case IssueTrackingPackage.USER__REPORTED_ISSUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReportedIssues()).basicAdd(otherEnd, msgs);
			case IssueTrackingPackage.USER__ASSIGNED_ISSUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignedIssues()).basicAdd(otherEnd, msgs);
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
			case IssueTrackingPackage.USER__REPORTED_ISSUES:
				return ((InternalEList<?>)getReportedIssues()).basicRemove(otherEnd, msgs);
			case IssueTrackingPackage.USER__ASSIGNED_ISSUES:
				return ((InternalEList<?>)getAssignedIssues()).basicRemove(otherEnd, msgs);
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
			case IssueTrackingPackage.USER__USER_ID:
				return getUserID();
			case IssueTrackingPackage.USER__NAME:
				return getName();
			case IssueTrackingPackage.USER__EMAIL:
				return getEmail();
			case IssueTrackingPackage.USER__REPORTED_ISSUES:
				return getReportedIssues();
			case IssueTrackingPackage.USER__ASSIGNED_ISSUES:
				return getAssignedIssues();
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
			case IssueTrackingPackage.USER__USER_ID:
				setUserID((String)newValue);
				return;
			case IssueTrackingPackage.USER__NAME:
				setName((String)newValue);
				return;
			case IssueTrackingPackage.USER__EMAIL:
				setEmail((String)newValue);
				return;
			case IssueTrackingPackage.USER__REPORTED_ISSUES:
				getReportedIssues().clear();
				getReportedIssues().addAll((Collection<? extends Issue>)newValue);
				return;
			case IssueTrackingPackage.USER__ASSIGNED_ISSUES:
				getAssignedIssues().clear();
				getAssignedIssues().addAll((Collection<? extends Issue>)newValue);
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
			case IssueTrackingPackage.USER__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case IssueTrackingPackage.USER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IssueTrackingPackage.USER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case IssueTrackingPackage.USER__REPORTED_ISSUES:
				getReportedIssues().clear();
				return;
			case IssueTrackingPackage.USER__ASSIGNED_ISSUES:
				getAssignedIssues().clear();
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
			case IssueTrackingPackage.USER__USER_ID:
				return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
			case IssueTrackingPackage.USER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IssueTrackingPackage.USER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case IssueTrackingPackage.USER__REPORTED_ISSUES:
				return reportedIssues != null && !reportedIssues.isEmpty();
			case IssueTrackingPackage.USER__ASSIGNED_ISSUES:
				return assignedIssues != null && !assignedIssues.isEmpty();
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
		result.append(" (userID: ");
		result.append(userID);
		result.append(", name: ");
		result.append(name);
		result.append(", email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} //UserImpl
