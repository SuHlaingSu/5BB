package com.fivebb.selfcare;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/fivebb/selfcare/FiveBBApp;", "Landroid/app/Application;", "()V", "fcms", "", "getFcms", "()Ljava/lang/String;", "setFcms", "(Ljava/lang/String;)V", "onCreate", "", "Companion", "app_psrRelease"})
public final class FiveBBApp extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fcms = "";
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.FiveBBApp.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    private static boolean showMainPrompt = true;
    
    public FiveBBApp() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFcms() {
        return null;
    }
    
    public final void setFcms(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/fivebb/selfcare/FiveBBApp$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "showMainPrompt", "", "getShowMainPrompt", "()Z", "setShowMainPrompt", "(Z)V", "app_psrRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        public final boolean getShowMainPrompt() {
            return false;
        }
        
        public final void setShowMainPrompt(boolean p0) {
        }
    }
}