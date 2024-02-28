package com.fivebb.selfcare.mvp.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH&J&\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH&\u00a8\u0006\u0014"}, d2 = {"Lcom/fivebb/selfcare/mvp/views/PaymentHistoryView;", "Lcom/fivebb/shared/mvp/views/BaseView;", "afterClickDownload", "", "invoiceVO", "Lcom/fivebb/shared/vos/InvoiceVO;", "getContext", "Landroid/content/Context;", "onPaymentPDF", "creditNo", "", "onViewClick", "onViewPDF", "showFilterDateDialog", "fromDate", "toDate", "showPaymentHistory", "paymentList", "", "Lcom/fivebb/shared/vos/PaymentHistoryVO;", "app_psrRelease"})
public abstract interface PaymentHistoryView extends com.fivebb.shared.mvp.views.BaseView {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    public abstract void showPaymentHistory(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.PaymentHistoryVO> paymentList, @org.jetbrains.annotations.NotNull()
    java.lang.String fromDate, @org.jetbrains.annotations.NotNull()
    java.lang.String toDate);
    
    public abstract void showFilterDateDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String fromDate, @org.jetbrains.annotations.NotNull()
    java.lang.String toDate);
    
    public abstract void onPaymentPDF(@org.jetbrains.annotations.NotNull()
    java.lang.String creditNo);
    
    public abstract void onViewPDF(@org.jetbrains.annotations.NotNull()
    java.lang.String creditNo);
    
    public abstract void afterClickDownload(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.InvoiceVO invoiceVO);
    
    public abstract void onViewClick(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.InvoiceVO invoiceVO);
}