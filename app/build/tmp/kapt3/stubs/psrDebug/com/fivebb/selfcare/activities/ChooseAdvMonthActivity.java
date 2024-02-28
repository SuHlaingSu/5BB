package com.fivebb.selfcare.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001<B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u000eH\u0016J\b\u0010 \u001a\u00020\u000eH\u0002J\b\u0010!\u001a\u00020\u000eH\u0002J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0010\u0010\'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0006H\u0016J\u0010\u0010)\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020\u000eH\u0002J\u0016\u00107\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002080\fH\u0016J\u0010\u00109\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u000208H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u000205H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/fivebb/selfcare/activities/ChooseAdvMonthActivity;", "Lcom/fivebb/selfcare/activities/ApplicationBaseActivity;", "Lcom/fivebb/selfcare/mvp/views/AdvTopUpView;", "Lcom/fivebb/selfcare/delegates/AdvPayMonthActionDelegate;", "()V", "listPlan", "Lcom/fivebb/shared/vos/AdvPlanListVO;", "mAdvPaymentAdapter", "Lcom/fivebb/selfcare/adapters/advPaymentChooseMonth/AdvPaymentAdapter;", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/AdvTopUpPresenter;", "monthList", "", "ayaPayLink", "", "data", "Lcom/fivebb/selfcare/network/responses/AYARequestPushPaymentResponse;", "callPayRetrieveStatus", "status", "Lcom/fivebb/selfcare/network/requests/CitizenPayRequest;", "chooseToPlan", "citizenPaymentRetrieveStatus", "response", "Lcom/fivebb/selfcare/network/responses/CitizenRetrieveResponse;", "dp", "", "", "getContext", "Landroid/content/Context;", "getPlanPriceList", "Lcom/fivebb/shared/vos/PlanPriceListVO;", "goToBank", "initListeners", "initPresenter", "mcfPayPaymentLink", "Lcom/fivebb/selfcare/network/responses/CitizenPayResponse;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSelectClick", "item", "queryOrderAYAPay", "Lcom/fivebb/selfcare/network/responses/AYAQueryOrderResponse;", "queryOrderWPay", "Lcom/fivebb/selfcare/network/responses/WaveQueryOrderResponse;", "requestQueryOrderAYAPay", "Lcom/fivebb/selfcare/network/requests/AYAPayRequest;", "requestQueryOrderWPay", "Lcom/fivebb/selfcare/network/requests/WavePayRequest;", "requestWavePayResponse", "Lcom/fivebb/selfcare/network/responses/WavePayResponse;", "responseOfAYAPay", "message", "", "setUpRecyclerView", "showAllBank", "Lcom/fivebb/shared/vos/BankVO;", "showKBZPayAPP", "Lcom/fivebb/selfcare/network/responses/KBZOrderInfoResponse;", "showSelectedBankInfo", "Companion", "app_psrDebug"})
public final class ChooseAdvMonthActivity extends com.fivebb.selfcare.activities.ApplicationBaseActivity implements com.fivebb.selfcare.mvp.views.AdvTopUpView, com.fivebb.selfcare.delegates.AdvPayMonthActionDelegate {
    private com.fivebb.selfcare.adapters.advPaymentChooseMonth.AdvPaymentAdapter mAdvPaymentAdapter;
    private com.fivebb.selfcare.mvp.presenters.AdvTopUpPresenter mPresenter;
    private java.util.List<com.fivebb.shared.vos.AdvPlanListVO> monthList;
    private com.fivebb.shared.vos.AdvPlanListVO listPlan;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.ChooseAdvMonthActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public ChooseAdvMonthActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initPresenter() {
    }
    
    private final void setUpRecyclerView() {
    }
    
    private final void initListeners() {
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
    
    private final float dp(int dp) {
        return 0.0F;
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
    
    @java.lang.Override()
    public void onSelectClick(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.AdvPlanListVO item) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/fivebb/selfcare/activities/ChooseAdvMonthActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_psrDebug"})
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