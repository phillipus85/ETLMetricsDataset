/**
 * generated by Xtext 2.9.2
 */
package edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.impl;

import edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.Column;
import edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.PrimaryKey;
import edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.SqlCrudGeneratorPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.impl.PrimaryKeyImpl#getIds <em>Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryKeyImpl extends MinimalEObjectImpl.Container implements PrimaryKey
{
  /**
   * The cached value of the '{@link #getIds() <em>Ids</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIds()
   * @generated
   * @ordered
   */
  protected EList<Column> ids;

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
    return SqlCrudGeneratorPackage.Literals.PRIMARY_KEY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Column> getIds()
  {
    if (ids == null)
    {
      ids = new EObjectResolvingEList<Column>(Column.class, this, SqlCrudGeneratorPackage.PRIMARY_KEY__IDS);
    }
    return ids;
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
      case SqlCrudGeneratorPackage.PRIMARY_KEY__IDS:
        return getIds();
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
      case SqlCrudGeneratorPackage.PRIMARY_KEY__IDS:
        getIds().clear();
        getIds().addAll((Collection<? extends Column>)newValue);
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
      case SqlCrudGeneratorPackage.PRIMARY_KEY__IDS:
        getIds().clear();
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
      case SqlCrudGeneratorPackage.PRIMARY_KEY__IDS:
        return ids != null && !ids.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PrimaryKeyImpl
