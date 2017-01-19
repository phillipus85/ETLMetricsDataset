/**
 * generated by Xtext 2.9.2
 */
package edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.impl;

import edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.DataType;
import edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.ENUM_DATA_TYPE;
import edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.SqlCrudGeneratorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.impl.DataTypeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link edu.uniandes.automatizacion.sql_crud_generator.sqlCrudGenerator.impl.DataTypeImpl#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeImpl extends MinimalEObjectImpl.Container implements DataType
{
  /**
   * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataType()
   * @generated
   * @ordered
   */
  protected static final ENUM_DATA_TYPE DATA_TYPE_EDEFAULT = ENUM_DATA_TYPE.CHARACTER;

  /**
   * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataType()
   * @generated
   * @ordered
   */
  protected ENUM_DATA_TYPE dataType = DATA_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecision()
   * @generated
   * @ordered
   */
  protected static final int PRECISION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecision()
   * @generated
   * @ordered
   */
  protected int precision = PRECISION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataTypeImpl()
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
    return SqlCrudGeneratorPackage.Literals.DATA_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENUM_DATA_TYPE getDataType()
  {
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataType(ENUM_DATA_TYPE newDataType)
  {
    ENUM_DATA_TYPE oldDataType = dataType;
    dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlCrudGeneratorPackage.DATA_TYPE__DATA_TYPE, oldDataType, dataType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPrecision()
  {
    return precision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrecision(int newPrecision)
  {
    int oldPrecision = precision;
    precision = newPrecision;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlCrudGeneratorPackage.DATA_TYPE__PRECISION, oldPrecision, precision));
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
      case SqlCrudGeneratorPackage.DATA_TYPE__DATA_TYPE:
        return getDataType();
      case SqlCrudGeneratorPackage.DATA_TYPE__PRECISION:
        return getPrecision();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SqlCrudGeneratorPackage.DATA_TYPE__DATA_TYPE:
        setDataType((ENUM_DATA_TYPE)newValue);
        return;
      case SqlCrudGeneratorPackage.DATA_TYPE__PRECISION:
        setPrecision((Integer)newValue);
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
      case SqlCrudGeneratorPackage.DATA_TYPE__DATA_TYPE:
        setDataType(DATA_TYPE_EDEFAULT);
        return;
      case SqlCrudGeneratorPackage.DATA_TYPE__PRECISION:
        setPrecision(PRECISION_EDEFAULT);
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
      case SqlCrudGeneratorPackage.DATA_TYPE__DATA_TYPE:
        return dataType != DATA_TYPE_EDEFAULT;
      case SqlCrudGeneratorPackage.DATA_TYPE__PRECISION:
        return precision != PRECISION_EDEFAULT;
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
    result.append(" (dataType: ");
    result.append(dataType);
    result.append(", precision: ");
    result.append(precision);
    result.append(')');
    return result.toString();
  }

} //DataTypeImpl