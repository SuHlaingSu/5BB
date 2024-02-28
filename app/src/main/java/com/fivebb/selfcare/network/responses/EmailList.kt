package com.fivebb.selfcare.network.responses

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class EmailList(
    @SerializedName("data")
    var emailList: List<EmailListResponse>?
)
