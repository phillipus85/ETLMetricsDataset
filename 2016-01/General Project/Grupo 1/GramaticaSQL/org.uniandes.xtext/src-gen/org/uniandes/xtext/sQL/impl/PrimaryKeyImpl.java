/**
 * generated by Xtext 2.9.1
 */
package org.uniandes.xtext.sQL.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.uniandes.xtext.sQL.Column;
import org.uniandes.xtext.sQL.PrimaryKey;
import org.uniandes.xtext.sQL.SQLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.uniandes.xtext.sQL.impl.PrimaryKeyImpl#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryKeyImpl extends MinimalEObjectImpl.Container implements PrimaryKey
{
  /**
   * The cached value of the '{@link #getColumn() <em>Column</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected EList<Column> column;

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
  public EList<Column> getColumn()
  {
    if (column == null)
    {
      column = new EObjectResolvingEList<Column>(Column.class, this, SQLPackage.PRIMARY_KEY__COLUMN);
    }
    return column;
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
      case SQLPackage.PRIMARY_KEY__COLUMN:
        return getColumn();
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
      case SQLPackage.PRIMARY_KEY__COLUMN:
        getColumn().clear();
        getColumn().addAll((Collection<? extends Column>)newValue);
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
      case SQLPackage.PRIMARY_KEY__COLUMN:
        getColumn().clear();
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
      case SQLPackage.PRIMARY_KEY__COLUMN:
        return column != null && !column.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PrimaryKeyImpl