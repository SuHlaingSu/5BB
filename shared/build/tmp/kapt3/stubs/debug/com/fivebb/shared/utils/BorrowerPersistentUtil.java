package com.fivebb.shared.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u0000 $2\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u000bJ\u0006\u0010\u0010\u001a\u00020\u000bJ\u0006\u0010\u0011\u001a\u00020\u000bJ\u0006\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bJ\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\bJ\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000bJ\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000bJ\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u000bJ\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000bJ\u000e\u0010 \u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000bJ\u000e\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u000bJ\u000e\u0010#\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/fivebb/shared/utils/BorrowerPersistentUtil;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mSharedPreferences", "Landroid/content/SharedPreferences;", "getCapturedVideoUri", "", "getLanguage", "isAppUsageDataUploadServiceStarted", "", "isCallDataUploadServiceStarted", "isCredoAppInitiated", "isInitCallDataUploaded", "isLocationDataUploadServiceStarted", "isPsychometricAnswerLastScreenReached", "isSMSDataUploadServiceStarted", "isSyncServiceStart", "saveCapturedVideoUri", "", "videoUri", "saveLanguage", "language", "saveSyncServiceStart", "isServiceStarted", "setAppUsageDataUploadServiceStatus", "setCallDataUploadServiceStatus", "setCredoAppInitiating", "initiated", "setInitCallDataUploadedValue", "isCallDataUploaded", "setLocationDataUploadServiceStatus", "setPsychometricAnswerLastScreenReached", "lastScreenReached", "setSMSDataUploadServiceStatus", "Companion", "shared_debug"})
public final class BorrowerPersistentUtil {
    private android.content.SharedPreferences mSharedPreferences;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.shared.utils.BorrowerPersistentUtil.Companion Companion = null;
    
    public BorrowerPersistentUtil(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void saveLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String language) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    public final void setCallDataUploadServiceStatus(boolean isServiceStarted) {
    }
    
    public final boolean isCallDataUploadServiceStarted() {
        return false;
    }
    
    public final void setInitCallDataUploadedValue(boolean isCallDataUploaded) {
    }
    
    public final boolean isInitCallDataUploaded() {
        return false;
    }
    
    public final void setLocationDataUploadServiceStatus(boolean isServiceStarted) {
    }
    
    public final boolean isLocationDataUploadServiceStarted() {
        return false;
    }
    
    public final boolean isSyncServiceStart() {
        return false;
    }
    
    public final void saveSyncServiceStart(boolean isServiceStarted) {
    }
    
    public final void setSMSDataUploadServiceStatus(boolean isServiceStarted) {
    }
    
    public final boolean isSMSDataUploadServiceStarted() {
        return false;
    }
    
    public final void setAppUsageDataUploadServiceStatus(boolean isServiceStarted) {
    }
    
    public final boolean isAppUsageDataUploadServiceStarted() {
        return false;
    }
    
    public final void setPsychometricAnswerLastScreenReached(boolean lastScreenReached) {
    }
    
    public final boolean isPsychometricAnswerLastScreenReached() {
        return false;
    }
    
    public final void setCredoAppInitiating(boolean initiated) {
    }
    
    public final boolean isCredoAppInitiated() {
        return false;
    }
    
    public final void saveCapturedVideoUri(@org.jetbrains.annotations.NotNull()
    java.lang.String videoUri) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCapturedVideoUri() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/fivebb/shared/utils/BorrowerPersistentUtil$Companion;", "", "()V", "newInstance", "Lcom/fivebb/shared/utils/BorrowerPersistentUtil;", "context", "Landroid/content/Context;", "shared_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.fivebb.shared.utils.BorrowerPersistentUtil newInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}