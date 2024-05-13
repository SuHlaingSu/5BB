package com.fivebb.selfcare.mvp.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0016\u0010\u001b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001fH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001dH&\u00a8\u0006!"}, d2 = {"Lcom/fivebb/selfcare/mvp/views/RechargeTopUpView;", "Lcom/fivebb/shared/mvp/views/BaseView;", "ayaPayLink", "", "data", "Lcom/fivebb/selfcare/network/responses/AYARequestPushPaymentResponse;", "callPayRetrieveStatus", "status", "Lcom/fivebb/selfcare/network/requests/CitizenPayRequest;", "citizenPaymentRetrieveStatus", "response", "Lcom/fivebb/selfcare/network/responses/CitizenRetrieveResponse;", "mcfPayPaymentLink", "Lcom/fivebb/selfcare/network/responses/CitizenPayResponse;", "queryOrderAYAPay", "Lcom/fivebb/selfcare/network/responses/AYAQueryOrderResponse;", "queryOrderWPay", "Lcom/fivebb/selfcare/network/responses/WaveQueryOrderResponse;", "requestQueryOrderAYAPay", "Lcom/fivebb/selfcare/network/requests/AYAPayRequest;", "requestQueryOrderWPay", "Lcom/fivebb/selfcare/network/requests/WavePayRequest;", "requestWavePayResponse", "Lcom/fivebb/selfcare/network/responses/WavePayResponse;", "responseOfAYAPay", "message", "", "showAllBank", "", "Lcom/fivebb/shared/vos/BankVO;", "showKBZPayAPP", "Lcom/fivebb/selfcare/network/responses/KBZOrderInfoResponse;", "showSelectedBankInfo", "app_devDebug"})
public abstract interface RechargeTopUpView extends com.fivebb.shared.mvp.views.BaseView {
    
    public abstract void showAllBank(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.BankVO> data);
    
    public abstract void showSelectedBankInfo(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.BankVO data);
    
    public abstract void showKBZPayAPP(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.KBZOrderInfoResponse data);
    
    public abstract void ayaPayLink(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.AYARequestPushPaymentResponse data);
    
    public abstract void responseOfAYAPay(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void requestQueryOrderAYAPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.AYAPayRequest data);
    
    public abstract void queryOrderAYAPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.AYAQueryOrderResponse data);
    
    public abstract void mcfPayPaymentLink(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.CitizenPayResponse data);
    
    public abstract void citizenPaymentRetrieveStatus(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.CitizenRetrieveResponse response);
    
    public abstract void callPayRetrieveStatus(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.CitizenPayRequest status);
    
    public abstract void requestWavePayResponse(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.WavePayResponse data);
    
    public abstract void requestQueryOrderWPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.WavePayRequest data);
    
    public abstract void queryOrderWPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.WaveQueryOrderResponse data);
}