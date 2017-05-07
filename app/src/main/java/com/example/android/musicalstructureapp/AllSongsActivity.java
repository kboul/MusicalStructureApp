package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AllSongsActivity extends AppCompatActivity {

    int[] nowPlayingIds = new int[]{
            R.id.nowPlaying1,
            R.id.nowPlaying2,
            R.id.nowPlaying3,
            R.id.nowPlaying4
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_songs);

        //Transfer the user to the Now Playing Activity when selecting one of the songs
        for (int i = 0; i < nowPlayingIds.length; i++) {
            TextView nowPlaying = (TextView) findViewById(nowPlayingIds[i]);
            nowPlaying.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent nowPlayingIntent = new Intent(AllSongsActivity.this, NowPlayingActivity.class);
                    startActivity(nowPlayingIntent);
                }
            });
        }
    }
}
