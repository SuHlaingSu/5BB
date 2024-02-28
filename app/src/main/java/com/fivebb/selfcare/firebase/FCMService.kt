package com.fivebb.selfcare.firebase

import android.os.Build
import android.text.TextUtils
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import com.fivebb.selfcare.notification.sendNotification
import com.fivebb.selfcare.utils.SharedPreferenceUtils
//import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


open class FCMService : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        super.onNewToken(token)

        Log.d("FCMS", "Refreshed token: $token")
        FirebaseMessaging.getInstance().token
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    if (task.result != null && !TextUtils.isEmpty(task.result)) {
                        val token: String = task.result!!
                    }
                }
            }
        if (token != null) {
            SharedPreferenceUtils.saveFCMToken(this,token)
        }
        /* FirebaseInstanceId.getInstance().instanceId.addOnCompleteListener {
             val token: String? = it.result?.token
             if (!token.isSuccessful) {
                 Log.w("TAG", "getInstanceId failed", it.exception)
                 return@addOnCompleteListener
             }

             // Get new Instance ID token

             if (token != null) {
                 SharedPreferenceUtils.saveFCMToken(this,token)
             }
             // Log and toast
             //val msg = getString("1", token)
             if (token != null) {
                 Log.d("FCM_Token", token)
             }

         }*/
}

@RequiresApi(Build.VERSION_CODES.M)
override fun onMessageReceived(message: RemoteMessage) {
 super.onMessageReceived(message)
     sendNotification(this, message.data["title"] ?: "", message.data["body"] ?: "", "1")
     Log.i("TAG", "onMessageReceived: $message")
 }
}