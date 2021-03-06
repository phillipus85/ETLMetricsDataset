/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.sQL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.sQL.SQLFactory
 * @model kind="package"
 * @generated
 */
public interface SQLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sQL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://uniandes.edu.co/sqlCrud";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sQL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SQLPackage eINSTANCE = org.xtext.example.mydsl.sQL.impl.SQLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.sQL.impl.DatabaseImpl <em>Database</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.sQL.impl.DatabaseImpl
   * @see org.xtext.example.mydsl.sQL.impl.SQLPackageImpl#getDatabase()
   * @generated
   */
  int DATABASE = 0;

  /**
   * The feature id for the '<em><b>Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE__TABLES = 0;

  /**
   * The number of structural features of the '<em>Database</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.sQL.impl.TableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.sQL.impl.TableImpl
   * @see org.xtext.example.mydsl.sQL.impl.SQLPackageImpl#getTable()
   * @generated
   */
  int TABLE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__COLUMNS = 1;

  /**
   * The feature id for the '<em><b>Primary Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__PRIMARY_KEY = 2;

  /**
   * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__FOREIGN_KEYS = 3;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.sQL.impl.ColumnImpl <em>Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.sQL.impl.ColumnImpl
   * @see org.xtext.example.mydsl.sQL.impl.SQLPackageImpl#getColumn()
   * @generated
   */
  int COLUMN = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__NAME = 0;

  /**
   * The feature id for the '<em><b>Data Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__DATA_TYPE = 1;

  /**
   * The feature id for the '<em><b>Not Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__NOT_NULL = 2;

  /**
   * The number of structural features of the '<em>Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.sQL.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.sQL.impl.PrimaryKeyImpl
   * @see org.xtext.example.mydsl.sQL.impl.SQLPackageImpl#getPrimaryKey()
   * @generated
   */
  int PRIMARY_KEY = 3;

  /**
   * The feature id for the '<em><b>Columns</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_KEY__COLUMNS = 0;

  /**
   * The number of structural features of the '<em>Primary Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_KEY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.sQL.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.sQL.impl.ForeignKeyImpl
   * @see org.xtext.example.mydsl.sQL.impl.SQLPackageImpl#getForeignKey()
   * @generated
   */
  int FOREIGN_KEY = 4;

  /**
   * The feature id for the '<em><b>Columns</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY__COLUMNS = 0;

  /**
   * The feature id for the '<em><b>Ref Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY__REF_TABLE = 1;

  /**
   * The feature id for the '<em><b>Ref Columns</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY__REF_COLUMNS = 2;

  /**
   * The number of structural features of the '<em>Foreign Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.sQL.Database <em>Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database</em>'.
   * @see org.xtext.example.mydsl.sQL.Database
   * @generated
   */
  EClass getDatabase();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.sQL.Database#getTables <em>Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tables</em>'.
   * @see org.xtext.example.mydsl.sQL.Database#getTables()
   * @see #getDatabase()
   * @generated
   */
  EReference getDatabase_Tables();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.sQL.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table</em>'.
   * @see org.xtext.example.mydsl.sQL.Table
   * @generated
   */
  EClass getTable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.sQL.Table#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.sQL.Table#getName()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.sQL.Table#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see org.xtext.example.mydsl.sQL.Table#getColumns()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Columns();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.sQL.Table#getPrimaryKey <em>Primary Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary Key</em>'.
   * @see org.xtext.example.mydsl.sQL.Table#getPrimaryKey()
   * @see #getTable()
   * @generated
   */
  EReference getTable_PrimaryKey();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.sQL.Table#getForeignKeys <em>Foreign Keys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
   * @see org.xtext.example.mydsl.sQL.Table#getForeignKeys()
   * @see #getTable()
   * @generated
   */
  EReference getTable_ForeignKeys();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.sQL.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column</em>'.
   * @see org.xtext.example.mydsl.sQL.Column
   * @generated
   */
  EClass getColumn();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.sQL.Column#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.sQL.Column#getName()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.sQL.Column#getDataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data Type</em>'.
   * @see org.xtext.example.mydsl.sQL.Column#getDataType()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_DataType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.sQL.Column#getNotNull <em>Not Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not Null</em>'.
   * @see org.xtext.example.mydsl.sQL.Column#getNotNull()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_NotNull();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.sQL.PrimaryKey <em>Primary Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Key</em>'.
   * @see org.xtext.example.mydsl.sQL.PrimaryKey
   * @generated
   */
  EClass getPrimaryKey();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl.sQL.PrimaryKey#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Columns</em>'.
   * @see org.xtext.example.mydsl.sQL.PrimaryKey#getColumns()
   * @see #getPrimaryKey()
   * @generated
   */
  EReference getPrimaryKey_Columns();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.sQL.ForeignKey <em>Foreign Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Foreign Key</em>'.
   * @see org.xtext.example.mydsl.sQL.ForeignKey
   * @generated
   */
  EClass getForeignKey();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl.sQL.ForeignKey#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Columns</em>'.
   * @see org.xtext.example.mydsl.sQL.ForeignKey#getColumns()
   * @see #getForeignKey()
   * @generated
   */
  EReference getForeignKey_Columns();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.sQL.ForeignKey#getRefTable <em>Ref Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Table</em>'.
   * @see org.xtext.example.mydsl.sQL.ForeignKey#getRefTable()
   * @see #getForeignKey()
   * @generated
   */
  EReference getForeignKey_RefTable();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl.sQL.ForeignKey#getRefColumns <em>Ref Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Ref Columns</em>'.
   * @see org.xtext.example.mydsl.sQL.ForeignKey#getRefColumns()
   * @see #getForeignKey()
   * @generated
   */
  EReference getForeignKey_RefColumns();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SQLFactory getSQLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.sQL.impl.DatabaseImpl <em>Database</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.sQL.impl.DatabaseImpl
     * @see org.xtext.example.mydsl.sQL.impl.SQLPackageImpl#getDatabase()
     * @generated
     */
    EClass DATABASE = eINSTANCE.getDatabase();

    /**
     * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE__TABLES = eINSTANCE.getDatabase_Tables();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.sQL.impl.TableImpl <em>Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.sQL.impl.TableImpl
     * @see org.xtext.example.mydsl.sQL.impl.SQLPackageImpl#getTable()
     * @generated
     */
    EClass TABLE = eINSTANCE.getTable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

    /**
     * The meta object literal for the '<em><b>Primary Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__PRIMARY_KEY = eINSTANCE.getTable_PrimaryKey();

    /**
     * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__FOREIGN_KEYS = eINSTANCE.getTable_ForeignKeys();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.sQL.impl.ColumnImpl <em>Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.sQL.impl.ColumnImpl
     * @see org.xtext.example.mydsl.sQL.impl.SQLPackageImpl#getColumn()
     * @generated
     */
    EClass COLUMN = eINSTANCE.getColumn();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

    /**
     * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__DATA_TYPE = eINSTANCE.getColumn_DataType();

    /**
     * The meta object literal for the '<em><b>Not Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__NOT_NULL = eINSTANCE.getColumn_NotNull();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.sQL.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.sQL.impl.PrimaryKeyImpl
     * @see org.xtext.example.mydsl.sQL.impl.SQLPackageImpl#getPrimaryKey()
     * @generated
     */
    EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_KEY__COLUMNS = eINSTANCE.getPrimaryKey_Columns();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.sQL.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.sQL.impl.ForeignKeyImpl
     * @see org.xtext.example.mydsl.sQL.impl.SQLPackageImpl#getForeignKey()
     * @generated
     */
    EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREIGN_KEY__COLUMNS = eINSTANCE.getForeignKey_Columns();

    /**
     * The meta object literal for the '<em><b>Ref Table</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREIGN_KEY__REF_TABLE = eINSTANCE.getForeignKey_RefTable();

    /**
     * The meta object literal for the '<em><b>Ref Columns</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREIGN_KEY__REF_COLUMNS = eINSTANCE.getForeignKey_RefColumns();

  }

} //SQLPackage
