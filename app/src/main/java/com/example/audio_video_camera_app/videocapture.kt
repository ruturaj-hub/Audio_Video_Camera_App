package com.example.audio_video_camera_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_videocapture.*

class videocapture : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videocapture)

        button4.setOnClickListener {
            var i = Intent(MediaStore.ACTION_VIDEO_CAPTURE)
            startActivityForResult(i,101)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 101){
            videoView3.setVideoURI(data?.data)
            videoView3.start()
        }
    }
}