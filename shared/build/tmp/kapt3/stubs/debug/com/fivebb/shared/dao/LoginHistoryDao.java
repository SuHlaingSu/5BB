package com.fivebb.shared.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/fivebb/shared/dao/LoginHistoryDao;", "", "deleteAllLoginHistory", "", "getLoginHistory", "Landroidx/lifecycle/LiveData;", "", "Lcom/fivebb/shared/vos/LoginHistroyVO;", "insertLoginHistory", "", "history", "shared_debug"})
public abstract interface LoginHistoryDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insertLoginHistory(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.LoginHistroyVO history);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from login_history")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.fivebb.shared.vos.LoginHistroyVO>> getLoginHistory();
    
    @androidx.room.Query(value = "delete from login_history")
    public abstract void deleteAllLoginHistory();
}