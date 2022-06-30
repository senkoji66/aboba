package com.example.smarthousev20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kitchentermostat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchentermostat);
    }
    public void click_light(View view) {
        Intent intent = new Intent(this,kitchenlight2.class);
        startActivity(intent);
        finish();
    }

}