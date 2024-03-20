package com.fivebb.selfcare.mvp.presenters

import android.content.Context
import android.util.Log
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.fivebb.selfcare.BuildConfig
import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.HomeScreenView
import com.fivebb.selfcare.network.requests.DownloadPaymentSlipRequest
import com.fivebb.selfcare.utils.IMAGE_TYPE_ADS
import com.fivebb.selfcare.utils.IMAGE_TYPE_SLIDE
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.mvp.presenters.BasePresenter
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.vos.BillVO
import com.google.gson.Gson

class HomeScreenPresenter : BasePresenter<HomeScreenView, UserModel>() {

    init {
        mModel = UserModelImpl.getInstance()
    }

    private var mBillingList = mutableListOf<BillVO>()

    fun onUiReady(owner: LifecycleOwner){
//        mModel.getAppVersion().observe(owner, Observer {
//            it?.let {
//                val versionName = "Ver ${BuildConfig.VERSION_NAME}"
//                if (versionName!=it.appVersion){
//                    mView.showForceUpdateDialog(it.isForceToUpdate,it.appVersion)
//                }
//            }
//        })

        mModel.loadAppVersion(
            mView.getContext(),
            success = {
                it.let {
                    val versionName = "Ver ${BuildConfig.VERSION_NAME}"
                    Log.i("VersionName",versionName)
                    Log.i("appVersionFromServer",it.appVersion)
                    if (versionName!=it.appVersion){
                        mView.showForceUpdateDialog(it.isForceToUpdate,it.appVersion)
                    }
                }
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            }
        )
    }

    fun loadCustomerBasicViewDetails() {

        mShowProgressLoadingDialogLiveData.postValue(true)

        mModel.getCustomerBasicViewDetails(
            mView.getContext(),
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)

            })
    }

    fun loadPaymentHistory() {
        mShowProgressLoadingDialogLiveData.postValue(true)
        mModel.getPaymentHistory(
            mView.getContext(),
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
            },
            failure = {
            }
        )
    }

    fun onHomeScreenUiReady() {
        mModel.getTopics(
            mView.getContext(),
            success = {
                it.forEach {
                    Log.d("Topic", it.topic)
                }
            },
            failure = {
                Log.d("Error", it)
            }
        )
    }

    fun getAdvPayment()
    {
        mModel.getAdvancePayment(
            context = mView.getContext(),
            success = {
                mView.saveAdvPay(it)
            },
            failure = {

            }
        )
    }

    fun getPXDetails()
    {
        mModel.getPXDetails(
            context = mView.getContext(),
            success = {
                mView.showPXInfo(it)
            },
            failure = {

            }
        )
    }

    fun loadHomeScreenInfo() {
        mShowProgressLoadingDialogLiveData.postValue(true)
        mModel.getDataForHomeScreen(
            mView.getContext(),
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.onUiReady(
                    mutableListOf(),
                    mModel.getLoadedPaymentHistory(),
                    mModel.getLoadedCustomerDetails()?.serviceInstanceDetails?.values?.first(),
                    it
                )
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            }
        )

        mModel.loadAppVersion(
            mView.getContext(),
            success = {
            },
            failure = {

            }
        )
    }

    fun loadAppImageList() {

        mModel.getAppImageList(
            mView.getContext(),
            success = {imageList ->

                imageList.firstOrNull { it.imageType == IMAGE_TYPE_ADS }?.let { adsImage ->
                    mView.showAdsDialog(adsImage)
                }

               val slideList =  imageList.filter { it.imageType == IMAGE_TYPE_SLIDE }
                if (!slideList.isNullOrEmpty()) {
                    mView.bindSliderImage(slideList.toMutableList())
                }

            }, failure = {
               Log.d("App Image List Error ->",it)
            }
        )

    }

    fun loadBillingList(context:Context){
        mModel.getBillList(context,
        success = {
                mView.showBillingList(it)
        },
        failure = {
            _errorLiveData.postValue(it)
        })
    }

    fun onTapProfile(){
        mView.navigateToProfileActivity()
    }

    fun onDownloadPaymentPDF(creditNo: String) {

        mShowProgressLoadingDialogLiveData.postValue(true)
        val request = DownloadPaymentSlipRequest(
           creditNo
        )
        mModel.getInvoicePDF(
            mView.getContext(),
            request,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.afterClickDownload(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            }
        )
    }

    fun onViewPaymentPDF(creditNo:String) {

        mShowProgressLoadingDialogLiveData.postValue(true)
        val request = DownloadPaymentSlipRequest(
           creditNo
        )
        mModel.getInvoicePDF(
            mView.getContext(),
            request,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.viewClickInvoice(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            }
        )
    }

    fun onTapAdvanceTopUp(context:Context){
        mShowProgressLoadingDialogLiveData.postValue(true)
        mModel.getBillList(context,
            success = {
                mView.topUpListener(it)
                mHideProgressLoadingDialogLiveData.postValue(true)
            },
            failure = {
                _errorLiveData.postValue(it)
            })
    }

}