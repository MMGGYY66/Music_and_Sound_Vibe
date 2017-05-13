package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MusicSearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Set the content of the activity to use the activity_music_search.xml layout file
        setContentView(R.layout.activity_music_search);

        // Find the View that shows the Music Library
        ImageView musicLibrary = (ImageView) findViewById(R.id.music_library);

        // Set a click listener on that View
        musicLibrary.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the NowPlaying activity
            public void onClick(View view) {
                // Start the NowPlaying activity
                Intent musicLibraryIntent = new Intent(MusicSearchActivity.this, NowPlayingActivity.class);
                startActivity(musicLibraryIntent);
            }
        });
    }
}


