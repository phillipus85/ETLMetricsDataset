/**
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.grammarSql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.grammarSql.PrimaryKey#getCol <em>Col</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.grammarSql.GrammarSqlPackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends EObject
{
  /**
   * Returns the value of the '<em><b>Col</b></em>' reference list.
   * The list contents are of type {@link co.edu.uniandes.grammarSql.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Col</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Col</em>' reference list.
   * @see co.edu.uniandes.grammarSql.GrammarSqlPackage#getPrimaryKey_Col()
   * @model
   * @generated
   */
  EList<Column> getCol();

} // PrimaryKey
