package com.example.nino.financeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "Created the Main one");

        Button button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)    {
                Intent intent2 = new Intent(MainActivity.this, FacebookActivity.class);
                startActivity(intent2);

            }
        });
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)    {
                Intent intent = new Intent(MainActivity.this, AlphabetActivity.class);
                startActivity(intent);

            }
        });

        Button button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)    {
                Intent intent3 = new Intent(MainActivity.this, MicrosoftActivity.class);
                startActivity(intent3);

            }
        });


    }
    @Override
    public void onPause() {
        super.onPause();

        Log.v(TAG, "MainActivity is onPause now... Just chill...");
    }


}
