package com.fivebb.shared.vos

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class TransactionDetailsVO(
    @SerializedName("CustAccNo")
    val accountNo: String = "",
    @SerializedName("BillInvoiceNo")
    val bill_invoice: String = "",
    @SerializedName("BillMonth")
    val bill_month: String = "",
    @SerializedName("Type")
    val type: String = "",
    @SerializedName("Amount")
    val amount: String = "",
    @SerializedName("PaymentMethod")
    val payment: String = "",
    @SerializedName("TransactionDate")
    val transaction_time: String = "",
    @SerializedName("CurrencyAlias")
    val currency_alias: String = " "

) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:""
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(accountNo)
        parcel.writeString(bill_invoice)
        parcel.writeString(bill_month)
        parcel.writeString(type)
        parcel.writeString(amount)
        parcel.writeString(payment)
        parcel.writeString(transaction_time)
        parcel.writeString(currency_alias)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TransactionDetailsVO> {
        override fun createFromParcel(parcel: Parcel): TransactionDetailsVO {
            return TransactionDetailsVO(parcel)
        }

        override fun newArray(size: Int): Array<TransactionDetailsVO?> {
            return arrayOfNulls(size)
        }
    }
}