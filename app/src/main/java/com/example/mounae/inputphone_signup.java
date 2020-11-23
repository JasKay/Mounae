package com.example.mounae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inputphone_signup extends AppCompatActivity {

    private Button gotootp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputphone_signup);

        gotootp = (Button) findViewById(R.id.gotootp);
        gotootp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOtp();
            }
        });
    }

    public void openOtp(){
        Intent intent = new Intent(this, otp.class);
        startActivity(intent);
    }
}