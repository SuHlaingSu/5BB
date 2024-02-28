package com.fivebb.selfcare.notification

import android.annotation.SuppressLint
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import com.fivebb.selfcare.BuildConfig
import com.fivebb.selfcare.R
import com.fivebb.selfcare.activities.NotificationActivity
import com.fivebb.shared.utils.mmTextUnicodeOrigin


@SuppressLint("UnspecifiedImmutableFlag")
@RequiresApi(Build.VERSION_CODES.M)
fun sendNotification(context: Context, title: String, messageBody: String, msgId: String) {
    val intent = NotificationActivity.newIntent(context)
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

    val pendingIntent = PendingIntent.getActivity(
        context, 0, intent,
        PendingIntent.FLAG_UPDATE_CURRENT
    )

    buildAndSendNotification(context, title, messageBody, pendingIntent)
}

    private fun buildNoti(
        context: Context,
        channelId: String,
        title: String,
        content: String,
        intent: PendingIntent
    ): Notification {
        val defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)

        return NotificationCompat.Builder(context, channelId)
            .setSmallIcon(R.drawable.logo)
            .setContentTitle(mmTextUnicodeOrigin(title, context))
            .setContentText(mmTextUnicodeOrigin(content, context))
            .setStyle(
                NotificationCompat.BigTextStyle()
                    .bigText(mmTextUnicodeOrigin(content, context))
            )
            .setContentIntent(intent)
            .setAutoCancel(true)
            .setSound(defaultSoundUri)
            .build()
    }

    private fun buildAndSendNotification(
        context: Context,
        title: String,
        message: String,
        pendingIntent: PendingIntent
    ) {
        val notificationManager = context
            .getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val NOTIFICATION_CHANNEL_ID = BuildConfig.APPLICATION_ID + ".channel"

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O
            && notificationManager.getNotificationChannel(NOTIFICATION_CHANNEL_ID) == null
        ) {
            val name = context.getString(R.string.app_name)
            val channel = NotificationChannel(
                NOTIFICATION_CHANNEL_ID,
                name,
                NotificationManager.IMPORTANCE_DEFAULT
            )

            notificationManager.createNotificationChannel(channel)
        }

        val notification =
            buildNoti(context, NOTIFICATION_CHANNEL_ID, title, message, pendingIntent)

        notificationManager.notify(getUniqueId(), notification)
    }

    private fun getUniqueId() = ((System.currentTimeMillis() % 10000).toInt())