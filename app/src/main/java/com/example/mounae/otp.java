package com.example.mounae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class otp extends AppCompatActivity {

    private Button gotofirstname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        gotofirstname = (Button) findViewById(R.id.gotofirstname);
        gotofirstname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFirstName();
            }
        });
    }

    public void openFirstName() {
        Intent intent = new Intent(this, first_name.class);
        startActivity(intent);
    }
}