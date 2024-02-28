package com.fivebb.selfcare.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0017J \u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u0012\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0002J\b\u0010\u001f\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/fivebb/selfcare/activities/LoginActivity;", "Lcom/fivebb/shared/activities/BaseActivity;", "Lcom/fivebb/selfcare/mvp/views/LoginView;", "()V", "checkedRememberMe", "", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/LoginPresenter;", "areRequiredFieldsFilled", "bindLocalizedData", "", "callLevel2Form", "fillPreviousAccountIdAndRememberMe", "accountId", "", "password", "getContext", "Landroid/content/Context;", "level2Form", "advancePaymentVO", "Lcom/fivebb/shared/vos/AdvancePaymentVO;", "navigateToForgetPassword", "navigateToHome", "serviceType", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSuccessVerification", "data", "Lcom/fivebb/shared/vos/CheckVericationVO;", "setUpListeners", "setUpPresenter", "Companion", "app_devDebug"})
public final class LoginActivity extends com.fivebb.shared.activities.BaseActivity implements com.fivebb.selfcare.mvp.views.LoginView {
    private com.fivebb.selfcare.mvp.presenters.LoginPresenter mPresenter;
    private boolean checkedRememberMe = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.LoginActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public LoginActivity() {
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
    
    private final void setUpListeners() {
    }
    
    private final boolean areRequiredFieldsFilled() {
        return false;
    }
    
    private final void bindLocalizedData() {
    }
    
    @java.lang.Override()
    public void fillPreviousAccountIdAndRememberMe(@org.jetbrains.annotations.NotNull()
    java.lang.String accountId, @org.jetbrains.annotations.NotNull()
    java.lang.String password, boolean checkedRememberMe) {
    }
    
    @java.lang.Override()
    public void navigateToHome(@org.jetbrains.annotations.NotNull()
    java.lang.String serviceType) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void callLevel2Form() {
    }
    
    @java.lang.Override()
    public void navigateToForgetPassword() {
    }
    
    @java.lang.Override()
    public void onSuccessVerification(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.CheckVericationVO data) {
    }
    
    @java.lang.Override()
    public void level2Form(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.AdvancePaymentVO advancePaymentVO) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/fivebb/selfcare/activities/LoginActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_devDebug"})
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