/**
 */
package projectManagement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectManagement.TeamMember#getMemberID <em>Member ID</em>}</li>
 *   <li>{@link projectManagement.TeamMember#getName <em>Name</em>}</li>
 *   <li>{@link projectManagement.TeamMember#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see projectManagement.ProjectManagementPackage#getTeamMember()
 * @model
 * @generated
 */
public interface TeamMember extends EObject {
	/**
	 * Returns the value of the '<em><b>Member ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member ID</em>' attribute.
	 * @see #setMemberID(String)
	 * @see projectManagement.ProjectManagementPackage#getTeamMember_MemberID()
	 * @model
	 * @generated
	 */
	String getMemberID();

	/**
	 * Sets the value of the '{@link projectManagement.TeamMember#getMemberID <em>Member ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member ID</em>' attribute.
	 * @see #getMemberID()
	 * @generated
	 */
	void setMemberID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projectManagement.ProjectManagementPackage#getTeamMember_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projectManagement.TeamMember#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see projectManagement.ProjectManagementPackage#getTeamMember_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link projectManagement.TeamMember#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

} // TeamMember
