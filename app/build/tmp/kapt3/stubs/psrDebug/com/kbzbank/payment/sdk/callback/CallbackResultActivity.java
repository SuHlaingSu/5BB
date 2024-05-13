package com.kbzbank.payment.sdk.callback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0002J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\u0012\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0015J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020&H\u0016J\u0010\u0010\'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020)H\u0016J\u0016\u0010*\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020,0+H\u0016J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020,H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020)H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/kbzbank/payment/sdk/callback/CallbackResultActivity;", "Lcom/fivebb/selfcare/activities/ApplicationBaseActivity;", "Lcom/fivebb/selfcare/mvp/views/AdvTopUpView;", "()V", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/AdvTopUpPresenter;", "ayaPayLink", "", "data", "Lcom/fivebb/selfcare/network/responses/AYARequestPushPaymentResponse;", "callPayRetrieveStatus", "status", "Lcom/fivebb/selfcare/network/requests/CitizenPayRequest;", "chooseToPlan", "citizenPaymentRetrieveStatus", "response", "Lcom/fivebb/selfcare/network/responses/CitizenRetrieveResponse;", "getContext", "Landroid/content/Context;", "getPlanPriceList", "Lcom/fivebb/shared/vos/PlanPriceListVO;", "goToBank", "initPresenter", "mcfPayPaymentLink", "Lcom/fivebb/selfcare/network/responses/CitizenPayResponse;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "queryOrderAYAPay", "Lcom/fivebb/selfcare/network/responses/AYAQueryOrderResponse;", "queryOrderWPay", "Lcom/fivebb/selfcare/network/responses/WaveQueryOrderResponse;", "requestQueryOrderAYAPay", "Lcom/fivebb/selfcare/network/requests/AYAPayRequest;", "requestQueryOrderWPay", "Lcom/fivebb/selfcare/network/requests/WavePayRequest;", "requestWavePayResponse", "Lcom/fivebb/selfcare/network/responses/WavePayResponse;", "responseOfAYAPay", "message", "", "showAllBank", "", "Lcom/fivebb/shared/vos/BankVO;", "showKBZPayAPP", "Lcom/fivebb/selfcare/network/responses/KBZOrderInfoResponse;", "showSelectedBankInfo", "Companion", "app_psrDebug"})
public final class CallbackResultActivity extends com.fivebb.selfcare.activities.ApplicationBaseActivity implements com.fivebb.selfcare.mvp.views.AdvTopUpView {
    private com.fivebb.selfcare.mvp.presenters.AdvTopUpPresenter mPresenter;
    @org.jetbrains.annotations.NotNull()
    public static final com.kbzbank.payment.sdk.callback.CallbackResultActivity.Companion Companion = null;
    public static final int REQUEST_CODE = 1001;
    private java.util.HashMap _$_findViewCache;
    
    public CallbackResultActivity() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initPresenter() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    public void showAllBank(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.BankVO> data) {
    }
    
    @java.lang.Override()
    public void showSelectedBankInfo(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.BankVO data) {
    }
    
    @java.lang.Override()
    public void showKBZPayAPP(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.KBZOrderInfoResponse data) {
    }
    
    @java.lang.Override()
    public void getPlanPriceList(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.PlanPriceListVO data) {
    }
    
    @java.lang.Override()
    public void goToBank() {
    }
    
    @java.lang.Override()
    public void status(@org.jetbrains.annotations.NotNull()
    java.lang.String status) {
    }
    
    @java.lang.Override()
    public void chooseToPlan() {
    }
    
    @java.lang.Override()
    public void ayaPayLink(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.AYARequestPushPaymentResponse data) {
    }
    
    @java.lang.Override()
    public void requestQueryOrderAYAPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.AYAPayRequest data) {
    }
    
    @java.lang.Override()
    public void responseOfAYAPay(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void queryOrderAYAPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.AYAQueryOrderResponse data) {
    }
    
    @java.lang.Override()
    public void mcfPayPaymentLink(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.CitizenPayResponse data) {
    }
    
    @java.lang.Override()
    public void citizenPaymentRetrieveStatus(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.CitizenRetrieveResponse response) {
    }
    
    @java.lang.Override()
    public void callPayRetrieveStatus(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.CitizenPayRequest status) {
    }
    
    @java.lang.Override()
    public void requestWavePayResponse(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.WavePayResponse data) {
    }
    
    @java.lang.Override()
    public void requestQueryOrderWPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.WavePayRequest data) {
    }
    
    @java.lang.Override()
    public void queryOrderWPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.WaveQueryOrderResponse data) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/kbzbank/payment/sdk/callback/CallbackResultActivity$Companion;", "", "()V", "REQUEST_CODE", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_psrDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}