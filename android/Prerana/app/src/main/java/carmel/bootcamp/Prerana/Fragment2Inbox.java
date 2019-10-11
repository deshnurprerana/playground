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

public class Fragment2Inbox extends Fragment {
    Button publicButtonNew;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view1= inflater.inflate(R.layout.fragment_fragment2_inbox, container, false);
        publicButtonNew=view1.findViewById(R.id.publicButton);
        publicButtonNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InboxFragment inboxFragment=new InboxFragment();
                FragmentManager manager=getFragmentManager();
                FragmentTransaction transaction=manager.beginTransaction();
                transaction.replace(R.id.mainLayout,inboxFragment);
                transaction.commit();

            }
        });






   return  view1;

    }


}