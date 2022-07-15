package com.example.exercise;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4;
    EditText ed1,ed2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);

        ed1=findViewById(R.id.et1);
        ed2=findViewById(R.id.et2);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 int a=Integer.parseInt(ed1.getText().toString());
                 int b=Integer.parseInt(ed2.getText().toString());
                int sum=a+b;
                Toast.makeText(Calculator.this, "Total is"+sum, Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a=Integer.parseInt(ed1.getText().toString());
                int b=Integer.parseInt(ed2.getText().toString());

                int sub=a-b;
                Toast.makeText(Calculator.this, "Difference is"+sub, Toast.LENGTH_SHORT).show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a=Integer.parseInt(ed1.getText().toString());
                int b=Integer.parseInt(ed2.getText().toString());

                int mul=a*b;
                Toast.makeText(Calculator.this, "Product is "+mul, Toast.LENGTH_SHORT).show();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a=Integer.parseInt(ed1.getText().toString());
                int b=Integer.parseInt(ed2.getText().toString());

                double div;
                if (b==0)
                Toast.makeText(Calculator.this, "Division by 0 is not Possible", Toast.LENGTH_SHORT).show();
                else
                {
                    div=a/b;
                    Toast.makeText(Calculator.this, "Division is "+div, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}