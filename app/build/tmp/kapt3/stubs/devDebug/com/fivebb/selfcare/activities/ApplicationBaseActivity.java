package com.fivebb.selfcare.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0004H\u0002\u00a8\u0006\f"}, d2 = {"Lcom/fivebb/selfcare/activities/ApplicationBaseActivity;", "Lcom/fivebb/shared/activities/BaseActivity;", "()V", "checkErrorMessageAndRedirectLogin", "", "errorMessage", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "redirectToLoginActivity", "Companion", "app_devDebug"})
public abstract class ApplicationBaseActivity extends com.fivebb.shared.activities.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.ApplicationBaseActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public ApplicationBaseActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void checkErrorMessageAndRedirectLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    private final void redirectToLoginActivity() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/fivebb/selfcare/activities/ApplicationBaseActivity$Companion;", "", "()V", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}