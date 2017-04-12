package com.example.samsung.unitecapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;

public class CareerAndStudyOptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_careerandstudyoptions);
    }

    public void homePage(View aView) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
