package com.fivebb.selfcare.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.fivebb.selfcare.BuildConfig
import com.fivebb.selfcare.R
import com.fivebb.selfcare.mvp.presenters.SecretQuestionPresenter
import com.fivebb.selfcare.mvp.views.SecretQuestionView
import com.fivebb.shared.utils.InputValidityUtil
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.utils.setMMHint
import kotlinx.android.synthetic.main.activity_secret_question.*

class SecretQuestionActivity : ApplicationBaseActivity(), SecretQuestionView {

    override fun getContext(): Context = applicationContext

    private lateinit var mPresenter: SecretQuestionPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secret_question)

        //Set application version
        tvAppVersion.text =  getString(R.string.lbl_app_version, BuildConfig.VERSION_NAME)

        initPresenter()
        bindLocalizedData()
        initListeners()
    }

    private fun initPresenter() {
        mPresenter = ViewModelProviders.of(this).get(SecretQuestionPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    private fun initListeners() {
        ivBack.setOnClickListener {
            finish()
        }

        btnNext.setOnClickListener {
            if (InputValidityUtil.isGivenEditTextHasInput(etAccountNumber, tilAccountNumber, getString(R.string.err_fill_account_number))) {
                mPresenter.loadSecretQuestion(etAccountNumber.text.toString())
            }
        }

        btnDone.setOnClickListener {
            if (InputValidityUtil.isGivenEditTextHasInput(etAnswer, tilAnswer, getString(R.string.err_fill_information))) {
                mPresenter.validateSecretQuestion(etAnswer.text.toString())
            }
        }

        mPresenter.mShowProgressLoadingDialogLiveData.observe(this, Observer {
            showLoadingDialog()
        })

        mPresenter.mHideProgressLoadingDialogLiveData.observe(this, Observer {
            hideLoadingDialog()
        })

        mPresenter.mErrorLiveData.observe(this, Observer {
            if (it == SharedConstants.MSG_NO_SECRET_QUESTION) showErrorMessage(getString(R.string.msg_to_call_service_center))
            else showErrorMessage(it)
        })
    }

    override fun readySecretQuestion() {
        mPresenter.mSecretQuestion.observe(this, Observer {

            cvInputAccountNumber.visibility = View.GONE
            cvAnswerQuestion.visibility = View.VISIBLE

            tvQuestion.text = getString(R.string.tv_question, it)
        })
    }

    override fun correctSecretQuestion(message: String) {
        showSuccessMessage(getString(R.string.msg_check_your_email, message), action = {
            val intent = LoginActivity.newIntent(this)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        })
    }

    private fun bindLocalizedData() {
        tilAccountNumber.setMMHint(R.string.lbl_customer_account_number)
        tilAnswer.setMMHint(R.string.lbl_answer)
    }

    companion object {
        fun newIntent(context: Context) : Intent =  Intent(context, SecretQuestionActivity::class.java)
    }

}
