package com.segproject.niflheimr.projectapplication;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class Login2 extends AppCompatActivity  {


    private AutoCompleteTextView email;
    private EditText password;
    private Button signin;
    private Button register;
    private String emailString ="";
    private String passwordString ="";
    private TextView showUser;
    private TextView showRward;
    private TextView showpPhoto;
    private TextView showpass;
    private TextView showgroup;




    /**
     * Id to identity READ_CONTACTS permission request.
     *
     */

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        email = (AutoCompleteTextView)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);

        signin = (Button)findViewById(R.id.sign_in_button);
        register = (Button)findViewById(R.id.register_button);
        showUser= (TextView)findViewById(R.id.showUserName);
        showRward= (TextView)findViewById(R.id.showReward);
        showpPhoto= (TextView)findViewById(R.id.showPhoto);
        showpass= (TextView)findViewById(R.id.showPassword);
        showgroup= (TextView)findViewById(R.id.showGroup);
    }

    public void OnMenu(View view) {
        MydbHandler dbHandler = new MydbHandler(this);

        User user = dbHandler.findUser(email.getText().toString());


        if (user != null){
            if (user.getPassword().equals(password.getText().toString())) {
                Intent intent = new Intent(getApplicationContext(), Menu.class);
                startActivityForResult(intent, 0);

            }

        }
    }
        /***
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emailString = email.getText().toString();
                passwordString = password.getText().toString();
        ***/





//Application Context and Activity


    public void OnRegister(View view) {

//Application Context and Activity
        Intent intent = new Intent(getApplicationContext(), Register.class);
        startActivityForResult (intent,0);
    }


}

