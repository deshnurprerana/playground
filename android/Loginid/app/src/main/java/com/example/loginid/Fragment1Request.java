package com.example.loginid;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.widget.ListPopupWindow;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.loginid.Global.RequestStatus;
import com.example.loginid.Model.RequestModel;
import com.example.loginid.RequestDelegate.RequestDelegateInterface;

import java.util.ArrayList;


public class Fragment1Request extends Fragment {
    ListPopupWindow listPopupWindow;
    ImageView filter;
    TextView tv3;
    ListView listview;
    ImageView notification;
    Button newrequest;
    private RequestDelegateInterface requestDelegateInterface;

    public Fragment1Request(){

    }
    public void setRequestDelegateInterface(RequestDelegateInterface requestDelegateInterface){
        this.requestDelegateInterface=requestDelegateInterface;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view1=inflater.inflate(R.layout.fragment_fragment1_request, container, false);
        filter=view1.findViewById(R.id.filter);
        listview=view1.findViewById(R.id.lv);


        notification=view1.findViewById(R.id.ivnoti);
        newrequest=view1.findViewById(R.id.newrequestbutton);
        final ArrayList<RequestModel> reqlist=new ArrayList<>();


        RequestModel requestModel=new RequestModel();


        requestModel.setRequestnumber("PUR-2019-056");
        requestModel.setRequestStatus(RequestStatus.APPROVED);
        requestModel.setDescription("06-jul-2019");
        reqlist.add(requestModel);
        requestModel =new RequestModel();
        requestModel.setRequestnumber("PUR-2019-056");
        requestModel.setRequestStatus(RequestStatus.AWAITING_APPROVAL);
        requestModel.setDescription("06-jul-2019");
        reqlist.add(requestModel);
        requestModel =new RequestModel();
        requestModel.setRequestnumber("PUR-2019-056");
        requestModel.setRequestStatus(RequestStatus.DRAFT);
        requestModel.setDescription("06-jul-2019");
        reqlist.add(requestModel);
        requestModel =new RequestModel();
        requestModel.setRequestnumber("PUR-2019-056");
        requestModel.setRequestStatus(RequestStatus.CLOSED);
        requestModel.setDescription("06-jul-2019");
        reqlist.add(requestModel);


        ListAdapter listAdapter=new MyListAdapter (view1.getContext(),reqlist);
        listview.setAdapter(listAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                RequestModel requestModel=reqlist.get(position);
                if(requestDelegateInterface!=null) {

                    requestDelegateInterface.onRequestItemClick(requestModel);
                }
                }

        });




        newrequest.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),Requisition1.class);
                startActivity(intent);
            }
        });

        String[] products={"CLEAR", "APPROVED", "DRAFT","AWAITING",
                "REJECTED"};
        tv3=view1.findViewById(R.id.tv3);

                listPopupWindow = new ListPopupWindow(
                getContext());
        listPopupWindow.setAdapter(new ArrayAdapter(
                getContext(),
                R.layout.filter,products));
        listPopupWindow.setAnchorView(filter);
        listPopupWindow.setModal(true);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listPopupWindow.show();
            }
        });






        return view1;
    }

}