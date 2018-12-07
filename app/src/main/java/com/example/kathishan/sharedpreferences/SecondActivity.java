package com.example.kathishan.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";
    private TextView FirstName, MiddleName, LastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        FirstName = findViewById(R.id.tvFirstName);
        MiddleName = findViewById(R.id.tvMiddleName);
        LastName = findViewById(R.id.tvLastName);
    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences sharedPreferences = getSharedPreferences ( "sp" , MODE_PRIVATE );
        String firstname = sharedPreferences.getString ( "FirstName" , "");
        String middlename = sharedPreferences.getString ("MiddleName" , "");
        String lastname =sharedPreferences.getString ("LastName", "");
        FirstName.setText ( firstname );
        MiddleName.setText (middlename);
        LastName.setText (lastname);
    }



}
