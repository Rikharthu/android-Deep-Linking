package com.example.uberv.deeplinking;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GizmosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gizmos);

        Intent intent = getIntent();
        String action = intent.getAction();
        Uri data= intent.getData();

        ((TextView)findViewById(R.id.gizmos_tv)).setText(data.toString());
    }
}
