package com.fivebb.selfcare.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0003J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000eH\u0014J\b\u0010\u0013\u001a\u00020\u000eH\u0014J\b\u0010\u0014\u001a\u00020\u000eH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/fivebb/selfcare/activities/SkippableNoticeActivity;", "Lcom/fivebb/shared/activities/BaseActivity;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "initialTimer", "", "getInitialTimer", "()I", "setInitialTimer", "(I)V", "navigateToAppropriateScreen", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStart", "setUpListener", "Companion", "app_devDebug"})
public final class SkippableNoticeActivity extends com.fivebb.shared.activities.BaseActivity {
    private int initialTimer = 5;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.SkippableNoticeActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public SkippableNoticeActivity() {
        super();
    }
    
    public final int getInitialTimer() {
        return 0;
    }
    
    public final void setInitialTimer(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpListener() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    private final void navigateToAppropriateScreen() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/fivebb/selfcare/activities/SkippableNoticeActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_devDebug"})
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