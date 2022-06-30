package com.example.grabit_llc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Otp_verification extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);
    }
    public void Verify(View view) {
        Intent Otp =new Intent(Otp_verification.this,Dashboard.class);
        startActivity(Otp);
    }

}