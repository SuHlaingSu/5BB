package com.fivebb.selfcare.mvp.presenters

import androidx.lifecycle.MutableLiveData
import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.SecretQuestionView
import com.fivebb.shared.mvp.presenters.BasePresenter

class SecretQuestionPresenter : BasePresenter<SecretQuestionView, UserModel>() {

    init {
        mModel = UserModelImpl.getInstance()
    }

    var mSecretQuestion: MutableLiveData<String> = MutableLiveData()

    fun loadSecretQuestion(accountNumber: String) {

        mShowProgressLoadingDialogLiveData.postValue(true)
        mModel.getSecretQuestion(accountNumber,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.readySecretQuestion()
                mSecretQuestion.postValue(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            })
    }

    fun validateSecretQuestion(answer: String) {
        mShowProgressLoadingDialogLiveData.postValue(true)

        mModel.validateSecretQuestion(
            answer,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.correctSecretQuestion(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            }
        )
    }
}