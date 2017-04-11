package com.example.samsung.unitecapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ViewFlipper;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showFlipper();
    }

    public void showFlipper(){
        ViewFlipper viewFlipper = (ViewFlipper)findViewById(R.id.Lay1);
        viewFlipper.setFlipInterval(3500);
        viewFlipper.startFlipping();
    }

    public void sendMoodle(View aView){
        Intent intent = new Intent(this,MoodleActivity.class);
        startActivity(intent);
    }

    public void sendLibrary(View aView){
        Intent intent = new Intent(this,LibraryActivity.class);
        startActivity(intent);
    }

    public void sendFAQs(View aView){
        Intent intent = new Intent(this,FAQsActivity.class);
        startActivity(intent);
    }

    public void sendCurrentStudent(View aView){
        Intent intent = new Intent(this,CurrentStudentActivity.class);
        startActivity(intent);
    }

    public void sendContact(View aView){
        Intent intent = new Intent(this,ContactActivity.class);
        startActivity(intent);
    }

    public void sendWelcome(View aView){
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
    }

    public void sendCareer(View aView){
        Intent intent = new Intent(this, CareerAndStudyOptionsActivity.class);
        startActivity(intent);
    }

    public void sendMyportal(View aView){
        Intent intent = new Intent(this,MyportalActivity.class);
        startActivity(intent);
    }

    public void sendCalendar(View aView){
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
    }
}
