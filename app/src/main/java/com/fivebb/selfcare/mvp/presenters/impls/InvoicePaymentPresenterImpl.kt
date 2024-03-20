package com.fivebb.selfcare.mvp.presenters.impls

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import com.fivebb.selfcare.BuildConfig
import com.fivebb.selfcare.R
import com.fivebb.selfcare.models.StaticDataModel
import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.presenters.InvoicePaymentPresenter
import com.fivebb.selfcare.mvp.views.InvoicePaymentView
import com.fivebb.selfcare.network.requests.*
import com.fivebb.selfcare.utils.*
import com.fivebb.shared.mvp.presenters.BasePresenter
import com.fivebb.shared.vos.BankVO
import com.fivebb.shared.vos.CombinePaymentDataVO
import com.fivebb.shared.vos.PaymentMethodVO
import com.fivebb.shared.vos.RegionVO
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.delay
import org.jetbrains.annotations.NotNull
import java.util.concurrent.TimeUnit


class InvoicePaymentPresenterImpl : BasePresenter<InvoicePaymentView, UserModel>(),
    InvoicePaymentPresenter {

    private val mBankList = StaticDataModel.getBankList()
    private val mPaymentList= mutableListOf<PaymentMethodVO>()
    var combinePaymentDataVO = CombinePaymentDataVO()

    init {
        mModel = UserModelImpl.getInstance()
    }

    override fun loadBankList() {
        mView.showAllBankPayment(mBankList)
    }

    override fun loadPaymentMethodList() {
        mShowProgressLoadingDialogLiveData.postValue(true)
        mModel.getPaymentMethod(
            success = { it ->
                mHideProgressLoadingDialogLiveData.postValue(true)
                it.let { it ->
                    it.forEach {
                       if(it.isMobileActive) {
                           mView.showAllPaymentMethod(combinePaymentDataVO)
                       }

                    }
                }
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            }
        )
    }

    override fun onTapBank(bank: BankVO) {

        mBankList.forEach {
            it.isChecked = it.id == bank.id
        }
        mView.showAllBankPayment(mBankList)

        mView.showSelectedBankInfo(bank)
    }

    override fun onTapBank(paymentMethodVO:  CombinePaymentDataVO) {
        mPaymentList.forEach {
            it.isChecked = it.id == paymentMethodVO.id
        }
        mView.showAllPaymentMethodList(mPaymentList)

        mView.showSelectedPaymentInfo(paymentMethodVO)
    }

    override fun onTapPayWithKBZPay(request: KBZPreCreateRequest,context: Context) {
        mShowProgressLoadingDialogLiveData.postValue(true)

        val encryptData = generateEncDataForPreCreate(request,context)
        val decData = Cryptography_Android.Decrypt(encryptData.encData, BuildConfig.ENCRYPTION_KEY)
//        Log.e("Mi4C_encrypt", encryptData.encData)
//        Log.e("Mi4C_decrypt", decData)

        mModel.sendKBZPayPreCreate(encryptData,
            success = {
                val encryptDataOrderInfo = generateEncDataForOrderInFo(it.prepayID)
                mHideProgressLoadingDialogLiveData.postValue(true)
                loadKBZOrderInfo(encryptDataOrderInfo)
            },
            failure = {
                val encryptDataQueryOrder = generateEncDataForQueryOrder(request)
                mModel.sendKBZPayQueryOrder(encryptDataQueryOrder,
                    success = {
                        mHideProgressLoadingDialogLiveData.postValue(true)
                        mView.navigateToPaymentSuccess()
                    },
                    failure = {
                        mHideProgressLoadingDialogLiveData.postValue(true)
                        _errorLiveData.postValue(it)
                        mView.errorResponseKBZPayApp(it)

                    })
          })
    }

    @SuppressLint("CheckResult")
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

    fun aYAPayQueryOrder(data: AYAPayRequest) {
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

    private fun loadKBZOrderInfo(data: EncryptDataRequest) {
        mModel.loadKBZOrderInfo(data,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.showKBZPayAPP(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
                mView.errorResponseKBZPayApp(it)
            })
    }

    //KBZ PreCreateV2
    private fun generateEncDataForPreCreate(request: KBZPreCreateRequest,context: Context): EncryptDataRequest {

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val customerAccountNo = "CustAccNo=${request.custAccNo}|"
        val name = "Name=${request.name}|"
        val billInvoiceNo = "BillInvoiceNo=${request.billInvoiceNo}|"
        val orderID = "OrderID=${request.orderID}|"
        val totalAmount = "TotalAmount=${request.totalAmount}|"
        val tradeType = "TradeType=APP|Title=Bill Payment|Currency=MMK|PaymentAlias=Bill|"
        val billMonth = "BillMonth=${request.billMonth}"
        var data =
            accountCode + customerAccountNo + name + billInvoiceNo + orderID + totalAmount + tradeType + billMonth

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    //KBZ Query Order
    private fun generateEncDataForQueryOrder(request: KBZPreCreateRequest): EncryptDataRequest {

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val orderID = "OrderID=${request.orderID}"

        var data = accountCode + orderID

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    //KBZ OrderInfo
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
        val tradeType = "TradeType=APP|Title=Bill Payment|Currency=MMK|PaymentAlias=Bill|"
        val billMonth = "BillMonth=${request.billMonth}|"
        val paymentType = "PaymentType=Android_BillPay|"
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

    //Citizen
    private fun generateEncDataForCitizen(request: CitizenPayRequest): EncryptDataRequest {

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val customerAccountNo = "CustAccNo=${request.custAccNo}|"
        val name = "Name=${request.name}|"
        val billInvoiceNo = "BillInvoiceNo=${request.billInvoiceNo}|"
        val orderID = "OrderID=${request.orderID}|"
        val totalAmount = "TotalAmount=${request.totalAmount}|"
        val tradeType = "TradeType=APP|Title=Bill Payment|Currency=MMK|PaymentAlias=Bill|"
        val billMonth = "BillMonth=${request.billMonth}|"
        val paymentType = "PaymentType=Android_BillPay"
        var data =
            accountCode + customerAccountNo + name + billInvoiceNo + orderID + totalAmount + tradeType + billMonth + paymentType

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    //WavePay
    private fun generateEncDataForWavePay(request: WavePayRequest): EncryptDataRequest {

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val customerAccountNo = "CustAccNo=${request.custAccNo}|"
        val name = "Name=${request.name}|"
        val billInvoiceNo = "BillInvoiceNo=${request.billInvoiceNo}|"
        val orderID = "OrderID=${request.orderID}|"
        val totalAmount = "TotalAmount=${request.totalAmount}|"
        val tradeType = "TradeType=APP|Title=Bill Payment|Currency=MMK|PaymentAlias=Bill|"
        val billMonth = "BillMonth=${request.billMonth}|"
        val paymentType = "PaymentType=Android_BillPay"
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

    private fun generateEncDataForMCFRetrieve(request: CitizenPayRequest): EncryptDataRequest {

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val orderID = "OrderID=${request.orderID}"

        var data = accountCode + orderID

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    override fun onTapFullScreen(url: String,position: Long) {
        mView.navigateToVideoFullScreen(url,position)
    }
}