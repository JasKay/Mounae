package com.example.mounae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class addnewaccount_one extends AppCompatActivity {

    private Button gotoaddnew_accttwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnewaccount_one);

        gotoaddnew_accttwo = (Button) findViewById(R.id.gotoaddnew_accttwo);
        gotoaddnew_accttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddNewAcctTwo();
            }
        });
    }

    public void openAddNewAcctTwo(){
        Intent intent = new Intent(this, addnewaccount_two.class);
        startActivity(intent);
    }
}