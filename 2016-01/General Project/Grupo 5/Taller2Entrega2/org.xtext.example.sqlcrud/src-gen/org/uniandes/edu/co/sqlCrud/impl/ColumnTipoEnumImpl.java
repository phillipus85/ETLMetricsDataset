/**
 * generated by Xtext 2.9.1
 */
package org.uniandes.edu.co.sqlCrud.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.uniandes.edu.co.sqlCrud.Binary;
import org.uniandes.edu.co.sqlCrud.ColumnTipoEnum;
import org.uniandes.edu.co.sqlCrud.SqlCrudPackage;
import org.uniandes.edu.co.sqlCrud.Varchar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Tipo Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.impl.ColumnTipoEnumImpl#getIntt <em>Intt</em>}</li>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.impl.ColumnTipoEnumImpl#getVarchart <em>Varchart</em>}</li>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.impl.ColumnTipoEnumImpl#getSmallintt <em>Smallintt</em>}</li>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.impl.ColumnTipoEnumImpl#getBigintt <em>Bigintt</em>}</li>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.impl.ColumnTipoEnumImpl#getBooleant <em>Booleant</em>}</li>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.impl.ColumnTipoEnumImpl#getRealt <em>Realt</em>}</li>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.impl.ColumnTipoEnumImpl#getFloatt <em>Floatt</em>}</li>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.impl.ColumnTipoEnumImpl#getBinaryt <em>Binaryt</em>}</li>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.impl.ColumnTipoEnumImpl#getVarbinaryt <em>Varbinaryt</em>}</li>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.impl.ColumnTipoEnumImpl#getDatet <em>Datet</em>}</li>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.impl.ColumnTipoEnumImpl#getTimestampt <em>Timestampt</em>}</li>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.impl.ColumnTipoEnumImpl#getMultisett <em>Multisett</em>}</li>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.impl.ColumnTipoEnumImpl#getXmlt <em>Xmlt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnTipoEnumImpl extends MinimalEObjectImpl.Container implements ColumnTipoEnum
{
  /**
   * The default value of the '{@link #getIntt() <em>Intt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntt()
   * @generated
   * @ordered
   */
  protected static final String INTT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIntt() <em>Intt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntt()
   * @generated
   * @ordered
   */
  protected String intt = INTT_EDEFAULT;

  /**
   * The cached value of the '{@link #getVarchart() <em>Varchart</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarchart()
   * @generated
   * @ordered
   */
  protected Varchar varchart;

  /**
   * The default value of the '{@link #getSmallintt() <em>Smallintt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSmallintt()
   * @generated
   * @ordered
   */
  protected static final String SMALLINTT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSmallintt() <em>Smallintt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSmallintt()
   * @generated
   * @ordered
   */
  protected String smallintt = SMALLINTT_EDEFAULT;

  /**
   * The default value of the '{@link #getBigintt() <em>Bigintt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBigintt()
   * @generated
   * @ordered
   */
  protected static final String BIGINTT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBigintt() <em>Bigintt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBigintt()
   * @generated
   * @ordered
   */
  protected String bigintt = BIGINTT_EDEFAULT;

  /**
   * The default value of the '{@link #getBooleant() <em>Booleant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleant()
   * @generated
   * @ordered
   */
  protected static final String BOOLEANT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBooleant() <em>Booleant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleant()
   * @generated
   * @ordered
   */
  protected String booleant = BOOLEANT_EDEFAULT;

  /**
   * The default value of the '{@link #getRealt() <em>Realt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealt()
   * @generated
   * @ordered
   */
  protected static final String REALT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRealt() <em>Realt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealt()
   * @generated
   * @ordered
   */
  protected String realt = REALT_EDEFAULT;

  /**
   * The default value of the '{@link #getFloatt() <em>Floatt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloatt()
   * @generated
   * @ordered
   */
  protected static final String FLOATT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFloatt() <em>Floatt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloatt()
   * @generated
   * @ordered
   */
  protected String floatt = FLOATT_EDEFAULT;

  /**
   * The cached value of the '{@link #getBinaryt() <em>Binaryt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinaryt()
   * @generated
   * @ordered
   */
  protected Binary binaryt;

  /**
   * The cached value of the '{@link #getVarbinaryt() <em>Varbinaryt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarbinaryt()
   * @generated
   * @ordered
   */
  protected Binary varbinaryt;

  /**
   * The default value of the '{@link #getDatet() <em>Datet</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatet()
   * @generated
   * @ordered
   */
  protected static final String DATET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDatet() <em>Datet</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatet()
   * @generated
   * @ordered
   */
  protected String datet = DATET_EDEFAULT;

  /**
   * The default value of the '{@link #getTimestampt() <em>Timestampt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimestampt()
   * @generated
   * @ordered
   */
  protected static final String TIMESTAMPT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTimestampt() <em>Timestampt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimestampt()
   * @generated
   * @ordered
   */
  protected String timestampt = TIMESTAMPT_EDEFAULT;

  /**
   * The default value of the '{@link #getMultisett() <em>Multisett</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultisett()
   * @generated
   * @ordered
   */
  protected static final String MULTISETT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMultisett() <em>Multisett</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultisett()
   * @generated
   * @ordered
   */
  protected String multisett = MULTISETT_EDEFAULT;

  /**
   * The default value of the '{@link #getXmlt() <em>Xmlt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXmlt()
   * @generated
   * @ordered
   */
  protected static final String XMLT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getXmlt() <em>Xmlt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXmlt()
   * @generated
   * @ordered
   */
  protected String xmlt = XMLT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColumnTipoEnumImpl()
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
    return SqlCrudPackage.Literals.COLUMN_TIPO_ENUM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIntt()
  {
    return intt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntt(String newIntt)
  {
    String oldIntt = intt;
    intt = newIntt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlCrudPackage.COLUMN_TIPO_ENUM__INTT, oldIntt, intt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Varchar getVarchart()
  {
    return varchart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarchart(Varchar newVarchart, NotificationChain msgs)
  {
    Varchar oldVarchart = varchart;
    varchart = newVarchart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlCrudPackage.COLUMN_TIPO_ENUM__VARCHART, oldVarchart, newVarchart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarchart(Varchar newVarchart)
  {
    if (newVarchart != varchart)
    {
      NotificationChain msgs = null;
      if (varchart != null)
        msgs = ((InternalEObject)varchart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlCrudPackage.COLUMN_TIPO_ENUM__VARCHART, null, msgs);
      if (newVarchart != null)
        msgs = ((InternalEObject)newVarchart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlCrudPackage.COLUMN_TIPO_ENUM__VARCHART, null, msgs);
      msgs = basicSetVarchart(newVarchart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlCrudPackage.COLUMN_TIPO_ENUM__VARCHART, newVarchart, newVarchart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSmallintt()
  {
    return smallintt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSmallintt(String newSmallintt)
  {
    String oldSmallintt = smallintt;
    smallintt = newSmallintt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlCrudPackage.COLUMN_TIPO_ENUM__SMALLINTT, oldSmallintt, smallintt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBigintt()
  {
    return bigintt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBigintt(String newBigintt)
  {
    String oldBigintt = bigintt;
    bigintt = newBigintt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlCrudPackage.COLUMN_TIPO_ENUM__BIGINTT, oldBigintt, bigintt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBooleant()
  {
    return booleant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBooleant(String newBooleant)
  {
    String oldBooleant = booleant;
    booleant = newBooleant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlCrudPackage.COLUMN_TIPO_ENUM__BOOLEANT, oldBooleant, booleant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRealt()
  {
    return realt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRealt(String newRealt)
  {
    String oldRealt = realt;
    realt = newRealt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlCrudPackage.COLUMN_TIPO_ENUM__REALT, oldRealt, realt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFloatt()
  {
    return floatt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFloatt(String newFloatt)
  {
    String oldFloatt = floatt;
    floatt = newFloatt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlCrudPackage.COLUMN_TIPO_ENUM__FLOATT, oldFloatt, floatt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binary getBinaryt()
  {
    return binaryt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinaryt(Binary newBinaryt, NotificationChain msgs)
  {
    Binary oldBinaryt = binaryt;
    binaryt = newBinaryt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlCrudPackage.COLUMN_TIPO_ENUM__BINARYT, oldBinaryt, newBinaryt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinaryt(Binary newBinaryt)
  {
    if (newBinaryt != binaryt)
    {
      NotificationChain msgs = null;
      if (binaryt != null)
        msgs = ((InternalEObject)binaryt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlCrudPackage.COLUMN_TIPO_ENUM__BINARYT, null, msgs);
      if (newBinaryt != null)
        msgs = ((InternalEObject)newBinaryt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlCrudPackage.COLUMN_TIPO_ENUM__BINARYT, null, msgs);
      msgs = basicSetBinaryt(newBinaryt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlCrudPackage.COLUMN_TIPO_ENUM__BINARYT, newBinaryt, newBinaryt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binary getVarbinaryt()
  {
    return varbinaryt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarbinaryt(Binary newVarbinaryt, NotificationChain msgs)
  {
    Binary oldVarbinaryt = varbinaryt;
    varbinaryt = newVarbinaryt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlCrudPackage.COLUMN_TIPO_ENUM__VARBINARYT, oldVarbinaryt, newVarbinaryt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarbinaryt(Binary newVarbinaryt)
  {
    if (newVarbinaryt != varbinaryt)
    {
      NotificationChain msgs = null;
      if (varbinaryt != null)
        msgs = ((InternalEObject)varbinaryt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlCrudPackage.COLUMN_TIPO_ENUM__VARBINARYT, null, msgs);
      if (newVarbinaryt != null)
        msgs = ((InternalEObject)newVarbinaryt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlCrudPackage.COLUMN_TIPO_ENUM__VARBINARYT, null, msgs);
      msgs = basicSetVarbinaryt(newVarbinaryt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlCrudPackage.COLUMN_TIPO_ENUM__VARBINARYT, newVarbinaryt, newVarbinaryt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDatet()
  {
    return datet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatet(String newDatet)
  {
    String oldDatet = datet;
    datet = newDatet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlCrudPackage.COLUMN_TIPO_ENUM__DATET, oldDatet, datet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTimestampt()
  {
    return timestampt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimestampt(String newTimestampt)
  {
    String oldTimestampt = timestampt;
    timestampt = newTimestampt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlCrudPackage.COLUMN_TIPO_ENUM__TIMESTAMPT, oldTimestampt, timestampt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMultisett()
  {
    return multisett;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultisett(String newMultisett)
  {
    String oldMultisett = multisett;
    multisett = newMultisett;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlCrudPackage.COLUMN_TIPO_ENUM__MULTISETT, oldMultisett, multisett));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getXmlt()
  {
    return xmlt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXmlt(String newXmlt)
  {
    String oldXmlt = xmlt;
    xmlt = newXmlt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlCrudPackage.COLUMN_TIPO_ENUM__XMLT, oldXmlt, xmlt));
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
      case SqlCrudPackage.COLUMN_TIPO_ENUM__VARCHART:
        return basicSetVarchart(null, msgs);
      case SqlCrudPackage.COLUMN_TIPO_ENUM__BINARYT:
        return basicSetBinaryt(null, msgs);
      case SqlCrudPackage.COLUMN_TIPO_ENUM__VARBINARYT:
        return basicSetVarbinaryt(null, msgs);
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
      case SqlCrudPackage.COLUMN_TIPO_ENUM__INTT:
        return getIntt();
      case SqlCrudPackage.COLUMN_TIPO_ENUM__VARCHART:
        return getVarchart();
      case SqlCrudPackage.COLUMN_TIPO_ENUM__SMALLINTT:
        return getSmallintt();
      case SqlCrudPackage.COLUMN_TIPO_ENUM__BIGINTT:
        return getBigintt();
      case SqlCrudPackage.COLUMN_TIPO_ENUM__BOOLEANT:
        return getBooleant();
      case SqlCrudPackage.COLUMN_TIPO_ENUM__REALT:
        return getRealt();
      case SqlCrudPackage.COLUMN_TIPO_ENUM__FLOATT:
        return getFloatt();
      case SqlCrudPackage.COLUMN_TIPO_ENUM__BINARYT:
        return getBinaryt();
      case SqlCrudPackage.COLUMN_TIPO_ENUM__VARBINARYT:
        return getVarbinaryt();
      case SqlCrudPackage.COLUMN_TIPO_ENUM__DATET:
        return getDatet();
      case SqlCrudPackage.COLUMN_TIPO_ENUM__TIMESTAMPT:
        return getTimestampt();
      case SqlCrudPackage.COLUMN_TIPO_ENUM__MULTISETT:
        return getMultisett();
      case SqlCrudPackage.COLUMN_TIPO_ENUM__XMLT:
        return getXmlt();
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
      case SqlCrudPackage.COLUMN_TIPO_ENUM__INTT:
        setIntt((String)newValue);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__VARCHART:
        setVarchart((Varchar)newValue);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__SMALLINTT:
        setSmallintt((String)newValue);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__BIGINTT:
        setBigintt((String)newValue);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__BOOLEANT:
        setBooleant((String)newValue);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__REALT:
        setRealt((String)newValue);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__FLOATT:
        setFloatt((String)newValue);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__BINARYT:
        setBinaryt((Binary)newValue);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__VARBINARYT:
        setVarbinaryt((Binary)newValue);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__DATET:
        setDatet((String)newValue);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__TIMESTAMPT:
        setTimestampt((String)newValue);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__MULTISETT:
        setMultisett((String)newValue);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__XMLT:
        setXmlt((String)newValue);
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
      case SqlCrudPackage.COLUMN_TIPO_ENUM__INTT:
        setIntt(INTT_EDEFAULT);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__VARCHART:
        setVarchart((Varchar)null);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__SMALLINTT:
        setSmallintt(SMALLINTT_EDEFAULT);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__BIGINTT:
        setBigintt(BIGINTT_EDEFAULT);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__BOOLEANT:
        setBooleant(BOOLEANT_EDEFAULT);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__REALT:
        setRealt(REALT_EDEFAULT);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__FLOATT:
        setFloatt(FLOATT_EDEFAULT);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__BINARYT:
        setBinaryt((Binary)null);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__VARBINARYT:
        setVarbinaryt((Binary)null);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__DATET:
        setDatet(DATET_EDEFAULT);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__TIMESTAMPT:
        setTimestampt(TIMESTAMPT_EDEFAULT);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__MULTISETT:
        setMultisett(MULTISETT_EDEFAULT);
        return;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__XMLT:
        setXmlt(XMLT_EDEFAULT);
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
      case SqlCrudPackage.COLUMN_TIPO_ENUM__INTT:
        return INTT_EDEFAULT == null ? intt != null : !INTT_EDEFAULT.equals(intt);
      case SqlCrudPackage.COLUMN_TIPO_ENUM__VARCHART:
        return varchart != null;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__SMALLINTT:
        return SMALLINTT_EDEFAULT == null ? smallintt != null : !SMALLINTT_EDEFAULT.equals(smallintt);
      case SqlCrudPackage.COLUMN_TIPO_ENUM__BIGINTT:
        return BIGINTT_EDEFAULT == null ? bigintt != null : !BIGINTT_EDEFAULT.equals(bigintt);
      case SqlCrudPackage.COLUMN_TIPO_ENUM__BOOLEANT:
        return BOOLEANT_EDEFAULT == null ? booleant != null : !BOOLEANT_EDEFAULT.equals(booleant);
      case SqlCrudPackage.COLUMN_TIPO_ENUM__REALT:
        return REALT_EDEFAULT == null ? realt != null : !REALT_EDEFAULT.equals(realt);
      case SqlCrudPackage.COLUMN_TIPO_ENUM__FLOATT:
        return FLOATT_EDEFAULT == null ? floatt != null : !FLOATT_EDEFAULT.equals(floatt);
      case SqlCrudPackage.COLUMN_TIPO_ENUM__BINARYT:
        return binaryt != null;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__VARBINARYT:
        return varbinaryt != null;
      case SqlCrudPackage.COLUMN_TIPO_ENUM__DATET:
        return DATET_EDEFAULT == null ? datet != null : !DATET_EDEFAULT.equals(datet);
      case SqlCrudPackage.COLUMN_TIPO_ENUM__TIMESTAMPT:
        return TIMESTAMPT_EDEFAULT == null ? timestampt != null : !TIMESTAMPT_EDEFAULT.equals(timestampt);
      case SqlCrudPackage.COLUMN_TIPO_ENUM__MULTISETT:
        return MULTISETT_EDEFAULT == null ? multisett != null : !MULTISETT_EDEFAULT.equals(multisett);
      case SqlCrudPackage.COLUMN_TIPO_ENUM__XMLT:
        return XMLT_EDEFAULT == null ? xmlt != null : !XMLT_EDEFAULT.equals(xmlt);
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
    result.append(" (intt: ");
    result.append(intt);
    result.append(", smallintt: ");
    result.append(smallintt);
    result.append(", bigintt: ");
    result.append(bigintt);
    result.append(", booleant: ");
    result.append(booleant);
    result.append(", realt: ");
    result.append(realt);
    result.append(", floatt: ");
    result.append(floatt);
    result.append(", datet: ");
    result.append(datet);
    result.append(", timestampt: ");
    result.append(timestampt);
    result.append(", multisett: ");
    result.append(multisett);
    result.append(", xmlt: ");
    result.append(xmlt);
    result.append(')');
    return result.toString();
  }

} //ColumnTipoEnumImpl
