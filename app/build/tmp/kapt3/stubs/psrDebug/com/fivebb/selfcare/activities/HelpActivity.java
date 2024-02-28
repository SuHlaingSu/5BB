package com.fivebb.selfcare.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0016\u0010\u0019\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0007H\u0016J\u0012\u0010!\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\b\u0010$\u001a\u00020\u0017H\u0014J\b\u0010%\u001a\u00020\u0017H\u0016J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020\nH\u0016J\b\u0010(\u001a\u00020\u0017H\u0014J\b\u0010)\u001a\u00020\u0017H\u0014J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020#H\u0014J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u0015H\u0017J\b\u0010.\u001a\u00020\u0017H\u0014J\b\u0010/\u001a\u00020\u0017H\u0014J\b\u00100\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/fivebb/selfcare/activities/HelpActivity;", "Lcom/fivebb/selfcare/activities/ApplicationBaseActivity;", "Lcom/fivebb/selfcare/mvp/views/HelpView;", "Lcom/fivebb/selfcare/delegates/HelpActionDelegate;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "MAP_VIEW_BUNDLE_KEY", "", "mFacebookLink", "mGoogleMap", "Lcom/google/android/gms/maps/GoogleMap;", "mHelpListAdapter", "Lcom/fivebb/selfcare/adapters/help/HelpListAdapter;", "mLat", "", "mLong", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/HelpPresenter;", "mYouTubeLink", "regionList", "Ljava/util/ArrayList;", "Lcom/fivebb/shared/vos/RegionVO;", "bindData", "", "data", "bindDataList", "", "getContext", "Landroid/content/Context;", "initListeners", "initPresenter", "navigateToSendEmailActivity", "email", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onLowMemory", "onMapReady", "googleMap", "onPause", "onResume", "onSaveInstanceState", "outState", "onShowroomClickItem", "item", "onStart", "onStop", "setUpRecyclerView", "Companion", "app_psrDebug"})
public final class HelpActivity extends com.fivebb.selfcare.activities.ApplicationBaseActivity implements com.fivebb.selfcare.mvp.views.HelpView, com.fivebb.selfcare.delegates.HelpActionDelegate, com.google.android.gms.maps.OnMapReadyCallback {
    private com.fivebb.selfcare.adapters.help.HelpListAdapter mHelpListAdapter;
    private com.fivebb.selfcare.mvp.presenters.HelpPresenter mPresenter;
    private com.google.android.gms.maps.GoogleMap mGoogleMap;
    private final java.lang.String MAP_VIEW_BUNDLE_KEY = "MapViewBundleKey";
    private java.lang.String mFacebookLink = "";
    private java.lang.String mYouTubeLink = "";
    private double mLat = 0.0;
    private double mLong = 0.0;
    private final java.util.ArrayList<com.fivebb.shared.vos.RegionVO> regionList = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.HelpActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public HelpActivity() {
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
    
    private final void initPresenter() {
    }
    
    private final void setUpRecyclerView() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onLowMemory() {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    private final void initListeners() {
    }
    
    @java.lang.Override()
    public void bindData(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.RegionVO data) {
    }
    
    @java.lang.Override()
    public void bindDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.RegionVO> data) {
    }
    
    @java.lang.Override()
    public void navigateToSendEmailActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void onShowroomClickItem(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.RegionVO item) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/fivebb/selfcare/activities/HelpActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_psrDebug"})
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