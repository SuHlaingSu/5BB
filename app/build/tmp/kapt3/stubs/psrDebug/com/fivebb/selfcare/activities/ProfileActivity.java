package com.fivebb.selfcare.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0002J\b\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\u0012\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\tH\u0014J\b\u0010\u0017\u001a\u00020\tH\u0002J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010\u001b\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016J\b\u0010\u001f\u001a\u00020\tH\u0016J$\u0010 \u001a\u00020\t*\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/fivebb/selfcare/activities/ProfileActivity;", "Lcom/fivebb/shared/activities/BaseActivity;", "Lcom/fivebb/selfcare/mvp/views/ProfileView;", "()V", "activityOpenInProgress", "", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/ProfilePresenter;", "bindLocalizedData", "", "getContext", "Landroid/content/Context;", "hideLoading", "initListeners", "navigateToAccountDetail", "navigateToAdvPayTopUp", "navigateToChangePassword", "navigateToLoginScreen", "navigateToPaymentHistory", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setUpPresenter", "showAdvPayment", "paymentVO", "Lcom/fivebb/shared/vos/AdvancePaymentVO;", "showBillingList", "billList", "", "Lcom/fivebb/shared/vos/BillVO;", "showLoading", "clickWithDebounce", "Landroid/view/View;", "debounceTime", "", "action", "Lkotlin/Function0;", "Companion", "app_psrDebug"})
public final class ProfileActivity extends com.fivebb.shared.activities.BaseActivity implements com.fivebb.selfcare.mvp.views.ProfileView {
    private boolean activityOpenInProgress = false;
    private com.fivebb.selfcare.mvp.presenters.ProfilePresenter mPresenter;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.ProfileActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public ProfileActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    public void showAdvPayment(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.AdvancePaymentVO paymentVO) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpPresenter() {
    }
    
    private final void initListeners() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void clickWithDebounce(android.view.View $this$clickWithDebounce, long debounceTime, kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    @java.lang.Override()
    public void showBillingList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.BillVO> billList) {
    }
    
    private final void bindLocalizedData() {
    }
    
    @java.lang.Override()
    public void navigateToLoginScreen() {
    }
    
    @java.lang.Override()
    public void navigateToAccountDetail() {
    }
    
    @java.lang.Override()
    public void navigateToChangePassword() {
    }
    
    @java.lang.Override()
    public void navigateToPaymentHistory() {
    }
    
    @java.lang.Override()
    public void navigateToAdvPayTopUp() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/fivebb/selfcare/activities/ProfileActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_psrDebug"})
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