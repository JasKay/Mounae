package com.example.mounae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcome_screen extends AppCompatActivity {

    private Button gotoadd_acctone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        gotoadd_acctone = (Button) findViewById(R.id.gotoadd_acctone);
        gotoadd_acctone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddAcctOne();
            }
        });
    }

    public void openAddAcctOne(){
        Intent intent = new Intent(this, addnewaccount_one.class);
        startActivity(intent);
    }
}