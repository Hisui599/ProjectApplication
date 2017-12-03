package com.segproject.niflheimr.projectapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void OnPeopleList(View view) {

        Intent intent = new Intent(getApplicationContext(), User_list.class);
        startActivityForResult(intent, 0);
    }
    public void OnTaskList(View view) {

        Intent intent = new Intent(getApplicationContext(), TaskList.class);
        startActivityForResult(intent, 0);
    }
    public void OnPersonalInfo(View view) {

        Intent intent = new Intent(getApplicationContext(), TasksFragment.class);
        startActivityForResult(intent, 0);
    }

}
