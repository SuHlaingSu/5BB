package com.fivebb.shared.vos

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class PXNextPlanVO (
    @SerializedName("PackageID")
    var packageID : String? = null,

    @SerializedName("PlanName")
    var planName: String? = null,

    @SerializedName("FullName")
    var fullName : String? = null,

    @SerializedName("PkgDisplayName")
    var pkg_displayName : String? = null,

    @SerializedName("Price")
    var price : Int = 0,

    @SerializedName("Amount")
    var amt : String? = null,

    @SerializedName("CalculateAmount")
    var calc_amt : Int = 0,

    @SerializedName("TaxPercentage")
    var tax_percent : Int = 0,

    @SerializedName("TaxAmount")
    var tax_amt : String? = null,

    @SerializedName("CalculateTaxAmount")
    var calc_tax_amt : Int = 0,

    @SerializedName("TotalAmount")
    var tot_amt:String? = null,

    @SerializedName("CalculateTotalAmount")
    var calc_tot_amt:Int = 0,

    @SerializedName("DownloadSpeed")
    var download_speed:String? = null,

    @SerializedName("UploadSpeed")
    var upload_speed:String? = null,

    @SerializedName("Validity")
    var validity:Int = 0,

    @SerializedName("PromoDay")
    var promo_day:Int = 0,

    @SerializedName("ValidityLabel")
    var validity_lbl:String? = null,

    @SerializedName("SortOrder")
    var sort_order:Int = 0,

    @SerializedName("StartDate")
    var startDate:String? = null,

    @SerializedName("EndDate")
    var endDate:String? = null

):Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readInt()?:0,
        parcel.readString()?:"",
        parcel.readInt()?:0,
        parcel.readInt()?:0,
        parcel.readString()?:"",
        parcel.readInt()?:0,
        parcel.readString()?:"",
        parcel.readInt()?:0,
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readInt()?:0,
        parcel.readInt()?:0,
        parcel.readString()?:"",
        parcel.readInt()?:0,
        parcel.readString()?:"",
        parcel.readString()?:""
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(packageID)
        parcel.writeString(planName)
        parcel.writeString(fullName)
        parcel.writeString(pkg_displayName)
        parcel.writeInt(price)
        parcel.writeString(amt)
        parcel.writeInt(calc_amt)
        parcel.writeInt(tax_percent)
        parcel.writeString(tax_amt)
        parcel.writeInt(calc_tax_amt)
        parcel.writeString(tot_amt)
        parcel.writeInt(calc_tot_amt)
        parcel.writeString(download_speed)
        parcel.writeString(upload_speed)
        parcel.writeInt(validity)
        parcel.writeInt(promo_day)
        parcel.writeString(validity_lbl)
        parcel.writeInt(sort_order)
        parcel.writeString(startDate)
        parcel.writeString(endDate)
    }


    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PXNextPlanVO> {
        override fun createFromParcel(parcel: Parcel): PXNextPlanVO {
            return PXNextPlanVO(parcel)
        }

        override fun newArray(size: Int): Array<PXNextPlanVO?> {
            return arrayOfNulls(size)
        }
    }

}