package com.fivebb.shared.vos

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class RechargeVO (
    @SerializedName("planID")
    var plan_id: String = "",

    @SerializedName("planName")
    var plan_name: String = "",

    @SerializedName("FullName")
    var fullname: String = "",

    @SerializedName("CalculatePrice")
    var cal_price: Double = 0.0,

    @SerializedName("Price")
    var price: String = "",

    @SerializedName("SortOrder")
    var sorting: Int = 0,

    @SerializedName("DownloadSpeed")
    var speed: String = "",

    @SerializedName("Quota")
    var quota: Int = 0,

    @SerializedName("Validity")
    var validity: Int = 0,

    @SerializedName("Label")
    var flag: String = ""

):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readDouble()?:0.0,
        parcel.readString()?:"",
        parcel.readInt()?:0,
        parcel.readString()?:"",
        parcel.readInt()?:0,
        parcel.readInt()?:0,
        parcel.readString()?:""
        ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(plan_id)
        parcel.writeString(plan_name)
        parcel.writeString(fullname)
        parcel.writeDouble(cal_price)
        parcel.writeString(price)
        parcel.writeInt(sorting)
        parcel.writeString(speed)
        parcel.writeInt(quota)
        parcel.writeInt(validity)
        parcel.writeString(flag)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<RechargeVO> {
        override fun createFromParcel(parcel: Parcel): RechargeVO {
            return RechargeVO(parcel)
        }

        override fun newArray(size: Int): Array<RechargeVO?> {
            return arrayOfNulls(size)
        }
    }
}