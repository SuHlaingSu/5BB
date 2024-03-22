package com.fivebb.shared.db;

import java.lang.System;

@androidx.room.Database(entities = {com.fivebb.shared.vos.LoginHistroyVO.class, com.fivebb.shared.vos.AppVersionVO.class}, version = 3, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/fivebb/shared/db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "appVersionDao", "Lcom/fivebb/shared/dao/AppVersionDao;", "loginHistoryDao", "Lcom/fivebb/shared/dao/LoginHistoryDao;", "Companion", "shared_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.shared.db.AppDatabase.Companion Companion = null;
    private static final java.lang.String DB_NAME = "FIVEBB.DB";
    private static com.fivebb.shared.db.AppDatabase INSTANCE;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fivebb.shared.dao.LoginHistoryDao loginHistoryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fivebb.shared.dao.AppVersionDao appVersionDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/fivebb/shared/db/AppDatabase$Companion;", "", "()V", "DB_NAME", "", "INSTANCE", "Lcom/fivebb/shared/db/AppDatabase;", "deleteInstance", "", "getDatabase", "context", "Landroid/content/Context;", "shared_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.fivebb.shared.db.AppDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final void deleteInstance() {
        }
    }
}