package com.example.audio_video_camera_app

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_video_play.*

class VideoPlayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_play)

        var mc = MediaController(this)
        mc.setAnchorView(videoView2)
        videoView2.setMediaController(mc)
        videoView2.setVideoURI(Uri.parse("https://static.videezy.com/system/resources/previews/000/038/653/original/alb_glitch1047_1080p_24fps.mp4"))
        videoView2.start()
    }
}