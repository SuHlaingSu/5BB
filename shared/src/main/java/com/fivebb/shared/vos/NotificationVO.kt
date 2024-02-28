package com.fivebb.shared.vos

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class NotificationVO(
    @SerializedName("ID")
    val id: Int = 0,
    @SerializedName("Title")
    val title: String = "",
    @SerializedName("Content")
    val content: String = "",
    @SerializedName("Description")
    val description: String = "",
    @SerializedName("SentDate")
    val sentDate: String = "",
    @SerializedName("Category")
    val category: String = "",
    @SerializedName("InfoImageUrl")
    val image_url: String = "",
    @SerializedName("PromoUrl")
    val promo_url: String = "",
    @SerializedName("Detail")
    val item: TransactionDetailsVO? = null,
    @SerializedName("IsRead")
    var isRead: Boolean,
    @SerializedName("isSelected")
    var isSelected: Boolean = false

) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readParcelable(TransactionDetailsVO::class.java.classLoader),
        parcel.readByte() != 0.toByte(),
        parcel.readByte() != 0.toByte()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(title)
        parcel.writeString(content)
        parcel.writeString(description)
        parcel.writeString(sentDate)
        parcel.writeString(category)
        parcel.writeString(image_url)
        parcel.writeString(promo_url)
        parcel.writeParcelable(item, flags)
        parcel.writeByte(if (isRead) 1 else 0)
        parcel.writeByte(if (isSelected) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<NotificationVO> {
        override fun createFromParcel(parcel: Parcel): NotificationVO {
            return NotificationVO(parcel)
        }

        override fun newArray(size: Int): Array<NotificationVO?> {
            return arrayOfNulls(size)
        }
    }

}