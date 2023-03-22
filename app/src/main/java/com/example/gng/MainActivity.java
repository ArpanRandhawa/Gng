package com.example.gng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.storage.FirebaseStorage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a non-default Storage bucket
        FirebaseStorage storage = FirebaseStorage.getInstance("https://console.firebase.google.com/project/glamandgloss-dfcd7/storage/glamandgloss-dfcd7.appspot.com/files");
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