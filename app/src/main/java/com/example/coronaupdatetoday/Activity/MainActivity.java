package com.example.coronaupdatetoday.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import android.webkit.WebViewClient;


import android.webkit.WebView;

import com.example.coronaupdatetoday.R;


public class MainActivity extends AppCompatActivity {

    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        webView =findViewById(R.id.webView);
        android.webkit.WebSettings WebSettings =webView.getSettings();
        WebSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://shahoshikantho24.com");
        webView.setWebViewClient(new WebViewClient ());
    }

    @Override
    public void onBackPressed() {

        if(webView.canGoBack())
        {
            webView.goBack();
        }

        else
        {
            super.onBackPressed();
        }

    }
}
