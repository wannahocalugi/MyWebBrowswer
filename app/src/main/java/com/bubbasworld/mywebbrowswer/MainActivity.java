package com.bubbasworld.mywebbrowswer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnYahoo;
    Button btnUcsd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnYahoo = (Button) findViewById(R.id.btnYahoo);
        btnYahoo.setOnClickListener((View.OnClickListener) this);

        btnUcsd = (Button) findViewById(R.id.btnUcsd);
        btnUcsd.setOnClickListener((View.OnClickListener) this);


    }


    @Override
    public void onClick(View v)
    {
        switch( v.getId() ) {
            case R.id.btnYahoo:
                Intent IntentYahoo;
                IntentYahoo = new Intent(this, Activity_Yahoo.class);
                startActivity(IntentYahoo);
                break;

            case R.id.btnUcsd:
                Intent IntentUcsd;
                IntentUcsd = new Intent(this, activity_UCSD.class);
                startActivity(IntentUcsd);
                break;
       }

    }



}
