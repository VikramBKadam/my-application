package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class page2 extends AppCompatActivity {
    private String info;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        text=findViewById(R.id.textViewPage2);


        Bundle extras =getIntent().getExtras();
        info=extras.getString("info");

        text.setText(info);

    }
}