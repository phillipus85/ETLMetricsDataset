/**
 * generated by Xtext 2.9.2
 */
package edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.Schema#getName <em>Name</em>}</li>
 *   <li>{@link edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.Schema#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.SqlCrudGeneratorPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.SqlCrudGeneratorPackage#getSchema_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.Schema#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
   * The list contents are of type {@link edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.Table}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tables</em>' containment reference list.
   * @see edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.SqlCrudGeneratorPackage#getSchema_Tables()
   * @model containment="true"
   * @generated
   */
  EList<Table> getTables();

} // Schema
