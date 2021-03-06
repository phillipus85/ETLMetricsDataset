/**
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.genSql.impl;

import co.edu.uniandes.genSql.Column;
import co.edu.uniandes.genSql.ForeignKey;
import co.edu.uniandes.genSql.GenSqlPackage;
import co.edu.uniandes.genSql.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.genSql.impl.ForeignKeyImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link co.edu.uniandes.genSql.impl.ForeignKeyImpl#getTableRef <em>Table Ref</em>}</li>
 *   <li>{@link co.edu.uniandes.genSql.impl.ForeignKeyImpl#getColumnsRef <em>Columns Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyImpl extends MinimalEObjectImpl.Container implements ForeignKey
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
   * The cached value of the '{@link #getTableRef() <em>Table Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableRef()
   * @generated
   * @ordered
   */
  protected Table tableRef;

  /**
   * The cached value of the '{@link #getColumnsRef() <em>Columns Ref</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnsRef()
   * @generated
   * @ordered
   */
  protected EList<Column> columnsRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForeignKeyImpl()
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
    return GenSqlPackage.Literals.FOREIGN_KEY;
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
      columns = new EObjectResolvingEList<Column>(Column.class, this, GenSqlPackage.FOREIGN_KEY__COLUMNS);
    }
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Table getTableRef()
  {
    if (tableRef != null && tableRef.eIsProxy())
    {
      InternalEObject oldTableRef = (InternalEObject)tableRef;
      tableRef = (Table)eResolveProxy(oldTableRef);
      if (tableRef != oldTableRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenSqlPackage.FOREIGN_KEY__TABLE_REF, oldTableRef, tableRef));
      }
    }
    return tableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Table basicGetTableRef()
  {
    return tableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTableRef(Table newTableRef)
  {
    Table oldTableRef = tableRef;
    tableRef = newTableRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenSqlPackage.FOREIGN_KEY__TABLE_REF, oldTableRef, tableRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Column> getColumnsRef()
  {
    if (columnsRef == null)
    {
      columnsRef = new EObjectResolvingEList<Column>(Column.class, this, GenSqlPackage.FOREIGN_KEY__COLUMNS_REF);
    }
    return columnsRef;
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
      case GenSqlPackage.FOREIGN_KEY__COLUMNS:
        return getColumns();
      case GenSqlPackage.FOREIGN_KEY__TABLE_REF:
        if (resolve) return getTableRef();
        return basicGetTableRef();
      case GenSqlPackage.FOREIGN_KEY__COLUMNS_REF:
        return getColumnsRef();
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
      case GenSqlPackage.FOREIGN_KEY__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends Column>)newValue);
        return;
      case GenSqlPackage.FOREIGN_KEY__TABLE_REF:
        setTableRef((Table)newValue);
        return;
      case GenSqlPackage.FOREIGN_KEY__COLUMNS_REF:
        getColumnsRef().clear();
        getColumnsRef().addAll((Collection<? extends Column>)newValue);
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
      case GenSqlPackage.FOREIGN_KEY__COLUMNS:
        getColumns().clear();
        return;
      case GenSqlPackage.FOREIGN_KEY__TABLE_REF:
        setTableRef((Table)null);
        return;
      case GenSqlPackage.FOREIGN_KEY__COLUMNS_REF:
        getColumnsRef().clear();
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
      case GenSqlPackage.FOREIGN_KEY__COLUMNS:
        return columns != null && !columns.isEmpty();
      case GenSqlPackage.FOREIGN_KEY__TABLE_REF:
        return tableRef != null;
      case GenSqlPackage.FOREIGN_KEY__COLUMNS_REF:
        return columnsRef != null && !columnsRef.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ForeignKeyImpl
