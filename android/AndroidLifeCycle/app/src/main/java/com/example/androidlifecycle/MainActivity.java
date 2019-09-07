package com.example.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private static final String TAG = "MainActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "hello how are you", Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(this, "on start is working", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(this, "on pause is working", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(this, "on resume is working", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(this, "on stop is working", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "on destroy is working", Toast.LENGTH_LONG).show();
    }

}



