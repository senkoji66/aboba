package com.example.smarthousev20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class maintwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintwo);

    }
    public void transitionHomepage(View v) {
        Intent intent = new Intent(this, homepage2.class);
        startActivity(intent);
        finish();
    }

}

