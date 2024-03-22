package com.fivebb.selfcare.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u0003:\u00019B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010H\u0016J\"\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u0012\u0010#\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u000e\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020(J\b\u0010)\u001a\u00020\u0014H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\u0016\u0010+\u001a\u00020\u00142\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-H\u0016J\b\u0010/\u001a\u00020\u0014H\u0014J\b\u00100\u001a\u00020\u0014H\u0016J\u0010\u00101\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\b\u00102\u001a\u00020\u0014H\u0002J\u0006\u00103\u001a\u00020\u0014J\b\u00104\u001a\u00020\u0014H\u0002J\b\u00105\u001a\u00020\u0014H\u0016J\u0010\u00106\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u00107\u001a\u00020\u00142\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00100-H\u0016R\u001a\u0010\u0005\u001a\u00020\u0002X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006:"}, d2 = {"Lcom/fivebb/selfcare/activities/NotificationActivity;", "Lcom/fivebb/shared/activities/BaseActivity;", "Lcom/fivebb/selfcare/delegates/NotificationActionDelegate;", "Lcom/fivebb/selfcare/mvp/views/NotificationListView;", "()V", "mDelegate", "getMDelegate", "()Lcom/fivebb/selfcare/delegates/NotificationActionDelegate;", "setMDelegate", "(Lcom/fivebb/selfcare/delegates/NotificationActionDelegate;)V", "mNotificationAdapter", "Lcom/fivebb/selfcare/adapters/noti/NotificationListAdapter;", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/NotificationListPresenter;", "notiList", "Ljava/util/ArrayList;", "Lcom/fivebb/shared/vos/NotificationVO;", "getNotiList", "()Ljava/util/ArrayList;", "displayErrorMessage", "", "message", "", "getContext", "Landroid/content/Context;", "hideLoading", "isReadNotiId", "noti", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onClickNotiInbox", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteAll", "view", "Landroid/view/View;", "onDeleteAllNotification", "onLongPressed", "onNotiSuccesss", "IDList", "", "Lcom/fivebb/selfcare/network/requests/GetNotiIdRequest;", "onResume", "onSelectedDelete", "onSingleDelete", "setUpListeners", "setUpPresenter", "setUpRecyclerView", "showLoading", "showMessage", "showNotificationList", "notificationList", "Companion", "app_devDebug"})
public final class NotificationActivity extends com.fivebb.shared.activities.BaseActivity implements com.fivebb.selfcare.delegates.NotificationActionDelegate, com.fivebb.selfcare.mvp.views.NotificationListView {
    private com.fivebb.selfcare.adapters.noti.NotificationListAdapter mNotificationAdapter;
    private com.fivebb.selfcare.mvp.presenters.NotificationListPresenter mPresenter;
    public com.fivebb.selfcare.delegates.NotificationActionDelegate mDelegate;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.fivebb.shared.vos.NotificationVO> notiList = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.NotificationActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public NotificationActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.selfcare.delegates.NotificationActionDelegate getMDelegate() {
        return null;
    }
    
    public final void setMDelegate(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.delegates.NotificationActionDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fivebb.shared.vos.NotificationVO> getNotiList() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpRecyclerView() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void displayErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onDeleteAllNotification() {
    }
    
    @java.lang.Override()
    public void onSelectedDelete() {
    }
    
    @java.lang.Override()
    public void isReadNotiId(@org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.NotificationVO noti) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context getContext() {
        return null;
    }
    
    public final void setUpPresenter() {
    }
    
    private final void setUpListeners() {
    }
    
    @java.lang.Override()
    public void showNotificationList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.NotificationVO> notificationList) {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    @java.lang.Override()
    public void onNotiSuccesss(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.selfcare.network.requests.GetNotiIdRequest> IDList) {
    }
    
    @java.lang.Override()
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onClickNotiInbox(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.NotificationVO noti) {
    }
    
    @java.lang.Override()
    public void onSingleDelete(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.NotificationVO noti) {
    }
    
    @java.lang.Override()
    public void onLongPressed() {
    }
    
    public final void onDeleteAll(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/fivebb/selfcare/activities/NotificationActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_devDebug"})
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