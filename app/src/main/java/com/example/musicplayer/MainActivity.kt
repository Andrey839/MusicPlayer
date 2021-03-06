package com.example.musicplayer

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var player: MediaPlayer
    lateinit var zeek : SeekBar
    private val listSong = listOf(R.raw.beau, R.raw.zonderling, R.raw.disclosure)
    private var counter = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val player = MediaPlayer.create(this, listSong[counter])
        zeek = seekBar
        zeek.max = player.duration
        songsTextView?.text = listSong[counter].toString()
        val uri = Uri.parse("android.resource://"+packageName+"/"+listSong[counter])


        zeek?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean){
                if (fromUser) player.seekTo(progress)
         }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        Timer().scheduleAtFixedRate(object : TimerTask(){
            override fun run() {
                zeek.progress = player.currentPosition
            }
        },0,1000)

        player.setOnCompletionListener {
            if (counter==2) counter = 0
            else counter++
            player.reset()
            player?.setDataSource(this,uri)
            player.prepare()
            player.start()
        }

    }

    fun previous(view: View) {
        player.stop()
        if (counter==0) counter=2
        else counter--
        player.start()
        songsTextView?.text = listSong[counter].toString()
    }
    fun next(view: View) {
        player.stop()
        if (counter==2) counter=0
        else counter++
        player.start()
        songsTextView?.text = listSong[counter].toString()
    }


    fun play( view: View) {
            //      if (player.isPlaying) {
            //          player.pause()
            //          playImageView?.setImageResource(R.drawable.ic_pause_orang_24dp)
            //      } else {
            player.prepare()
            player.start()

            //          playImageView?.setImageResource(R.drawable.ic_play_arrow_orang_24dp)
            //          if (counter==2) counter=0
            //          else counter++}
            songsTextView?.text = listSong[counter].toString()


    }


}

