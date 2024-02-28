package com.fivebb.shared.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.fivebb.shared.dao.AppVersionDao
import com.fivebb.shared.dao.LoginHistoryDao
import com.fivebb.shared.vos.AppVersionVO
import com.fivebb.shared.vos.LoginHistroyVO

@Database(
    entities = [
        LoginHistroyVO::class,
        AppVersionVO::class], version = 3, exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun loginHistoryDao(): LoginHistoryDao
    abstract fun appVersionDao(): AppVersionDao

    companion object {
        private val DB_NAME = "FIVEBB.DB"

        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    DB_NAME
                )
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()
            }
            return INSTANCE as AppDatabase
        }

        fun deleteInstance() {

        }
    }
}