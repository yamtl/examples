/**
 */
package projectManagement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectManagement.Project#getProjectID <em>Project ID</em>}</li>
 *   <li>{@link projectManagement.Project#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link projectManagement.Project#getFeatures <em>Features</em>}</li>
 *   <li>{@link projectManagement.Project#getTeamMembers <em>Team Members</em>}</li>
 * </ul>
 *
 * @see projectManagement.ProjectManagementPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Project ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project ID</em>' attribute.
	 * @see #setProjectID(String)
	 * @see projectManagement.ProjectManagementPackage#getProject_ProjectID()
	 * @model
	 * @generated
	 */
	String getProjectID();

	/**
	 * Sets the value of the '{@link projectManagement.Project#getProjectID <em>Project ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project ID</em>' attribute.
	 * @see #getProjectID()
	 * @generated
	 */
	void setProjectID(String value);

	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see projectManagement.ProjectManagementPackage#getProject_ProjectName()
	 * @model
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link projectManagement.Project#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link projectManagement.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see projectManagement.ProjectManagementPackage#getProject_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Team Members</b></em>' containment reference list.
	 * The list contents are of type {@link projectManagement.TeamMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Members</em>' containment reference list.
	 * @see projectManagement.ProjectManagementPackage#getProject_TeamMembers()
	 * @model containment="true"
	 * @generated
	 */
	EList<TeamMember> getTeamMembers();

} // Project
