/**
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.tallerM2M.sql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tabla</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.tallerM2M.sql.Tabla#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.tallerM2M.sql.Tabla#getColumnas <em>Columnas</em>}</li>
 *   <li>{@link co.edu.uniandes.tallerM2M.sql.Tabla#getPrimarys <em>Primarys</em>}</li>
 *   <li>{@link co.edu.uniandes.tallerM2M.sql.Tabla#getForeigns <em>Foreigns</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.tallerM2M.sql.SqlPackage#getTabla()
 * @model
 * @generated
 */
public interface Tabla extends EObject
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
   * @see co.edu.uniandes.tallerM2M.sql.SqlPackage#getTabla_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.edu.uniandes.tallerM2M.sql.Tabla#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Columnas</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.tallerM2M.sql.Columna}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columnas</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columnas</em>' containment reference list.
   * @see co.edu.uniandes.tallerM2M.sql.SqlPackage#getTabla_Columnas()
   * @model containment="true"
   * @generated
   */
  EList<Columna> getColumnas();

  /**
   * Returns the value of the '<em><b>Primarys</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.tallerM2M.sql.Primary}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primarys</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primarys</em>' containment reference list.
   * @see co.edu.uniandes.tallerM2M.sql.SqlPackage#getTabla_Primarys()
   * @model containment="true"
   * @generated
   */
  EList<Primary> getPrimarys();

  /**
   * Returns the value of the '<em><b>Foreigns</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.tallerM2M.sql.ForeignKey}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreigns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreigns</em>' containment reference list.
   * @see co.edu.uniandes.tallerM2M.sql.SqlPackage#getTabla_Foreigns()
   * @model containment="true"
   * @generated
   */
  EList<ForeignKey> getForeigns();

} // Tabla
