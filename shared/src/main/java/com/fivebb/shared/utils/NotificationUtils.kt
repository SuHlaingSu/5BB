package com.fivebb.shared.utils

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.app.TaskStackBuilder
import com.fivebb.shared.R
import com.fivebb.shared.utils.BitmapUtils


object NotificationUtils  {

    const val CHANNEL_ID = "MMTUTORS_CHANNEL_ID"
    const val NOTI_ID = 100

    fun notify(context: Context, message: String, resultIntent: Intent, notificationId: Int) {
        //Notification Title
        val title = context.getString(R.string.app_name)

        //Supporting both unicode & zawgyi
        val mmMessage = SharedUtils.mmTextUnicodeOrigin(message, context)

        //Large Icon
        //Must call this in a background thread.
        //        Bitmap appIcon = encodeResourceToBitmap(context, R.mipmap.ic_launcher_fivebb);

        //Message in BigText Style
        val bigTextStyle = NotificationCompat.BigTextStyle()
        bigTextStyle.bigText(mmMessage)

        val builder = NotificationCompat.Builder(context, CHANNEL_ID)
                .setColor(context.getResources().getColor(R.color.colorAccent))
              //  .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(title)
                .setContentText(mmMessage)
                .setAutoCancel(true)
                .setStyle(bigTextStyle)

        val stackBuilder = TaskStackBuilder.create(context)
        stackBuilder.addNextIntent(resultIntent)

        val resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT)
        builder.setContentIntent(resultPendingIntent)

        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = context.getString(R.string.channel_name)
            val description = context.getString(R.string.channel_description)
            val channel = NotificationChannel(CHANNEL_ID, name, NotificationManager.IMPORTANCE_DEFAULT)
            channel.description = description

            val notificationManager = context.getSystemService(NotificationManager::class.java)
            if (notificationManager != null) {
                notificationManager!!.createNotificationChannel(channel)
                notificationManager!!.notify(if (notificationId == 0) NOTI_ID else notificationId, builder.build())
            } else {
                Toast.makeText(context, "Error showing notification in Android O", Toast.LENGTH_SHORT).show()
            }
        } else {
            val notificationManager = NotificationManagerCompat.from(context)
            notificationManager.notify(if (notificationId == 0) NOTI_ID else notificationId, builder.build())
        }
    }

    fun testNotify(context: Context, message: String, notificationId: Int) {
        //Notification Title
        val title = context.getString(R.string.app_name)

        //Supporting both unicode & zawgyi
        val mmMessage = SharedUtils.mmTextUnicodeOrigin(message, context)

        //Large Icon
        //Must call this in a background thread.
        //        Bitmap appIcon = encodeResourceToBitmap(context, R.mipmap.ic_launcher_fivebb);

        //Message in BigText Style
        val bigTextStyle = NotificationCompat.BigTextStyle()
        bigTextStyle.bigText(mmMessage)

        val builder = NotificationCompat.Builder(context, CHANNEL_ID)
                .setColor(context.getResources().getColor(R.color.colorAccent))
              //  .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(title)
                .setContentText(mmMessage)
                .setAutoCancel(true)
                .setStyle(bigTextStyle)

        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = context.getString(R.string.channel_name)
            val description = context.getString(R.string.channel_description)
            val channel = NotificationChannel(CHANNEL_ID, name, NotificationManager.IMPORTANCE_DEFAULT)
            channel.description = description

            val notificationManager = context.getSystemService(NotificationManager::class.java)
            if (notificationManager != null) {
                notificationManager!!.createNotificationChannel(channel)
                notificationManager!!.notify(if (notificationId == 0) NOTI_ID else notificationId, builder.build())
            } else {
                Toast.makeText(context, "Error showing notification in Android O", Toast.LENGTH_SHORT).show()
            }
        } else {
            val notificationManager = NotificationManagerCompat.from(context)
            notificationManager.notify(if (notificationId == 0) NOTI_ID else notificationId, builder.build())
        }
    }

    fun bigPictureStyle(context: Context, title: String, message: String, imageUrl: String): NotificationCompat.Builder {

        val bigPictureStyle = NotificationCompat.BigPictureStyle()
        bigPictureStyle.bigPicture(BitmapUtils.getBitmapFromURL(imageUrl))
                .setSummaryText(message)

        return NotificationCompat.Builder(context)
                .setContentTitle(title)
                .setContentText(message)
                .setStyle(bigPictureStyle)
        //TODO set logo
    }

    fun createNotification(context: Context, pendingIntent: PendingIntent, title: String, body: String) : NotificationCompat.Builder {
        return NotificationCompat.Builder(context, CHANNEL_ID)
                .setContentIntent(pendingIntent)
                .setContentTitle(title)
                .setStyle(NotificationCompat.BigTextStyle().bigText(body))
                .setContentText(body)
                .setAutoCancel(true)
        //TODO set logo
    }
}