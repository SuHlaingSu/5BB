package com.fivebb.selfcare.network

import com.fivebb.selfcare.network.requests.*
import com.fivebb.selfcare.network.responses.EmailList
import com.fivebb.selfcare.network.responses.EmailListResponse
import com.fivebb.selfcare.utils.*
import com.fivebb.shared.network.responses.BaseResponse
import com.fivebb.shared.network.responses.DataResponse
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.vos.*
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface BSSApi {
    @POST(API_INVOICE_DOWNLOAD)
    fun getInvoicePDf(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: DownloadPaymentSlipRequest
    ): Observable<DataResponse<InvoiceVO>>
}