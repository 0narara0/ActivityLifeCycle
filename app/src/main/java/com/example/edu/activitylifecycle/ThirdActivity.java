package com.example.edu.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends AppCompatActivity {
    final String TAG = "States";
    final String ACTIVITY = "ThirdActivity:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
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
}
