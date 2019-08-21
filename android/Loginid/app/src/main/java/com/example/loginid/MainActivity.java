package com.example.loginid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button loginbutton;
    TextView forgotpassword;
    ImageView warning1;
    ImageView warning2;
    TextView text1;
    TextView text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbutton=findViewById(R.id.button);
        forgotpassword=findViewById(R.id.fp);
        warning1=findViewById(R.id.warning1);
        warning2=findViewById(R.id.warning2);
        text1=findViewById(R.id.tv1);
        text2=findViewById(R.id.tv2);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                warning1.setVisibility(1);
                warning2.setVisibility(1);
                text1.setVisibility(1);
                text2.setVisibility(1);


            }
        });
       forgotpassword.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(MainActivity.this, ForgotPassword.class);
               startActivity(intent);

           }
       });
    }
}
