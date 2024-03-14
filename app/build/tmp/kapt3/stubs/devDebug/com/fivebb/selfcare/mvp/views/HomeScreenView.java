package com.fivebb.selfcare.mvp.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J6\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\tH&J\u0016\u0010\u001c\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH&J\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H&J\u0016\u0010%\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\'"}, d2 = {"Lcom/fivebb/selfcare/mvp/views/HomeScreenView;", "Lcom/fivebb/shared/mvp/views/BaseView;", "afterClickDownload", "", "invoiceVO", "Lcom/fivebb/shared/vos/InvoiceVO;", "bindSliderImage", "data", "", "Lcom/fivebb/shared/vos/AppImageVO;", "getContext", "Landroid/content/Context;", "navigateToAdvPayTopUp", "navigateToGooglePlayStore", "navigateToProfileActivity", "onUiReady", "billList", "Lcom/fivebb/shared/vos/BillVO;", "payment", "Lcom/fivebb/shared/vos/PaymentHistoryVO;", "serviceInstanceDetails", "Lcom/fivebb/shared/vos/ServiceInstanceDetailsVO;", "serviceInstanceSummary", "Lcom/fivebb/shared/vos/ServiceInstanceSummaryVO;", "saveAdvPay", "paymentVO", "Lcom/fivebb/shared/vos/AdvancePaymentVO;", "showAdsDialog", "showBillingList", "showForceUpdateDialog", "isForceUpdate", "", "versionName", "", "showPXInfo", "pxDetailVO", "Lcom/fivebb/shared/vos/PXDetailVO;", "topUpListener", "viewClickInvoice", "app_devDebug"})
public abstract interface HomeScreenView extends com.fivebb.shared.mvp.views.BaseView {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    public abstract void onUiReady(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.BillVO> billList, @org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.PaymentHistoryVO> payment, @org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.ServiceInstanceDetailsVO serviceInstanceDetails, @org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.ServiceInstanceSummaryVO serviceInstanceSummary);
    
    public abstract void showAdsDialog(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.AppImageVO data);
    
    public abstract void saveAdvPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.AdvancePaymentVO paymentVO);
    
    public abstract void showPXInfo(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.PXDetailVO pxDetailVO);
    
    public abstract void bindSliderImage(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.AppImageVO> data);
    
    public abstract void showBillingList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.BillVO> billList);
    
    public abstract void navigateToProfileActivity();
    
    public abstract void navigateToGooglePlayStore();
    
    public abstract void showForceUpdateDialog(boolean isForceUpdate, @org.jetbrains.annotations.NotNull()
    java.lang.String versionName);
    
    public abstract void afterClickDownload(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.InvoiceVO invoiceVO);
    
    public abstract void navigateToAdvPayTopUp();
    
    public abstract void viewClickInvoice(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.InvoiceVO invoiceVO);
    
    public abstract void topUpListener(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.BillVO> billList);
}