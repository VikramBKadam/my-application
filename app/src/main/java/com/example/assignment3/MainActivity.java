package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

private String info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onBtnClick(View view){
        EditText editTextTextPersonName =findViewById(R.id.editTextTextPersonName);
        EditText editTextDate =findViewById(R.id.editTextDate);
        EditText editTextTextPostalAddress =findViewById(R.id.editTextTextPostalAddress);
        EditText editTextTextPersonName2 =findViewById(R.id.editTextTextPersonName2);
        EditText editTextNumber =findViewById(R.id.editTextNumber);
        EditText editTextNumber2 =findViewById(R.id.editTextNumber2);
        EditText editTextTextEmailAddress =findViewById(R.id.editTextTextEmailAddress);
        EditText editTextTextMultiLine =findViewById(R.id.editTextTextMultiLine);
        EditText editTextTextMultiLine2 =findViewById(R.id.editTextTextMultiLine2);
        EditText editTextTextMultiLine3 =findViewById(R.id.editTextTextMultiLine3);


        info="You have entered the following Details\n\n"+
                "Name: "+editTextTextPersonName.getText().toString()+"\n\n"+
                "DOB: "+editTextDate.getText().toString()+"\n\n"+
                "Address: "+editTextTextPostalAddress.getText().toString()+"\n\n"+
                "City: "+editTextTextPersonName2.getText().toString()+"\n\n"+
                "Pin Code: "+editTextNumber.getText().toString()+"\n\n"+
                "Mobile no: "+editTextNumber2.getText().toString()+"\n\n"+
                "Email Address: "+editTextTextEmailAddress.getText().toString()+"\n\n"+
                "Interest : "+editTextTextMultiLine.getText().toString()+"\n\n"+
                "Profile: "+editTextTextMultiLine2.getText().toString()+"\n\n"+
                "Experience: "+editTextTextMultiLine3.getText().toString()+"\n\n";
        Intent myIntent= new Intent(this,page2.class);
        myIntent.putExtra("info",info);
        startActivity(myIntent);



    }


}