package com.example.mounae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class first_name extends AppCompatActivity {

    private Button gotodevisecode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_name);

        gotodevisecode = (Button) findViewById(R.id.gotodevisecode);
        gotodevisecode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDeviseCode();
            }
        });
    }

    public void openDeviseCode(){
        Intent intent = new Intent(this, devise_code_1.class);
        startActivity(intent);
    }
}