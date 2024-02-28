package com.fivebb.selfcare.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000bH\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/fivebb/selfcare/activities/RelocationActivity;", "Lcom/fivebb/selfcare/activities/ApplicationBaseActivity;", "Lcom/fivebb/selfcare/mvp/views/RelocationView;", "()V", "customerDetail", "Lcom/fivebb/shared/vos/CustomerBasicViewDetailsVO;", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/RelocationPresenter;", "areRequiredFieldsFilled", "", "bindLocalizedData", "", "getContext", "Landroid/content/Context;", "initListeners", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUpPresenter", "showCustomerBasicViewDetails", "customerBasicViewDetails", "showSendEmailSuccess", "successMessage", "", "Companion", "app_psrRelease"})
public final class RelocationActivity extends com.fivebb.selfcare.activities.ApplicationBaseActivity implements com.fivebb.selfcare.mvp.views.RelocationView {
    private com.fivebb.selfcare.mvp.presenters.RelocationPresenter mPresenter;
    private com.fivebb.shared.vos.CustomerBasicViewDetailsVO customerDetail;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.RelocationActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public RelocationActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpPresenter() {
    }
    
    private final void initListeners() {
    }
    
    private final void bindLocalizedData() {
    }
    
    private final boolean areRequiredFieldsFilled() {
        return false;
    }
    
    @java.lang.Override()
    public void showCustomerBasicViewDetails(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.CustomerBasicViewDetailsVO customerBasicViewDetails) {
    }
    
    @java.lang.Override()
    public void showSendEmailSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String successMessage) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/fivebb/selfcare/activities/RelocationActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_psrRelease"})
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