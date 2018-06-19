package com.example.android.displayjoke;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayJokeActivity extends AppCompatActivity {

    private static final String TAG = "DisplayJokeActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        Intent intent = getIntent();
        String joke = intent.getStringExtra("Saved joke");
        Log.d(TAG, "Received joke from JavaLibrary, which is: " + joke);

        TextView displayJoke = findViewById(R.id.joke_text_view);
        displayJoke.setText(joke);
    }

}
