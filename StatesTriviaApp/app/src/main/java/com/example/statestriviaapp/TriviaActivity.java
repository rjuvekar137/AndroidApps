package com.example.statestriviaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class TriviaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);

        EditText editText = (EditText)findViewById(R.id.trivia_text);

        // get state
        Intent senderIntent = getIntent();
        String state = senderIntent.getStringExtra("state");
        if ( state.equals("Alabama") ) {
            editText.setText(state+"\nHome of: George Washington Carver, who discovered more than 300 uses for peanuts.");
        } else if ( state.equals("Alaska") ) {
            editText.setText(state+"\nHome of: Longest coastline in the U.S., 6,640 miles, greater than that of all other states combined.");
        } else {
            editText.setText(state+"\nNever heard of that.");
        }

        // return button
        Button button = (Button) findViewById(R.id.return_button);
        button.setOnClickListener((v) -> {
            Intent intent = new Intent (TriviaActivity.this, MainActivity.class);
            startActivity(intent);
        });

    }

}