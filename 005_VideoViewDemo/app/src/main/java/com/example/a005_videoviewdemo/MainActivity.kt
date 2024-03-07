package com.example.a005_videoviewdemo

import android.net.Uri
import android.net.Uri.parse
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import java.net.URI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView = findViewById<VideoView>(R.id.videoView)//instantiate the media view
        val mediaController = MediaController(this)//"this" is the context
        mediaController.setAnchorView(videoView) //"videoView" its connected to "mediaController"

        val uri: Uri = parse("android.resource://"+packageName+"/"+R.raw.pig)
        videoView.setMediaController(mediaController) //"mediaController" is now connected to "videoView"
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}