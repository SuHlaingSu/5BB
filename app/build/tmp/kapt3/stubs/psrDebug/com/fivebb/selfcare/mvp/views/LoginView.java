package com.fivebb.selfcare.mvp.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0006H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&\u00a8\u0006\u0015"}, d2 = {"Lcom/fivebb/selfcare/mvp/views/LoginView;", "Lcom/fivebb/shared/mvp/views/BaseView;", "callLevel2Form", "", "fillPreviousAccountIdAndRememberMe", "accountId", "", "password", "checkedRememberMe", "", "getContext", "Landroid/content/Context;", "level2Form", "advancePaymentVO", "Lcom/fivebb/shared/vos/AdvancePaymentVO;", "navigateToForgetPassword", "navigateToHome", "serviceType", "onSuccessVerification", "data", "Lcom/fivebb/shared/vos/CheckVericationVO;", "app_psrDebug"})
public abstract interface LoginView extends com.fivebb.shared.mvp.views.BaseView {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    public abstract void navigateToHome(@org.jetbrains.annotations.NotNull()
    java.lang.String serviceType);
    
    public abstract void callLevel2Form();
    
    public abstract void fillPreviousAccountIdAndRememberMe(@org.jetbrains.annotations.NotNull()
    java.lang.String accountId, @org.jetbrains.annotations.NotNull()
    java.lang.String password, boolean checkedRememberMe);
    
    public abstract void navigateToForgetPassword();
    
    public abstract void onSuccessVerification(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.CheckVericationVO data);
    
    public abstract void level2Form(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.AdvancePaymentVO advancePaymentVO);
}