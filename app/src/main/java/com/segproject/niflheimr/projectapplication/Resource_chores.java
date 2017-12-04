package com.segproject.niflheimr.projectapplication;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.sql.Date;

public class Resource_chores extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resources_list);

        //use SQL to return list of chores
        String[] itemName = {"bucket", "soap"};
        Integer[] avalible = {1, 2};
        Integer[] Total = {3, 3};
        Resources res = getResources();
        Drawable[] ItemIcon = {res.getDrawable(R.drawable.ic_menu_manage), res.getDrawable(R.drawable.ic_menu_manage)};
        ListView listView = (ListView)findViewById(R.id.ResourceList);

        ResourceCustomAdapter adapter = new ResourceCustomAdapter(this, itemName,  avalible, Total, ItemIcon);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //some SQL to return the task information based on choreId.
            }
        });

    }
}
