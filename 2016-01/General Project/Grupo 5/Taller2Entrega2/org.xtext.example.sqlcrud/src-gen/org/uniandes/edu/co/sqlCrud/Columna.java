/**
 * generated by Xtext 2.9.1
 */
package org.uniandes.edu.co.sqlCrud;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Columna</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.Columna#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.Columna#getTipo <em>Tipo</em>}</li>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.Columna#getNotnullable <em>Notnullable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uniandes.edu.co.sqlCrud.SqlCrudPackage#getColumna()
 * @model
 * @generated
 */
public interface Columna extends EObject
{
  /**
   * Returns the value of the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre</em>' attribute.
   * @see #setNombre(String)
   * @see org.uniandes.edu.co.sqlCrud.SqlCrudPackage#getColumna_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link org.uniandes.edu.co.sqlCrud.Columna#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

  /**
   * Returns the value of the '<em><b>Tipo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo</em>' containment reference.
   * @see #setTipo(ColumnTipoEnum)
   * @see org.uniandes.edu.co.sqlCrud.SqlCrudPackage#getColumna_Tipo()
   * @model containment="true"
   * @generated
   */
  ColumnTipoEnum getTipo();

  /**
   * Sets the value of the '{@link org.uniandes.edu.co.sqlCrud.Columna#getTipo <em>Tipo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo</em>' containment reference.
   * @see #getTipo()
   * @generated
   */
  void setTipo(ColumnTipoEnum value);

  /**
   * Returns the value of the '<em><b>Notnullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Notnullable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Notnullable</em>' attribute.
   * @see #setNotnullable(String)
   * @see org.uniandes.edu.co.sqlCrud.SqlCrudPackage#getColumna_Notnullable()
   * @model
   * @generated
   */
  String getNotnullable();

  /**
   * Sets the value of the '{@link org.uniandes.edu.co.sqlCrud.Columna#getNotnullable <em>Notnullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Notnullable</em>' attribute.
   * @see #getNotnullable()
   * @generated
   */
  void setNotnullable(String value);

} // Columna
