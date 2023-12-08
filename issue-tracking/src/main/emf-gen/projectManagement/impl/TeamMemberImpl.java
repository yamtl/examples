/**
 */
package projectManagement.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projectManagement.ProjectManagementPackage;
import projectManagement.TeamMember;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectManagement.impl.TeamMemberImpl#getMemberID <em>Member ID</em>}</li>
 *   <li>{@link projectManagement.impl.TeamMemberImpl#getName <em>Name</em>}</li>
 *   <li>{@link projectManagement.impl.TeamMemberImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamMemberImpl extends MinimalEObjectImpl.Container implements TeamMember {
	/**
	 * The default value of the '{@link #getMemberID() <em>Member ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberID()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMBER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemberID() <em>Member ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberID()
	 * @generated
	 * @ordered
	 */
	protected String memberID = MEMBER_ID_EDEFAULT;

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
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectManagementPackage.Literals.TEAM_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMemberID() {
		return memberID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemberID(String newMemberID) {
		String oldMemberID = memberID;
		memberID = newMemberID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectManagementPackage.TEAM_MEMBER__MEMBER_ID, oldMemberID, memberID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectManagementPackage.TEAM_MEMBER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectManagementPackage.TEAM_MEMBER__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjectManagementPackage.TEAM_MEMBER__MEMBER_ID:
				return getMemberID();
			case ProjectManagementPackage.TEAM_MEMBER__NAME:
				return getName();
			case ProjectManagementPackage.TEAM_MEMBER__ROLE:
				return getRole();
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
			case ProjectManagementPackage.TEAM_MEMBER__MEMBER_ID:
				setMemberID((String)newValue);
				return;
			case ProjectManagementPackage.TEAM_MEMBER__NAME:
				setName((String)newValue);
				return;
			case ProjectManagementPackage.TEAM_MEMBER__ROLE:
				setRole((String)newValue);
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
			case ProjectManagementPackage.TEAM_MEMBER__MEMBER_ID:
				setMemberID(MEMBER_ID_EDEFAULT);
				return;
			case ProjectManagementPackage.TEAM_MEMBER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProjectManagementPackage.TEAM_MEMBER__ROLE:
				setRole(ROLE_EDEFAULT);
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
			case ProjectManagementPackage.TEAM_MEMBER__MEMBER_ID:
				return MEMBER_ID_EDEFAULT == null ? memberID != null : !MEMBER_ID_EDEFAULT.equals(memberID);
			case ProjectManagementPackage.TEAM_MEMBER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProjectManagementPackage.TEAM_MEMBER__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
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
		result.append(" (memberID: ");
		result.append(memberID);
		result.append(", name: ");
		result.append(name);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //TeamMemberImpl
