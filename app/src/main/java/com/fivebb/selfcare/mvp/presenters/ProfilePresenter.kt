package com.fivebb.selfcare.mvp.presenters

import android.content.Context
import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.ProfileView
import com.fivebb.shared.mvp.presenters.BasePresenter
import kotlinx.android.synthetic.main.activity_notification.*

class ProfilePresenter : BasePresenter<ProfileView, UserModel>() {

    init {
        mModel = UserModelImpl.getInstance()
    }

    fun getAdvPayment()
    {
        mView.showLoading()
        mModel.getAdvancePayment(
            context = mView.getContext(),
            success = {
                mView.hideLoading()
                mView.showAdvPayment(it)

            },
            failure = {
                mView.hideLoading()
            }
        )
    }

    fun onTapLogOut(context: Context) {
        mModel.logOut(context
            , success = {
                mView.navigateToLoginScreen()
            })
    }

    fun onTapAccountDetail(){
        mView.navigateToAccountDetail()
    }

    fun onTapChangePassword(){
        mView.navigateToChangePassword()
    }

    fun onTapPaymentHistory(){
        mView.navigateToPaymentHistory()
    }

    fun onTapAdvanceTopUp(context:Context){
        mShowProgressLoadingDialogLiveData.postValue(true)
        mModel.getBillList(context,
            success = {
                mView.showBillingList(it)
               mHideProgressLoadingDialogLiveData.postValue(true)
            },
            failure = {
                _errorLiveData.postValue(it)
            })
    }
}