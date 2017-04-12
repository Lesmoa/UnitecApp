package com.example.samsung.unitecapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.view.View;
import android.content.Intent;

public class FAQsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);

        WebView webView = (WebView)findViewById(R.id.webview_faqs);
        webView.loadUrl("http://www.unitec.ac.nz/about-us/frequently-asked-questions");
    }

    public void homePage(View aView) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
