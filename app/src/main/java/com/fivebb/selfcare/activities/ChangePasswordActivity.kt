package com.fivebb.selfcare.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.fivebb.selfcare.R
import com.fivebb.selfcare.mvp.presenters.ChangePasswordPresenter
import com.fivebb.selfcare.mvp.views.ChangePasswordView
import com.fivebb.shared.activities.BaseActivity
import com.fivebb.shared.components.PasswordVisibilityListener
import com.fivebb.shared.utils.InputValidityUtil
import com.fivebb.shared.utils.SharedUtils
import com.fivebb.shared.utils.setMMHint
import kotlinx.android.synthetic.main.activity_change_password.*

class ChangePasswordActivity : BaseActivity(), ChangePasswordView {

    override fun getContext(): Context = applicationContext

    private lateinit var mPresenter: ChangePasswordPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_password)

        setUpPresenter()
        initListeners()
        bindLocalizedData()

    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(ChangePasswordPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    private fun initListeners() {

        ivBack.setOnClickListener {
            finish()
        }

        btnSubmit.setOnClickListener {
            if (areRequiredFieldsFilled()) {

                confirmDialog(getString(R.string.confirm_msg_change_password), clickOk = {
                    tapChangePassword(
                        etOldPassword.text.toString(),
                        etNewPassword.text.toString(),
                        etConfirmPassword.text.toString())
                })
            }
        }

        etOldPassword.setOnTouchListener(PasswordVisibilityListener())

        etNewPassword.setOnTouchListener(PasswordVisibilityListener())

        etConfirmPassword.setOnTouchListener(PasswordVisibilityListener())

        mPresenter.mErrorLiveData.observe(this, Observer {
            showErrorMessage(it)
        })

        mPresenter.mShowProgressLoadingDialogLiveData.observe(this, Observer {
            showLoadingDialog()
        })

        mPresenter.mHideProgressLoadingDialogLiveData.observe(this, Observer {
            hideLoadingDialog()
        })
    }

    private fun tapChangePassword(newPassword: String, oldPassword: String, confPassword: String) {
        mPresenter.changePassword(
            newPassword,
            oldPassword,
            confPassword)
    }

    private fun areRequiredFieldsFilled() : Boolean {
        return InputValidityUtil.isGivenEditTextHasInput(etOldPassword, tilOldPassword, getString(R.string.err_fill_password)) &&
                InputValidityUtil.isGivenEditTextHasInput(etNewPassword, tilNewPassword, getString(R.string.err_fill_password)) &&
                InputValidityUtil.isGivenEditTextHasInput(etConfirmPassword, tilConfirmPassword, getString(R.string.err_fill_password)) &&
                InputValidityUtil.checkEditTextAtLeastCharacterCount(etNewPassword, tilNewPassword, MIN_PASSWORD_COUNT, getString(R.string.err_password_count_invalid)) &&
                sameNewAndConfPasswords()
    }

    private fun sameNewAndConfPasswords() : Boolean {

        val confirm = etNewPassword.text.toString() == etConfirmPassword.text.toString()

            if (!confirm) tilConfirmPassword.error = SharedUtils.mmTextUnicodeOrigin(getString(R.string.err_confirm_password), applicationContext)

        return confirm
    }

    private fun bindLocalizedData() {
        tilOldPassword.setMMHint(R.string.lbl_old_password)
        tilNewPassword.setMMHint(R.string.lbl_new_password)
        tilConfirmPassword.setMMHint(R.string.lbl_confirm_password)
    }

    override fun showPasswordChangeSuccess(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
        finish()
    }

    companion object {

        const val MIN_PASSWORD_COUNT = 8

        fun newIntent(context: Context): Intent {
            return Intent(context, ChangePasswordActivity::class.java)
        }
    }
}
