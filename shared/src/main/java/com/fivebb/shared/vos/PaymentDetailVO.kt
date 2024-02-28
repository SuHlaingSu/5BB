package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class PaymentDetailVO(

    @SerializedName("paymentDetail")
    var paymentDetail: MutableList<PaymentHistoryVO>?
)