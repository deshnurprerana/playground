package com.example.newlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

class MyListAdapter extends BaseAdapter
{
    public Context context;
    public ArrayList<String>titles;
    public ArrayList<String>dates;
    public ArrayList<String>statusTexts;



    public MyListAdapter(Context context , ArrayList<String> title, ArrayList<String> date, ArrayList<String> statusText) {
       this.context=context;
       this.titles= title;
       this.dates=date;
       this.statusTexts=statusText;


    }

        @Override
        public int getCount() {
            return titles.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent)

            {
                View view = LayoutInflater.from(context).inflate(R.layout.newlistview,parent,false);
                TextView titles1,dates1,statusTexts1;
                titles1=view.findViewById(R.id.title);
                dates1=view.findViewById(R.id.date);
                statusTexts1=view.findViewById(R.id.statusText);


                titles1.setText(titles.get(position));
                dates1.setText(dates.get(position));
                statusTexts1.setText(statusTexts.get(position));

               return view;

        }

}


