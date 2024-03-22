package com.fivebb.shared.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.fivebb.shared.vos.AppVersionVO;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.concurrent.Callable;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppVersionDao_Impl implements AppVersionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AppVersionVO> __insertionAdapterOfAppVersionVO;

  public AppVersionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAppVersionVO = new EntityInsertionAdapter<AppVersionVO>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `app_version` (`id`,`appID`,`appVersion`,`isForceToUpdate`,`publishDate`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppVersionVO value) {
        stmt.bindLong(1, value.getId());
        if (value.getAppID() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAppID());
        }
        if (value.getAppVersion() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAppVersion());
        }
        final int _tmp;
        _tmp = value.isForceToUpdate() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        if (value.getPublishDate() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPublishDate());
        }
      }
    };
  }

  @Override
  public void saveAppVersion(final AppVersionVO data) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAppVersionVO.insert(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<AppVersionVO> getAppVersion() {
    final String _sql = "select * from app_version";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"app_version"}, false, new Callable<AppVersionVO>() {
      @Override
      public AppVersionVO call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAppID = CursorUtil.getColumnIndexOrThrow(_cursor, "appID");
          final int _cursorIndexOfAppVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "appVersion");
          final int _cursorIndexOfIsForceToUpdate = CursorUtil.getColumnIndexOrThrow(_cursor, "isForceToUpdate");
          final int _cursorIndexOfPublishDate = CursorUtil.getColumnIndexOrThrow(_cursor, "publishDate");
          final AppVersionVO _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpAppID;
            _tmpAppID = _cursor.getString(_cursorIndexOfAppID);
            final String _tmpAppVersion;
            _tmpAppVersion = _cursor.getString(_cursorIndexOfAppVersion);
            final boolean _tmpIsForceToUpdate;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsForceToUpdate);
            _tmpIsForceToUpdate = _tmp != 0;
            final String _tmpPublishDate;
            _tmpPublishDate = _cursor.getString(_cursorIndexOfPublishDate);
            _result = new AppVersionVO(_tmpId,_tmpAppID,_tmpAppVersion,_tmpIsForceToUpdate,_tmpPublishDate);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
