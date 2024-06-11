package com.fivebb.selfcare.mvp.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0016J\u0006\u0010\r\u001a\u00020\u0007J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\u0007J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0016J\u0006\u0010\u0012\u001a\u00020\u0007J\u0006\u0010\u0013\u001a\u00020\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/fivebb/selfcare/mvp/presenters/PaymentHistoryPresenter;", "Lcom/fivebb/shared/mvp/presenters/BasePresenter;", "Lcom/fivebb/selfcare/mvp/views/PaymentHistoryView;", "Lcom/fivebb/selfcare/models/UserModel;", "Lcom/fivebb/selfcare/delegates/PaymentHistoryFilterActionDelegate;", "()V", "filterWithDateRange", "", "fromDate", "", "toDate", "onDownload", "creditNo", "onDownloadPaymentPDF", "onTapChooseDateRange", "onTapFilter", "onUiReady", "onViewInvoice", "onViewPaymentPDF", "refreshPaymentHistory", "app_psrDebug"})
public final class PaymentHistoryPresenter extends com.fivebb.shared.mvp.presenters.BasePresenter<com.fivebb.selfcare.mvp.views.PaymentHistoryView, com.fivebb.selfcare.models.UserModel> implements com.fivebb.selfcare.delegates.PaymentHistoryFilterActionDelegate {
    
    public PaymentHistoryPresenter() {
        super();
    }
    
    public final void onUiReady() {
    }
    
    public final void refreshPaymentHistory() {
    }
    
    public final void filterWithDateRange(@org.jetbrains.annotations.NotNull()
    java.lang.String fromDate, @org.jetbrains.annotations.NotNull()
    java.lang.String toDate) {
    }
    
    @java.lang.Override()
    public void onTapChooseDateRange(@org.jetbrains.annotations.NotNull()
    java.lang.String fromDate, @org.jetbrains.annotations.NotNull()
    java.lang.String toDate) {
    }
    
    @java.lang.Override()
    public void onDownload(@org.jetbrains.annotations.NotNull()
    java.lang.String creditNo) {
    }
    
    @java.lang.Override()
    public void onViewInvoice(@org.jetbrains.annotations.NotNull()
    java.lang.String creditNo) {
    }
    
    public final void onDownloadPaymentPDF() {
    }
    
    public final void onViewPaymentPDF() {
    }
    
    public final void onTapFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String fromDate, @org.jetbrains.annotations.NotNull()
    java.lang.String toDate) {
    }
}