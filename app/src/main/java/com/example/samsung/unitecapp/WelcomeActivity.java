package com.example.samsung.unitecapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        WebView webView = (WebView)findViewById(R.id.webview_welcome);
        webView.loadUrl("http://www.unitec.ac.nz/about-us/welcome-to-unitec");
    }
}
