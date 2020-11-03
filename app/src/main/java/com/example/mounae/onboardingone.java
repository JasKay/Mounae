package com.example.mounae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class onboardingone extends AppCompatActivity {
    private Button onboardingbuttonone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboardingone);

        onboardingbuttonone = (Button) findViewById(R.id.onboardingbuttonone);
        onboardingbuttonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOnboardingTwo();
            }
        });
    }

    public void openOnboardingTwo(){
        Intent intent = new Intent(this, onboardingtwo.class);
        startActivity(intent);
    }
}