package com.example.nino.financeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MicrosoftActivity extends AppCompatActivity {

    private static final String TAG = "MicrosoftActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microsoft);
        Log.v(TAG, "Created the Microsoft Activity... just so you know.");

    }
    @Override
    public void onResume() {
        super.onResume();

        Log.v(TAG, "Microsoft Activity is back on resuming");
}
}
