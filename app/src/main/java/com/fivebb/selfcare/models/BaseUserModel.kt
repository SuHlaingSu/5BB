package com.fivebb.selfcare.models

import android.content.Context
import com.fivebb.selfcare.BuildConfig
import com.fivebb.selfcare.network.BSSApi
import com.fivebb.selfcare.network.MobileAppApi
import com.fivebb.selfcare.network.PaymentApi
import com.fivebb.selfcare.network.UserApi
import com.fivebb.shared.model.BaseModelImpl
import com.fivebb.shared.network.RetrofitProvider

abstract class BaseUserModel(context: Context) : BaseModelImpl() {

    protected var mUserApi: UserApi

    protected var mMobileAppApi: MobileAppApi

    protected var mPaymentApi : PaymentApi

    protected var mBSSApi : BSSApi

    init {
        val retrofit = RetrofitProvider.getRetrofit(BuildConfig.BASE_URL,context)
        mUserApi = retrofit.create(UserApi::class.java)

        val mobileAppRetrofit = RetrofitProvider.getRetrofit(BuildConfig.MOBILE_API_BASE_URL_FIELD,context)
        mMobileAppApi = mobileAppRetrofit.create(MobileAppApi::class.java)

        val paymentRetrofit = RetrofitProvider.getRetrofit(BuildConfig.PAYMENT_API_BASE_URL_FIELD,context)
        mPaymentApi = paymentRetrofit.create(PaymentApi::class.java)

        val bssRetrofit = RetrofitProvider.getRetrofit(BuildConfig.BSS_API_BASE_URL_FIELD,context)
        mBSSApi = bssRetrofit.create(BSSApi::class.java)
    }

}