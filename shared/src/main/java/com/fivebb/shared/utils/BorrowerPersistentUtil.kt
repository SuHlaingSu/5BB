package com.fivebb.shared.utils
import android.content.Context
import android.content.SharedPreferences

class BorrowerPersistentUtil(context: Context) {

    private var mSharedPreferences: SharedPreferences = context.getSharedPreferences(BorrowerPersistentUtil::class.java.name, Context.MODE_PRIVATE)

    companion object {
        fun newInstance(context: Context): BorrowerPersistentUtil {
            return BorrowerPersistentUtil(context)
        }
    }

    fun saveLanguage(language: String) {
        val editor = mSharedPreferences.edit()
        editor.putString(SharedConstants.SELECTED_LANGUAGE, language)
        editor.apply()
    }

    //Default language is English.
    fun getLanguage(): String? {
        return mSharedPreferences.getString(SharedConstants.SELECTED_LANGUAGE, SharedConstants.SELECTED_LANGUAGE_MY)
    }

    fun setCallDataUploadServiceStatus(isServiceStarted: Boolean) {
        val editor = mSharedPreferences.edit()
        editor.putBoolean(SharedConstants.SERVICE_CALL_DATA_UPLOAD_STARTED, isServiceStarted).apply()
    }

    fun isCallDataUploadServiceStarted(): Boolean {
        return mSharedPreferences.getBoolean(SharedConstants.SERVICE_CALL_DATA_UPLOAD_STARTED, false)
    }

    /*
    * JobSchedular ကပို့တဲ့ဟာနဲ့ ဒါနဲ့မတူဘူး။​
    * ဒီ sharedPref ကို App Login | Register လုပ်ပြီးပြီးချင်း ApplyActivity ကိုရောက်တာနဲ့ Contact | Call Log
    * နဲ့ဆိုင်တဲ့ အချက်အလက်တွေကို ContactDataUploadThread သုံးပြီးပို့ပေးမယ်။
    * တစ်ခါပို့ပြီးတာနဲ့ နောက်တစ်ခါတွေမှာ မပို့တော့ဘူး။ နောက်ပိုင်းပို့တာတွေအတွက် JobSchedular ကလုပ်သွားမယ်။
    *
    * Log out လုပ်လိုက်ရင် Data Clear လုပ်ပေးမယ်။​
    * */
    fun setInitCallDataUploadedValue(isCallDataUploaded : Boolean) {
        val editor = mSharedPreferences.edit()
        editor.putBoolean(SharedConstants.INIT_CALL_DATA_UPLOADED, isCallDataUploaded).apply()
    }

    fun isInitCallDataUploaded() : Boolean {
        return mSharedPreferences.getBoolean(SharedConstants.INIT_CALL_DATA_UPLOADED, false)
    }

    fun setLocationDataUploadServiceStatus(isServiceStarted: Boolean) {
        val editor = mSharedPreferences.edit()
        editor.putBoolean(SharedConstants.SERVICE_LOCATION_DATA_UPLOAD_SERVICE_STARTED, isServiceStarted).apply()
    }

    fun isLocationDataUploadServiceStarted(): Boolean {
        return mSharedPreferences.getBoolean(SharedConstants.SERVICE_LOCATION_DATA_UPLOAD_SERVICE_STARTED, false)
    }

    fun isSyncServiceStart() : Boolean {
        return mSharedPreferences.getBoolean(SharedConstants.SYNC_SERVICE_STARTED, false)
    }

    fun saveSyncServiceStart(isServiceStarted: Boolean) {
        val editor = mSharedPreferences.edit()
        editor.putBoolean(SharedConstants.SYNC_SERVICE_STARTED, isServiceStarted).apply()
    }

    fun setSMSDataUploadServiceStatus(isServiceStarted: Boolean) {
        val editor = mSharedPreferences.edit()
        editor.putBoolean(SharedConstants.SERVICE_SMS_DATA_UPLOAD_SERVICE_STARTED, isServiceStarted).apply()
    }

    fun isSMSDataUploadServiceStarted(): Boolean {
        return mSharedPreferences.getBoolean(SharedConstants.SERVICE_SMS_DATA_UPLOAD_SERVICE_STARTED, false)
    }

    fun setAppUsageDataUploadServiceStatus(isServiceStarted: Boolean) {
        val editor = mSharedPreferences.edit()
        editor.putBoolean(SharedConstants.SERVICE_APP_USAGE_DATA_UPLOAD_SERVICE_STARTED, isServiceStarted).apply()
    }

    fun isAppUsageDataUploadServiceStarted(): Boolean {
        return mSharedPreferences.getBoolean(SharedConstants.SERVICE_APP_USAGE_DATA_UPLOAD_SERVICE_STARTED, false)
    }

    fun setPsychometricAnswerLastScreenReached(lastScreenReached: Boolean) {
        val editor = mSharedPreferences.edit()
        editor.putBoolean(SharedConstants.PSYCHOMETRIC_ANSWER_LAST_SCREEN_REACHED, lastScreenReached).apply()
    }

    fun isPsychometricAnswerLastScreenReached(): Boolean {
        return mSharedPreferences.getBoolean(SharedConstants.PSYCHOMETRIC_ANSWER_LAST_SCREEN_REACHED, false)
    }

    fun setCredoAppInitiating(initiated: Boolean) {
        val editor = mSharedPreferences.edit()
        editor.putBoolean(SharedConstants.CREDO_APP_INITIATING, initiated).apply()
    }

    fun isCredoAppInitiated(): Boolean {
        return mSharedPreferences.getBoolean(SharedConstants.CREDO_APP_INITIATING, false)
    }

    fun saveCapturedVideoUri(videoUri: String) {
        val editor = mSharedPreferences.edit()
        editor.putString(SharedConstants.CAPTURED_VIDEO_URI, videoUri)
        editor.apply()
    }

    fun getCapturedVideoUri(): String? {
        return mSharedPreferences.getString(SharedConstants.CAPTURED_VIDEO_URI, "")
    }

}













