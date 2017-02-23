package com.example.alex.opu_weather;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TestIntentFilterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_intent_filter);

        Intent i = getIntent();

        TextView tvCaption = (TextView) findViewById(R.id.textCaption);
        tvCaption.setText(i.getStringExtra(Intent.EXTRA_SUBJECT));
        TextView tvBody = (TextView) findViewById(R.id.textView);
        tvBody.setText(i.getStringExtra(Intent.EXTRA_TEXT));
    }
}
