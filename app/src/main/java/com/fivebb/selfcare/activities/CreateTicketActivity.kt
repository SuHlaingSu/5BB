package com.fivebb.selfcare.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.fivebb.selfcare.R
import com.fivebb.selfcare.mvp.presenters.CreateTicketPresenter
import com.fivebb.selfcare.mvp.views.CreateTicketView
import com.fivebb.shared.utils.ScreenUtils
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.vos.CustomerBasicViewDetailsVO
import kotlinx.android.synthetic.main.activity_create_ticket.*

class CreateTicketActivity : ApplicationBaseActivity(), CreateTicketView {

    override fun getContext(): Context = applicationContext

    private lateinit var mPresenter: CreateTicketPresenter

    private var mCustomerDetail: CustomerBasicViewDetailsVO? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_ticket)

        setUpPresenter()
        setUpListeners()
        setUpSpinner()

        mPresenter.onUiReady()
        bgMain.layoutParams.height = (ScreenUtils.getInstance().screenHeightPx / 2).toInt()
    }

    private fun setUpListeners() {
        ivBack.setOnClickListener {
            finish()
        }

        btnSubmit.setOnClickListener {

            if (areRequiredFieldsFilled()) {

                confirmDialog(getString(R.string.confirm_msg_create_ticket)) {

                    mPresenter.sendEmailAndSaveActivity(
                        spTicketType.selectedItem.toString(),
                        spProblemCategory.selectedItem.toString(),
                        etTicketSummary.text.toString())

                }

            } else {
                showErrorMessage(getString(R.string.err_fill_information))
            }
        }

        mPresenter.mHideProgressLoadingDialogLiveData.observe(this, Observer {
            hideLoadingDialog()
        })

        mPresenter.mShowProgressLoadingDialogLiveData.observe(this, Observer {
            showLoadingDialog()
        })

        mPresenter.mErrorLiveData.observe(this, Observer {
            checkErrorMessageAndRedirectLogin(it)
        })
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(CreateTicketPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    private fun setUpSpinner() {

        ArrayAdapter.createFromResource(this, R.array.ticket_type, android.R.layout.simple_spinner_item)
            .also { spinnerAdapter ->
                spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spTicketType.adapter = spinnerAdapter
            }

        ArrayAdapter.createFromResource(this, R.array.ticket_problem_category, android.R.layout.simple_spinner_item)
            .also { spinnerAdapter ->
                spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spProblemCategory.adapter = spinnerAdapter
            }
    }

    private fun areRequiredFieldsFilled() : Boolean {
        return spTicketType.selectedItemPosition > 0 &&
                spProblemCategory.selectedItemPosition > 0
    }

    override fun showCustomerBasicDetail(customerBasicViewDetails: CustomerBasicViewDetailsVO) {
        mCustomerDetail = customerBasicViewDetails

        if (mCustomerDetail == null) {
            checkErrorMessageAndRedirectLogin(SharedConstants.UNAUTHORIZED_REQUEST)
        }
    }

    override fun showSendEmailSuccess(successMessage: String) {
        Toast.makeText(
            applicationContext,
            successMessage,
            Toast.LENGTH_SHORT
        ).show()
        finish()
    }

    companion object {
        fun newIntent(context: Context) : Intent {
            return Intent(context, CreateTicketActivity::class.java)
        }
    }


}
