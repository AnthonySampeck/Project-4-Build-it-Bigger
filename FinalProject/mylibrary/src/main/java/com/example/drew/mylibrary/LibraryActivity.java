package com.example.drew.mylibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        Intent intent = getIntent();

        TextView jokeTextView =(TextView)findViewById(R.id.jokeTextView);

        jokeTextView.setText(intent.getStringExtra("joke"));



    }




}
