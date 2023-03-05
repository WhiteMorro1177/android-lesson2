package ru.mirea.tsybulko.notificationapp

import android.Manifest.permission.POST_NOTIFICATIONS
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.IconCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendNotification(view: View) {
        val channelId: String = "ru.mirea.tsybulko.notificationapp.ANDROID"

        // check permission
        if (ContextCompat.checkSelfPermission(
                this,
                POST_NOTIFICATIONS
            ) == PackageManager.PERMISSION_DENIED
        ) return

        // create notification builder with values
        val builder = NotificationCompat
            .Builder(this, channelId).apply {
                setContentText("Congratulations!") // text of notification
                priority = NotificationCompat.PRIORITY_HIGH
                setSmallIcon(R.drawable.ic_launcher_foreground) // notification icon
                setContentTitle("Noted") // notification title
                // notification text
                setStyle(
                    NotificationCompat.BigTextStyle()
                        .bigText("artificial longing text aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                )
            }

        // create notification channel
        val channel = NotificationChannel(
            channelId,
            "канал Цыбулько А Д",
            NotificationManager.IMPORTANCE_DEFAULT
        ).apply {
            description = "just channel"
        }

        // create notification manager
        val notificationManager: NotificationManagerCompat = NotificationManagerCompat.from(this)

        // convert builder into notification and post it
        notificationManager.createNotificationChannel(channel)
        notificationManager.notify(1, builder.build())
    }
}