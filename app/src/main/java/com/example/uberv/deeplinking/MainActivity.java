package com.example.uberv.deeplinking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView)findViewById(R.id.info)).setText("adb shell am start -W -a android.intent.action.VIEW -d \"http://www.example.com/gizmos\"");
    }
}
