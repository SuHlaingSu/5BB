package com.fivebb.shared.vos

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class CurrentPlanVO (
    @SerializedName("AdvancePaymentFormID")
    var adv_id : Int = 0,

    @SerializedName("ID")
    var id : Int = 0,

    @SerializedName("PromoName_Eng")
    var promo_name_eng : String? = null,

    @SerializedName("PromoName_MM")
    var promo_name_mm : String? = null,

    @SerializedName("PlanName")
    var plan_name : String? = null,

    @SerializedName("Price")
    var price : String? = null,

    @SerializedName("Amount")
    var amount : String? = null,

    @SerializedName("BankForPayment")
    var bankForPayment : String? = null,

    @SerializedName("TaxPercentage")
    var taxPercentage : Int = 0,

    @SerializedName("TaxAmount")
    var taxAmt:String? = null,

    @SerializedName("TotalAmount")
    var totAmt:String? = null

):Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readInt()?:0,
        parcel.readString()?:"",
        parcel.readString()?:""
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(adv_id)
        parcel.writeInt(id)
        parcel.writeString(promo_name_eng)
        parcel.writeString(promo_name_mm)
        parcel.writeString(plan_name)
        parcel.writeString(price)
        parcel.writeString(amount)
        parcel.writeString(bankForPayment)
        parcel.writeInt(taxPercentage)
        parcel.writeString(taxAmt)
        parcel.writeString(totAmt)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CurrentPlanVO> {
        override fun createFromParcel(parcel: Parcel): CurrentPlanVO {
            return CurrentPlanVO(parcel)
        }

        override fun newArray(size: Int): Array<CurrentPlanVO?> {
            return arrayOfNulls(size)
        }
    }

}