package com.example.smarthousev20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kitchenlight2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchenlight2);
    }
    public void click_thermostat(View view) {
        Intent intent = new Intent(this, kitchentermostat.class);
        startActivity(intent);
        finish();
    }
}