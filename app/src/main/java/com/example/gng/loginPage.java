package com.example.gng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }

    public void loginToMain(View view) {
        Intent intent = new Intent(loginPage.this, MainActivity.class);
        startActivity(intent);
    }

    public void loginToSignUp(View view) {
        Intent intent = new Intent(loginPage.this, signUpPage.class);
        startActivity(intent);
    }

}