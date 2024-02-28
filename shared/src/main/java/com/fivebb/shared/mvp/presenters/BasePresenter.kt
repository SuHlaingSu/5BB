package com.fivebb.shared.mvp.presenters

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fivebb.shared.mvp.views.BaseView

abstract class BasePresenter<T: BaseView, M: Any>: ViewModel() {

    protected lateinit var mView: T

    protected lateinit var mModel:M

    protected val _errorLiveData = MutableLiveData<String>()

    val mErrorLiveData: LiveData<String>
    get() = _errorLiveData

    val mShowProgressLoadingDialogLiveData: MutableLiveData<Boolean> = MutableLiveData()
    val mHideProgressLoadingDialogLiveData: MutableLiveData<Boolean> = MutableLiveData()

    fun initPresenter(view: T) {
        this.mView = view
    }

}