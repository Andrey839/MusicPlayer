package com.example.musicplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun tomJERRY(view: View) {
        val tom = tom
        val jerry = jerry
        tom.animate().alpha(0F).duration=2000
        jerry.animate().alpha(1F).duration = 2000
        if (jerry.alpha==1F) {
            tom.animate().alpha(1F).duration=2000
            jerry.animate().alpha(0F).duration=2000

        }

    }
}
