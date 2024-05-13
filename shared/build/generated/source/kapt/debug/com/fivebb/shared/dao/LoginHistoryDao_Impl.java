package com.fivebb.shared.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.fivebb.shared.vos.LoginHistroyVO;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class LoginHistoryDao_Impl implements LoginHistoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LoginHistroyVO> __insertionAdapterOfLoginHistroyVO;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllLoginHistory;

  public LoginHistoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLoginHistroyVO = new EntityInsertionAdapter<LoginHistroyVO>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `login_history` (`username`,`password`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LoginHistroyVO value) {
        if (value.getUsername() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUsername());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPassword());
        }
      }
    };
    this.__preparedStmtOfDeleteAllLoginHistory = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from login_history";
        return _query;
      }
    };
  }

  @Override
  public long insertLoginHistory(final LoginHistroyVO history) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfLoginHistroyVO.insertAndReturnId(history);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllLoginHistory() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllLoginHistory.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllLoginHistory.release(_stmt);
    }
  }

  @Override
  public LiveData<List<LoginHistroyVO>> getLoginHistory() {
    final String _sql = "select * from login_history";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"login_history"}, false, new Callable<List<LoginHistroyVO>>() {
      @Override
      public List<LoginHistroyVO> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
          final List<LoginHistroyVO> _result = new ArrayList<LoginHistroyVO>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final LoginHistroyVO _item;
            final String _tmpUsername;
            _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            final String _tmpPassword;
            _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
            _item = new LoginHistroyVO(_tmpUsername,_tmpPassword);
            _result.add(_item);
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
