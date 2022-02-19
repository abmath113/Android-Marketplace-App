package com.example.firebaseapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class HomeActivity extends AppCompatActivity {

    Button sendbtn,recbtn;
    Data obj = new Data("Shubham",224);
    FirebaseDatabase database;
    DatabaseReference myRef;
    TextView outputfield;
    String DBurl = "https://invictus-a4b18-default-rtdb.asia-southeast1.firebasedatabase.app/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        outputfield = findViewById(R.id.textView2);

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
        database = FirebaseDatabase.getInstance(DBurl);
        myRef = database.getReference("message");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                String val = snapshot.getValue(String.class);
                outputfield.setText(val);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    private void pushData()
    {
        database = FirebaseDatabase.getInstance(DBurl);
        //database = FirebaseDatabase.getInstance("https://invictus-a4b18-default-rtdb.asia-southeast1.firebasedatabase.app/");
       // myRef = database.getReference("message");
        //myRef.setValue("Hello, World!");
        myRef = database.getReference("Users");
        myRef.push().setValue(obj);

    }


}
