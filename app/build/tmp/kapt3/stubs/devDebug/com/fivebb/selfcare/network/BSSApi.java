package com.fivebb.selfcare.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/fivebb/selfcare/network/BSSApi;", "", "getInvoicePDf", "Lio/reactivex/Observable;", "Lcom/fivebb/shared/network/responses/DataResponse;", "Lcom/fivebb/shared/vos/InvoiceVO;", "contentType", "", "authorization", "request", "Lcom/fivebb/selfcare/network/requests/DownloadPaymentSlipRequest;", "app_devDebug"})
public abstract interface BSSApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "DownloadPaymentSlip")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.shared.vos.InvoiceVO>> getInvoicePDf(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.DownloadPaymentSlipRequest request);
}