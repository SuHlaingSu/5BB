package com.fivebb.shared.vos

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class AdvPlanListVO (
    @SerializedName("ID")
    var id:Int = 0,
    @SerializedName("PromoName_Eng")
    var promo_name_eng:String? = null,
    @SerializedName("PromoName_MM")
    var promo_name_mm:String? = null,
    @SerializedName("PlanName")
    var plan_name:String? = null,
    @SerializedName("Price")
    var price:String? = null,
    @SerializedName("Amount")
    var amount:String? = null,
    @SerializedName("CalculateAmount")
    var cal_amt:String? = null,
    @SerializedName("Note")
    var note:String? = null,
    @SerializedName("TaxPercentage")
    var taxPercentage : Int = 0,
    @SerializedName("TaxAmount")
    var taxAmt:String? = null,
    @SerializedName("CalculateTaxAmount")
    var calTaxAmt : Int = 0,
    @SerializedName("TotalAmount")
    var totAmt:String? = null,
    @SerializedName("CalculateTotalAmount")
    var calTotAmt : Int = 0

): Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readInt()?:0,
        parcel.readString()?:"",
        parcel.readInt()?:0,
        parcel.readString()?:"",
        parcel.readInt()?:0

    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(promo_name_eng)
        parcel.writeString(promo_name_mm)
        parcel.writeString(plan_name)
        parcel.writeString(price)
        parcel.writeString(amount)
        parcel.writeString(cal_amt)
        parcel.writeString(note)
        parcel.writeInt(taxPercentage)
        parcel.writeString(taxAmt)
        parcel.writeInt(calTaxAmt)
        parcel.writeString(totAmt)
        parcel.writeInt(calTotAmt)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<AdvPlanListVO> {
        override fun createFromParcel(parcel: Parcel): AdvPlanListVO {
            return AdvPlanListVO(parcel)
        }

        override fun newArray(size: Int): Array<AdvPlanListVO?> {
            return arrayOfNulls(size)
        }
    }

}





