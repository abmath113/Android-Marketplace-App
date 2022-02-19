package com.example.suppliermanagementsystem;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CRUD_Employee
{
    private DatabaseReference databaseReference;
    public CRUD_Employee()
    {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Employee.class.getSimpleName());
    }
    public Task<Void> add(Employee emp)
    {
        return databaseReference.push().setValue(emp);
    }
}
