package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Set the content of the activity to use the activity_playlist.xml layout file
        setContentView(R.layout.activity_playlist);

        // Find the View that shows the Best Hits category
        TextView bestHits = (TextView) findViewById(R.id.best_hits);

        // Set a click listener on that View
        bestHits.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the NowPlaying activity
            public void onClick(View view) {
                // Start the NowPlaying activity
                Intent bestHitsIntent = new Intent(PlaylistActivity.this, NowPlayingActivity.class);
                startActivity(bestHitsIntent);
            }
        });

        // Find the View that shows the Chill Songs category
        TextView chillSongs = (TextView) findViewById(R.id.chill);

        // Set a click listener on that View
        chillSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the NowPlaying activity
            public void onClick(View view) {
                // Start the NowPlaying activity
                Intent chillSongsIntent = new Intent(PlaylistActivity.this, NowPlayingActivity.class);
                startActivity(chillSongsIntent);
            }
        });

        // Find the View that shows the Love Songs category
        TextView loveSongs = (TextView) findViewById(R.id.love_songs);

        // Set a click listener on that View
        loveSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the NowPlaying activity
            public void onClick(View view) {
                // Start the NowPlaying activity
                Intent loveSongsIntent = new Intent(PlaylistActivity.this, NowPlayingActivity.class);
                startActivity(loveSongsIntent);
            }
        });

        // Find the View that shows the Soundtracks category
        TextView soundtracks = (TextView) findViewById(R.id.soundtracks);

        // Set a click listener on that View
        soundtracks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the NowPlaying activity
            public void onClick(View view) {
                // Start the NowPlaying activity
                Intent soundtracksIntent = new Intent(PlaylistActivity.this, NowPlayingActivity.class);
                startActivity(soundtracksIntent);
            }
        });

        // Find the View that shows the Celebration Songs category
        TextView celebrationSongs = (TextView) findViewById(R.id.celebration);

        // Set a click listener on that View
        celebrationSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the NowPlaying activity
            public void onClick(View view) {
                // Start the NowPlaying activity
                Intent celebrationSongsIntent = new Intent(PlaylistActivity.this, NowPlayingActivity.class);
                startActivity(celebrationSongsIntent);
            }
        });

        // Find the View that shows the Inspirational Songs category
        TextView inspirationalSongs = (TextView) findViewById(R.id.inspirational);

        // Set a click listener on that View
        inspirationalSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the NowPlaying activity
            public void onClick(View view) {
                // Start the NowPlaying activity
                Intent inspirationalSongsIntent = new Intent(PlaylistActivity.this, NowPlayingActivity.class);
                startActivity(inspirationalSongsIntent);
            }
        });

        // Find the View that shows the Add Custom Playlist category
        TextView addCustomPlaylist = (TextView) findViewById(R.id.add_playlist);

        // Set a click listener on that View
        addCustomPlaylist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the NowPlaying activity
            public void onClick(View view) {
                // Start the NowPlaying activity
                Intent addCustomPlaylistIntent = new Intent(PlaylistActivity.this, NowPlayingActivity.class);
                startActivity(addCustomPlaylistIntent);
            }
        });
    }
}
