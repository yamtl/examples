/**
 */
package projectManagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projectManagement.Feature;
import projectManagement.Project;
import projectManagement.ProjectManagementPackage;
import projectManagement.TeamMember;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectManagement.impl.ProjectImpl#getProjectID <em>Project ID</em>}</li>
 *   <li>{@link projectManagement.impl.ProjectImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link projectManagement.impl.ProjectImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link projectManagement.impl.ProjectImpl#getTeamMembers <em>Team Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
	/**
	 * The default value of the '{@link #getProjectID() <em>Project ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectID() <em>Project ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectID()
	 * @generated
	 * @ordered
	 */
	protected String projectID = PROJECT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getTeamMembers() <em>Team Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<TeamMember> teamMembers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectManagementPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectID() {
		return projectID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectID(String newProjectID) {
		String oldProjectID = projectID;
		projectID = newProjectID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectManagementPackage.PROJECT__PROJECT_ID, oldProjectID, projectID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectManagementPackage.PROJECT__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, ProjectManagementPackage.PROJECT__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TeamMember> getTeamMembers() {
		if (teamMembers == null) {
			teamMembers = new EObjectContainmentEList<TeamMember>(TeamMember.class, this, ProjectManagementPackage.PROJECT__TEAM_MEMBERS);
		}
		return teamMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjectManagementPackage.PROJECT__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case ProjectManagementPackage.PROJECT__TEAM_MEMBERS:
				return ((InternalEList<?>)getTeamMembers()).basicRemove(otherEnd, msgs);
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
			case ProjectManagementPackage.PROJECT__PROJECT_ID:
				return getProjectID();
			case ProjectManagementPackage.PROJECT__PROJECT_NAME:
				return getProjectName();
			case ProjectManagementPackage.PROJECT__FEATURES:
				return getFeatures();
			case ProjectManagementPackage.PROJECT__TEAM_MEMBERS:
				return getTeamMembers();
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
			case ProjectManagementPackage.PROJECT__PROJECT_ID:
				setProjectID((String)newValue);
				return;
			case ProjectManagementPackage.PROJECT__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case ProjectManagementPackage.PROJECT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case ProjectManagementPackage.PROJECT__TEAM_MEMBERS:
				getTeamMembers().clear();
				getTeamMembers().addAll((Collection<? extends TeamMember>)newValue);
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
			case ProjectManagementPackage.PROJECT__PROJECT_ID:
				setProjectID(PROJECT_ID_EDEFAULT);
				return;
			case ProjectManagementPackage.PROJECT__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case ProjectManagementPackage.PROJECT__FEATURES:
				getFeatures().clear();
				return;
			case ProjectManagementPackage.PROJECT__TEAM_MEMBERS:
				getTeamMembers().clear();
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
			case ProjectManagementPackage.PROJECT__PROJECT_ID:
				return PROJECT_ID_EDEFAULT == null ? projectID != null : !PROJECT_ID_EDEFAULT.equals(projectID);
			case ProjectManagementPackage.PROJECT__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case ProjectManagementPackage.PROJECT__FEATURES:
				return features != null && !features.isEmpty();
			case ProjectManagementPackage.PROJECT__TEAM_MEMBERS:
				return teamMembers != null && !teamMembers.isEmpty();
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
		result.append(" (projectID: ");
		result.append(projectID);
		result.append(", projectName: ");
		result.append(projectName);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
