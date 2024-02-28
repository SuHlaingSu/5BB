package com.fivebb.selfcare.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.fivebb.selfcare.R
import com.fivebb.selfcare.mvp.presenters.RelocationPresenter
import com.fivebb.selfcare.mvp.views.RelocationView
import com.fivebb.shared.utils.InputValidityUtil
import com.fivebb.shared.utils.ScreenUtils
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.utils.setMMHint
import com.fivebb.shared.vos.CustomerBasicViewDetailsVO
import kotlinx.android.synthetic.main.activity_relocaiton.*

class RelocationActivity : ApplicationBaseActivity(), RelocationView {

    override fun getContext(): Context = applicationContext

    private lateinit var mPresenter: RelocationPresenter

    private var customerDetail: CustomerBasicViewDetailsVO? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relocaiton)

        setUpPresenter()
        initListeners()
        bindLocalizedData()

        mPresenter.onUiReady()
        bgMain.layoutParams.height = (ScreenUtils.getInstance().screenHeightPx / 2).toInt()
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(RelocationPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    private fun initListeners() {
        ivBack.setOnClickListener {
            finish()
        }

        btnSubmit.setOnClickListener {

            if (areRequiredFieldsFilled()) {

                customerDetail?.let {

                    val changeAddress = "${etHomeNumber.text}, " +
                            "${etResidentialQuarter.text}, " +
                            "${etStreetOrRoad.text}, " +
                            "${etTownship.text}, "

                    confirmDialog(getString(R.string.confirm_msg_relocation)) {
                        mPresenter.sendEmailAndSaveActivity(changeAddress)
                    }

                }
            }
        }

        mPresenter.mShowProgressLoadingDialogLiveData.observe(this, Observer {
            showLoadingDialog()
        })

        mPresenter.mHideProgressLoadingDialogLiveData.observe(this, Observer {
            hideLoadingDialog()
        })

        mPresenter.mErrorLiveData.observe(this, Observer {
            checkErrorMessageAndRedirectLogin(it)
        })
    }

    private fun bindLocalizedData() {
        tilHomeNumber.setMMHint(R.string.hint_home_number)
        tilResidentialQuarter.setMMHint(R.string.hint_residential_quarter)
        tilStreetOrRoad.setMMHint(R.string.hint_street_or_road)
        tilTownship.setMMHint(R.string.hint_township)
    }

    private fun areRequiredFieldsFilled(): Boolean {
        return InputValidityUtil.isGivenEditTextHasInput(
            etHomeNumber,
            tilHomeNumber,
            getString(R.string.err_fill_information)
        ) &&
                InputValidityUtil.isGivenEditTextHasInput(
                    etResidentialQuarter,
                    tilResidentialQuarter,
                    getString(R.string.err_fill_information)
                ) &&
                InputValidityUtil.isGivenEditTextHasInput(
                    etStreetOrRoad,
                    tilStreetOrRoad,
                    getString(R.string.err_fill_information)
                ) &&
                InputValidityUtil.isGivenEditTextHasInput(
                    etTownship,
                    tilTownship,
                    getString(R.string.err_fill_information)
                )
    }

    override fun showCustomerBasicViewDetails(customerBasicViewDetails: CustomerBasicViewDetailsVO) {
        customerDetail = customerBasicViewDetails

        if (customerDetail == null) {
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
        fun newIntent(context: Context): Intent {
            return Intent(context, RelocationActivity::class.java)
        }
    }

}
