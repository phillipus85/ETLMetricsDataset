package co.edu.uniandes.proyectoautomatizacion.database;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.internal.DaoConfig;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table productoDb.
*/
public class ProductoDbDao extends AbstractDao<ProductoDb, Long> {

    public static final String TABLENAME = "productoDb";

    /**
     * Properties of entity ProductoDb.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Nombre = new Property(1, String.class, "nombre", false, "NOMBRE");
        public final static Property Descripcion = new Property(2, String.class, "descripcion", false, "DESCRIPCION");
        public final static Property Url = new Property(3, String.class, "url", false, "URL");
        public final static Property Imagen1 = new Property(4, String.class, "imagen1", false, "IMAGEN1");
        public final static Property Imagen2 = new Property(5, String.class, "imagen2", false, "IMAGEN2");
        public final static Property CategoriaId = new Property(6, long.class, "categoriaId", false, "CATEGORIA_ID");
    };

    private DaoSession daoSession;

    private Query<ProductoDb> categoriaDb_ProductosQuery;

    public ProductoDbDao(DaoConfig config) {
        super(config);
    }
    
    public ProductoDbDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'productoDb' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'NOMBRE' TEXT," + // 1: nombre
                "'DESCRIPCION' TEXT," + // 2: descripcion
                "'URL' TEXT," + // 3: url
                "'IMAGEN1' TEXT," + // 4: imagen1
                "'IMAGEN2' TEXT," + // 5: imagen2
                "'CATEGORIA_ID' INTEGER NOT NULL );"); // 6: categoriaId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'productoDb'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ProductoDb entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String nombre = entity.getNombre();
        if (nombre != null) {
            stmt.bindString(2, nombre);
        }
 
        String descripcion = entity.getDescripcion();
        if (descripcion != null) {
            stmt.bindString(3, descripcion);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(4, url);
        }
 
        String imagen1 = entity.getImagen1();
        if (imagen1 != null) {
            stmt.bindString(5, imagen1);
        }
 
        String imagen2 = entity.getImagen2();
        if (imagen2 != null) {
            stmt.bindString(6, imagen2);
        }
        stmt.bindLong(7, entity.getCategoriaId());
    }

    @Override
    protected void attachEntity(ProductoDb entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ProductoDb readEntity(Cursor cursor, int offset) {
        ProductoDb entity = new ProductoDb( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // nombre
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // descripcion
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // url
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // imagen1
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // imagen2
            cursor.getLong(offset + 6) // categoriaId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ProductoDb entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNombre(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDescripcion(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUrl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setImagen1(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setImagen2(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCategoriaId(cursor.getLong(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(ProductoDb entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(ProductoDb entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "productos" to-many relationship of CategoriaDb. */
    public List<ProductoDb> _queryCategoriaDb_Productos(Long id) {
        synchronized (this) {
            if (categoriaDb_ProductosQuery == null) {
                QueryBuilder<ProductoDb> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.Id.eq(null));
                categoriaDb_ProductosQuery = queryBuilder.build();
            }
        }
        Query<ProductoDb> query = categoriaDb_ProductosQuery.forCurrentThread();
        query.setParameter(0, id);
        return query.list();
    }

    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getCategoriaDbDao().getAllColumns());
            builder.append(" FROM productoDb T");
            builder.append(" LEFT JOIN categoriaDb T0 ON T.'CATEGORIA_ID'=T0.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected ProductoDb loadCurrentDeep(Cursor cursor, boolean lock) {
        ProductoDb entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        CategoriaDb categoriaDb = loadCurrentOther(daoSession.getCategoriaDbDao(), cursor, offset);
         if(categoriaDb != null) {
            entity.setCategoriaDb(categoriaDb);
        }

        return entity;    
    }

    public ProductoDb loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<ProductoDb> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<ProductoDb> list = new ArrayList<ProductoDb>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<ProductoDb> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<ProductoDb> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
