package com.fivebb.selfcare.network

import com.fivebb.selfcare.network.requests.*
import com.fivebb.selfcare.utils.*
import com.fivebb.shared.network.responses.BaseResponse
import com.fivebb.shared.network.responses.DataResponse
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.vos.*
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface UserApi {

    @POST(API_LOG_IN_BY_PHONENUMBER_AND_PASSWORD)
    fun login(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Body request: LoginRequest
    ): Observable<DataResponse<UserLoginVO>>

    @POST(API_CUSTOMER_DETAIL)
    fun getCustomerDetail(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: CustomerDetailRequest
    ): Observable<DataResponse<CustomerBasicViewDetailsVO>>

    @POST(API_CHANGE_PASSWORD)
    fun changePassword(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: ChangePasswordRequest
    ): Observable<BaseResponse>

    @POST(API_PAYMENT_HISTORY)
    fun getPaymentHistory(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: PaymentHistoryRequest
    ): Observable<DataResponse<PaymentDetailVO>>

    @POST(API_LIST_OF_BILL)
    fun getBillList(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: BillListRequest
    ): Observable<DataResponse<MutableList<BillVO>>>

    @POST(API_LOAD_TICKET_CONFIGURATION)
    fun getTicketConfiguration(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: TicketConfigurationRequest
    ): Observable<DataResponse<TicketConfigVO>>


    @POST(API_RECHARGED_HISTORY)
    fun getRechargedHistory(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: RechargedHistoryRequest
    ): Observable<BaseResponse>

    @POST(API_SERVICE_INSTANCE_SUMMARY_DETAILS)
    fun getServiceInstanceSummary(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: ServiceInstanceSummaryRequest
    ): Observable<DataResponse<ServiceInstanceSummaryVO>>

    @POST(API_GET_SECRET_QUESTION)
    fun getSecretQuestion(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Body request: SecretQuestionRequest
    ): Observable<DataResponse<SecretQuestionVO>>

    @POST(API_VALIDATE_SECRET_QUESTION)
    fun validateSecretQuestion(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Body request: SecretQuestionRequest
    ): Observable<BaseResponse>

}