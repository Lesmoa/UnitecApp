package com.example.samsung.unitecapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class FAQsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);

        WebView webView = (WebView)findViewById(R.id.webview_faqs);
        webView.loadUrl("http://www.unitec.ac.nz/about-us/frequently-asked-questions");
    }
}
