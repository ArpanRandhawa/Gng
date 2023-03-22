package com.example.gng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class signUpPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
    }
    public void signUpFunction(View view) {
        Intent intent = new Intent(signUpPage.this, loginPage.class);
        startActivity(intent);
    }

}