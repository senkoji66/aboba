package com.example.smarthousev20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class addroom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addroom);
    }

    public void add_room_click(View view) {
    }


    public void strelka(View view) {
        Intent intent = new Intent(this, homepage2.class);
        startActivity(intent);
        finish();
    }
    public void click_kitchen(View view) {
        Intent intent = new Intent(this,kitchenlight2.class);
        startActivity(intent);
        finish();
    }
}