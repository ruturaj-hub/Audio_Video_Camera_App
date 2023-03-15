package com.example.audio_video_camera_app

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TO PLAY AUDIO THROUGH OFFLINE RESOURCE
        button.setOnClickListener {
            var mp = MediaPlayer.create(this,R.raw.tere)
            mp.start()
        }

        // TO PLAY AUDIO VIA ONLINE
        button2.setOnClickListener {
            var mp = MediaPlayer()
            mp.setDataSource("https://drive.google.com/file/d/1mMuD4DaFo_Kor_Sukv34sp6JWrMTQIsb/view?usp=share_link")
            mp.prepare()
            mp.start()
        }

        //To play VIDEO from resource folder

        var path = "android.resource://${packageName}/${R.raw.videopattern}"
        var mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)
        videoView.setVideoPath(path)
        videoView.start()
    }
}