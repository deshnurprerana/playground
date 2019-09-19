package com.example.newlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.newlistview.Model.RequestModel;

import java.lang.reflect.Array;
import java.util.ArrayList;

class MyListAdapter extends BaseAdapter
{
    public Context context;
    ArrayList<RequestModel> arlist;

    public MyListAdapter(Context context , ArrayList<RequestModel>requestlist) {
       this.context=context;
       this.arlist=requestlist;


    }

        @Override
        public int getCount() {
            return arlist.size();
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
                View view1 = LayoutInflater.from(context).inflate(R.layout.newlistview,parent,false);
                TextView titles1,dates1,statusTexts1;
                ImageView noti;
                titles1=view1.findViewById(R.id.title);
                dates1=view1.findViewById(R.id.date);
                statusTexts1=view1.findViewById(R.id.statusText);
                noti=view1.findViewById(R.id.ivnoti);
                RequestModel req=this.arlist.get(position);



                titles1.setText(String.valueOf(req.getRequestnumber()));
                dates1.setText(String.valueOf(req.getDescription()));
                statusTexts1.setText(String.valueOf(req.getRequestStatus()));
                 noti.setImageResource(R.drawable.notification);
               return view1;

        }

}


