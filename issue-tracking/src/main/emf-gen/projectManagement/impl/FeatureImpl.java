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
import projectManagement.Issue;
import projectManagement.ProjectManagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectManagement.impl.FeatureImpl#getFeatureID <em>Feature ID</em>}</li>
 *   <li>{@link projectManagement.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link projectManagement.impl.FeatureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link projectManagement.impl.FeatureImpl#getRelatedIssues <em>Related Issues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends MinimalEObjectImpl.Container implements Feature {
	/**
	 * The default value of the '{@link #getFeatureID() <em>Feature ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureID()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureID() <em>Feature ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureID()
	 * @generated
	 * @ordered
	 */
	protected String featureID = FEATURE_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getRelatedIssues() <em>Related Issues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> relatedIssues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectManagementPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFeatureID() {
		return featureID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureID(String newFeatureID) {
		String oldFeatureID = featureID;
		featureID = newFeatureID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectManagementPackage.FEATURE__FEATURE_ID, oldFeatureID, featureID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectManagementPackage.FEATURE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectManagementPackage.FEATURE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Issue> getRelatedIssues() {
		if (relatedIssues == null) {
			relatedIssues = new EObjectContainmentEList<Issue>(Issue.class, this, ProjectManagementPackage.FEATURE__RELATED_ISSUES);
		}
		return relatedIssues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjectManagementPackage.FEATURE__RELATED_ISSUES:
				return ((InternalEList<?>)getRelatedIssues()).basicRemove(otherEnd, msgs);
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
			case ProjectManagementPackage.FEATURE__FEATURE_ID:
				return getFeatureID();
			case ProjectManagementPackage.FEATURE__NAME:
				return getName();
			case ProjectManagementPackage.FEATURE__DESCRIPTION:
				return getDescription();
			case ProjectManagementPackage.FEATURE__RELATED_ISSUES:
				return getRelatedIssues();
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
			case ProjectManagementPackage.FEATURE__FEATURE_ID:
				setFeatureID((String)newValue);
				return;
			case ProjectManagementPackage.FEATURE__NAME:
				setName((String)newValue);
				return;
			case ProjectManagementPackage.FEATURE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProjectManagementPackage.FEATURE__RELATED_ISSUES:
				getRelatedIssues().clear();
				getRelatedIssues().addAll((Collection<? extends Issue>)newValue);
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
			case ProjectManagementPackage.FEATURE__FEATURE_ID:
				setFeatureID(FEATURE_ID_EDEFAULT);
				return;
			case ProjectManagementPackage.FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProjectManagementPackage.FEATURE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProjectManagementPackage.FEATURE__RELATED_ISSUES:
				getRelatedIssues().clear();
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
			case ProjectManagementPackage.FEATURE__FEATURE_ID:
				return FEATURE_ID_EDEFAULT == null ? this.featureID != null : !FEATURE_ID_EDEFAULT.equals(this.featureID);
			case ProjectManagementPackage.FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProjectManagementPackage.FEATURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ProjectManagementPackage.FEATURE__RELATED_ISSUES:
				return relatedIssues != null && !relatedIssues.isEmpty();
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
		result.append(" (featureID: ");
		result.append(featureID);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
