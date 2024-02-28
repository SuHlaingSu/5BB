package com.fivebb.selfcare.notification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a0\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\bH\u0002\u001a\b\u0010\u000e\u001a\u00020\u000fH\u0002\u001a(\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0007\u00a8\u0006\u0013"}, d2 = {"buildAndSendNotification", "", "context", "Landroid/content/Context;", "title", "", "message", "pendingIntent", "Landroid/app/PendingIntent;", "buildNoti", "Landroid/app/Notification;", "channelId", "content", "intent", "getUniqueId", "", "sendNotification", "messageBody", "msgId", "app_psrRelease"})
public final class NotificationUtilsKt {
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @android.annotation.SuppressLint(value = {"UnspecifiedImmutableFlag"})
    public static final void sendNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String messageBody, @org.jetbrains.annotations.NotNull()
    java.lang.String msgId) {
    }
    
    private static final android.app.Notification buildNoti(android.content.Context context, java.lang.String channelId, java.lang.String title, java.lang.String content, android.app.PendingIntent intent) {
        return null;
    }
    
    private static final void buildAndSendNotification(android.content.Context context, java.lang.String title, java.lang.String message, android.app.PendingIntent pendingIntent) {
    }
    
    private static final int getUniqueId() {
        return 0;
    }
}