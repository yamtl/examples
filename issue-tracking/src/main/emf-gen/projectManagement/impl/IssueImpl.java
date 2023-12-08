/**
 */
package projectManagement.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projectManagement.Issue;
import projectManagement.IssueStatus;
import projectManagement.IssueType;
import projectManagement.ProjectManagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectManagement.impl.IssueImpl#getIssueID <em>Issue ID</em>}</li>
 *   <li>{@link projectManagement.impl.IssueImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link projectManagement.impl.IssueImpl#getType <em>Type</em>}</li>
 *   <li>{@link projectManagement.impl.IssueImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueImpl extends MinimalEObjectImpl.Container implements Issue {
	/**
	 * The default value of the '{@link #getIssueID() <em>Issue ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueID()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssueID() <em>Issue ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueID()
	 * @generated
	 * @ordered
	 */
	protected String issueID = ISSUE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final IssueType TYPE_EDEFAULT = IssueType.BUG;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected IssueType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final IssueStatus STATUS_EDEFAULT = IssueStatus.OPEN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected IssueStatus status = STATUS_EDEFAULT;

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
		return ProjectManagementPackage.Literals.ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssueID() {
		return issueID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueID(String newIssueID) {
		String oldIssueID = issueID;
		issueID = newIssueID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectManagementPackage.ISSUE__ISSUE_ID, oldIssueID, issueID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectManagementPackage.ISSUE__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(IssueType newType) {
		IssueType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectManagementPackage.ISSUE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(IssueStatus newStatus) {
		IssueStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectManagementPackage.ISSUE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjectManagementPackage.ISSUE__ISSUE_ID:
				return getIssueID();
			case ProjectManagementPackage.ISSUE__SUMMARY:
				return getSummary();
			case ProjectManagementPackage.ISSUE__TYPE:
				return getType();
			case ProjectManagementPackage.ISSUE__STATUS:
				return getStatus();
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
			case ProjectManagementPackage.ISSUE__ISSUE_ID:
				setIssueID((String)newValue);
				return;
			case ProjectManagementPackage.ISSUE__SUMMARY:
				setSummary((String)newValue);
				return;
			case ProjectManagementPackage.ISSUE__TYPE:
				setType((IssueType)newValue);
				return;
			case ProjectManagementPackage.ISSUE__STATUS:
				setStatus((IssueStatus)newValue);
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
			case ProjectManagementPackage.ISSUE__ISSUE_ID:
				setIssueID(ISSUE_ID_EDEFAULT);
				return;
			case ProjectManagementPackage.ISSUE__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case ProjectManagementPackage.ISSUE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ProjectManagementPackage.ISSUE__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case ProjectManagementPackage.ISSUE__ISSUE_ID:
				return ISSUE_ID_EDEFAULT == null ? issueID != null : !ISSUE_ID_EDEFAULT.equals(issueID);
			case ProjectManagementPackage.ISSUE__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case ProjectManagementPackage.ISSUE__TYPE:
				return type != TYPE_EDEFAULT;
			case ProjectManagementPackage.ISSUE__STATUS:
				return status != STATUS_EDEFAULT;
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
		result.append(" (issueID: ");
		result.append(issueID);
		result.append(", summary: ");
		result.append(summary);
		result.append(", type: ");
		result.append(type);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //IssueImpl
