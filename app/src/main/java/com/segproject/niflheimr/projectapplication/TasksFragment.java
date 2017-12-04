package com.segproject.niflheimr.projectapplication;

/**
 * Created by Niflheimr on 2017-11-24.
 */

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.sql.Date;


public class TasksFragment extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tasks_fragment);

        String[] choreList = {"cook", "eat"};
        Date[] deadLine = {new Date(2017,01,01),new Date(2017,01,01)};
        String[] assignedTo = {"lala","lala"};
        Resources res = getResources();
        Drawable[] choreIcon = {res.getDrawable(R.drawable.vacuum),res.getDrawable(R.drawable.vacuum)};
        ListView listView = (ListView)findViewById(R.id.userChoreList);

        ChoreCustomAdapter adapter = new ChoreCustomAdapter(this, choreList,deadLine,assignedTo, choreIcon);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //some SQL to return the task information based on choreId.
            }
        });
    }
}
