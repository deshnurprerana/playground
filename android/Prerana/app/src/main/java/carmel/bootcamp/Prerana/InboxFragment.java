package carmel.bootcamp.Prerana;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class InboxFragment extends Fragment {
    Button privatebutton;


    public InboxFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_inbox, container, false);
        privatebutton=view.findViewById(R.id.privateButton);
        privatebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2Inbox fragment2Inbox=new Fragment2Inbox();
                FragmentManager manager2=getFragmentManager();
                FragmentTransaction transaction2=manager2.beginTransaction();
                transaction2.replace(R.id.mainLayout,fragment2Inbox);
                transaction2.commit();
            }
        });

    return view;
    }
}