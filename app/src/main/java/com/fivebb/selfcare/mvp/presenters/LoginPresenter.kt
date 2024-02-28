package com.fivebb.selfcare.mvp.presenters

import android.util.Log
import androidx.lifecycle.LiveData
import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.LoginView
import com.fivebb.shared.model.BaseModel
import com.fivebb.shared.model.BaseModelImpl
import com.fivebb.shared.mvp.presenters.BasePresenter
import com.fivebb.shared.vos.LoginHistroyVO

class LoginPresenter : BasePresenter<LoginView, UserModel>() {

    init {
        mModel = UserModelImpl.getInstance()
    }

//    fun login(accountId: String, password: String, checkedRememberMe: Boolean) {
//
//        mShowProgressLoadingDialogLiveData.postValue(true)
//
//        mModel.login(mView.getContext(), accountId, password, checkedRememberMe,
//            success = {
//                mHideProgressLoadingDialogLiveData.postValue(false)
//
//                mView.navigateToHome()
//            }, failure = {
//                mHideProgressLoadingDialogLiveData.postValue(true)
//                _errorLiveData.postValue(it)
//            })
//    }

    fun loginAndGetAccountDetail(accountId: String, password: String, checkedRememberMe: Boolean) {

        mShowProgressLoadingDialogLiveData.postValue(true)

        mModel.loginAndGetAccountDetail(
            mView.getContext(),
            accountId,
            password,
            checkedRememberMe,
            success = {
                mView.navigateToHome(it)
                mHideProgressLoadingDialogLiveData.postValue(true)
            }
            , failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            })
    }

    fun checkedRememberPreviousAccountId() {

        var accountId = ""
        var checkedRememberMe = false
        var password = ""

        mModel.getRememberPreviousAccountId(mView.getContext(), accountId = {
            accountId = it
        }, password = {
            password = it
        }, checkedRememberMe = {
            checkedRememberMe = it
        })

        mView.fillPreviousAccountIdAndRememberMe(accountId, password, checkedRememberMe)

    }

    fun getLoginHistory(): LiveData<List<LoginHistroyVO>> {
        return mModel.getLoginHistory()
    }

    fun onTapForgetPassword(){
        mView.navigateToForgetPassword()
    }

    fun onCallCheckVerification()
    {
        mShowProgressLoadingDialogLiveData.postValue(true)
        mModel.checkVerication(
            mView.getContext(),
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.onSuccessVerification(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            }
        )
    }

    fun onSubscribedTopicsWithAccount() {
        mShowProgressLoadingDialogLiveData.postValue(true)
        mModel.getTopics(
            mView.getContext(),
            success = {
               // mView.callLevel2Form()
                it.forEach {
                    Log.d("Topic", it.topic)
                }
                mHideProgressLoadingDialogLiveData.postValue(false)
            },
            failure = {
                Log.d("Error", it)
               // _errorLiveData.postValue(it)
            }
        )


    }

    fun getLvl2Form()
    {
        mShowProgressLoadingDialogLiveData.postValue(true)
        mModel.getAdvancePayment(
            context = mView.getContext(),
            success = {
                mView.level2Form(it)
                mHideProgressLoadingDialogLiveData.postValue(false)
            },
            failure = {
                _errorLiveData.postValue(it)
            }
        )
    }
}