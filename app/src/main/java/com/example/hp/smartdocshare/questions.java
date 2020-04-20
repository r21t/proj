package com.example.hp.smartdocshare;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class questions extends AppCompatActivity {
    WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        Intent data = getIntent();
        final String sem = data.getStringExtra("s");
        String url = "https://acc-smartdocshare.000webhostapp.com/test_paper.php?r=" + sem;
        Log.v("data", url);
        browser = findViewById(R.id.webkit1);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.loadUrl(url);

    }
}
