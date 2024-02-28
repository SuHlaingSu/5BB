package com.fivebb.shared.vos

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "app_version")
data class AppVersionVO(

    @PrimaryKey
    val id :Int = 1,

    @SerializedName("AppID")
    val appID:String,

    @SerializedName("AppVersion")
    val appVersion:String,

    @SerializedName("IsForceToUpdate")
    val isForceToUpdate:Boolean,

    @SerializedName("PublishDate")
    val publishDate:String?
) {
}