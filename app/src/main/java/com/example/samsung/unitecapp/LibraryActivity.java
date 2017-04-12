package com.example.samsung.unitecapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.view.View;
import android.content.Intent;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        WebView webView = (WebView)findViewById(R.id.webview_library);
        webView.loadUrl("http://library.unitec.ac.nz/");
    }

    public void homePage(View aView) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
