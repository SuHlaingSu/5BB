package com.fivebb.selfcare.network

import com.fivebb.selfcare.network.requests.*
import com.fivebb.selfcare.network.responses.*
import com.fivebb.selfcare.utils.*
import com.fivebb.shared.network.responses.DataResponse
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.vos.*
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface PaymentApi {
    //KBZ
    @POST(API_KBZ_PRE_CREATE)
    fun kbzPreCreate(
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body encryptData: EncryptDataRequest): Observable<DataResponse<KBZPreCreateResponse>>

    @POST(API_KBZ_QUERY_ORDER)
    fun kbzQueryOrder(
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body encryptData: EncryptDataRequest): Observable<DataResponse<KBZQueryOrderResponse>>

    @POST(API_KBZ_ORDER_INFO)
    fun kbzOrderInfo(
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body encryptData: EncryptDataRequest): Observable<DataResponse<KBZOrderInfoResponse>>
    // API_VERSION
    @POST(API_GET_APP_VERSION)
    fun getAppVersion(
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body appVersion: AppIDRequest
    ): Observable<DataResponse<AppVersionVO>>
    //Advanced Payment
    @POST(API_ADVANCE_PAYMENT)
    fun getAdvancedPayment(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body advancePaymentRequest: AdvancePaymentRequest
    ): Observable<DataResponse<AdvancePaymentVO>>

    //Advanced Payment
    @POST(API_ADVANCE_PAYMENT)
    fun getPXDetails(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body advancePaymentRequest: AdvancePaymentRequest
    ): Observable<DataResponse<PXDetailVO>>

    //AYA_Pay
    @POST(API_AYA_PAY)
    fun ayaPay(
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body encryptData: EncryptDataRequest): Observable<DataResponse<AYARequestPushPaymentResponse>>

    @POST(API_AYA_QUERY_ORDER)
    fun ayaPayQueryOrder(
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body encryptData: EncryptDataRequest): Observable<DataResponse<AYAQueryOrderResponse>>
    //CitizenPay
    @POST(API_CITIZEN_PAY)
    fun mcfPay(
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body encryptData: EncryptDataRequest): Observable<DataResponse<CitizenPayResponse>>

    @POST(API_CITIZEN_RETRIEVE)
    fun mcfRetrieve(
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body encryptData: EncryptDataRequest): Observable<DataResponse<CitizenRetrieveResponse>>

    //WavePay
    @POST(API_WAVE_PAY)
    fun wavePayRequest(
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body encryptData: EncryptDataRequest): Observable<DataResponse<WavePayResponse>>

    @POST(API_WAVE_QUERY_ORDER)
    fun wavePayQueryOrder(
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body encryptData: EncryptDataRequest): Observable<DataResponse<WaveQueryOrderResponse>>

    @POST(API_PX_PLAN)
    fun getPXPlan(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: PXPlanListRequest
    ): Observable<DataResponse<PXPlanListVO>>
}