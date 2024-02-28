package com.fivebb.selfcare.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 &2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0016J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u001e\u001a\u00020\rH\u0002J\b\u0010\u001f\u001a\u00020\rH\u0002J\b\u0010 \u001a\u00020\rH\u0002J\u0018\u0010!\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0016J&\u0010\"\u001a\u00020\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/fivebb/selfcare/activities/PaymentHistoryActivity;", "Lcom/fivebb/selfcare/activities/ApplicationBaseActivity;", "Lcom/fivebb/selfcare/mvp/views/PaymentHistoryView;", "Lcom/fivebb/selfcare/delegates/PaymentHistoryFilterActionDelegate;", "()V", "mFromDate", "", "mPaymentHistoryAdapter", "Lcom/fivebb/selfcare/adapters/PaymentHistoryAdapter;", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/PaymentHistoryPresenter;", "mToDate", "afterClickDownload", "", "invoiceVO", "Lcom/fivebb/shared/vos/InvoiceVO;", "getContext", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDownload", "creditNo", "onPaymentPDF", "onTapChooseDateRange", "fromDate", "toDate", "onViewClick", "onViewInvoice", "onViewPDF", "setUpListeners", "setUpPresenter", "setUpRecyclerView", "showFilterDateDialog", "showPaymentHistory", "paymentList", "", "Lcom/fivebb/shared/vos/PaymentHistoryVO;", "Companion", "app_psrRelease"})
public final class PaymentHistoryActivity extends com.fivebb.selfcare.activities.ApplicationBaseActivity implements com.fivebb.selfcare.mvp.views.PaymentHistoryView, com.fivebb.selfcare.delegates.PaymentHistoryFilterActionDelegate {
    private com.fivebb.selfcare.mvp.presenters.PaymentHistoryPresenter mPresenter;
    private com.fivebb.selfcare.adapters.PaymentHistoryAdapter mPaymentHistoryAdapter;
    private java.lang.String mFromDate = "";
    private java.lang.String mToDate = "";
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.PaymentHistoryActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public PaymentHistoryActivity() {
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
    
    private final void setUpRecyclerView() {
    }
    
    private final void setUpListeners() {
    }
    
    @java.lang.Override()
    public void showPaymentHistory(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.PaymentHistoryVO> paymentList, @org.jetbrains.annotations.NotNull()
    java.lang.String fromDate, @org.jetbrains.annotations.NotNull()
    java.lang.String toDate) {
    }
    
    @java.lang.Override()
    public void showFilterDateDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String fromDate, @org.jetbrains.annotations.NotNull()
    java.lang.String toDate) {
    }
    
    @java.lang.Override()
    public void onPaymentPDF(@org.jetbrains.annotations.NotNull()
    java.lang.String creditNo) {
    }
    
    @java.lang.Override()
    public void onViewPDF(@org.jetbrains.annotations.NotNull()
    java.lang.String creditNo) {
    }
    
    @java.lang.Override()
    public void afterClickDownload(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.InvoiceVO invoiceVO) {
    }
    
    @java.lang.Override()
    public void onViewClick(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.InvoiceVO invoiceVO) {
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/fivebb/selfcare/activities/PaymentHistoryActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_psrRelease"})
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