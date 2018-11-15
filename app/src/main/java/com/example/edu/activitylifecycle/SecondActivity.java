package com.example.edu.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    final String TAG = "States";
    final String ACTIVITY = "SecondActivity:";
    TextView textViewSecod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ((Button)findViewById(R.id.buttonSecond)).setOnClickListener(this);
        textViewSecod = findViewById(R.id.textViewSecond);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(ACTIVITY+TAG,"Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(ACTIVITY+TAG,"Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(ACTIVITY+TAG,"Destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(ACTIVITY+TAG,"Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(ACTIVITY+TAG,"Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(ACTIVITY+TAG,"Restart");
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}
