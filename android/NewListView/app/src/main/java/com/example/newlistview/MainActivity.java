package com.example.newlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.newlistview.Global.RequestStatus;
import com.example.newlistview.Model.RequestModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=findViewById(R.id.lv);
//       ArrayList<String>titles=new ArrayList<String>();
//        ArrayList<String>dates=new ArrayList<String>();
//        ArrayList<String>statusTexts=new ArrayList<String>();
        ArrayList<RequestModel>reqlist=new ArrayList<>();


        RequestModel requestModel=new RequestModel();


        requestModel.setRequestnumber("PUR-2019-056");
        requestModel.setRequestStatus(RequestStatus.APPROVED);
        requestModel.setDescription("06-jul-2019");
        reqlist.add(requestModel);


        requestModel =new RequestModel();
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



//        titles.add("PUR-2019-056");
//        titles.add("PUR-2019-056");
//        titles.add("PUR-2019-056");
//        titles.add("PUR-2019-056");
//        titles.add("PUR-2019-056");
//        dates.add("06-jul-2019");
//        dates.add("06-jul-2019");
//        dates.add("06-jul-2019");
//        dates.add("06-jul-2019");
//        dates.add("06-jul-2019");
//        statusTexts.add("APPROVED");
//        statusTexts.add("APPROVED");
//
//        statusTexts.add("APPROVED");
//
//        statusTexts.add("APPROVED");
//
//        statusTexts.add("APPROVED");


        MyListAdapter listAdapter=new MyListAdapter(getApplicationContext(),reqlist);
       listview.setAdapter(listAdapter);
    }
}
