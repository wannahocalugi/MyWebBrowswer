package com.bubbasworld.mywebbrowswer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class activity_UCSD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__ucsd);

        WebView  ucsdView = (WebView) findViewById(R.id.webView_ucsd);
        ucsdView.loadUrl(getString(R.string.strUrlUCSD));
    }
}
