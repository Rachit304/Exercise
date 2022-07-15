package com.example.exercise;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewForm extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_form);

        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        tv5=findViewById(R.id.tv5);


        Intent i=getIntent();
        String n=i.getStringExtra("Name");
        tv1.setText("Name: "+n);
        String mob =i.getStringExtra("Mobile");
        tv2.setText("Mobile Number: "+mob);
        String email =i.getStringExtra("Email");
        tv3.setText("Email: "+email);
        String gender=i.getStringExtra("Gender");
        tv4.setText("Gender: "+gender);
        String hobby=i.getStringExtra("Hobby");
        tv5.setText("Hobbies: "+hobby);
    }
}