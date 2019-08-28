package com.example.loginid;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginid.MyRecyclerListAdapter;
import com.example.loginid.R;

public class Recycler extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle);

        recyclerView = findViewById(R.id.recycle);

        String title[] = {"PUR-2019-056", "PUR-2019-056", "PUR-2019-056", "PUR-2019-056", "PUR-2019-056"};
        String date[] = {"06-Jul-2019", "06-Jul-2019", "06-Jul-2019", "06-Jul-2019", "06-Jul-2019"};
        String statusText[] = {"APPROVED", "APPROVED", "APPROVED", "APPROVED", "APPROVED"};

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        MyRecyclerListAdapter myRecyclerListAdapter = new MyRecyclerListAdapter(getApplicationContext(), title, date, statusText);
        recyclerView.setAdapter(myRecyclerListAdapter);

    }

}
