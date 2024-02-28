package com.fivebb.selfcare.activities

import android.content.Intent
import android.os.Bundle
import com.fivebb.selfcare.BuildConfig
import com.fivebb.selfcare.R
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.activities.BaseActivity
import com.fivebb.shared.utils.SharedConstants

abstract class ApplicationBaseActivity: BaseActivity() {


    companion object {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    fun checkErrorMessageAndRedirectLogin(errorMessage: String) {
        if (errorMessage.equals(SharedConstants.UNAUTHORIZED_REQUEST, true)) {
            showErrorMessage(getString(R.string.msg_session_expired), action = {

                SharedPreferenceUtils.deleteLogin(applicationContext)
                SharedPreferenceUtils.deleteAccessToken(applicationContext)
                SharedPreferenceUtils.deleteAccountId(applicationContext)

                redirectToLoginActivity()
            })
        } else {
            with(errorMessage){
                replace(BuildConfig.BASE_URL, "")
                replace(BuildConfig.MOBILE_API_BASE_URL_FIELD, "")
                showErrorMessage(this)
            }
        }
    }

    private fun redirectToLoginActivity() {
        val intent = LoginActivity.newIntent(applicationContext)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }
}