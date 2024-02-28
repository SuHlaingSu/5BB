package com.fivebb.selfcare.mvp.presenters

import android.util.Log
import com.fivebb.selfcare.delegates.PaymentHistoryFilterActionDelegate
import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.ActivityLogView
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.mvp.presenters.BasePresenter
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.utils.SharedUtils

class ActivityLogPresenter: BasePresenter<ActivityLogView, UserModel>(),
    PaymentHistoryFilterActionDelegate {

    init {
        mModel = UserModelImpl.getInstance()
    }

    fun onUiReady() {

        mShowProgressLoadingDialogLiveData.postValue(true)
        val fromDate = SharedUtils.getDateThreeMonthsPreviousToday()
        val toDate = SharedUtils.getDateForToday()
        val timestampFromDate = SharedUtils.getTimestampFromUserChooseDate(fromDate)

        val timestampToDate = SharedUtils.getTimestampFromUserChooseDate(toDate) + SharedConstants.ONE_DAY_MILITIME //Add one day cuz of date's time is start 12:00 AM
        mModel.getActivityLogs(
            mView.getContext(),
            success = { it ->
                mHideProgressLoadingDialogLiveData.postValue(true)

                if (it.isNotEmpty()){
                    val filteredList = it
                        .filter { SharedUtils.getTimestampFromMobilApiDate(it.activityDate) in timestampFromDate..timestampToDate }.toMutableList()
                    mView.showActivityLog(filteredList,fromDate, toDate)
                }
            },

            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
               // _errorLiveData.postValue(it)
            }

        )
    }

    //input date format --> DD/MM/YYYY
    fun filterLogsByDate(fromDate: String, toDate: String) {
        val loadedActivityLogs = mModel.getLoadedActivityLogs()

        val fromDate = SharedUtils.getDateThreeMonthsPreviousToday()
        val toDate = SharedUtils.getDateForToday()
        val timestampFromDate = SharedUtils.getTimestampFromUserChooseDate(fromDate)

        val timestampToDate = SharedUtils.getTimestampFromUserChooseDate(toDate) + SharedConstants.ONE_DAY_MILITIME //Add one day cuz of date's time is start 12:00 AM

        if (loadedActivityLogs.isNotEmpty()) {

            val filteredList = loadedActivityLogs
                .filter { SharedUtils.getTimestampFromMobilApiDate(it.activityDate) in timestampFromDate..timestampToDate }.toMutableList()

            mView.showActivityLog(filteredList,fromDate, toDate)

        } else mView.showActivityLog(mutableListOf(),fromDate, toDate)
    }

    override fun onTapChooseDateRange(fromDate: String, toDate: String) {
       // mView.showDateRange(fromDate, toDate)

        val loadedActivityLogs = mModel.getLoadedActivityLogs()

        val timestampFromDate = SharedUtils.getTimestampFromUserChooseDate(fromDate)

        val timestampToDate = SharedUtils.getTimestampFromUserChooseDate(toDate) + SharedConstants.ONE_DAY_MILITIME //Add one day cuz of date's time is start 12:00 AM

        if (loadedActivityLogs.isNotEmpty()) {

            val filteredList = loadedActivityLogs
                .filter { SharedUtils.getTimestampFromMobilApiDate(it.activityDate) in timestampFromDate..timestampToDate }.toMutableList()

            mView.showActivityLog(filteredList,fromDate,toDate)

        } else mView.showActivityLog(mutableListOf(),fromDate,toDate)
    }

    override fun onDownload(creditNo: String) {
        TODO("Not yet implemented")
    }

    override fun onViewInvoice(creditNo: String) {
        TODO("Not yet implemented")
    }

    fun onTapFilter(){
        mView.showDatePickerDialog()
    }
}