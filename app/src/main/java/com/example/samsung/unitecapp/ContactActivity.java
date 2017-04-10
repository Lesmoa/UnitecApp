package com.example.samsung.unitecapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        WebView webView = (WebView)findViewById(R.id.webview_contact);
        webView.loadUrl("http://www.unitec.ac.nz/about-us/contact-us");
    }
}
