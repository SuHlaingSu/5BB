package com.fivebb.selfcare.mvp.presenters

import android.content.Context
import com.fivebb.selfcare.delegates.PaymentHistoryFilterActionDelegate
import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.PaymentHistoryView
import com.fivebb.selfcare.network.requests.DownloadPaymentSlipRequest
import com.fivebb.selfcare.network.requests.EmailRequest
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.mvp.presenters.BasePresenter
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.utils.SharedUtils
import com.fivebb.shared.vos.PaymentHistoryVO

class PaymentHistoryPresenter: BasePresenter<PaymentHistoryView, UserModel>(),PaymentHistoryFilterActionDelegate{

    init {
        mModel = UserModelImpl.getInstance()
    }

    fun onUiReady() {
        mView.showPaymentHistory(mModel.getLoadedPaymentHistory(),"","")
    }

    fun refreshPaymentHistory() {

        mShowProgressLoadingDialogLiveData.postValue(true)
        mModel.getPaymentHistory(
            mView.getContext(),
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.showPaymentHistory(it.toMutableList(),"","")
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            }
        )
    }

    fun filterWithDateRange(fromDate: String, toDate: String) {
        mShowProgressLoadingDialogLiveData.postValue(true)
        mModel.getPaymentHistoryByDateRange(
            mView.getContext(),
            SharedUtils.changeDateFormat(fromDate, SharedConstants.FORMAT_DATE_D_M_Y, SharedConstants.FORMAT_DATE_YYYY_MM_DD),
            SharedUtils.changeDateFormat(toDate, SharedConstants.FORMAT_DATE_D_M_Y, SharedConstants.FORMAT_DATE_YYYY_MM_DD),
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.showPaymentHistory(it.toMutableList(),fromDate, toDate)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            }
        )
    }

    override fun onTapChooseDateRange(fromDate: String, toDate: String) {
        //mView.showDateRange(fromDate, toDate)

        mShowProgressLoadingDialogLiveData.postValue(true)
        mModel.getPaymentHistoryByDateRange(
            mView.getContext(),
            SharedUtils.changeDateFormat(fromDate, SharedConstants.FORMAT_DATE_D_M_Y, SharedConstants.FORMAT_DATE_YYYY_MM_DD),
            SharedUtils.changeDateFormat(toDate, SharedConstants.FORMAT_DATE_D_M_Y, SharedConstants.FORMAT_DATE_YYYY_MM_DD),
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.showPaymentHistory(it.toMutableList(),fromDate,toDate)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            }
        )
    }

    override fun onDownload(creditNo: String) {
        mView.onPaymentPDF(creditNo)
    }

    override fun onViewInvoice(creditNo: String) {
        mView.onViewPDF(creditNo)
    }

    fun onDownloadPaymentPDF() {

        mShowProgressLoadingDialogLiveData.postValue(true)
        val request = DownloadPaymentSlipRequest(
            SharedPreferenceUtils.getCreditNo(mView.getContext()),
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

    fun onViewPaymentPDF() {

        mShowProgressLoadingDialogLiveData.postValue(true)
        val request = DownloadPaymentSlipRequest(
            SharedPreferenceUtils.getCreditNo(mView.getContext()),
        )
        mModel.getInvoicePDF(
            mView.getContext(),
            request,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.onViewClick(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            }
        )
    }

    fun onTapFilter(fromDate: String,toDate: String){
        mView.showFilterDateDialog(fromDate, toDate)
    }
}