package com.example.exercise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Percentage extends AppCompatActivity {
    EditText et1,et2,et3,et4,et5;
    TextView tv1;
    Button btn1,prev,nxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        et4=findViewById(R.id.et4);
        et5=findViewById(R.id.et5);
        tv1=findViewById(R.id.tv1);
        btn1=findViewById(R.id.btn1);
        prev=findViewById(R.id.prev);
        nxt=findViewById(R.id.nxt);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(et1.getText().toString());
                int b=Integer.parseInt(et2.getText().toString());
                int c=Integer.parseInt(et3.getText().toString());
                int d=Integer.parseInt(et4.getText().toString());
                int e=Integer.parseInt(et5.getText().toString());

                double per=(a+b+c+d+e)/5 ;
                tv1.setText("Percentage is: "+per);

                if (per>=90)
                {
                    Toast.makeText(Percentage.this, "Grade A1", Toast.LENGTH_SHORT).show();
                }
                else if (per >=80 & per <=89)
                {
                    Toast.makeText(Percentage.this, "Grade A2", Toast.LENGTH_SHORT).show();
                }
                else if (per >=70 & per <=79)
                {
                    Toast.makeText(Percentage.this, "Grade B1", Toast.LENGTH_SHORT).show();
                }
                else if (per >=60 & per <=69)
                {
                    Toast.makeText(Percentage.this, "Grade B2", Toast.LENGTH_SHORT).show();
                }
                else if (per >=50 & per <=59)
                {
                    Toast.makeText(Percentage.this, "Grade C", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(Percentage.this, "Below Average", Toast.LENGTH_SHORT).show();
                }
            }
        });


        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Percentage.this,MainActivity.class);
                startActivity(intent);
            }
        });

        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Percentage.this,Compare3.class);
                startActivity(intent);
            }
        });

    }
}