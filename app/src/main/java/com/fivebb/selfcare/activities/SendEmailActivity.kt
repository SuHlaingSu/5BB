package com.fivebb.selfcare.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.fivebb.selfcare.R
import com.fivebb.selfcare.mvp.presenters.SendEmailPresenter
import com.fivebb.selfcare.mvp.views.SendEmailView
import com.fivebb.shared.utils.InputValidityUtil
import kotlinx.android.synthetic.main.activity_send_email.*

class SendEmailActivity : ApplicationBaseActivity(), SendEmailView {

    override fun getContext(): Context = applicationContext

    private lateinit var mPresenter: SendEmailPresenter

    private var mToEmail = ""

    companion object {

        private const val TO_EMAIL = "TO_EMAIL"

        fun newIntent(context: Context, toEmail: String) : Intent {
            val intent = Intent(context, SendEmailActivity::class.java)
            intent.putExtra(TO_EMAIL, toEmail)

            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_email)

        getIntentExtraData()

        setUpPresenter()
        setUpListeners()
    }

    private fun getIntentExtraData() {
        intent.let {
            mToEmail = it.getStringExtra(TO_EMAIL).toString()
            tvSentTo.text = getString(R.string.format_send_email, mToEmail)
        }
    }

    override fun onBackPressed() {
        confirmDialog("Are you sure to exit?"){
            super.onBackPressed()
        }
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(SendEmailPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    private fun setUpListeners() {

        btnSend.setOnClickListener {

            if (areRequiredFieldsFilled()) {
                confirmDialog(getString(R.string.confirm_msg_create_ticket)) {
                    mPresenter.sendEmail(
                        mToEmail,
                        etSubject.text.trim().toString(),
                        etBody.text.trim().toString()
                    )
                }
            }
        }

        ivClose.setOnClickListener {
            onBackPressed()
        }

        mPresenter.mShowProgressLoadingDialogLiveData.observe(
            this, Observer {
                showLoadingDialog()
            }
        )

        mPresenter.mHideProgressLoadingDialogLiveData.observe(
            this, Observer {
                hideLoadingDialog()
            }
        )

        mPresenter.mErrorLiveData.observe(this, Observer {
            checkErrorMessageAndRedirectLogin(it)
        })
    }

    private fun areRequiredFieldsFilled() : Boolean {
        return InputValidityUtil.isGivenEditTextHasInput(etSubject, getString(R.string.err_fill_information)) &&
                InputValidityUtil.isGivenEditTextHasInput(etBody, getString(R.string.err_fill_information))
    }

    override fun showSendEmailSuccessfully(message: String) {
        showSuccessMessage(message) {
            finish()
        }
    }
}
