package com.fivebb.shared.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.fivebb.shared.vos.LoginHistroyVO


@Dao
interface LoginHistoryDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertLoginHistory(history: LoginHistroyVO) : Long

    @Query("select * from login_history")
    fun getLoginHistory(): LiveData<List<LoginHistroyVO>>

    @Query("delete from login_history")
    fun deleteAllLoginHistory()

}