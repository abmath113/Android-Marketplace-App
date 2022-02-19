package com.example.firebaseapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class HomeActivity extends AppCompatActivity {

    Button sendbtn,recbtn;
    Data obj = new Data("Prasad",20);
    FirebaseDatabase database;
    DatabaseReference myRef;
    String DBurl = "https://invictus-a4b18-default-rtdb.asia-southeast1.firebasedatabase.app/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        sendbtn = findViewById(R.id.send_query_button);
        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pushData();

            }
        });
        recbtn = findViewById(R.id.read_query_button);
        recbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                fetchData();

            }
        });


    }

    private void fetchData()
    {

    }

    private void pushData()
    {
        database = FirebaseDatabase.getInstance(DBurl);
        //database = FirebaseDatabase.getInstance("https://invictus-a4b18-default-rtdb.asia-southeast1.firebasedatabase.app/");
       // myRef = database.getReference("message");
        //myRef.setValue("Hello, World!");
        myRef = database.getReference("Users");
        myRef.setValue(obj);

    }


}
