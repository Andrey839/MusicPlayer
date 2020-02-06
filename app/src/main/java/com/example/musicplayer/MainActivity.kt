package com.example.musicplayer

import android.content.Context
import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.MediaController
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.max
import kotlin.properties.Delegates


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


}

