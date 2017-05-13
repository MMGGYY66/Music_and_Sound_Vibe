package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.ActionBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the Playlist activity
        Button playlist = (Button) findViewById(R.id.playlist);

        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the Playlist activity
            public void onClick(View view) {
                // Start the Playlist activity
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        // Find the View that shows the Music Search activity
        Button musicSearch = (Button) findViewById(R.id.music_search);

        // Set a click listener on that View
        musicSearch.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the Search Music activity
            public void onClick(View view) {
                // Start the Music Search activity
                Intent musicSearchIntent = new Intent(MainActivity.this, MusicSearchActivity.class);
                startActivity(musicSearchIntent);
            }
        });

        // Find the View that shows the Random activity
        Button random = (Button) findViewById(R.id.random);

        // Set a click listener on that View
        random.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the Random activity
            public void onClick(View view) {
                // Start the Random activity
                Intent randomIntent = new Intent(MainActivity.this,RandomActivity.class);
                startActivity(randomIntent);
            }
        });
    }
}
