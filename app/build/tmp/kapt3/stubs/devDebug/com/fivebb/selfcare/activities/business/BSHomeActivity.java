package com.fivebb.selfcare.activities.business;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00dc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 m2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0001mB\u0005\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\'H\u0002J\u0016\u0010+\u001a\u00020\'2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-H\u0016J\b\u0010/\u001a\u00020\'H\u0002J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\'H\u0002J\b\u00103\u001a\u00020\'H\u0002J\b\u00104\u001a\u00020\'H\u0002J\b\u00105\u001a\u00020\'H\u0002J\b\u00106\u001a\u00020\'H\u0016J\b\u00107\u001a\u00020\'H\u0016J\b\u00108\u001a\u00020\'H\u0016J\u0012\u00109\u001a\u00020\'2\b\u0010:\u001a\u0004\u0018\u00010;H\u0014J\u0010\u0010<\u001a\u00020\'2\u0006\u0010=\u001a\u00020\u0017H\u0016J\u0010\u0010>\u001a\u00020\'2\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020\'H\u0014J\b\u0010B\u001a\u00020\'H\u0016J\b\u0010C\u001a\u00020\'H\u0016J\b\u0010D\u001a\u00020\'H\u0016J\u0010\u0010E\u001a\u00020\'2\u0006\u0010F\u001a\u00020\u0017H\u0016J\b\u0010G\u001a\u00020\'H\u0016J\b\u0010H\u001a\u00020\'H\u0016J\u0010\u0010I\u001a\u00020\'2\u0006\u0010J\u001a\u00020KH\u0016J\b\u0010L\u001a\u00020\'H\u0016J\b\u0010M\u001a\u00020\'H\u0016J\b\u0010N\u001a\u00020\'H\u0016J\b\u0010O\u001a\u00020\'H\u0016J\b\u0010P\u001a\u00020\'H\u0016J\b\u0010Q\u001a\u00020\'H\u0016J\b\u0010R\u001a\u00020\'H\u0016J6\u0010S\u001a\u00020\'2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020K0-2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020V0-2\b\u0010W\u001a\u0004\u0018\u00010X2\u0006\u0010Y\u001a\u00020ZH\u0016J\u0010\u0010[\u001a\u00020\'2\u0006\u0010=\u001a\u00020\u0017H\u0016J\u0010\u0010\\\u001a\u00020\'2\u0006\u0010]\u001a\u00020^H\u0016J\b\u0010_\u001a\u00020\'H\u0002J\b\u0010`\u001a\u00020\'H\u0002J\u0010\u0010a\u001a\u00020\'2\u0006\u0010,\u001a\u00020.H\u0016J\u0016\u0010b\u001a\u00020\'2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020K0-H\u0016J\u0018\u0010c\u001a\u00020\'2\u0006\u0010d\u001a\u00020\r2\u0006\u0010e\u001a\u00020\u0017H\u0016J\b\u0010f\u001a\u00020\'H\u0002J\u0010\u0010g\u001a\u00020\'2\u0006\u0010h\u001a\u00020iH\u0016J\b\u0010j\u001a\u00020\'H\u0002J\b\u0010k\u001a\u00020\'H\u0002J\u0010\u0010l\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006n"}, d2 = {"Lcom/fivebb/selfcare/activities/business/BSHomeActivity;", "Lcom/fivebb/selfcare/activities/ApplicationBaseActivity;", "Lcom/fivebb/selfcare/delegates/PXPlanChangeActionDelegate;", "Lcom/fivebb/selfcare/delegates/PlanChangeActionDelegate;", "Lcom/fivebb/selfcare/delegates/NavigationActionDelegate;", "Lcom/fivebb/selfcare/delegates/InvoicePaymentActionDelegate;", "Lcom/fivebb/selfcare/delegates/LatestPaymentActionDelegate;", "Lcom/fivebb/selfcare/delegates/LatestRechargedActionDelegate;", "Lcom/fivebb/selfcare/delegates/PrepaidActionDelegate;", "Lcom/fivebb/selfcare/mvp/views/HomeScreenView;", "Lcom/fivebb/selfcare/delegates/PopupActionDelegate;", "()V", "IsOpenEye", "", "latestPaymentViewPod", "Lcom/fivebb/selfcare/viewpods/LatestPaymentViewPod;", "mAdsSlideAdapter", "Lcom/fivebb/selfcare/adapters/AdsSlideAdapter;", "mOutstandingInvoiceAdapter", "Lcom/fivebb/selfcare/adapters/business/BSOustandingInvoiceAdapter;", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/HomeScreenPresenter;", "mServiceType", "", "navigationViewPod", "Lcom/fivebb/selfcare/viewpods/NavigationViewPod;", "planChangeViewPod", "Lcom/fivebb/selfcare/viewpods/PlanChangeViewPod;", "prepaidViewPod", "Lcom/fivebb/selfcare/viewpods/PrepaidViewPod;", "px_planChangeViewPod", "Lcom/fivebb/selfcare/viewpods/PXPlanChangeViewPod;", "quotaUsageSummaryViewPod", "Lcom/fivebb/selfcare/viewpods/QuotaUsageViewPod;", "usageSummaryViewPod", "Lcom/fivebb/selfcare/viewpods/UsageSummaryViewPod;", "walletViewPod", "Lcom/fivebb/selfcare/viewpods/WalletViewPod;", "afterClickDownload", "", "invoiceVO", "Lcom/fivebb/shared/vos/InvoiceVO;", "bindLocalizedData", "bindSliderImage", "data", "", "Lcom/fivebb/shared/vos/AppImageVO;", "changeLanguage", "getContext", "Landroid/content/Context;", "getIntentExtraData", "hideOutstandingInvoice", "initListeners", "initViewPods", "navigateToAdvPayTopUp", "navigateToGooglePlayStore", "navigateToProfileActivity", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDownloadRequest", "credit", "onItemClick", "pxPlanVO", "Lcom/fivebb/shared/vos/PXPlanVO;", "onResume", "onTapActivityLog", "onTapHelp", "onTapInvoicePdf", "onTapMore", "url", "onTapNotification", "onTapPXPlanChange", "onTapPayment", "bill", "Lcom/fivebb/shared/vos/BillVO;", "onTapPlanChange", "onTapRecharge", "onTapRelocation", "onTapSeeAllPaymentHistory", "onTapSeeAllRechargedHistory", "onTapTicket", "onTapTopUp", "onUiReady", "billList", "payment", "Lcom/fivebb/shared/vos/PaymentHistoryVO;", "serviceInstanceDetails", "Lcom/fivebb/shared/vos/ServiceInstanceDetailsVO;", "serviceInstanceSummary", "Lcom/fivebb/shared/vos/ServiceInstanceSummaryVO;", "onViewInvoice", "saveAdvPay", "paymentVO", "Lcom/fivebb/shared/vos/AdvancePaymentVO;", "setUpAdapters", "setUpPresenter", "showAdsDialog", "showBillingList", "showForceUpdateDialog", "isForceUpdate", "versionName", "showOutstandingInvoice", "showPXInfo", "pxDetailVO", "Lcom/fivebb/shared/vos/PXDetailVO;", "uiForFTTHCustomer", "uiForLTECustomer", "viewClickInvoice", "Companion", "app_devDebug"})
public final class BSHomeActivity extends com.fivebb.selfcare.activities.ApplicationBaseActivity implements com.fivebb.selfcare.delegates.PXPlanChangeActionDelegate, com.fivebb.selfcare.delegates.PlanChangeActionDelegate, com.fivebb.selfcare.delegates.NavigationActionDelegate, com.fivebb.selfcare.delegates.InvoicePaymentActionDelegate, com.fivebb.selfcare.delegates.LatestPaymentActionDelegate, com.fivebb.selfcare.delegates.LatestRechargedActionDelegate, com.fivebb.selfcare.delegates.PrepaidActionDelegate, com.fivebb.selfcare.mvp.views.HomeScreenView, com.fivebb.selfcare.delegates.PopupActionDelegate {
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.business.BSHomeActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERVICE_TYPE = "SERVICE_TYPE";
    private com.fivebb.selfcare.mvp.presenters.HomeScreenPresenter mPresenter;
    private com.fivebb.selfcare.viewpods.LatestPaymentViewPod latestPaymentViewPod;
    private com.fivebb.selfcare.viewpods.PlanChangeViewPod planChangeViewPod;
    private com.fivebb.selfcare.viewpods.PXPlanChangeViewPod px_planChangeViewPod;
    private com.fivebb.selfcare.viewpods.PrepaidViewPod prepaidViewPod;
    private com.fivebb.selfcare.viewpods.WalletViewPod walletViewPod;
    private com.fivebb.selfcare.viewpods.NavigationViewPod navigationViewPod;
    private com.fivebb.selfcare.viewpods.UsageSummaryViewPod usageSummaryViewPod;
    private com.fivebb.selfcare.viewpods.QuotaUsageViewPod quotaUsageSummaryViewPod;
    private com.fivebb.selfcare.adapters.business.BSOustandingInvoiceAdapter mOutstandingInvoiceAdapter;
    private com.fivebb.selfcare.adapters.AdsSlideAdapter mAdsSlideAdapter;
    private java.lang.String mServiceType;
    private boolean IsOpenEye = false;
    private java.util.HashMap _$_findViewCache;
    
    public BSHomeActivity() {
        super();
    }
    
    @java.lang.Override()
    public void onTapMore(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @java.lang.Override()
    public void onUiReady(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.BillVO> billList, @org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.PaymentHistoryVO> payment, @org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.ServiceInstanceDetailsVO serviceInstanceDetails, @org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.ServiceInstanceSummaryVO serviceInstanceSummary) {
    }
    
    @java.lang.Override()
    public void showBillingList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.BillVO> billList) {
    }
    
    @java.lang.Override()
    public void showAdsDialog(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.AppImageVO data) {
    }
    
    @java.lang.Override()
    public void saveAdvPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.AdvancePaymentVO paymentVO) {
    }
    
    @java.lang.Override()
    public void showPXInfo(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.PXDetailVO pxDetailVO) {
    }
    
    @java.lang.Override()
    public void bindSliderImage(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.AppImageVO> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    public void onTapSeeAllRechargedHistory() {
    }
    
    @java.lang.Override()
    public void onTapSeeAllPaymentHistory() {
    }
    
    @java.lang.Override()
    public void onTapInvoicePdf() {
    }
    
    @java.lang.Override()
    public void onDownloadRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String credit) {
    }
    
    @java.lang.Override()
    public void onViewInvoice(@org.jetbrains.annotations.NotNull()
    java.lang.String credit) {
    }
    
    @java.lang.Override()
    public void onTapPayment(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.BillVO bill) {
    }
    
    @java.lang.Override()
    public void onTapRecharge() {
    }
    
    @java.lang.Override()
    public void onTapActivityLog() {
    }
    
    @java.lang.Override()
    public void onTapRelocation() {
    }
    
    @java.lang.Override()
    public void onTapTicket() {
    }
    
    @java.lang.Override()
    public void onTapNotification() {
    }
    
    @java.lang.Override()
    public void onTapHelp() {
    }
    
    @java.lang.Override()
    public void onTapPlanChange() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getIntentExtraData() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void initViewPods() {
    }
    
    private final void setUpPresenter() {
    }
    
    private final void setUpAdapters() {
    }
    
    private final void initListeners() {
    }
    
    private final void showOutstandingInvoice() {
    }
    
    private final void hideOutstandingInvoice() {
    }
    
    private final void bindLocalizedData() {
    }
    
    private final void uiForLTECustomer() {
    }
    
    private final void uiForFTTHCustomer() {
    }
    
    private final void changeLanguage() {
    }
    
    @java.lang.Override()
    public void navigateToProfileActivity() {
    }
    
    @java.lang.Override()
    public void showForceUpdateDialog(boolean isForceUpdate, @org.jetbrains.annotations.NotNull()
    java.lang.String versionName) {
    }
    
    @java.lang.Override()
    public void afterClickDownload(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.InvoiceVO invoiceVO) {
    }
    
    @java.lang.Override()
    public void navigateToAdvPayTopUp() {
    }
    
    @java.lang.Override()
    public void viewClickInvoice(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.InvoiceVO invoiceVO) {
    }
    
    @java.lang.Override()
    public void navigateToGooglePlayStore() {
    }
    
    @java.lang.Override()
    public void onTapPXPlanChange() {
    }
    
    @java.lang.Override()
    public void onTapTopUp() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.PXPlanVO pxPlanVO) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/fivebb/selfcare/activities/business/BSHomeActivity$Companion;", "", "()V", "SERVICE_TYPE", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "serviceType", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String serviceType) {
            return null;
        }
    }
}