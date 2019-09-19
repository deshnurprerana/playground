package com.example.loginid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecyclerListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    String titles[] ={}, dates[] = {}, status[] = {};
    private Context context;

    public MyRecyclerListAdapter(Context context, String[] title, String[] date, String[] statusText) {
        this.context = context;
        this.titles = title;
        this.dates = date;
        this.status = statusText;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycle, viewGroup, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        MyRecyclerListAdapter.MyViewHolder myViewHolder = (MyRecyclerListAdapter.MyViewHolder) viewHolder;
        myViewHolder.setUpData(String.valueOf(titles[position]), String.valueOf(dates[position]), String.valueOf(status[position]));

    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, date, statusText;
        public ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            date = itemView.findViewById(R.id.date);
            statusText = itemView.findViewById(R.id.statusText);
            imageView = itemView.findViewById(R.id.ivnoti);
        }

        public void setUpData(String titles, String dates, String status) {
            title.setText(titles);
            date.setText(dates);
            statusText.setText(status);
            imageView.setImageResource(R.drawable.notification);
        }
    }

}
