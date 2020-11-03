package com.example.mounae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class onboardingtwo extends AppCompatActivity {
    private Button onboardingbuttontwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboardingtwo);

        onboardingbuttontwo = (Button) findViewById(R.id.onboardingbuttontwo);
        onboardingbuttontwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOnboardingThree();
            }
        });
    }

    public void openOnboardingThree(){
        Intent intent = new Intent(this, onboardingthree.class);
        startActivity(intent);
    }
}