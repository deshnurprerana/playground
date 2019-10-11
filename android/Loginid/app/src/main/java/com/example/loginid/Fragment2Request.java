package com.example.loginid;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.loginid.Model.RequestModel;


public class Fragment2Request extends Fragment {
    TextView title, date, status;
    RequestModel requestModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view2 = inflater.inflate(R.layout.fragment_fragment2_request, container, false);

        // Inflate the layout for this fragment
        title = view2.findViewById(R.id.textView31);
        date = view2.findViewById(R.id.textView33);
        status = view2.findViewById(R.id.textView35);
        title.setText(requestModel.getRequestnumber());
        date.setText(requestModel.getDescription());
        status.setText(requestModel.getRequestStatus().toString());
        return view2;
    }

    public void setData(RequestModel requestModel){
        this.requestModel=requestModel;
    }
}