package com.fivebb.selfcare.activities.prepaid;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ;2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001;B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0017J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u000eH\u0002J\b\u0010\u001e\u001a\u00020\u000eH\u0002J\b\u0010\u001f\u001a\u00020\u0012H\u0002J\b\u0010 \u001a\u00020\u0012H\u0002J\b\u0010!\u001a\u00020\u0012H\u0002J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020#H\u0017J\u0012\u0010$\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010\'\u001a\u00020\u0012H\u0014J\b\u0010(\u001a\u00020\u0012H\u0014J\u0010\u0010)\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020,H\u0017J\u0010\u0010-\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u000200H\u0017J\u0010\u00101\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u000202H\u0017J\u0010\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u000eH\u0016J\b\u00105\u001a\u00020\u0012H\u0002J\u0016\u00106\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020807H\u0016J\u0010\u00109\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u001cH\u0016J\u0010\u0010:\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u000208H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/fivebb/selfcare/activities/prepaid/PXChooseBankActivity;", "Lcom/fivebb/selfcare/activities/ApplicationBaseActivity;", "Lcom/fivebb/selfcare/mvp/views/RechargeTopUpView;", "Lcom/fivebb/selfcare/mvp/views/BankListView;", "()V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "mBankAdapter", "Lcom/fivebb/selfcare/adapters/BankAdapter;", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/RechargeTopUpPresenter;", "rechargeVO", "Lcom/fivebb/shared/vos/RechargeVO;", "timeStamp", "", "totalAmt", "", "ayaPayLink", "", "data", "Lcom/fivebb/selfcare/network/responses/AYARequestPushPaymentResponse;", "callPayRetrieveStatus", "status", "Lcom/fivebb/selfcare/network/requests/CitizenPayRequest;", "citizenPaymentRetrieveStatus", "response", "Lcom/fivebb/selfcare/network/responses/CitizenRetrieveResponse;", "createOrderInfo", "Lcom/fivebb/selfcare/network/responses/KBZOrderInfoResponse;", "createTimestamp", "getCurrentDateString", "getIntentExtraData", "initListeners", "initPresenter", "mcfPayPaymentLink", "Lcom/fivebb/selfcare/network/responses/CitizenPayResponse;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "queryOrderAYAPay", "Lcom/fivebb/selfcare/network/responses/AYAQueryOrderResponse;", "queryOrderWPay", "Lcom/fivebb/selfcare/network/responses/WaveQueryOrderResponse;", "requestQueryOrderAYAPay", "Lcom/fivebb/selfcare/network/requests/AYAPayRequest;", "requestQueryOrderWPay", "Lcom/fivebb/selfcare/network/requests/WavePayRequest;", "requestWavePayResponse", "Lcom/fivebb/selfcare/network/responses/WavePayResponse;", "responseOfAYAPay", "message", "setUpRecyclerView", "showAllBank", "", "Lcom/fivebb/shared/vos/BankVO;", "showKBZPayAPP", "showSelectedBankInfo", "Companion", "app_psrDebug"})
public final class PXChooseBankActivity extends com.fivebb.selfcare.activities.ApplicationBaseActivity implements com.fivebb.selfcare.mvp.views.RechargeTopUpView, com.fivebb.selfcare.mvp.views.BankListView {
    private com.fivebb.selfcare.adapters.BankAdapter mBankAdapter;
    private com.fivebb.selfcare.mvp.presenters.RechargeTopUpPresenter mPresenter;
    private com.fivebb.shared.vos.RechargeVO rechargeVO;
    private java.lang.String timeStamp = "";
    private double totalAmt = 0.0;
    private io.reactivex.disposables.CompositeDisposable disposables;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.prepaid.PXChooseBankActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public PXChooseBankActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    public void ayaPayLink(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.AYARequestPushPaymentResponse data) {
    }
    
    @java.lang.Override()
    public void responseOfAYAPay(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void requestQueryOrderAYAPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.AYAPayRequest data) {
    }
    
    @java.lang.Override()
    public void queryOrderAYAPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.AYAQueryOrderResponse data) {
    }
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    @java.lang.Override()
    public void mcfPayPaymentLink(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.CitizenPayResponse data) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void citizenPaymentRetrieveStatus(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.CitizenRetrieveResponse response) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void callPayRetrieveStatus(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.CitizenPayRequest status) {
    }
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled", "CheckResult"})
    @java.lang.Override()
    public void requestWavePayResponse(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.WavePayResponse data) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void requestQueryOrderWPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.WavePayRequest data) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void queryOrderWPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.WaveQueryOrderResponse data) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void showAllBank(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.BankVO> data) {
    }
    
    private final void initListeners() {
    }
    
    private final void initPresenter() {
    }
    
    private final void setUpRecyclerView() {
    }
    
    private final void getIntentExtraData() {
    }
    
    private final java.lang.String createTimestamp() {
        return null;
    }
    
    private final java.lang.String getCurrentDateString() {
        return null;
    }
    
    private final java.lang.String createOrderInfo(com.fivebb.selfcare.network.responses.KBZOrderInfoResponse data) {
        return null;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/fivebb/selfcare/activities/prepaid/PXChooseBankActivity$Companion;", "", "()V", "newIntent", "", "context", "Landroid/content/Context;", "rechargeVO", "Lcom/fivebb/shared/vos/RechargeVO;", "app_psrDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.fivebb.shared.vos.RechargeVO rechargeVO) {
        }
    }
}