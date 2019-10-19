package com.example.callwallmute

import android.Manifest
import android.app.NotificationManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.AudioManager
import android.content.Context.AUDIO_SERVICE
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.app.ActivityCompat.startActivityForResult
import android.content.Intent
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat


class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var n : NotificationManager = getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//        if (n.isNotificationPolicyAccessGranted) {
//            val audioManager = applicationContext.getSystemService(Context.AUDIO_SERVICE) as AudioManager
//            audioManager.ringerMode = AudioManager.RINGER_MODE_SILENT
//        } else {
//            // Ask the user to grant access
//            val permission0 = ContextCompat.checkSelfPermission(this,
//                Manifest.permission.ACCESS_NOTIFICATION_POLICY)
//            val permission1 = ContextCompat.checkSelfPermission(this,
//                Manifest.permission.VIBRATE)
//            ActivityCompat.requestPermissions(this,
//                arrayOf(Manifest.permission.VIBRATE), permission1)
////            val intent = Intent(android.provider.Settings.ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS)
//
//        }
        var audio : Audio = Audio(getSystemService(Context.AUDIO_SERVICE) as AudioManager)
        println(webscrape.checkPhoneNum("6505461126"))
        audio.mute()
//        unmute()
//        mute()
//        Thread.sleep(5_000)
//        unmute()

    }

    fun mute() {
        val audioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
        audioManager.adjustStreamVolume(AudioManager.STREAM_RING, AudioManager.ADJUST_MUTE, 0)
    }
//
//
    fun unmute() {
        val audioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
        audioManager.adjustStreamVolume(AudioManager.STREAM_RING, AudioManager.ADJUST_UNMUTE, 0)

    }
}
