package com.android.if18s;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    WebView webGoogle;

    public static final String URL = "https://google.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webGoogle = (WebView) findViewById(R.id.webGoogle);

        WebSettings settings = webGoogle.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(true);
        settings.setDisplayZoomControls(true);

        webGoogle.setWebChromeClient(new WebChromeClient());
        webGoogle.loadUrl(URL);
    }
}
