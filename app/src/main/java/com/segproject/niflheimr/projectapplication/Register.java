package com.segproject.niflheimr.projectapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {
    public void FinishRegistration(View view) {
        //Need Implement logic
        Intent intent = new Intent(getApplicationContext(), Tab2Tasks.class);
        startActivityForResult (intent,0);
    }
    public void OnSetAvatarButton(View view) {
//Application Context and Activity
        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
        startActivityForResult (intent,0);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }


}
