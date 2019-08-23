package com.example.loginid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

public class Request extends AppCompatActivity {
    ImageView image1;
    Button  button;
    ImageView image2;
    SearchView search;
    TextView text1;
    TextView text2;
    AlertDialog.Builder alertBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
        image1=findViewById(R.id.i1);
        image2=findViewById(R.id.i2);
        button=findViewById(R.id.button);

    }
}
