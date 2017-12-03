package com.segproject.niflheimr.projectapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void Login(View view) {
        //Application Context and Activity
        Intent intent = new Intent(getApplicationContext(), SigninActivity.class);
        startActivityForResult (intent,0);
    }

    public void SignUp(View view) {
        //Application Context and Activity
        Intent intent = new Intent(getApplicationContext(), Register.class);
        startActivityForResult (intent,0);
    }

}
