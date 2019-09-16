package com.example.loginid;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class NewRequest extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ListPopupWindow listPopupWindow;
    ImageView filter;
    TextView tv3;
    ListView listview;
    ImageView notification;
    Button btn;


   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_request);
        filter=findViewById(R.id.filter);
        listview=findViewById(R.id.lv);
        notification=findViewById(R.id.noti);
        btn=findViewById(R.id.btn);

        String title[]={"PUR-2019-056","PUR-2019-056","PUR-2019-056","PUR-2019-056","PUR-2019-056"};
       String date[]={"06-Jul-2019","06-Jul-2019","06-Jul-2019","06-Jul-2019","06-Jul-2019"};
        String statusText[]={"APPROVED","APPROVED","APPROVED","APPROVED","APPROVED"};
        ListAdapter listAdapter=new MyListAdapter(getApplicationContext(),title,date,statusText);
        listview.setAdapter(listAdapter);
      String[] products={"CLEAR", "APPROVED", "DRAFT","AWAITING",
                "REJECTED"};
        tv3=findViewById(R.id.tv3);
       btn.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View view) {
               Intent intent=new Intent(getApplicationContext(),Recycler.class);
               startActivity(intent);
           }
       });
        listPopupWindow = new ListPopupWindow(
                getApplicationContext());
        listPopupWindow.setAdapter(new ArrayAdapter(
                getApplicationContext(),
                R.layout.filter, products));
        listPopupWindow.setAnchorView(filter);
        listPopupWindow.setModal(true);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listPopupWindow.show();
            }
        });



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.new_request, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
