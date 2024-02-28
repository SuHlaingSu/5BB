package com.fivebb.shared.utils
import android.content.Context
import android.preference.PreferenceManager

open class PreferenceUtils {

    companion object {

        private var objInstance : PreferenceUtils? = null

        private val SHARED_PREF_BATTERY_COUNT = "SHARED_PREF_BATTERY_COUNT"

        private val SHARED_PREF_WIFI_CONNECTIVITY_FREQUENCY = "SHARED_PREF_WIFI_CONNECTIVITY_FREQUENCY"

        private val SHARED_PREF_IS_DEVICE_INFO_SEND = "SHARED_PREF_IS_DEVICE_INFO_SEND"

        private val SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_BATTERY = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_BATTERY"

        private val SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_WIFI = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_WIFI"

        private val SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_LOCATION = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_LOCATION"

        private val SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_MOST_USED_APP = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_MOST_USED_APP"

        private val SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_TOPUP = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_TOPUP"

        private val SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_AMOUNT_OF_USAGE_DATA = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_AMOUNT_OF_USAGE_DATA"

        private val SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_COMMUTE_TIME = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_COMMUTE_TIME"

        private val SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_CALL_LOG = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_CALL_LOG"

        private val SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_SMS = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_SMS"

        private val SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_ADDRESS_BOOK = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_ADDRESS_BOOK"

        private val SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_REGULAR_CONTACT = "SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_REGULAR_CONTACT"

        private val SHARED_PREF_REGISTRATION_ID = "SHARED_PREF_REGISTRATION_ID"

        fun getInstance(): PreferenceUtils {
            if (objInstance == null) {
                objInstance = PreferenceUtils()
            }
            return objInstance!!
        }

        fun saveDeviceInfoSend(context: Context, isDeviceInfoSend : Boolean) {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val editor = preferences.edit()
            editor.putBoolean(SHARED_PREF_IS_DEVICE_INFO_SEND, isDeviceInfoSend)
            editor.apply()
        }

        fun isDeviceInfoSend(context: Context) : Boolean {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getBoolean(SHARED_PREF_IS_DEVICE_INFO_SEND, false)
        }

        fun saveLastSyncTimeIntervalForWifi(context: Context, timeInterval: Long) {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val editor = preferences.edit()
            editor.putLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_WIFI, timeInterval)
            editor.apply()
        }

        fun getLastSyncTimeIntervalForWifi(context: Context) : Long {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_WIFI, 0)
        }

        fun saveLastSyncTimeIntervalForBattery(context: Context, timeInterval: Long) {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val editor = preferences.edit()
            editor.putLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_BATTERY, timeInterval)
            editor.apply()
        }

        fun getLastSyncTimeIntervalForBattery(context: Context) : Long {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_BATTERY, 0)
        }

        fun saveLastSyncTimeIntervalForLocation(context: Context, timeInterval: Long) {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val editor = preferences.edit()
            editor.putLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_LOCATION, timeInterval)
            editor.apply()
        }

        fun getLastSyncTimeIntervalForLocation(context: Context) : Long {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_LOCATION, 0)
        }

        fun saveLastSyncTimeIntervalForMostUsedApp(context: Context, timeInterval: Long) {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val editor = preferences.edit()
            editor.putLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_MOST_USED_APP, timeInterval)
            editor.apply()
        }

        fun getLastSyncTimeIntervalForMostUsedApp(context: Context) : Long {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_MOST_USED_APP, 0)
        }

        fun saveLastSyncTimeIntervalForTopup(context: Context, timeInterval: Long) {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val editor = preferences.edit()
            editor.putLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_TOPUP, timeInterval)
            editor.apply()
        }

        fun getLastSyncTimeIntervalForTopup(context: Context) : Long {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_TOPUP, 0)
        }

        fun saveLastSyncTimeIntervalForAmountOfUsageData(context: Context, timeInterval: Long) {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val editor = preferences.edit()
            editor.putLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_AMOUNT_OF_USAGE_DATA, timeInterval)
            editor.apply()
        }

        fun getLastSyncTimeIntervalForAmountOfUsageData(context: Context) : Long {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_AMOUNT_OF_USAGE_DATA, 0)
        }

        fun saveLastSyncTimeIntervalForCommuteTime(context: Context, timeInterval: Long) {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val editor = preferences.edit()
            editor.putLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_COMMUTE_TIME, timeInterval)
            editor.apply()
        }

        fun getLastSyncTimeIntervalForCommuteTime(context: Context) : Long {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_COMMUTE_TIME, 0)
        }

        fun saveLastSyncTimeIntervalForCallLog(context: Context, timeInterval: Long) {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val editor = preferences.edit()
            editor.putLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_CALL_LOG, timeInterval)
            editor.apply()
        }

        fun getLastSyncTimeIntervalForCallLog(context: Context) : Long {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_CALL_LOG, 0)
        }

        fun saveLastSyncTimeIntervalForSMS(context: Context, timeInterval: Long) {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val editor = preferences.edit()
            editor.putLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_SMS, timeInterval)
            editor.apply()
        }

        fun getLastSyncTimeIntervalForSMS(context: Context) : Long {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_SMS, 0)
        }

        fun saveLastSyncTimeIntervalForAddressBook(context: Context, timeInterval: Long) {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val editor = preferences.edit()
            editor.putLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_ADDRESS_BOOK, timeInterval)
            editor.apply()
        }

        fun getLastSyncTimeIntervalForAddressBook(context: Context) : Long {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_ADDRESS_BOOK, 0)
        }

        fun saveLastSyncTimeIntervalForRegularContact(context: Context, timeInterval: Long) {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val editor = preferences.edit()
            editor.putLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_REGULAR_CONTACT, timeInterval)
            editor.apply()
        }

        fun getLastSyncTimeIntervalForRegularContact(context: Context) : Long {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(SHARED_PREF_LAST_SYNC_TIME_INTERVAL_FOR_REGULAR_CONTACT, 0)
        }

        fun saveBatteryCount(context : Context, batteryCount : Int) {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val editor = preferences.edit()
            editor.putInt(SHARED_PREF_BATTERY_COUNT, batteryCount)
            editor.apply()
        }

        fun getBatteryCount(context: Context) : Int {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getInt(SHARED_PREF_BATTERY_COUNT, 0)
        }

        fun saveWifiConnectCount(context: Context, wifiConnectCount : Int) {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val editor = preferences.edit()
            editor.putInt(SHARED_PREF_WIFI_CONNECTIVITY_FREQUENCY, wifiConnectCount)
            editor.apply()
        }

        fun getWifiConnectCount(context: Context) : Int {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getInt(SHARED_PREF_WIFI_CONNECTIVITY_FREQUENCY, 0)
        }

        fun saveRegistrationId(context: Context, registrationId: String?) {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val editor = preferences.edit()
            editor.putString(SHARED_PREF_REGISTRATION_ID, registrationId)
            editor.apply()
        }

        fun getRegistrationId(context: Context) : String? {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getString(SHARED_PREF_REGISTRATION_ID, "Registration ID is Empty")
        }

    }

}