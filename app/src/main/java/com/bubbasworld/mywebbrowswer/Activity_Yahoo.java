package com.bubbasworld.mywebbrowswer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Activity_Yahoo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__yahoo);

        WebView yahooView = (WebView) findViewById(R.id.webView_yahoo);
        yahooView.loadUrl(getString(R.string.strUrlYahoo));
    }
}
