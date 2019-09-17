package com.example.constructor3;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.widget.Toast.LENGTH_LONG;

public  class Constructor extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        Constructor() {

    }
    void Cons(Context applicationContext)
    {
        Toast.makeText(applicationContext, "This is a rainy day", LENGTH_LONG).show();

    }
}
