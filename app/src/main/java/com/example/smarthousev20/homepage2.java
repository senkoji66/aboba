package com.example.smarthousev20;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;

public class homepage2 extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage2);

        bottomNavigationView = findViewById(R.id.ic_tab_bar);
        getSupportFragmentManager().beginTransaction().replace(R.id.body, new HomepageFragment()).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.Home:
                        fragment = new HomepageFragment();
                        break;
                    case R.id.Statics:
                        fragment = new HomepageFragment();
                        break;
                    case R.id.Routines:
                        fragment = new HomepageFragment();
                        break;
                    case R.id.Setting:
                        fragment = new profileFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.body, fragment).commit();
                return true;
            }
        });
    }

}






