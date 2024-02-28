package com.fivebb.shared.vos

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class PXPlanVO (
    @SerializedName("PackageID")
    var id: String = "",

    @SerializedName("PlanName")
    var plan_name: String = "",

    @SerializedName("FullName")
    var full_name: String? = "",

    @SerializedName("PkgDisplayName")
    var pkg_display_name: String = "",

    @SerializedName("Price")
    var price: Int = 0,

    @SerializedName("Amount")
    var amount: String = "",

    @SerializedName("CalculateAmount")
    var calc_amt: Int = 0,

    @SerializedName("TaxPercentage")
    var tax_percent: Int = 0,

    @SerializedName("TaxAmount")
    var tax_amt: String = "",

    @SerializedName("CalculateTaxAmount")
    var calc_tax_amt: Int = 0,

    @SerializedName("TotalAmount")
    var total_amt: String = "",

    @SerializedName("CalculateTotalAmount")
    var calc_total_amt: Int = 0,

    @SerializedName("DownloadSpeed")
    var down_speed: String = "",

    @SerializedName("UploadSpeed")
    var up_speed: String = "",

    @SerializedName("Validity")
    var validity: Int = 0,

    @SerializedName("PromoDay")
    var promo_day :Int = 0,

    @SerializedName("ValidityLabel")
    var validity_txt: String = "",

    @SerializedName("SortOrder")
    var sort_order :Int = 0

):Parcelable{
    constructor(parcel: Parcel):this(
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
                parcel.readInt()?:0
        ){
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(plan_name)
        parcel.writeString(full_name)
        parcel.writeString(pkg_display_name)
        parcel.writeInt(price)
        parcel.writeString(amount)
        parcel.writeInt(calc_amt)
        parcel.writeInt(tax_percent)
        parcel.writeString(tax_amt)
        parcel.writeInt(calc_tax_amt)
        parcel.writeString(total_amt)
        parcel.writeInt(calc_total_amt)
        parcel.writeString(down_speed)
        parcel.writeString(up_speed)
        parcel.writeInt(validity)
        parcel.writeInt(promo_day)
        parcel.writeString(validity_txt)
        parcel.writeInt(sort_order)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PXPlanVO> {
        override fun createFromParcel(parcel: Parcel): PXPlanVO {
            return PXPlanVO(parcel)
        }

        override fun newArray(size: Int): Array<PXPlanVO?> {
            return arrayOfNulls(size)
        }
    }
}