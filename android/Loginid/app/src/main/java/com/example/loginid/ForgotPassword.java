package com.example.loginid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ForgotPassword extends AppCompatActivity {
    Button button;
    ImageView warning1;
    ImageView warning2;
    TextView text1;
    TextView text2;
    AlertDialog.Builder alertBuilder;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        button=findViewById(R.id.button);
        warning1=findViewById(R.id.warning1);
        warning2=findViewById(R.id.warning2);
        text1=findViewById(R.id.tv1);
        text2=findViewById(R.id.tv2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                warning1.setVisibility(1);
                warning2.setVisibility(1);
                text1.setVisibility(1);
                text2.setVisibility(1);
            }
        });

        alertBuilder=new AlertDialog.Builder(this);
        final View alertView=getLayoutInflater().inflate(R.layout.fpdb,null);
        alertBuilder.setView(alertView);
        final AlertDialog alertDialog=alertBuilder.create();
        button =findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.show();
            }
        });
    }
}
