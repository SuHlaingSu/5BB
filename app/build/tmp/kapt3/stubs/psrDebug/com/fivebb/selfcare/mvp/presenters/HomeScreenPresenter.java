package com.fivebb.selfcare.mvp.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\tJ\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\tJ\u0006\u0010\u0016\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/fivebb/selfcare/mvp/presenters/HomeScreenPresenter;", "Lcom/fivebb/shared/mvp/presenters/BasePresenter;", "Lcom/fivebb/selfcare/mvp/views/HomeScreenView;", "Lcom/fivebb/selfcare/models/UserModel;", "()V", "mBillingList", "", "Lcom/fivebb/shared/vos/BillVO;", "getAdvPayment", "", "getPXDetails", "loadAppImageList", "loadBillingList", "context", "Landroid/content/Context;", "loadCustomerBasicViewDetails", "loadHomeScreenInfo", "loadPaymentHistory", "onDownloadPaymentPDF", "creditNo", "", "onHomeScreenUiReady", "onTapProfile", "onUiReady", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onViewPaymentPDF", "app_psrDebug"})
public final class HomeScreenPresenter extends com.fivebb.shared.mvp.presenters.BasePresenter<com.fivebb.selfcare.mvp.views.HomeScreenView, com.fivebb.selfcare.models.UserModel> {
    private java.util.List<com.fivebb.shared.vos.BillVO> mBillingList;
    
    public HomeScreenPresenter() {
        super();
    }
    
    public final void onUiReady(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    public final void loadCustomerBasicViewDetails() {
    }
    
    public final void loadPaymentHistory() {
    }
    
    public final void onHomeScreenUiReady() {
    }
    
    public final void getAdvPayment() {
    }
    
    public final void getPXDetails() {
    }
    
    public final void loadHomeScreenInfo() {
    }
    
    public final void loadAppImageList() {
    }
    
    public final void loadBillingList(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void onTapProfile() {
    }
    
    public final void onDownloadPaymentPDF(@org.jetbrains.annotations.NotNull()
    java.lang.String creditNo) {
    }
    
    public final void onViewPaymentPDF(@org.jetbrains.annotations.NotNull()
    java.lang.String creditNo) {
    }
}