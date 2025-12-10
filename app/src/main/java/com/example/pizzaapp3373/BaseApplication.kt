package com.example.pizzaapp3373

import android.annotation.SuppressLint
import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import android.renderscript.Sampler

class BaseApplication: Application (){
    companion object{
        const val CHANNEL_1_ID = "channel1"

        const val CHANNEL_2_ID = "channel2"
    }

    @SuppressLint("NewApi")
    private fun createNotificationChannels(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR_0_1 ){
            val channel1 = NotificationChannel(
                CHANNEL_1_ID,
                "Channel 1",
                NotificationManager.IMPORTANCE_HIGH
            )
            channel1.description = "Ini adalah channel 1"

            val channel2 = NotificationChannel(
                CHANNEL_2_ID,
                "Channel 2",
                NotificationManager.IMPORTANCE_LOW
            )
            channel2.description = "Ini adalah channel 2"

            val manager = getSystemService(NotificationManager::class.java)
            manager.createNotificationChannel(channel1)
            manager.createNotificationChannel(channel2)
        }
    }

    override fun onCreate() {
        super.onCreate()
        createNotificationChannels()
    }
}