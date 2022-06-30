package com.example.grabit_llc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Login(View view) {
        username = (EditText) findViewById(R.id.edtname);
        password = (EditText) findViewById(R.id.edtpwd);
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
            Intent home =new Intent(MainActivity.this,Otp_verification.class);
            startActivity(home);
        } else
        {
            username.setError("Username is incorrect!!");
            password.setError("Password is incorrect!!");
        }

    }
}