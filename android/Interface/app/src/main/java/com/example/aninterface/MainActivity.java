package com.example.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Demo1{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        A();
    }

    @Override
    public void A() {
        Toast.makeText(this, "hello how are you", Toast.LENGTH_LONG).show();
    }

}
