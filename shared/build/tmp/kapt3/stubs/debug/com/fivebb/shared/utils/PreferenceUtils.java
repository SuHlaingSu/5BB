package com.fivebb.shared.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/fivebb/shared/utils/PreferenceUtils;", "", "()V", "Companion", "shared_debug"})
public class PreferenceUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.shared.utils.PreferenceUtils.Companion Companion = null;
    private static com.fivebb.shared.utils.PreferenceUtils objInstance;
    private static final java.lang.String SHARED_PREF_BATTERY_COUNT = "SHARED_PREF_BATTERY_COUNT";
    private static final java.lang.String SHARED_PREF_WIFI_CONNECTIVITY_FREQUENCY = "SHARED_PREF_WIFI_CONNECTIVITY_FREQUENCY";
    private static final java.lang.String SHARED_PREF_IS_DEVICE_INFO_SEND = "SHARED_PREF_IS_DEVICE_INFO_SEND";
    private static final java.lang.String SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_BATTERY = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_BATTERY";
    private static final java.lang.String SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_WIFI = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_WIFI";
    private static final java.lang.String SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_LOCATION = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_LOCATION";
    private static final java.lang.String SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_MOST_USED_APP = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_MOST_USED_APP";
    private static final java.lang.String SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_TOPUP = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_TOPUP";
    private static final java.lang.String SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_AMOUNT_OF_USAGE_DATA = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_AMOUNT_OF_USAGE_DATA";
    private static final java.lang.String SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_COMMUTE_TIME = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_COMMUTE_TIME";
    private static final java.lang.String SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_CALL_LOG = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_CALL_LOG";
    private static final java.lang.String SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_SMS = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_SMS";
    private static final java.lang.String SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_ADDRESS_BOOK = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_ADDRESS_BOOK";
    private static final java.lang.String SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_REGULAR_CONTACT = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_REGULAR_CONTACT";
    private static final java.lang.String SHARED_PREF_REGISTRATION_ID = "SHARED_PREF_REGISTRATION_ID";
    
    public PreferenceUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0014J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010!\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010$\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010&\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\'\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010(\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010*\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u0016J\u0016\u0010-\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)J\u0016\u0010.\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u001bJ\u0016\u00100\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u001bJ\u0016\u00101\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u001bJ\u0016\u00102\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u001bJ\u0016\u00103\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u001bJ\u0016\u00104\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u001bJ\u0016\u00105\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u001bJ\u0016\u00106\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u001bJ\u0016\u00107\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u001bJ\u0016\u00108\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u001bJ\u0016\u00109\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u001bJ\u0018\u0010:\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010;\u001a\u0004\u0018\u00010\u0004J\u0016\u0010<\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lcom/fivebb/shared/utils/PreferenceUtils$Companion;", "", "()V", "SHARED_PREF_BATTERY_COUNT", "", "SHARED_PREF_IS_DEVICE_INFO_SEND", "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_ADDRESS_BOOK", "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_AMOUNT_OF_USAGE_DATA", "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_BATTERY", "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_CALL_LOG", "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_COMMUTE_TIME", "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_LOCATION", "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_MOST_USED_APP", "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_REGULAR_CONTACT", "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_SMS", "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_TOPUP", "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_WIFI", "SHARED_PREF_REGISTRATION_ID", "SHARED_PREF_WIFI_CONNECTIVITY_FREQUENCY", "objInstance", "Lcom/fivebb/shared/utils/PreferenceUtils;", "getBatteryCount", "", "context", "Landroid/content/Context;", "getInstance", "getLastSyncTimeIntervalForAddressBook", "", "getLastSyncTimeIntervalForAmountOfUsageData", "getLastSyncTimeIntervalForBattery", "getLastSyncTimeIntervalForCallLog", "getLastSyncTimeIntervalForCommuteTime", "getLastSyncTimeIntervalForLocation", "getLastSyncTimeIntervalForMostUsedApp", "getLastSyncTimeIntervalForRegularContact", "getLastSyncTimeIntervalForSMS", "getLastSyncTimeIntervalForTopup", "getLastSyncTimeIntervalForWifi", "getRegistrationId", "getWifiConnectCount", "isDeviceInfoSend", "", "saveBatteryCount", "", "batteryCount", "saveDeviceInfoSend", "saveLastSyncTimeIntervalForAddressBook", "timeInterval", "saveLastSyncTimeIntervalForAmountOfUsageData", "saveLastSyncTimeIntervalForBattery", "saveLastSyncTimeIntervalForCallLog", "saveLastSyncTimeIntervalForCommuteTime", "saveLastSyncTimeIntervalForLocation", "saveLastSyncTimeIntervalForMostUsedApp", "saveLastSyncTimeIntervalForRegularContact", "saveLastSyncTimeIntervalForSMS", "saveLastSyncTimeIntervalForTopup", "saveLastSyncTimeIntervalForWifi", "saveRegistrationId", "registrationId", "saveWifiConnectCount", "wifiConnectCount", "shared_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.fivebb.shared.utils.PreferenceUtils getInstance() {
            return null;
        }
        
        public final void saveDeviceInfoSend(@org.jetbrains.annotations.NotNull()
        android.content.Context context, boolean isDeviceInfoSend) {
        }
        
        public final boolean isDeviceInfoSend(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
        
        public final void saveLastSyncTimeIntervalForWifi(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long timeInterval) {
        }
        
        public final long getLastSyncTimeIntervalForWifi(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return 0L;
        }
        
        public final void saveLastSyncTimeIntervalForBattery(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long timeInterval) {
        }
        
        public final long getLastSyncTimeIntervalForBattery(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return 0L;
        }
        
        public final void saveLastSyncTimeIntervalForLocation(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long timeInterval) {
        }
        
        public final long getLastSyncTimeIntervalForLocation(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return 0L;
        }
        
        public final void saveLastSyncTimeIntervalForMostUsedApp(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long timeInterval) {
        }
        
        public final long getLastSyncTimeIntervalForMostUsedApp(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return 0L;
        }
        
        public final void saveLastSyncTimeIntervalForTopup(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long timeInterval) {
        }
        
        public final long getLastSyncTimeIntervalForTopup(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return 0L;
        }
        
        public final void saveLastSyncTimeIntervalForAmountOfUsageData(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long timeInterval) {
        }
        
        public final long getLastSyncTimeIntervalForAmountOfUsageData(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return 0L;
        }
        
        public final void saveLastSyncTimeIntervalForCommuteTime(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long timeInterval) {
        }
        
        public final long getLastSyncTimeIntervalForCommuteTime(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return 0L;
        }
        
        public final void saveLastSyncTimeIntervalForCallLog(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long timeInterval) {
        }
        
        public final long getLastSyncTimeIntervalForCallLog(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return 0L;
        }
        
        public final void saveLastSyncTimeIntervalForSMS(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long timeInterval) {
        }
        
        public final long getLastSyncTimeIntervalForSMS(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return 0L;
        }
        
        public final void saveLastSyncTimeIntervalForAddressBook(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long timeInterval) {
        }
        
        public final long getLastSyncTimeIntervalForAddressBook(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return 0L;
        }
        
        public final void saveLastSyncTimeIntervalForRegularContact(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long timeInterval) {
        }
        
        public final long getLastSyncTimeIntervalForRegularContact(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return 0L;
        }
        
        public final void saveBatteryCount(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int batteryCount) {
        }
        
        public final int getBatteryCount(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return 0;
        }
        
        public final void saveWifiConnectCount(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int wifiConnectCount) {
        }
        
        public final int getWifiConnectCount(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return 0;
        }
        
        public final void saveRegistrationId(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        java.lang.String registrationId) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRegistrationId(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}