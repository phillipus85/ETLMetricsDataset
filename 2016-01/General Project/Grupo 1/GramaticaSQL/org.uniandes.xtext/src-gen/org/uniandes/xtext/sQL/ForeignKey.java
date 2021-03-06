/**
 * generated by Xtext 2.9.1
 */
package org.uniandes.xtext.sQL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.uniandes.xtext.sQL.ForeignKey#getColumn <em>Column</em>}</li>
 *   <li>{@link org.uniandes.xtext.sQL.ForeignKey#getTableRef <em>Table Ref</em>}</li>
 *   <li>{@link org.uniandes.xtext.sQL.ForeignKey#getColumnsRef <em>Columns Ref</em>}</li>
 * </ul>
 *
 * @see org.uniandes.xtext.sQL.SQLPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends EObject
{
  /**
   * Returns the value of the '<em><b>Column</b></em>' reference list.
   * The list contents are of type {@link org.uniandes.xtext.sQL.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' reference list.
   * @see org.uniandes.xtext.sQL.SQLPackage#getForeignKey_Column()
   * @model
   * @generated
   */
  EList<Column> getColumn();

  /**
   * Returns the value of the '<em><b>Table Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Ref</em>' reference.
   * @see #setTableRef(Table)
   * @see org.uniandes.xtext.sQL.SQLPackage#getForeignKey_TableRef()
   * @model
   * @generated
   */
  Table getTableRef();

  /**
   * Sets the value of the '{@link org.uniandes.xtext.sQL.ForeignKey#getTableRef <em>Table Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table Ref</em>' reference.
   * @see #getTableRef()
   * @generated
   */
  void setTableRef(Table value);

  /**
   * Returns the value of the '<em><b>Columns Ref</b></em>' reference list.
   * The list contents are of type {@link org.uniandes.xtext.sQL.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns Ref</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns Ref</em>' reference list.
   * @see org.uniandes.xtext.sQL.SQLPackage#getForeignKey_ColumnsRef()
   * @model
   * @generated
   */
  EList<Column> getColumnsRef();

} // ForeignKey
