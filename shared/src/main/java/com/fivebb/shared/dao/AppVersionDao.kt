package com.fivebb.shared.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.fivebb.shared.vos.AppVersionVO

@Dao
interface AppVersionDao {

    @Query("select * from app_version")
    fun getAppVersion():LiveData<AppVersionVO>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveAppVersion(data:AppVersionVO)
}