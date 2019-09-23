package com.example.loginid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button loginbutton;
    TextView forgotpassword;
    ImageView warning1;
    ImageView warning2;
    TextView text1;
    TextView text2;
    EditText em;
    EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbutton=findViewById(R.id.newrequestbutton);
        forgotpassword=findViewById(R.id.fp);
        warning1=findViewById(R.id.warning1);
        warning2=findViewById(R.id.warning2);
        text1=findViewById(R.id.textview);
        text2=findViewById(R.id.tv2);
        password=findViewById(R.id.password1);
         em=findViewById(R.id.em);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((em.getText().toString().equals("Prerana"))){
                    Toast.makeText(getApplicationContext(), "Login successful", Toast.LENGTH_LONG).show();
                    Intent intent1 = new Intent(getApplicationContext(), MainRequestFragment.class);
                    startActivity(intent1);



                } else {
                    Toast.makeText(getApplicationContext(), "enter correct login details", Toast.LENGTH_LONG).show();

                    warning1.setVisibility(View.VISIBLE);
                    warning2.setVisibility(View.VISIBLE);
                    text1.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.VISIBLE);

                }
            }
        });
       forgotpassword.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(getApplicationContext(), ForgotPassword.class);
               startActivity(intent);

           }
       });
    }
}
