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
 * DAO for table productoUbicDb.
*/
public class ProductoUbicDbDao extends AbstractDao<ProductoUbicDb, Long> {

    public static final String TABLENAME = "productoUbicDb";

    /**
     * Properties of entity ProductoUbicDb.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Nombre = new Property(1, String.class, "nombre", false, "NOMBRE");
        public final static Property UbicacionId = new Property(2, long.class, "ubicacionId", false, "UBICACION_ID");
    };

    private DaoSession daoSession;

    private Query<ProductoUbicDb> ubicacionDb_ProductosUbicQuery;

    public ProductoUbicDbDao(DaoConfig config) {
        super(config);
    }
    
    public ProductoUbicDbDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'productoUbicDb' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'NOMBRE' TEXT," + // 1: nombre
                "'UBICACION_ID' INTEGER NOT NULL );"); // 2: ubicacionId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'productoUbicDb'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ProductoUbicDb entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String nombre = entity.getNombre();
        if (nombre != null) {
            stmt.bindString(2, nombre);
        }
        stmt.bindLong(3, entity.getUbicacionId());
    }

    @Override
    protected void attachEntity(ProductoUbicDb entity) {
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
    public ProductoUbicDb readEntity(Cursor cursor, int offset) {
        ProductoUbicDb entity = new ProductoUbicDb( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // nombre
            cursor.getLong(offset + 2) // ubicacionId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ProductoUbicDb entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNombre(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUbicacionId(cursor.getLong(offset + 2));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(ProductoUbicDb entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(ProductoUbicDb entity) {
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
    
    /** Internal query to resolve the "productosUbic" to-many relationship of UbicacionDb. */
    public List<ProductoUbicDb> _queryUbicacionDb_ProductosUbic(Long id) {
        synchronized (this) {
            if (ubicacionDb_ProductosUbicQuery == null) {
                QueryBuilder<ProductoUbicDb> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.Id.eq(null));
                ubicacionDb_ProductosUbicQuery = queryBuilder.build();
            }
        }
        Query<ProductoUbicDb> query = ubicacionDb_ProductosUbicQuery.forCurrentThread();
        query.setParameter(0, id);
        return query.list();
    }

    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getUbicacionDbDao().getAllColumns());
            builder.append(" FROM productoUbicDb T");
            builder.append(" LEFT JOIN ubicacionDb T0 ON T.'UBICACION_ID'=T0.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected ProductoUbicDb loadCurrentDeep(Cursor cursor, boolean lock) {
        ProductoUbicDb entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        UbicacionDb ubicacionDb = loadCurrentOther(daoSession.getUbicacionDbDao(), cursor, offset);
         if(ubicacionDb != null) {
            entity.setUbicacionDb(ubicacionDb);
        }

        return entity;    
    }

    public ProductoUbicDb loadDeep(Long key) {
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
    public List<ProductoUbicDb> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<ProductoUbicDb> list = new ArrayList<ProductoUbicDb>(count);
        
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
    
    protected List<ProductoUbicDb> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<ProductoUbicDb> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
