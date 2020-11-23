package com.example.mounae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class devise_code_1 extends AppCompatActivity {

    private Button gotoconnectbank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devise_code_1);
        gotoconnectbank = (Button) findViewById(R.id.gotoconnectbank);
        gotoconnectbank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openConnectBankOnboarding();
            }
        });
    }

    public void openConnectBankOnboarding(){
        Intent intent = new Intent(this, connect_bank_onboarding.class);
        startActivity(intent);
    }
}