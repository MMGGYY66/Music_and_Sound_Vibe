package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class RandomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Set the content of the activity to use the activity_random.xml layout file
        setContentView(R.layout.activity_random);

        // Find the View that shows song1 from the Spotify Library or from the User's Library
        ImageView song1 = (ImageView) findViewById(R.id.song1);

        // Set a click listener on that View
        song1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the NowPlaying activity
            public void onClick(View view) {
                // Start the NowPlaying activity
                Intent song1Intent = new Intent(RandomActivity.this, NowPlayingActivity.class);
                startActivity(song1Intent);
            }
        });

        // Find the View that shows song2 from the Spotify Library or from the User's Library
        ImageView song2 = (ImageView) findViewById(R.id.song2);

        // Set a click listener on that View
        song2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the NowPlaying activity
            public void onClick(View view) {
                // Start the NowPlaying activity
                Intent song2Intent = new Intent(RandomActivity.this, NowPlayingActivity.class);
                startActivity(song2Intent);
            }
        });

        // Find the View that shows song3 from the Spotify Library or from the User's Library
        ImageView song3= (ImageView) findViewById(R.id.song3);

        // Set a click listener on that View
        song3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the NowPlaying activity
            public void onClick(View view) {
                // Start the NowPlaying activity
                Intent song3Intent = new Intent(RandomActivity.this, NowPlayingActivity.class);
                startActivity(song3Intent);
            }
        });

        // Find the View that shows song4 from the Spotify Library or from the User's Library
        ImageView song4= (ImageView) findViewById(R.id.song4);

        // Set a click listener on that View
        song4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the NowPlaying activity
            public void onClick(View view) {
                // Start the NowPlaying activity
                Intent song4Intent = new Intent(RandomActivity.this, NowPlayingActivity.class);
                startActivity(song4Intent);
            }
        });

        // Find the View that shows song5 from the Spotify Library or from the User's Library
        ImageView song5= (ImageView) findViewById(R.id.song5);

        // Set a click listener on that View
        song5.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the NowPlaying activity
            public void onClick(View view) {
                // Start the NowPlaying activity
                Intent song5Intent = new Intent(RandomActivity.this, NowPlayingActivity.class);
                startActivity(song5Intent);
            }
        });

        // Find the View that shows song6 from the Spotify Library or from the User's Library
        ImageView song6= (ImageView) findViewById(R.id.song3);

        // Set a click listener on that View
        song6.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the NowPlaying activity
            public void onClick(View view) {
                // Start the NowPlaying activity
                Intent song6Intent = new Intent(RandomActivity.this, NowPlayingActivity.class);
                startActivity(song6Intent);
            }
        });
    }
}
