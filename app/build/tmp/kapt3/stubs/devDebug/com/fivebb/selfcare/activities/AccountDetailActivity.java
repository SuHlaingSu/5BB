package com.fivebb.selfcare.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001c2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\rH\u0002J\b\u0010\u0018\u001a\u00020\rH\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/fivebb/selfcare/activities/AccountDetailActivity;", "Lcom/fivebb/selfcare/activities/ApplicationBaseActivity;", "Lcom/fivebb/selfcare/delegates/EmailActionDelegate;", "Lcom/fivebb/selfcare/mvp/views/AccountDetailsView;", "()V", "expandBillingInfo", "", "expandContactInfo", "expandCustomerInfo", "expandPlanDetail", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/AccountDetailsPresenter;", "addListeners", "", "bindDetails", "data", "Lcom/fivebb/shared/vos/CustomerBasicViewDetailsVO;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onGetEmailList", "onTapAddNew", "onTapVerify", "setUpPresenter", "showBillingInfoExpend", "showCustomerBasicViewDetail", "customerDetails", "showCustomerInfoExpend", "Companion", "app_devDebug"})
public final class AccountDetailActivity extends com.fivebb.selfcare.activities.ApplicationBaseActivity implements com.fivebb.selfcare.delegates.EmailActionDelegate, com.fivebb.selfcare.mvp.views.AccountDetailsView {
    private boolean expandCustomerInfo = true;
    private boolean expandContactInfo = true;
    private boolean expandBillingInfo = true;
    private boolean expandPlanDetail = true;
    private com.fivebb.selfcare.mvp.presenters.AccountDetailsPresenter mPresenter;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.AccountDetailActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public AccountDetailActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpPresenter() {
    }
    
    private final void addListeners() {
    }
    
    @java.lang.Override()
    public void showCustomerBasicViewDetail(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.CustomerBasicViewDetailsVO customerDetails) {
    }
    
    private final void bindDetails(com.fivebb.shared.vos.CustomerBasicViewDetailsVO data) {
    }
    
    @java.lang.Override()
    public void showCustomerInfoExpend() {
    }
    
    @java.lang.Override()
    public void showBillingInfoExpend() {
    }
    
    @java.lang.Override()
    public void onGetEmailList() {
    }
    
    @java.lang.Override()
    public void onTapAddNew() {
    }
    
    @java.lang.Override()
    public void onTapVerify() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/fivebb/selfcare/activities/AccountDetailActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_devDebug"})
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