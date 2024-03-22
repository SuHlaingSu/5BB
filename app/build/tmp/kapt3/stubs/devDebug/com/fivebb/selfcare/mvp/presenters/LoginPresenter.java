package com.fivebb.selfcare.mvp.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u0006\u0010\u000b\u001a\u00020\u0006J\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\u0006\u00a8\u0006\u0015"}, d2 = {"Lcom/fivebb/selfcare/mvp/presenters/LoginPresenter;", "Lcom/fivebb/shared/mvp/presenters/BasePresenter;", "Lcom/fivebb/selfcare/mvp/views/LoginView;", "Lcom/fivebb/selfcare/models/UserModel;", "()V", "checkedRememberPreviousAccountId", "", "getLoginHistory", "Landroidx/lifecycle/LiveData;", "", "Lcom/fivebb/shared/vos/LoginHistroyVO;", "getLvl2Form", "loginAndGetAccountDetail", "accountId", "", "password", "checkedRememberMe", "", "onCallCheckVerification", "onSubscribedTopicsWithAccount", "onTapForgetPassword", "app_devDebug"})
public final class LoginPresenter extends com.fivebb.shared.mvp.presenters.BasePresenter<com.fivebb.selfcare.mvp.views.LoginView, com.fivebb.selfcare.models.UserModel> {
    
    public LoginPresenter() {
        super();
    }
    
    public final void loginAndGetAccountDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String accountId, @org.jetbrains.annotations.NotNull()
    java.lang.String password, boolean checkedRememberMe) {
    }
    
    public final void checkedRememberPreviousAccountId() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.fivebb.shared.vos.LoginHistroyVO>> getLoginHistory() {
        return null;
    }
    
    public final void onTapForgetPassword() {
    }
    
    public final void onCallCheckVerification() {
    }
    
    public final void onSubscribedTopicsWithAccount() {
    }
    
    public final void getLvl2Form() {
    }
}