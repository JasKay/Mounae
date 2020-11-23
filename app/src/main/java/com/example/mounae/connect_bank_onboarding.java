package com.example.mounae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class connect_bank_onboarding extends AppCompatActivity {

    private Button gotowelcomescreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect_bank_onboarding);

        gotowelcomescreen = (Button) findViewById(R.id.gotowelcomescreen);
        gotowelcomescreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWelcomeScreen();
            }
        });
    }

    public void openWelcomeScreen(){
        Intent intent = new Intent(this, welcome_screen.class);
        startActivity(intent);
    }
}