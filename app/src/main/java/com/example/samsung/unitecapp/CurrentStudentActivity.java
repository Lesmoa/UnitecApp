package com.example.samsung.unitecapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.view.View;
import android.content.Intent;

public class CurrentStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_student);

        WebView webView =(WebView)findViewById(R.id.webview_currentstudent);
        webView.loadUrl("http://www.unitec.ac.nz/current-students");
    }

    public void homePage(View aView) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
