package com.example.invictus_shubham;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ItemPageActivity extends AppCompatActivity {

    ImageView imageV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_page);

        imageV = findViewById(R.id.imageV);
        imageV.setVisibility(View.VISIBLE);
    }
}