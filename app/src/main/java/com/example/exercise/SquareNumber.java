package com.example.exercise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SquareNumber extends AppCompatActivity {
    EditText et1;
    Button btn1,prev,nxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_number);
        et1=findViewById(R.id.et1);
        btn1=findViewById(R.id.btn1);
        prev=findViewById(R.id.prev);
        nxt=findViewById(R.id.nxt);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(et1.getText().toString());

                if(a<=10)
                {
                    Toast.makeText(SquareNumber.this, "Square of "+a+" is: "+a*a, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(SquareNumber.this, "Please Enter value below 10..", Toast.LENGTH_SHORT).show();
                }
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SquareNumber.this,Compare3.class);
                startActivity(intent);
            }
        });

        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SquareNumber.this,CheckNumber.class);
                startActivity(intent);
            }
        });


    }
}