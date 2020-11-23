package com.example.mounae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class onboardingthree extends AppCompatActivity {
    private Button gotosignupbutton;
    private Button gotologinbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboardingthree);

        gotosignupbutton = (Button) findViewById(R.id.gotofirstname);
        gotosignupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInputphone_signup();
            }
        });

        gotologinbutton = (Button) findViewById(R.id.gotologinbutton);
        gotologinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInputphone_signin();
            }
        });
    }

    public void openInputphone_signup() {
        Intent intent = new Intent(this, inputphone_signup.class);
        startActivity(intent);
    }

    public void openInputphone_signin() {
        Intent intent = new Intent(this, inputphone_signin.class);
        startActivity(intent);
    }

}