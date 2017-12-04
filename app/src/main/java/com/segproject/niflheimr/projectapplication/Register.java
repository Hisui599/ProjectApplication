package com.segproject.niflheimr.projectapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Register extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private ImageButton imageIcon;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        email = (EditText)findViewById(R.id.userNameField);
        password = (EditText)findViewById(R.id.passwordField);
        imageIcon = (ImageButton)findViewById(R.id.logoView);



        signUpButton = (Button)findViewById(R.id.signUpBottom);


    }

    public void FinishRegistration(View view) {
        MydbHandler dbHandler = new MydbHandler(this);
        int photoid = imageIcon.getId();
        User user = new User(email.getText().toString(),password.getText().toString(),photoid);
        dbHandler.addUsers(user);

        Intent intent = new Intent(getApplicationContext(), Login2.class);
        startActivityForResult (intent,0);
    }
    public void OnSetAvatarButton(View view) {
//Application Context and Activity
        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
        //Need Implement logic
        Intent intent = new Intent(getApplicationContext(), Menu.class);
        startActivityForResult (intent,0);
    }

}
