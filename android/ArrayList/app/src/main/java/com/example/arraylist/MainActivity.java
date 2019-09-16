package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button add1;
    Button delete1;
    Button show;
    TextView text;
    ArrayList <String> ar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add1=findViewById(R.id.addbutton);
        delete1=findViewById(R.id.deletebutton);
        show=findViewById(R.id.showbutton);
        ar = new ArrayList<String>();
        text=findViewById(R.id.text);


        add1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {



                ar.add(0,"4");
                ar.add(1,"5");
                ar.add(2,"6");


            }

        });
        delete1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               ar.remove(2);


            }
        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<ar.size();i++) {
                    text.append(ar.get(i));
                }
            }
        });
    }


        }

