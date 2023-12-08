/**
 */
package issueTracking.impl;

import issueTracking.Issue;
import issueTracking.IssueTracker;
import issueTracking.IssueTrackingPackage;
import issueTracking.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue Tracker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link issueTracking.impl.IssueTrackerImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link issueTracking.impl.IssueTrackerImpl#getIssues <em>Issues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueTrackerImpl extends MinimalEObjectImpl.Container implements IssueTracker {
	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * The cached value of the '{@link #getIssues() <em>Issues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> issues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueTrackerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IssueTrackingPackage.Literals.ISSUE_TRACKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, IssueTrackingPackage.ISSUE_TRACKER__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Issue> getIssues() {
		if (issues == null) {
			issues = new EObjectContainmentEList<Issue>(Issue.class, this, IssueTrackingPackage.ISSUE_TRACKER__ISSUES);
		}
		return issues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IssueTrackingPackage.ISSUE_TRACKER__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
			case IssueTrackingPackage.ISSUE_TRACKER__ISSUES:
				return ((InternalEList<?>)getIssues()).basicRemove(otherEnd, msgs);
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
			case IssueTrackingPackage.ISSUE_TRACKER__USERS:
				return getUsers();
			case IssueTrackingPackage.ISSUE_TRACKER__ISSUES:
				return getIssues();
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
			case IssueTrackingPackage.ISSUE_TRACKER__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case IssueTrackingPackage.ISSUE_TRACKER__ISSUES:
				getIssues().clear();
				getIssues().addAll((Collection<? extends Issue>)newValue);
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
			case IssueTrackingPackage.ISSUE_TRACKER__USERS:
				getUsers().clear();
				return;
			case IssueTrackingPackage.ISSUE_TRACKER__ISSUES:
				getIssues().clear();
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
			case IssueTrackingPackage.ISSUE_TRACKER__USERS:
				return users != null && !users.isEmpty();
			case IssueTrackingPackage.ISSUE_TRACKER__ISSUES:
				return issues != null && !issues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IssueTrackerImpl
