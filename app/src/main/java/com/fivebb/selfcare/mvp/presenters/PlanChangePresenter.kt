package com.fivebb.selfcare.mvp.presenters

import com.fivebb.selfcare.R
import com.fivebb.selfcare.delegates.DatePickerActionDelegate
import com.fivebb.selfcare.delegates.PlanTypeActionDelegate
import com.fivebb.selfcare.models.StaticDataModel
import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.PlanChangeView
import com.fivebb.selfcare.network.requests.SaveActivityLogRequest
import com.fivebb.selfcare.network.requests.SendEmailRequest
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.mvp.presenters.BasePresenter
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.utils.SharedUtils
import com.fivebb.shared.vos.PlanVO
import com.google.gson.Gson

class PlanChangePresenter : BasePresenter<PlanChangeView, UserModel>(),
    PlanTypeActionDelegate, DatePickerActionDelegate {

    init {
        mModel = UserModelImpl.getInstance()
    }

    private var planList: MutableList<PlanVO> = mutableListOf()

    fun onUiReady() {

        mShowProgressLoadingDialogLiveData.postValue(true)

        mModel.getPlan(mView.getContext(), {
            mHideProgressLoadingDialogLiveData.postValue(true)

            //Default choose one plan
            it[0].isSelected = true
            planList = it

            mView.dataReady(mModel.getLoadedCustomerDetails(), mModel.getServiceInstance(), planList)
        }, {
            mHideProgressLoadingDialogLiveData.postValue(true)
            _errorLiveData.postValue("Server Response is empty")
        })

    }

    fun sendRequest(toEmail: String, type: String, subject: String, body: String) {

        val request = SendEmailRequest(
            SharedPreferenceUtils.getAccountId(mView.getContext()),
            toEmail,
            type,
            subject,
            body
        )
        mShowProgressLoadingDialogLiveData.postValue(true)

        mModel.sendEmail(mView.getContext(), request,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.sendEmailSuccess(it)
            }, failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            })
    }

    fun sendEmailAndSaveActivity(selectedPlan: PlanVO, selectedDate: String) {

        mShowProgressLoadingDialogLiveData.postValue(true)
        //comment by sh
       /* val regionVO = mModel.getLoadedRegionList()
        val ToMail: String = regionVO?.primaryEmail!!*/

        if (mModel.getLoadedCustomerDetails() != null) {

            mModel.getLoadedCustomerDetails()?.let {

                val planJsonStr = SharedPreferenceUtils.getCurrentPlanVO(mView.getContext())
                val planVO = Gson().fromJson(planJsonStr, PlanVO::class.java)


             /*   val body = mView.getContext().getString(
                    R.string.format_plan_change_request,
                    SharedPreferenceUtils.getAccountId(mView.getContext()),
                    SharedPreferenceUtils.getName(mView.getContext()),
                    it.customerAccountDetails.values.first().emailAddress,
                    "${it.customerAccountDetails.values.first().mobileNumber}, ${it.customerAccountDetails.values.first().multipleMobileNumber ?: ""}",
                    planVO.planShortName,
                    selectedPlan.planShortName,
                    selectedDate)


                val emailRequest = SendEmailRequest(
                    SharedPreferenceUtils.getAccountId(mView.getContext()),
                    mModel.getEmailByBillingArea(mView.getContext()),
                    SharedConstants.PLAN_CHANGE_FORM,
                    mView.getContext().getString(R.string.email_subject_plan_change),
                    body
                )*/

                val activityLogDesc = mView.getContext().getString(
                    R.string.format_activity_log_plan_change,
                    planVO.planShortName,
                    mView.getContext().getString(R.string.extension_mbps, planVO.downloadSpeed?.toInt().toString()),
                    selectedPlan.planShortName,
                    mView.getContext().getString(R.string.extension_mbps, selectedPlan.downloadSpeed?.toInt().toString()),
                    selectedDate
                    //comment by sh
                    //SharedUtils.getTodayDateByFormat(SharedConstants.FORMAT_DATE_D_MMMM_YYYY)
                )

                val saveActivityRequest = SaveActivityLogRequest(
                    SharedPreferenceUtils.getAccountId(mView.getContext()),
                    SharedConstants.PLAN_CHANGE,
                    activityLogDesc
                )

                mModel.sendEmailAndSaveActivityLog(
                    mView.getContext(),
                    //emailRequest,
                    saveActivityRequest,
                    {successMessage ->
                        mHideProgressLoadingDialogLiveData.postValue(true)
                        mView.sendEmailSuccess(successMessage)
                    }, {errorMessage ->
                        mHideProgressLoadingDialogLiveData.postValue(true)
                        _errorLiveData.postValue(errorMessage)
                    }
                )

            }

        } else {
            mHideProgressLoadingDialogLiveData.postValue(true)
            _errorLiveData.postValue(SharedConstants.UNAUTHORIZED_REQUEST)
        }

    }

    override fun onTapPlan(plan: PlanVO) {
        planList.forEach {
            it.isSelected = it.id == plan.id
        }

        mView.refreshPlanList(planList,plan)
    }

    override fun chooseDate(calendar: String) {
        mView.showChooseDate(calendar)
    }

    fun onTapChooseDate(){
        mView.showDatePickerFragment()
    }
}