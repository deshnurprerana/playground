package com.example.loginid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.loginid.Model.RequestModel;

import java.util.ArrayList;

class MyListAdapter extends BaseAdapter {
//    String titles[]={},dates[]={},status[]={};
//    private Context context;


    public Context context;
    ArrayList<RequestModel> arlist;

    public MyListAdapter(Context context , ArrayList<RequestModel>requestlist) {
        this.context=context;
        this.arlist=requestlist;
    }
//
//    public MyListAdapter(Context applicationContext, ArrayList<RequestModel> reqlist) {
//    }

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
    public View getView(int position, View convertView, ViewGroup parent) {
        View view1 = LayoutInflater.from(context).inflate(R.layout.list,parent,false);
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


//       View view = LayoutInflater.from(context).inflate(R.layout.list,parent,false);
//        TextView title,date,statusText;
//        title=view.findViewById(R.id.title);
//        date=view.findViewById(R.id.date);
//        statusText=view.findViewById(R.id.statusText);
//
//        title.setText(String.valueOf(titles[position]));
//        date.setText(String.valueOf(dates[position]));
//        statusText.setText(String.valueOf(status[position]));
//        return view;
    }
}
