package com.example.kathishan.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";
    private EditText FirstName, MiddleName, LastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstName = findViewById(R.id.etFirstName);
        MiddleName = findViewById(R.id.etMiddleName);
        LastName = findViewById(R.id.etLastName);
        Log.d(TAG, "onCreate: ");
        }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");

        onDestroy();
    }


    public void DoSomething(View view){

        SharedPreferences sharedPreferences = getSharedPreferences("sp", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("FirstName", FirstName.getText().toString());
        editor.putString("MiddleName", MiddleName.getText().toString());
        editor.putString("LastName", LastName.getText().toString());
        editor.commit();

        Intent intent1 = new Intent(this, SecondActivity.class);
        startActivity(intent1);



    }

}
