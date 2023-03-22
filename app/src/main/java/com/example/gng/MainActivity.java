package com.example.gng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.storage.FirebaseStorage;

public class MainActivity extends AppCompatActivity {

    Button btnLoginID,btnSignupID;
    AdView adViewID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        btnLoginID = findViewById(R.id.btnLoginID);
        btnSignupID = findViewById(R.id.btnSignupID);

        adViewID = findViewById(R.id.adViewID);
        AdRequest adRequest = new AdRequest.Builder().build();
        adViewID.loadAd(adRequest);
//
//        // Get a non-default Storage bucket
//        FirebaseStorage storage = FirebaseStorage.getInstance("https://console.firebase.google.com/project/glamandgloss-dfcd7/storage/glamandgloss-dfcd7.appspot.com/files");
        FirebaseStorage storage = FirebaseStorage.getInstance("gs://glamandgloss-dfcd7");

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