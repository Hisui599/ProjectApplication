package com.segproject.niflheimr.projectapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void FinishRegistration(View view) {
        //Need Implement logic
        Intent intent = new Intent(getApplicationContext(), Menu.class);
        startActivityForResult (intent,0);
    }

}
