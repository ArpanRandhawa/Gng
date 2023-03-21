package com.example.gng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void loginFunction(View view) {
        Intent intent = new Intent(MainActivity.this, loginPage.class);
        startActivity(intent);
    }

    public void signUpFunction(View view) {
        Intent intent = new Intent(MainActivity.this, signUpPage.class);
        startActivity(intent);
    }
}