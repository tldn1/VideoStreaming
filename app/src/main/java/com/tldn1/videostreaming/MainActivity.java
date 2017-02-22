package com.tldn1.videostreaming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView vidView = (VideoView)findViewById(R.id.myVideo);

        //video bellow is used only in presentation purpose

        String vidAddress = "https://d9648.thevideo.me:8777/ogjtaqjesooammfvg4pvacuqpk5u2azjoibgud3ckfxiehoxzz7acipnbtrlg5f32ultqiuvsf3jcsrly6rqc4gwzbndftmvww5pe3aiaed6opkdfutb6vsppcnwqriblqwledp7aan6tei6zctmyfkkvrcjflwgelxwino7cgloohdcuk45rwmyi2axwt5hoc7hgmycoesvxuxq7hoeu4q7tn2ldtpr3lz3pg4qv3ozovkhdh5tsuv4ydt5ntnqyqsjrfyg76rlq5c5mscvuxv3vaja/v.mp4\",\"label\":\"240p\"},{\"file\":\"https://d9648.thevideo.me:8777/ogjtaqjesooammfvg4pvacuqpk5u2azjoibgud3ckpoyehoxzz7ewhts23y2nshz5cuthlxsbrohbps4dlnhthyvy6nu5ilky5235c7pnnaxpvytctkv43zi3kivyzb2zyqnxyjpdzlebiauizmcla5wkabh26adgjt66nbqyqsxt4w3ae753tld7yfejeiozl4ptuqzrfox5c2wlydfo7vlhw5pahysb37xlmrx6b4onesthcr7jiav5juzghngkgwsjrc5lfgcngjlp4prmvw27ytq/v.mp4";
        Uri vidUri = Uri.parse(vidAddress);
        vidView.setVideoURI(vidUri);
        MediaController vidControl = new MediaController(this);
        vidControl.setAnchorView(vidView);
        vidView.setMediaController(vidControl);
    }
}
