package com.fivebb.selfcare.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 K2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001KB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0017J\b\u0010 \u001a\u00020\u001aH\u0016J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0017J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u0006H\u0002J\b\u0010\'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u0006H\u0002J\u0010\u0010*\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020+H\u0017J\b\u0010,\u001a\u00020\u001aH\u0016J\b\u0010-\u001a\u00020\u001aH\u0002J\b\u0010.\u001a\u00020\u001aH\u0002J\u0010\u0010/\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u000200H\u0017J\b\u00101\u001a\u00020\u001aH\u0016J\u0012\u00102\u001a\u00020\u001a2\b\u00103\u001a\u0004\u0018\u000104H\u0014J\b\u00105\u001a\u00020\u001aH\u0014J\b\u00106\u001a\u00020\u001aH\u0014J\u0010\u00107\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u000208H\u0017J\u0010\u00109\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020:H\u0017J\u0010\u0010;\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020<H\u0017J\u0010\u0010=\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020>H\u0017J\u0010\u0010?\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020@H\u0017J\u0010\u0010A\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u0006H\u0016J\b\u0010C\u001a\u00020\u001aH\u0002J\u0016\u0010D\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020F0EH\u0016J\b\u0010G\u001a\u00020\u001aH\u0002J\u0010\u0010H\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020%H\u0016J\b\u0010I\u001a\u00020\u001aH\u0002J\u0010\u0010J\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020FH\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006L"}, d2 = {"Lcom/fivebb/selfcare/activities/ChooseBankActivity;", "Lcom/fivebb/selfcare/activities/ApplicationBaseActivity;", "Lcom/fivebb/selfcare/mvp/views/AdvTopUpView;", "Lcom/fivebb/selfcare/mvp/views/BankListView;", "()V", "advID", "", "billNo", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "setDisposables", "(Lio/reactivex/disposables/CompositeDisposable;)V", "mBankAdapter", "Lcom/fivebb/selfcare/adapters/BankAdapter;", "mCurrentPlan", "Lcom/fivebb/shared/vos/CurrentPlanVO;", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/AdvTopUpPresenter;", "mUnpaidAmount", "orderID", "timeStamp", "totalAmt", "", "ayaPayLink", "", "data", "Lcom/fivebb/selfcare/network/responses/AYARequestPushPaymentResponse;", "callPayRetrieveStatus", "status", "Lcom/fivebb/selfcare/network/requests/CitizenPayRequest;", "chooseToPlan", "citizenPaymentRetrieveStatus", "response", "Lcom/fivebb/selfcare/network/responses/CitizenRetrieveResponse;", "createOrderInfo", "Lcom/fivebb/selfcare/network/responses/KBZOrderInfoResponse;", "createTimestamp", "getContext", "Landroid/content/Context;", "getCurrentDateString", "getPlanPriceList", "Lcom/fivebb/shared/vos/PlanPriceListVO;", "goToBank", "initListeners", "initPresenter", "mcfPayPaymentLink", "Lcom/fivebb/selfcare/network/responses/CitizenPayResponse;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "queryOrderAYAPay", "Lcom/fivebb/selfcare/network/responses/AYAQueryOrderResponse;", "queryOrderWPay", "Lcom/fivebb/selfcare/network/responses/WaveQueryOrderResponse;", "requestQueryOrderAYAPay", "Lcom/fivebb/selfcare/network/requests/AYAPayRequest;", "requestQueryOrderWPay", "Lcom/fivebb/selfcare/network/requests/WavePayRequest;", "requestWavePayResponse", "Lcom/fivebb/selfcare/network/responses/WavePayResponse;", "responseOfAYAPay", "message", "setUpRecyclerView", "showAllBank", "", "Lcom/fivebb/shared/vos/BankVO;", "showData", "showKBZPayAPP", "showPhBoxForAYAPay", "showSelectedBankInfo", "Companion", "app_psrRelease"})
public final class ChooseBankActivity extends com.fivebb.selfcare.activities.ApplicationBaseActivity implements com.fivebb.selfcare.mvp.views.AdvTopUpView, com.fivebb.selfcare.mvp.views.BankListView {
    private com.fivebb.selfcare.adapters.BankAdapter mBankAdapter;
    private com.fivebb.selfcare.mvp.presenters.AdvTopUpPresenter mPresenter;
    private com.fivebb.shared.vos.CurrentPlanVO mCurrentPlan;
    private java.lang.String timeStamp = "";
    private java.lang.String advID = "";
    private java.lang.String mUnpaidAmount = "";
    private java.lang.String billNo = "";
    private java.lang.String orderID = "";
    private double totalAmt = 0.0;
    @org.jetbrains.annotations.Nullable()
    private io.reactivex.disposables.CompositeDisposable disposables;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.ChooseBankActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public ChooseBankActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.reactivex.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    public final void setDisposables(@org.jetbrains.annotations.Nullable()
    io.reactivex.disposables.CompositeDisposable p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showData() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void setUpRecyclerView() {
    }
    
    private final void initPresenter() {
    }
    
    private final void initListeners() {
    }
    
    @java.lang.Override()
    public void status(@org.jetbrains.annotations.NotNull()
    java.lang.String status) {
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
    
    private final void showPhBoxForAYAPay() {
    }
    
    private final java.lang.String createTimestamp() {
        return null;
    }
    
    private final java.lang.String getCurrentDateString() {
        return null;
    }
    
    @java.lang.Override()
    public void showKBZPayAPP(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.KBZOrderInfoResponse data) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void getPlanPriceList(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.PlanPriceListVO data) {
    }
    
    @java.lang.Override()
    public void goToBank() {
    }
    
    @java.lang.Override()
    public void chooseToPlan() {
    }
    
    @java.lang.Override()
    public void ayaPayLink(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.AYARequestPushPaymentResponse data) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void requestQueryOrderAYAPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.AYAPayRequest data) {
    }
    
    @java.lang.Override()
    public void responseOfAYAPay(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
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
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void callPayRetrieveStatus(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.CitizenPayRequest status) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult", "SetJavaScriptEnabled"})
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
    
    private final java.lang.String createOrderInfo(com.fivebb.selfcare.network.responses.KBZOrderInfoResponse data) {
        return null;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/fivebb/selfcare/activities/ChooseBankActivity$Companion;", "", "()V", "newIntent", "", "context", "Landroid/content/Context;", "advPlanListVO", "Lcom/fivebb/shared/vos/AdvPlanListVO;", "app_psrRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.fivebb.shared.vos.AdvPlanListVO advPlanListVO) {
        }
    }
}