package com.example.musicplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.jerry as jerry1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun tomJERRY(view: View) {
        tom.animate().alpha(0F).duration=2000
        jerry1.animate().alpha(1F).duration=2000
        if (this.jerry1) {
            tom.animate().alpha(1F).duration=2000
            jerry1.animate().alpha(0F).duration=2000

        }

    }
}
