package com.example.suppliermanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final EditText edit_name = findViewById(R.id.edit_name);
        final EditText edit_position = findViewById(R.id.edit_position);
        Button btn = findViewById(R.id.btn_submit);
        CRUD_Employee CRUD = new CRUD_Employee();
        btn.setOnClickListener(v->
        {
            Employee emp = new Employee(edit_name.getText().toString(),edit_position.getText().toString());
            
        });


    }
}