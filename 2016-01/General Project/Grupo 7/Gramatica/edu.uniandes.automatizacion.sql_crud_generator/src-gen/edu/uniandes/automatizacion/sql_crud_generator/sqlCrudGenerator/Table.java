/**
 * generated by Xtext 2.9.2
 */
package edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.Table#getName <em>Name</em>}</li>
 *   <li>{@link edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.Table#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.Table#getForeignsKeys <em>Foreigns Keys</em>}</li>
 * </ul>
 *
 * @see edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.SqlCrudGeneratorPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject
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
   * @see edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.SqlCrudGeneratorPackage#getTable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.Table#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.SqlCrudGeneratorPackage#getTable_Columns()
   * @model containment="true"
   * @generated
   */
  EList<Column> getColumns();

  /**
   * Returns the value of the '<em><b>Primary Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Key</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Key</em>' containment reference.
   * @see #setPrimaryKey(PrimaryKey)
   * @see edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.SqlCrudGeneratorPackage#getTable_PrimaryKey()
   * @model containment="true"
   * @generated
   */
  PrimaryKey getPrimaryKey();

  /**
   * Sets the value of the '{@link edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.Table#getPrimaryKey <em>Primary Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary Key</em>' containment reference.
   * @see #getPrimaryKey()
   * @generated
   */
  void setPrimaryKey(PrimaryKey value);

  /**
   * Returns the value of the '<em><b>Foreigns Keys</b></em>' containment reference list.
   * The list contents are of type {@link edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.ForeignKey}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreigns Keys</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreigns Keys</em>' containment reference list.
   * @see edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.SqlCrudGeneratorPackage#getTable_ForeignsKeys()
   * @model containment="true"
   * @generated
   */
  EList<ForeignKey> getForeignsKeys();

} // Table
