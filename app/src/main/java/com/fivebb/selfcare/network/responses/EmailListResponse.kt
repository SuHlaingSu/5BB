package com.fivebb.selfcare.network.responses

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class EmailListResponse(
    @SerializedName("Email")
    var email : String = "",
    @SerializedName("IsPrimary")
    var isPrimary : Boolean,
    @SerializedName("isSelected")
    var isSelected: Boolean = false,
    @SerializedName("IsBSSPrimary")
    var isBSSPrimary : Boolean
):Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString()?:"",
        parcel.readByte() != 0.toByte(),
        parcel.readByte() != 0.toByte(),
        parcel.readByte() != 0.toByte()

        ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(email)
        parcel.writeByte(if (isPrimary) 1 else 0)
        parcel.writeByte(if (isSelected) 1 else 0)
        parcel.writeByte(if (isBSSPrimary) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<EmailListResponse> {
        override fun createFromParcel(parcel: Parcel): EmailListResponse {
            return EmailListResponse(parcel)
        }

        override fun newArray(size: Int): Array<EmailListResponse?> {
            return arrayOfNulls(size)
        }
    }

}
