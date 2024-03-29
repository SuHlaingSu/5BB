package com.fivebb.shared.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\'\u00a8\u0006\b"}, d2 = {"Lcom/fivebb/shared/dao/AppVersionDao;", "", "getAppVersion", "Landroidx/lifecycle/LiveData;", "Lcom/fivebb/shared/vos/AppVersionVO;", "saveAppVersion", "", "data", "shared_release"})
public abstract interface AppVersionDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from app_version")
    public abstract androidx.lifecycle.LiveData<com.fivebb.shared.vos.AppVersionVO> getAppVersion();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void saveAppVersion(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.AppVersionVO data);
}