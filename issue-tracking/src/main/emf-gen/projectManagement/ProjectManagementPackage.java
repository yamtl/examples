/**
 */
package projectManagement;

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
 * @see projectManagement.ProjectManagementFactory
 * @model kind="package"
 * @generated
 */
public interface ProjectManagementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "projectManagement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "yamtl.project";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "p";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjectManagementPackage eINSTANCE = projectManagement.impl.ProjectManagementPackageImpl.init();

	/**
	 * The meta object id for the '{@link projectManagement.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectManagement.impl.ProjectImpl
	 * @see projectManagement.impl.ProjectManagementPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Project ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_ID = 0;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FEATURES = 2;

	/**
	 * The feature id for the '<em><b>Team Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TEAM_MEMBERS = 3;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectManagement.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectManagement.impl.FeatureImpl
	 * @see projectManagement.impl.ProjectManagementPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Feature ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURE_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Related Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__RELATED_ISSUES = 3;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectManagement.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectManagement.impl.IssueImpl
	 * @see projectManagement.impl.ProjectManagementPackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 2;

	/**
	 * The feature id for the '<em><b>Issue ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ISSUE_ID = 0;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__SUMMARY = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__STATUS = 3;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectManagement.impl.TeamMemberImpl <em>Team Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectManagement.impl.TeamMemberImpl
	 * @see projectManagement.impl.ProjectManagementPackageImpl#getTeamMember()
	 * @generated
	 */
	int TEAM_MEMBER = 3;

	/**
	 * The feature id for the '<em><b>Member ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER__MEMBER_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER__ROLE = 2;

	/**
	 * The number of structural features of the '<em>Team Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Team Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectManagement.IssueType <em>Issue Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectManagement.IssueType
	 * @see projectManagement.impl.ProjectManagementPackageImpl#getIssueType()
	 * @generated
	 */
	int ISSUE_TYPE = 4;

	/**
	 * The meta object id for the '{@link projectManagement.IssueStatus <em>Issue Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectManagement.IssueStatus
	 * @see projectManagement.impl.ProjectManagementPackageImpl#getIssueStatus()
	 * @generated
	 */
	int ISSUE_STATUS = 5;


	/**
	 * Returns the meta object for class '{@link projectManagement.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see projectManagement.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link projectManagement.Project#getProjectID <em>Project ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project ID</em>'.
	 * @see projectManagement.Project#getProjectID()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ProjectID();

	/**
	 * Returns the meta object for the attribute '{@link projectManagement.Project#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see projectManagement.Project#getProjectName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ProjectName();

	/**
	 * Returns the meta object for the containment reference list '{@link projectManagement.Project#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see projectManagement.Project#getFeatures()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link projectManagement.Project#getTeamMembers <em>Team Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Team Members</em>'.
	 * @see projectManagement.Project#getTeamMembers()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_TeamMembers();

	/**
	 * Returns the meta object for class '{@link projectManagement.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see projectManagement.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link projectManagement.Feature#getFeatureID <em>Feature ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature ID</em>'.
	 * @see projectManagement.Feature#getFeatureID()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_FeatureID();

	/**
	 * Returns the meta object for the attribute '{@link projectManagement.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projectManagement.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link projectManagement.Feature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see projectManagement.Feature#getDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link projectManagement.Feature#getRelatedIssues <em>Related Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Issues</em>'.
	 * @see projectManagement.Feature#getRelatedIssues()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_RelatedIssues();

	/**
	 * Returns the meta object for class '{@link projectManagement.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see projectManagement.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for the attribute '{@link projectManagement.Issue#getIssueID <em>Issue ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue ID</em>'.
	 * @see projectManagement.Issue#getIssueID()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_IssueID();

	/**
	 * Returns the meta object for the attribute '{@link projectManagement.Issue#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see projectManagement.Issue#getSummary()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Summary();

	/**
	 * Returns the meta object for the attribute '{@link projectManagement.Issue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see projectManagement.Issue#getType()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Type();

	/**
	 * Returns the meta object for the attribute '{@link projectManagement.Issue#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see projectManagement.Issue#getStatus()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Status();

	/**
	 * Returns the meta object for class '{@link projectManagement.TeamMember <em>Team Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team Member</em>'.
	 * @see projectManagement.TeamMember
	 * @generated
	 */
	EClass getTeamMember();

	/**
	 * Returns the meta object for the attribute '{@link projectManagement.TeamMember#getMemberID <em>Member ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member ID</em>'.
	 * @see projectManagement.TeamMember#getMemberID()
	 * @see #getTeamMember()
	 * @generated
	 */
	EAttribute getTeamMember_MemberID();

	/**
	 * Returns the meta object for the attribute '{@link projectManagement.TeamMember#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projectManagement.TeamMember#getName()
	 * @see #getTeamMember()
	 * @generated
	 */
	EAttribute getTeamMember_Name();

	/**
	 * Returns the meta object for the attribute '{@link projectManagement.TeamMember#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see projectManagement.TeamMember#getRole()
	 * @see #getTeamMember()
	 * @generated
	 */
	EAttribute getTeamMember_Role();

	/**
	 * Returns the meta object for enum '{@link projectManagement.IssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Type</em>'.
	 * @see projectManagement.IssueType
	 * @generated
	 */
	EEnum getIssueType();

	/**
	 * Returns the meta object for enum '{@link projectManagement.IssueStatus <em>Issue Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Status</em>'.
	 * @see projectManagement.IssueStatus
	 * @generated
	 */
	EEnum getIssueStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProjectManagementFactory getProjectManagementFactory();

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
		 * The meta object literal for the '{@link projectManagement.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectManagement.impl.ProjectImpl
		 * @see projectManagement.impl.ProjectManagementPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Project ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PROJECT_ID = eINSTANCE.getProject_ProjectID();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PROJECT_NAME = eINSTANCE.getProject_ProjectName();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__FEATURES = eINSTANCE.getProject_Features();

		/**
		 * The meta object literal for the '<em><b>Team Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__TEAM_MEMBERS = eINSTANCE.getProject_TeamMembers();

		/**
		 * The meta object literal for the '{@link projectManagement.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectManagement.impl.FeatureImpl
		 * @see projectManagement.impl.ProjectManagementPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Feature ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__FEATURE_ID = eINSTANCE.getFeature_FeatureID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DESCRIPTION = eINSTANCE.getFeature_Description();

		/**
		 * The meta object literal for the '<em><b>Related Issues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__RELATED_ISSUES = eINSTANCE.getFeature_RelatedIssues();

		/**
		 * The meta object literal for the '{@link projectManagement.impl.IssueImpl <em>Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectManagement.impl.IssueImpl
		 * @see projectManagement.impl.ProjectManagementPackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();

		/**
		 * The meta object literal for the '<em><b>Issue ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__ISSUE_ID = eINSTANCE.getIssue_IssueID();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__SUMMARY = eINSTANCE.getIssue_Summary();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__TYPE = eINSTANCE.getIssue_Type();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__STATUS = eINSTANCE.getIssue_Status();

		/**
		 * The meta object literal for the '{@link projectManagement.impl.TeamMemberImpl <em>Team Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectManagement.impl.TeamMemberImpl
		 * @see projectManagement.impl.ProjectManagementPackageImpl#getTeamMember()
		 * @generated
		 */
		EClass TEAM_MEMBER = eINSTANCE.getTeamMember();

		/**
		 * The meta object literal for the '<em><b>Member ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MEMBER__MEMBER_ID = eINSTANCE.getTeamMember_MemberID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MEMBER__NAME = eINSTANCE.getTeamMember_Name();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MEMBER__ROLE = eINSTANCE.getTeamMember_Role();

		/**
		 * The meta object literal for the '{@link projectManagement.IssueType <em>Issue Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectManagement.IssueType
		 * @see projectManagement.impl.ProjectManagementPackageImpl#getIssueType()
		 * @generated
		 */
		EEnum ISSUE_TYPE = eINSTANCE.getIssueType();

		/**
		 * The meta object literal for the '{@link projectManagement.IssueStatus <em>Issue Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectManagement.IssueStatus
		 * @see projectManagement.impl.ProjectManagementPackageImpl#getIssueStatus()
		 * @generated
		 */
		EEnum ISSUE_STATUS = eINSTANCE.getIssueStatus();

	}

} //ProjectManagementPackage
