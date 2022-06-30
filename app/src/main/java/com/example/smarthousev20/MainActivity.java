package com.example.smarthousev20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clcik_enter_your_house(View view) {
        Intent intent = new Intent(this, homepage2.class);
        startActivity(intent);
        finish();
    }

    public void click_startNewActivity(View view) {
        Intent intent = new Intent(this, maintwo.class);
        startActivity(intent);
        finish();
    }
}