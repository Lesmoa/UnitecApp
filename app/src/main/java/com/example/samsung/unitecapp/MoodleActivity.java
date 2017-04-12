package com.example.samsung.unitecapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.view.View;
import android.content.Intent;

public class MoodleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moodle);

        WebView webView = (WebView)findViewById(R.id.webview_moodle);
        webView.loadUrl("https://moodle.unitec.ac.nz/");
    }

    public void homePage(View aView) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
