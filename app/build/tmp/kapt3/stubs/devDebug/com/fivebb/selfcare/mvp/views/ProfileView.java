package com.fivebb.selfcare.mvp.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&J\u0016\u0010\u000e\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&J\b\u0010\u0012\u001a\u00020\u0005H&\u00a8\u0006\u0013"}, d2 = {"Lcom/fivebb/selfcare/mvp/views/ProfileView;", "Lcom/fivebb/shared/mvp/views/BaseView;", "getContext", "Landroid/content/Context;", "hideLoading", "", "navigateToAccountDetail", "navigateToAdvPayTopUp", "navigateToChangePassword", "navigateToLoginScreen", "navigateToPaymentHistory", "showAdvPayment", "paymentVO", "Lcom/fivebb/shared/vos/AdvancePaymentVO;", "showBillingList", "billList", "", "Lcom/fivebb/shared/vos/BillVO;", "showLoading", "app_devDebug"})
public abstract interface ProfileView extends com.fivebb.shared.mvp.views.BaseView {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    public abstract void showLoading();
    
    public abstract void hideLoading();
    
    public abstract void showBillingList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.BillVO> billList);
    
    public abstract void showAdvPayment(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.AdvancePaymentVO paymentVO);
    
    public abstract void navigateToLoginScreen();
    
    public abstract void navigateToAccountDetail();
    
    public abstract void navigateToChangePassword();
    
    public abstract void navigateToPaymentHistory();
    
    public abstract void navigateToAdvPayTopUp();
}