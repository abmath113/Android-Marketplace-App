package com.example.invictus_shubham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SellerPage extends AppCompatActivity {

    EditText book_name, author_or_publication, phone_no;
    String bookName, authorOrPublication;
    Float phoneNo;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_page);

        book_name = findViewById(R.id.book_name);
        author_or_publication = findViewById(R.id.author_or_publication);
        phone_no = findViewById(R.id.phone_no);
        submitButton = findViewById(R.id.submitBtn);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bookName = book_name.getText().toString();
                authorOrPublication = author_or_publication.getText().toString();
                phoneNo = Float.valueOf(phone_no.getText().toString());

                Toast.makeText(SellerPage.this, "Details Recorded", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SellerPage.this, ProfilePage.class);
                startActivity(intent);
            }
        });
    }
}