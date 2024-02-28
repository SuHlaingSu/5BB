package com.fivebb.selfcare.mvp.presenters

import android.content.Context
import android.util.Log
import com.fivebb.selfcare.BuildConfig
import com.fivebb.selfcare.models.RechargeStaticDataModel
import com.fivebb.selfcare.models.StaticDataModel
import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.RechargeTopUpView
import com.fivebb.selfcare.network.requests.*
import com.fivebb.selfcare.utils.Cryptography_Android
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.selfcare.utils.md5Hash
import com.fivebb.shared.mvp.presenters.BasePresenter
import com.fivebb.shared.vos.BankVO
import com.fivebb.shared.vos.CombinePaymentDataVO
import com.fivebb.shared.vos.PaymentMethodVO

class RechargeTopUpPresenter: BasePresenter<RechargeTopUpView, UserModel>(),InvoicePaymentPresenter {
    private val mBankList = RechargeStaticDataModel.getBankList()

    init {
        mModel = UserModelImpl.getInstance()
    }

    override fun loadBankList() {
        mView.showAllBank(mBankList)
    }

    override fun loadPaymentMethodList() {
        TODO("Not yet implemented")
    }

    override fun onTapBank(bank: BankVO) {
        mBankList.forEach {
            it.isChecked = it.id == bank.id
        }

        mView.showAllBank(mBankList)

        mView.showSelectedBankInfo(bank)
    }

    override fun onTapBank(payment: CombinePaymentDataVO) {
        TODO("Not yet implemented")
    }

    override fun onTapPayWithKBZPay(request: KBZPreCreateRequest,context: Context) {
        val encryptData = generateEncDataForPreCreate(request,context)
        mShowProgressLoadingDialogLiveData.postValue(true)

        mModel.sendKBZPayPreCreate(encryptData,
            success = {
                val encryptDataOrderInfo = generateEncDataForOrderInFo(it.prepayID)
                mHideProgressLoadingDialogLiveData.postValue(true)
                loadKBZOrderInfo(encryptDataOrderInfo)
            },
            failure = {
                val encryptDataQueryOrder = generateEncDataForQueryOrder(request)
                mShowProgressLoadingDialogLiveData.postValue(true)
                mModel.sendKBZPayQueryOrder(encryptDataQueryOrder,
                    success = {
                        mHideProgressLoadingDialogLiveData.postValue(true)
                    },
                    failure = {
                        mHideProgressLoadingDialogLiveData.postValue(true)
                        _errorLiveData.postValue(it)
                    })
            })
    }

    override fun onTapPayWithAYAPay(request: AYAPayRequest) {
        mShowProgressLoadingDialogLiveData.postValue(true)
        val encryptData = generateEncDataForAYAPay(request)
        mModel.payWithAYAPay(encryptData, success = {
            mHideProgressLoadingDialogLiveData.postValue(true)
            mView.ayaPayLink(it)
            mView.requestQueryOrderAYAPay(request)

        }, failure = {
            mHideProgressLoadingDialogLiveData.postValue(true)
            mView.responseOfAYAPay(it)
        })
    }

    fun ayaPayQueryOrder(data: AYAPayRequest) {
        val encryptData = generateEncDataForAYAPayQueryOrder(data)
        mModel.AYAPayQueryOrder(encryptData,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.queryOrderAYAPay(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                //_errorLiveData.postValue(it)
            })
    }


    private fun loadKBZOrderInfo(data: EncryptDataRequest) {
        mModel.loadKBZOrderInfo(data,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.showKBZPayAPP(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            })
    }

    //KBZ
    private fun generateEncDataForPreCreate(request: KBZPreCreateRequest,context: Context): EncryptDataRequest {

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val customerAccountNo = "CustAccNo=${request.custAccNo}|"
        val name = "Name=${request.name}|"
        val billInvoiceNo = "BillInvoiceNo=${request.billInvoiceNo}|"
        val orderID = "OrderID=${request.orderID}|"
        val totalAmount = "TotalAmount=${request.totalAmount}|"
        val tradeType = "TradeType=APP|Title=Recharge Payment|Currency=MMK|PaymentAlias=Recharge|"
        val billMonth = "BillMonth=Test"
        var data =
            accountCode + customerAccountNo + name + billInvoiceNo + orderID + totalAmount + tradeType + billMonth

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    private fun generateEncDataForQueryOrder(request: KBZPreCreateRequest): EncryptDataRequest {

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val orderID = "OrderID=${request.orderID}"

        var data = accountCode + orderID

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    private fun generateEncDataForOrderInFo(prepayID: String): EncryptDataRequest {
        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val concatPrepayID = "prepay_id=$prepayID"

        var data = accountCode + concatPrepayID

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    //AYA Pay
    private fun generateEncDataForAYAPay(request: AYAPayRequest): EncryptDataRequest {

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val customerAccountNo = "CustAccNo=${request.custAccNo}|"
        val name = "Name=${request.name}|"
        val billInvoiceNo = "BillInvoiceNo=${request.billInvoiceNo}|"
        val orderID = "OrderID=${request.orderID}|"
        val totalAmount = "TotalAmount=${request.totalAmount?.toInt()}|"
        val tradeType = "TradeType=APP|Title=Recharge Payment|Currency=MMK|PaymentAlias=Recharge|"
        val billMonth = "BillMonth=N/A|"
        val paymentType = "PaymentType=Android_RechargePay|"
        val cusPh = "CustomerPhone=${request.cusPh}"
        var data =
            accountCode + customerAccountNo + name + billInvoiceNo + orderID + totalAmount + tradeType + billMonth + paymentType + cusPh

        data += "|checkSum=${data.md5Hash()}"

        Log.i("TAG", "generateEncDataForAYAPay: $data")

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    private fun generateEncDataForAYAPayQueryOrder(request: AYAPayRequest): EncryptDataRequest {

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val orderID = "OrderID=${request.orderID}"

        var data = accountCode + orderID

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    override fun onPayWithCitizen(request: CitizenPayRequest) {
        mShowProgressLoadingDialogLiveData.postValue(true)
        val encryptData = generateEncDataForCitizen(request)

        mModel.sendCitizenPay(encryptData,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.mcfPayPaymentLink(it)
                mView.callPayRetrieveStatus(request)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                citizenPaymentRetrieve(request)
            })
    }

    //WavePay
    override fun onTapWavePayRequest(request: WavePayRequest) {
        mShowProgressLoadingDialogLiveData.postValue(true)
        val encryptData = generateEncDataForWavePay(request)
        mModel.requestWavePay(encryptData,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.requestWavePayResponse(it)
                mView.requestQueryOrderWPay(request)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            })
    }

    fun wPayQueryOrder(data: WavePayRequest) {
        val encryptData = generateEncDataForWPQueryOrder(data)
        mModel.wavePayQueryOrder(encryptData,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.queryOrderWPay(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                //_errorLiveData.postValue(it)
            })
    }

    private fun generateEncDataForWavePay(request: WavePayRequest): EncryptDataRequest {

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val customerAccountNo = "CustAccNo=${request.custAccNo}|"
        val name = "Name=${request.name}|"
        val billInvoiceNo = "BillInvoiceNo=${request.billInvoiceNo}|"
        val orderID = "OrderID=${request.orderID}|"
        val totalAmount = "TotalAmount=${request.totalAmount}|"
        val tradeType = "TradeType=APP|Title=Recharge Payment|Currency=MMK|PaymentAlias=Recharge|"
        val billMonth = "BillMonth=N/A|"
        val paymentType = "PaymentType=Android_RechargePay"
        var data =
            accountCode + customerAccountNo + name + billInvoiceNo + orderID + totalAmount + tradeType + billMonth + paymentType

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    private fun generateEncDataForWPQueryOrder(request: WavePayRequest): EncryptDataRequest {

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val orderID = "OrderID=${request.orderID}"

        var data = accountCode + orderID

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    override fun citizenPaymentRetrieve(request: CitizenPayRequest) {
        val encryptData = generateEncDataForMCFRetrieve(request)

        mModel.sendCitizenRetrieve(encryptData,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.citizenPaymentRetrieveStatus(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            })
    }

    //Citizen
    private fun generateEncDataForCitizen(request: CitizenPayRequest): EncryptDataRequest {

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val customerAccountNo = "CustAccNo=${request.custAccNo}|"
        val name = "Name=${request.name}|"
        val billInvoiceNo = "BillInvoiceNo=${request.billInvoiceNo}|"
        val orderID = "OrderID=${request.orderID}|"
        val totalAmount = "TotalAmount=${request.totalAmount}|"
        val tradeType = "TradeType=APP|Title=Recharge Payment|Currency=MMK|PaymentAlias=Recharge|"
        val billMonth = "BillMonth=N/A|"//${request.billMonth}|"
        val paymentType = "PaymentType=Android_RechargePay"
        var data =
            accountCode + customerAccountNo + name + billInvoiceNo + orderID + totalAmount + tradeType + billMonth + paymentType

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    //Citizen Retrieve Response
    private fun generateEncDataForMCFRetrieve(request: CitizenPayRequest): EncryptDataRequest {

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val orderID = "OrderID=${request.orderID}"

        var data = accountCode + orderID

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    override fun onTapFullScreen(url: String, position: Long) {
    }
}