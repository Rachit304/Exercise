package com.example.exercise;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Splash1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash1);

        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(Splash1.this, Splash2.class);
                    startActivity(intent);
                }
            }

        };
        thread.start();

    }

    @Override
    protected void onPause() {
        super.onPause();    
        finish();
    }
}