package com.example.newlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=findViewById(R.id.lv);
        ArrayList ar;
       ArrayList<String>titles=new ArrayList<String>();
        ArrayList<String>dates=new ArrayList<String>();
        ArrayList<String>statusText=new ArrayList<String>();
        titles.add("PUR-2019-056");
        dates.add("06-jul-2019");
        statusText.add("APPROVED");

        ListAdapter listAdapter=new MyListAdapter(getApplicationContext(),titles,dates,statusText);
        listview.setAdapter(listAdapter);
    }
}
