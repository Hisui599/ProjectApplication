package com.segproject.niflheimr.projectapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class user_chores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_chores);

        //use SQL to return list of chores
        String[] choreList = {"Walk Dog", "Do the Dishes"};
        ListView listView = (ListView)findViewById(R.id.userChoreList);

        ChoreCustomAdapter adapter = new ChoreCustomAdapter(this, choreList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //some SQL to return the task information based on choreId.
            }
        });

    }

}
