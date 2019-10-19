package com.example.callwallmute

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.AudioManager
import androidx.core.content.ContextCompat.getSystemService

class Audio (audioManager: AudioManager){
   var audioManager : AudioManager = audioManager
    var voulume : Int = 5

    fun mute() {
        this.audioManager.adjustStreamVolume(AudioManager.STREAM_RING, AudioManager.ADJUST_MUTE, 0)
    }

    fun unmute() {
        audioManager.adjustStreamVolume(AudioManager.STREAM_RING, AudioManager.ADJUST_UNMUTE, 0)
    }
}