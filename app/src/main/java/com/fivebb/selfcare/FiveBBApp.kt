package com.fivebb.selfcare

import android.annotation.SuppressLint
import android.app.Application
import android.os.Build
import android.provider.Settings.Secure
import android.util.Log
import androidx.annotation.RequiresApi
import com.facebook.FacebookSdk
import com.fivebb.selfcare.models.UserModelImpl
import com.google.firebase.FirebaseApp
import com.google.firebase.crashlytics.FirebaseCrashlytics


class FiveBBApp : Application() {

    var fcms : String = ""

    companion object {
        val TAG: String = FiveBBApp::class.java.simpleName
        var showMainPrompt = true
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("HardwareIds")
    override fun onCreate() {
        super.onCreate()

        FirebaseApp.initializeApp(applicationContext)

        if(!BuildConfig.DEBUG){
           // Fabric.with(this, Crashlytics())
            val crashlytics = FirebaseCrashlytics.getInstance()
            crashlytics.log("App Crash");

        }
        UserModelImpl.initUserModelImpl(applicationContext)
       /* fcms = FirebaseInstanceId.getInstance().getToken().toString()
        Log.d("FCMS_TOKEN", fcms)*/

        val androidId = Secure.getString(
            this.contentResolver,
            Secure.ANDROID_ID
        )

        Log.d("Android", "Android ID : $androidId")

        //Facebook
        FacebookSdk.setAutoInitEnabled(true)
        FacebookSdk.fullyInitialize()
        FacebookSdk.setAutoLogAppEventsEnabled(true)

    }
}
