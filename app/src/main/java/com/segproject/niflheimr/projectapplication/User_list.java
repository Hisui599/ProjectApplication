package com.segproject.niflheimr.projectapplication;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.sql.Date;

public class User_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_layout);
        String[] userList = {"YueHanNi", "Xiao Li", "Xiao Dot"};
        Resources res = getResources();
        Drawable[] userIcon = {res.getDrawable(R.drawable.vacuum), res.getDrawable(R.drawable.vacuum)};
        ListView listView = (ListView) findViewById(R.id.userList);

        UserCustomAdapter adapter = new UserCustomAdapter(this, userList, userIcon);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //some SQL to return the task information based on choreId.
            }
        });
    }
}
