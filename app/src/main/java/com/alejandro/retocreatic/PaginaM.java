package com.alejandro.retocreatic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class PaginaM extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_m);

        webView=findViewById(R.id.web1);

        webView.loadUrl("https://www.mattelsa.net/");

    }
}
