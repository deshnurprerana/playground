package com.example.loginid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ForgotPassword extends AppCompatActivity {
    Button button;
    ImageView warning1;
    ImageView warning2;
    TextView text1;
    TextView text2;
    EditText em;
    AlertDialog.Builder alertBuilder;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        button=findViewById(R.id.button);
        warning1=findViewById(R.id.warning1);
        warning2=findViewById(R.id.warning2);
        text1=findViewById(R.id.textview);
        text2=findViewById(R.id.tv2);
        em=findViewById(R.id.em);

        alertBuilder=new AlertDialog.Builder(this);
        final View alertView=getLayoutInflater().inflate(R.layout.fpdb,null);
        alertBuilder.setView(alertView);
        final AlertDialog alertDialog=alertBuilder.create();
        button =findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(em.getText().toString().equals("")) {
                warning1.setVisibility(1);
                warning2.setVisibility(1);
                text1.setVisibility(1);
                text2.setVisibility(1);
            }
            else{
                 alertDialog.show();
                }
        }



        });
}
}
