package com.fivebb.selfcare.mvp.presenters

import com.fivebb.selfcare.delegates.PrepaidActionDelegate
import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.PXTopUpView
import com.fivebb.shared.mvp.presenters.BasePresenter
import com.fivebb.shared.vos.PXPlanVO

class PXTopUpPresenter : BasePresenter<PXTopUpView, UserModel>(),PrepaidActionDelegate {
       init {
        mModel = UserModelImpl.getInstance()
    }

    override fun onTapTopUp() {
       mShowProgressLoadingDialogLiveData.postValue(true)
        mModel.getPXPlan(
            context = mView.getContext(),
            success = {
            mView.getPlanPriceList(it)
            mHideProgressLoadingDialogLiveData.postValue(true)
        },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            }
        )
    }

    override fun onItemClick(pxPlanVO: PXPlanVO) {
        TODO("Not yet implemented")
    }

}