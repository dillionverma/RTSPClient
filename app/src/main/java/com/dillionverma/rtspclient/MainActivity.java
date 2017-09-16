package com.dillionverma.rtspclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView myVideoView = (VideoView) findViewById(R.id.videoView);
        myVideoView.setVideoPath("http://10.21.155.226:8080/video");
        myVideoView.setMediaController(new MediaController(this));
        myVideoView.start();

//        String mediaURL = "rtsp://10.21.155.226:8080/h264_ulaw.sdp";
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mediaURL));
//        startActivity(intent);

    }



}
