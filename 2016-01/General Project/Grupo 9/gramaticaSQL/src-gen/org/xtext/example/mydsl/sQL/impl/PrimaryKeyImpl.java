/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.sQL.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.example.mydsl.sQL.Column;
import org.xtext.example.mydsl.sQL.PrimaryKey;
import org.xtext.example.mydsl.sQL.SQLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.sQL.impl.PrimaryKeyImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimaryKeyImpl extends MinimalEObjectImpl.Container implements PrimaryKey
{
  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<Column> columns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimaryKeyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SQLPackage.Literals.PRIMARY_KEY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Column> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectResolvingEList<Column>(Column.class, this, SQLPackage.PRIMARY_KEY__COLUMNS);
    }
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SQLPackage.PRIMARY_KEY__COLUMNS:
        return getColumns();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SQLPackage.PRIMARY_KEY__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends Column>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SQLPackage.PRIMARY_KEY__COLUMNS:
        getColumns().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SQLPackage.PRIMARY_KEY__COLUMNS:
        return columns != null && !columns.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PrimaryKeyImpl
