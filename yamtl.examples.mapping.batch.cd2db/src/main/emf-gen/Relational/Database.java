/**
 */
package Relational;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Relational.Database#getTables <em>Tables</em>}</li>
 *   <li>{@link Relational.Database#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see Relational.RelationalPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends Named {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link Relational.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see Relational.RelationalPackage#getDatabase_Tables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTables();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link Relational.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see Relational.RelationalPackage#getDatabase_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

} // Database
