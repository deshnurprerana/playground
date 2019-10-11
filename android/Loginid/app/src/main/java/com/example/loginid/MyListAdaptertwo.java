package com.example.loginid;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.loginid.Model.RequestModel;
import com.example.loginid.ModelTwo.RequisitionModel;

import java.util.ArrayList;
import java.util.zip.Inflater;

class MyListAdaptertwo extends BaseAdapter {
    public Context context;
    ArrayList<RequisitionModel> arelist;

    public MyListAdaptertwo(Context context , ArrayList<RequisitionModel> requisilist) {
        this.context=context;
        this.arelist=requisilist;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return arelist.size();
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
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewtwo= LayoutInflater.from(context).inflate(R.layout.listtwo,parent,false);
        TextView descriptionone;
        ImageView three;
        final TextView descriptiontwo;
        TextView readmore;
         descriptionone=viewtwo.findViewById(R.id.descriptionone);
         three=viewtwo.findViewById(R.id.three);
         descriptiontwo=viewtwo.findViewById(R.id.descriptiontwo);
         readmore=viewtwo.findViewById(R.id.readmore);
        RequisitionModel requisition=this.arelist.get(position);


        descriptionone.setText(String.valueOf(requisition.getrequisitiondescription()));
         three.setImageResource(R.drawable.three);
         readmore.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 descriptiontwo.setVisibility(View.VISIBLE);
             }
         });
        return viewtwo;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return arelist.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
