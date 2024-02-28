package com.fivebb.selfcare.mvp.presenters

import android.util.Log
import com.fivebb.selfcare.BuildConfig
import com.fivebb.selfcare.delegates.AvdTopUpActionDelegate
import com.fivebb.selfcare.delegates.BankActionDelegate
import com.fivebb.selfcare.models.StaticDataModel
import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.AdvTopUpView
import com.fivebb.selfcare.mvp.views.BankListView
import com.fivebb.selfcare.network.requests.*
import com.fivebb.selfcare.network.responses.KBZOrderInfoResponse
import com.fivebb.selfcare.utils.Cryptography_Android
import com.fivebb.selfcare.utils.md5Hash
import com.fivebb.shared.mvp.presenters.BasePresenter
import com.fivebb.shared.vos.*
import java.util.*
import kotlin.concurrent.schedule

class AdvTopUpPresenter : BasePresenter<AdvTopUpView, UserModel>(),AvdTopUpActionDelegate {
    private val mBankList = StaticDataModel.getBankList()
    private var mPlanList: MutableList<PlanPriceListVO> = mutableListOf()

    init {
        mModel = UserModelImpl.getInstance()
    }

    override fun loadBankList() {
        mView.showAllBank(mBankList)

    }

    override fun onTapBank(bank: BankVO) {
        mBankList.forEach {
            it.isChecked = it.id == bank.id
        }

        mView.showAllBank(mBankList)

        mView.showSelectedBankInfo(bank)
    }

    override fun onTapPayWithKBZPay(request: KBZPreCreateRequest) {
        val encryptData = generateEncDataForPreCreate(request)
        val decData = Cryptography_Android.Decrypt(encryptData.encData, BuildConfig.ENCRYPTION_KEY)
//        Log.e("Mi4C_encrypt", encryptData.encData)
//        Log.e("Mi4C_decrypt", decData)

        mShowProgressLoadingDialogLiveData.postValue(true)

        mModel.sendKBZPayPreCreate(encryptData,
            success = {
                val encryptDataOrderInfo = generateEncDataForOrderInFo(it.prepayID)
                val decDataForOrderInfo = Cryptography_Android.Decrypt(encryptDataOrderInfo.encData, BuildConfig.ENCRYPTION_KEY)

//                Log.e("Mi4C_encrypt", encryptDataOrderInfo.encData)
//                Log.e("Mi4C_decrypt", decDataForOrderInfo)
                mHideProgressLoadingDialogLiveData.postValue(true)
                loadKBZOrderInfo(encryptDataOrderInfo)
            },
            failure = {
                val encryptDataQueryOrder = generateEncDataForQueryOrder(request)
                val decDataForQueryOrder = Cryptography_Android.Decrypt(encryptDataQueryOrder.encData, BuildConfig.ENCRYPTION_KEY)
                mShowProgressLoadingDialogLiveData.postValue(true)
                mModel.sendKBZPayQueryOrder(encryptDataQueryOrder,
                    success = {
                        mHideProgressLoadingDialogLiveData.postValue(true)
                    },
                    failure = {
                        mHideProgressLoadingDialogLiveData.postValue(true)
                        _errorLiveData.postValue(it)
                    })
//                Log.e("Mi4C_encrypt", encryptDataQueryOrder.encData)
//                Log.e("Mi4C_decrypt", decDataForQueryOrder)

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
    private fun generateEncDataForPreCreate(request: KBZPreCreateRequest): EncryptDataRequest {

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val customerAccountNo = "CustAccNo=${request.custAccNo}|"
        val name = "Name=${request.name}|"
        val billInvoiceNo = "BillInvoiceNo=${request.billInvoiceNo}|"
        val orderID = "OrderID=${request.orderID}|"
        val totalAmount = "TotalAmount=${request.totalAmount}|"
        val tradeType = "TradeType=APP|Title=Advance Payment|Currency=MMK|PaymentAlias=Advance|"
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
        val tradeType = "TradeType=APP|Title=Advance Payment|Currency=MMK|PaymentAlias=Advance|"
        val billMonth = "BillMonth=N/A|"
        val paymentType = "PaymentType=Android_AdvPay|"
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
        val tradeType = "TradeType=APP|Title=Advance Payment|Currency=MMK|PaymentAlias=Advance|"
        val billMonth = "BillMonth=N/A|"//${request.billMonth}|"
        val paymentType = "PaymentType=Android_AdvPay"
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

    //WavePay
    private fun generateEncDataForWavePay(request: WavePayRequest): EncryptDataRequest {

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val customerAccountNo = "CustAccNo=${request.custAccNo}|"
        val name = "Name=${request.name}|"
        val billInvoiceNo = "BillInvoiceNo=${request.billInvoiceNo}|"
        val orderID = "OrderID=${request.orderID}|"
        val totalAmount = "TotalAmount=${request.totalAmount}|"
        val tradeType = "TradeType=APP|Title=Advance Payment|Currency=MMK|PaymentAlias=Advance|"
        val billMonth = "BillMonth=N/A|"
        val paymentType = "PaymentType=Android_AdvPay"
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

    fun getAdvPayMonth ()
    {
        mShowProgressLoadingDialogLiveData.postValue(true)
        mModel.advTopUp(
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

    fun takePlanAction()
    {
        mShowProgressLoadingDialogLiveData.postValue(true)

        mModel.topUpAction(
            context = mView.getContext(),
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.status(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.status(it)
                _errorLiveData.postValue(it)

            }
        )
    }

}