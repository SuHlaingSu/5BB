package com.fivebb.selfcare.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00ca\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0001[B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0017J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&H\u0017J\u0010\u0010\'\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u0005H\u0002J\n\u0010*\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u001aH\u0003J\b\u0010-\u001a\u00020\u001aH\u0002J\b\u0010.\u001a\u00020\u001aH\u0002J\b\u0010/\u001a\u00020\u001aH\u0002J\u0010\u00100\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002J\u0010\u00101\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u000202H\u0017J\b\u00103\u001a\u00020\u001aH\u0016J\u0018\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u000207H\u0016J\"\u00108\u001a\u00020\u001a2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\b\u0010\u001b\u001a\u0004\u0018\u00010<H\u0014J\u0012\u0010=\u001a\u00020\u001a2\b\u0010>\u001a\u0004\u0018\u00010?H\u0014J\b\u0010@\u001a\u00020\u001aH\u0014J\b\u0010A\u001a\u00020\u001aH\u0014J\b\u0010B\u001a\u00020\u001aH\u0014J\u0010\u0010C\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020DH\u0017J\b\u0010E\u001a\u00020\u001aH\u0002J\u0010\u0010F\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020GH\u0017J\u0010\u0010H\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020IH\u0017J\u0010\u0010J\u001a\u00020\u001a2\u0006\u0010K\u001a\u00020\u0005H\u0016J\b\u0010L\u001a\u00020\u001aH\u0002J\u0016\u0010M\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020O0NH\u0016J\u0010\u0010P\u001a\u00020\u001a2\u0006\u0010Q\u001a\u00020RH\u0016J\u0016\u0010S\u001a\u00020\u001a2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020U0NH\u0016J\u0010\u0010V\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020(H\u0016J\b\u0010W\u001a\u00020\u001aH\u0002J\b\u0010X\u001a\u00020\u001aH\u0002J\u0010\u0010Y\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020OH\u0016J\u0010\u0010Z\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020RH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\\"}, d2 = {"Lcom/fivebb/selfcare/activities/InvoicePaymentActivity;", "Lcom/fivebb/selfcare/activities/ApplicationBaseActivity;", "Lcom/fivebb/selfcare/mvp/views/InvoicePaymentView;", "()V", "cusPh", "", "disposable", "Lio/reactivex/disposables/Disposable;", "mAmount", "mBankAdapter", "Lcom/fivebb/selfcare/adapters/BankAdapter;", "mBillNo", "mCurrency", "mFullScreenImageButton", "Landroid/widget/ImageButton;", "mPaymentMethodAdapter", "Lcom/fivebb/selfcare/adapters/PaymentMethodAdapter;", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/impls/InvoicePaymentPresenterImpl;", "mUnpaidAmount", "nowPlayingUrl", "orderID", "player", "Lcom/google/android/exoplayer2/ExoPlayer;", "timeStamp", "ayaPayLink", "", "data", "Lcom/fivebb/selfcare/network/responses/AYARequestPushPaymentResponse;", "buildMediaSource", "Lcom/google/android/exoplayer2/source/MediaSource;", "uri", "Landroid/net/Uri;", "callPayRetrieveStatus", "request", "Lcom/fivebb/selfcare/network/requests/CitizenPayRequest;", "citizenPaymentRetrieveStatus", "response", "Lcom/fivebb/selfcare/network/responses/CitizenRetrieveResponse;", "createOrderInfo", "Lcom/fivebb/selfcare/network/responses/KBZOrderInfoResponse;", "createTimestamp", "createTimestamp2", "errorResponseKBZPayApp", "getIntentExtraData", "hidePlayerViewAndButton", "initListeners", "initPresenter", "initializePlayer", "mcfPayPaymentLink", "Lcom/fivebb/selfcare/network/responses/CitizenPayResponse;", "navigateToPaymentSuccess", "navigateToVideoFullScreen", "videoUrl", "position", "", "onActivityResult", "requestCode", "", "resultCode", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "queryOrderWPay", "Lcom/fivebb/selfcare/network/responses/WaveQueryOrderResponse;", "releasePlayer", "requestQueryOrderWPay", "Lcom/fivebb/selfcare/network/requests/WavePayRequest;", "requestWavePayResponse", "Lcom/fivebb/selfcare/network/responses/WavePayResponse;", "responseOfAYAPay", "message", "setUpRecyclerView", "showAllBankPayment", "", "Lcom/fivebb/shared/vos/BankVO;", "showAllPaymentMethod", "payment", "Lcom/fivebb/shared/vos/CombinePaymentDataVO;", "showAllPaymentMethodList", "paymentList", "Lcom/fivebb/shared/vos/PaymentMethodVO;", "showKBZPayAPP", "showPhBoxForAYAPay", "showPlayerViewAndButton", "showSelectedBankInfo", "showSelectedPaymentInfo", "Companion", "app_psrDebug"})
public final class InvoicePaymentActivity extends com.fivebb.selfcare.activities.ApplicationBaseActivity implements com.fivebb.selfcare.mvp.views.InvoicePaymentView {
    private com.fivebb.selfcare.mvp.presenters.impls.InvoicePaymentPresenterImpl mPresenter;
    private com.fivebb.selfcare.adapters.BankAdapter mBankAdapter;
    private com.fivebb.selfcare.adapters.PaymentMethodAdapter mPaymentMethodAdapter;
    private android.widget.ImageButton mFullScreenImageButton;
    private com.google.android.exoplayer2.ExoPlayer player;
    private java.lang.String nowPlayingUrl = "";
    private java.lang.String mAmount = "";
    private java.lang.String mUnpaidAmount = "";
    private java.lang.String mBillNo = "";
    private java.lang.String orderID = "";
    private java.lang.String cusPh = "";
    private java.lang.String mCurrency = "";
    private java.lang.String timeStamp = "";
    private io.reactivex.disposables.Disposable disposable;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.InvoicePaymentActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNPAID_AMOUNT = "UNPAID_AMOUNT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BILL_MONTH = "BILL_MONTH";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BILL_NO = "BILL_NO";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CURRENCY = "CURRENCY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AMOUNT = "AMOUNT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BILL_DATE = "BILL_DATE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DUE_DATE = "DUE_DATE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BILL_ID = "BILL_ID";
    private java.util.HashMap _$_findViewCache;
    
    public InvoicePaymentActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void getIntentExtraData() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void initPresenter() {
    }
    
    private final void setUpRecyclerView() {
    }
    
    private final void initListeners() {
    }
    
    private final void initializePlayer(java.lang.String uri) {
    }
    
    private final void showPlayerViewAndButton() {
    }
    
    private final void hidePlayerViewAndButton() {
    }
    
    private final com.google.android.exoplayer2.source.MediaSource buildMediaSource(android.net.Uri uri) {
        return null;
    }
    
    private final void releasePlayer() {
    }
    
    @java.lang.Override()
    public void showAllBankPayment(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.BankVO> data) {
    }
    
    @java.lang.Override()
    public void showAllPaymentMethod(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.CombinePaymentDataVO payment) {
    }
    
    @java.lang.Override()
    public void showAllPaymentMethodList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.PaymentMethodVO> paymentList) {
    }
    
    @java.lang.Override()
    public void showSelectedBankInfo(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.BankVO data) {
    }
    
    private final void showPhBoxForAYAPay() {
    }
    
    @java.lang.Override()
    public void showSelectedPaymentInfo(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.CombinePaymentDataVO data) {
    }
    
    private final java.lang.String createTimestamp() {
        return null;
    }
    
    private final java.lang.String createTimestamp2() {
        return null;
    }
    
    @java.lang.Override()
    public void showKBZPayAPP(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.KBZOrderInfoResponse data) {
    }
    
    private final java.lang.String createOrderInfo(com.fivebb.selfcare.network.responses.KBZOrderInfoResponse data) {
        return null;
    }
    
    @java.lang.Override()
    public void navigateToPaymentSuccess() {
    }
    
    @java.lang.Override()
    public void navigateToVideoFullScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String videoUrl, long position) {
    }
    
    @java.lang.Override()
    public void errorResponseKBZPayApp(@org.jetbrains.annotations.NotNull()
    java.lang.String response) {
    }
    
    @java.lang.Override()
    public void ayaPayLink(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.AYARequestPushPaymentResponse data) {
    }
    
    @java.lang.Override()
    public void responseOfAYAPay(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    @java.lang.Override()
    public void mcfPayPaymentLink(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.CitizenPayResponse data) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void callPayRetrieveStatus(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.CitizenPayRequest request) {
    }
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled", "CheckResult"})
    @java.lang.Override()
    public void requestWavePayResponse(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.WavePayResponse data) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void requestQueryOrderWPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.WavePayRequest data) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void queryOrderWPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.WaveQueryOrderResponse data) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void citizenPaymentRetrieveStatus(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.CitizenRetrieveResponse response) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JN\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/fivebb/selfcare/activities/InvoicePaymentActivity$Companion;", "", "()V", "AMOUNT", "", "BILL_DATE", "BILL_ID", "BILL_MONTH", "BILL_NO", "CURRENCY", "DUE_DATE", "UNPAID_AMOUNT", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "amount", "unPaidAmount", "billMonth", "billNo", "currency", "billDate", "", "dueDate", "billId", "app_psrDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String amount, @org.jetbrains.annotations.NotNull()
        java.lang.String unPaidAmount, @org.jetbrains.annotations.NotNull()
        java.lang.String billMonth, @org.jetbrains.annotations.NotNull()
        java.lang.String billNo, @org.jetbrains.annotations.NotNull()
        java.lang.String currency, long billDate, long dueDate, @org.jetbrains.annotations.NotNull()
        java.lang.String billId) {
            return null;
        }
    }
}