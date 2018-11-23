package com.alejandro.retocreatic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class PaginaB extends AppCompatActivity {

    WebView webView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_b);

        webView=findViewById(R.id.web1);


        webView.loadUrl(ScrollingActivity.url);
    }
}
