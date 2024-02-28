package com.fivebb.shared.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.fivebb.shared.dao.AppVersionDao;
import com.fivebb.shared.dao.AppVersionDao_Impl;
import com.fivebb.shared.dao.LoginHistoryDao;
import com.fivebb.shared.dao.LoginHistoryDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile LoginHistoryDao _loginHistoryDao;

  private volatile AppVersionDao _appVersionDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `login_history` (`username` TEXT NOT NULL, `password` TEXT NOT NULL, PRIMARY KEY(`username`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `app_version` (`id` INTEGER NOT NULL, `appID` TEXT NOT NULL, `appVersion` TEXT NOT NULL, `isForceToUpdate` INTEGER NOT NULL, `publishDate` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '69b04206680c9dd8bd152721082726d4')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `login_history`");
        _db.execSQL("DROP TABLE IF EXISTS `app_version`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsLoginHistory = new HashMap<String, TableInfo.Column>(2);
        _columnsLoginHistory.put("username", new TableInfo.Column("username", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLoginHistory.put("password", new TableInfo.Column("password", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLoginHistory = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLoginHistory = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLoginHistory = new TableInfo("login_history", _columnsLoginHistory, _foreignKeysLoginHistory, _indicesLoginHistory);
        final TableInfo _existingLoginHistory = TableInfo.read(_db, "login_history");
        if (! _infoLoginHistory.equals(_existingLoginHistory)) {
          return new RoomOpenHelper.ValidationResult(false, "login_history(com.fivebb.shared.vos.LoginHistroyVO).\n"
                  + " Expected:\n" + _infoLoginHistory + "\n"
                  + " Found:\n" + _existingLoginHistory);
        }
        final HashMap<String, TableInfo.Column> _columnsAppVersion = new HashMap<String, TableInfo.Column>(5);
        _columnsAppVersion.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAppVersion.put("appID", new TableInfo.Column("appID", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAppVersion.put("appVersion", new TableInfo.Column("appVersion", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAppVersion.put("isForceToUpdate", new TableInfo.Column("isForceToUpdate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAppVersion.put("publishDate", new TableInfo.Column("publishDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAppVersion = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAppVersion = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAppVersion = new TableInfo("app_version", _columnsAppVersion, _foreignKeysAppVersion, _indicesAppVersion);
        final TableInfo _existingAppVersion = TableInfo.read(_db, "app_version");
        if (! _infoAppVersion.equals(_existingAppVersion)) {
          return new RoomOpenHelper.ValidationResult(false, "app_version(com.fivebb.shared.vos.AppVersionVO).\n"
                  + " Expected:\n" + _infoAppVersion + "\n"
                  + " Found:\n" + _existingAppVersion);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "69b04206680c9dd8bd152721082726d4", "3f805a3de89361d21a1aca63f56d387f");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "login_history","app_version");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `login_history`");
      _db.execSQL("DELETE FROM `app_version`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public LoginHistoryDao loginHistoryDao() {
    if (_loginHistoryDao != null) {
      return _loginHistoryDao;
    } else {
      synchronized(this) {
        if(_loginHistoryDao == null) {
          _loginHistoryDao = new LoginHistoryDao_Impl(this);
        }
        return _loginHistoryDao;
      }
    }
  }

  @Override
  public AppVersionDao appVersionDao() {
    if (_appVersionDao != null) {
      return _appVersionDao;
    } else {
      synchronized(this) {
        if(_appVersionDao == null) {
          _appVersionDao = new AppVersionDao_Impl(this);
        }
        return _appVersionDao;
      }
    }
  }
}
