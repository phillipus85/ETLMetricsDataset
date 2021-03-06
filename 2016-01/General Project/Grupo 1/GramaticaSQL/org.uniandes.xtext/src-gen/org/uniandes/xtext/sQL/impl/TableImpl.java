/**
 * generated by Xtext 2.9.1
 */
package org.uniandes.xtext.sQL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.uniandes.xtext.sQL.Column;
import org.uniandes.xtext.sQL.ForeignKey;
import org.uniandes.xtext.sQL.PrimaryKey;
import org.uniandes.xtext.sQL.SQLPackage;
import org.uniandes.xtext.sQL.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.uniandes.xtext.sQL.impl.TableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.uniandes.xtext.sQL.impl.TableImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.uniandes.xtext.sQL.impl.TableImpl#getPrimarykey <em>Primarykey</em>}</li>
 *   <li>{@link org.uniandes.xtext.sQL.impl.TableImpl#getForeignkey <em>Foreignkey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected EList<Column> column;

  /**
   * The cached value of the '{@link #getPrimarykey() <em>Primarykey</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimarykey()
   * @generated
   * @ordered
   */
  protected PrimaryKey primarykey;

  /**
   * The cached value of the '{@link #getForeignkey() <em>Foreignkey</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeignkey()
   * @generated
   * @ordered
   */
  protected EList<ForeignKey> foreignkey;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TableImpl()
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
    return SQLPackage.Literals.TABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SQLPackage.TABLE__NAME, oldName, name));
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
      column = new EObjectContainmentEList<Column>(Column.class, this, SQLPackage.TABLE__COLUMN);
    }
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryKey getPrimarykey()
  {
    return primarykey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimarykey(PrimaryKey newPrimarykey, NotificationChain msgs)
  {
    PrimaryKey oldPrimarykey = primarykey;
    primarykey = newPrimarykey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQLPackage.TABLE__PRIMARYKEY, oldPrimarykey, newPrimarykey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimarykey(PrimaryKey newPrimarykey)
  {
    if (newPrimarykey != primarykey)
    {
      NotificationChain msgs = null;
      if (primarykey != null)
        msgs = ((InternalEObject)primarykey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SQLPackage.TABLE__PRIMARYKEY, null, msgs);
      if (newPrimarykey != null)
        msgs = ((InternalEObject)newPrimarykey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SQLPackage.TABLE__PRIMARYKEY, null, msgs);
      msgs = basicSetPrimarykey(newPrimarykey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SQLPackage.TABLE__PRIMARYKEY, newPrimarykey, newPrimarykey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ForeignKey> getForeignkey()
  {
    if (foreignkey == null)
    {
      foreignkey = new EObjectContainmentEList<ForeignKey>(ForeignKey.class, this, SQLPackage.TABLE__FOREIGNKEY);
    }
    return foreignkey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SQLPackage.TABLE__COLUMN:
        return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
      case SQLPackage.TABLE__PRIMARYKEY:
        return basicSetPrimarykey(null, msgs);
      case SQLPackage.TABLE__FOREIGNKEY:
        return ((InternalEList<?>)getForeignkey()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SQLPackage.TABLE__NAME:
        return getName();
      case SQLPackage.TABLE__COLUMN:
        return getColumn();
      case SQLPackage.TABLE__PRIMARYKEY:
        return getPrimarykey();
      case SQLPackage.TABLE__FOREIGNKEY:
        return getForeignkey();
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
      case SQLPackage.TABLE__NAME:
        setName((String)newValue);
        return;
      case SQLPackage.TABLE__COLUMN:
        getColumn().clear();
        getColumn().addAll((Collection<? extends Column>)newValue);
        return;
      case SQLPackage.TABLE__PRIMARYKEY:
        setPrimarykey((PrimaryKey)newValue);
        return;
      case SQLPackage.TABLE__FOREIGNKEY:
        getForeignkey().clear();
        getForeignkey().addAll((Collection<? extends ForeignKey>)newValue);
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
      case SQLPackage.TABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SQLPackage.TABLE__COLUMN:
        getColumn().clear();
        return;
      case SQLPackage.TABLE__PRIMARYKEY:
        setPrimarykey((PrimaryKey)null);
        return;
      case SQLPackage.TABLE__FOREIGNKEY:
        getForeignkey().clear();
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
      case SQLPackage.TABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SQLPackage.TABLE__COLUMN:
        return column != null && !column.isEmpty();
      case SQLPackage.TABLE__PRIMARYKEY:
        return primarykey != null;
      case SQLPackage.TABLE__FOREIGNKEY:
        return foreignkey != null && !foreignkey.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TableImpl
