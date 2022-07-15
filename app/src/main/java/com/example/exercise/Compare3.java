package com.example.exercise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Compare3 extends AppCompatActivity {
    EditText et1,et2,et3;
    TextView tv1;
    Button btn1,prev,nxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare3);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
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

                if (a!=b || b!=c || c!=a) {
                    if (a > b) {
                        if (a > c)
                            tv1.setText(("Greatest Num is " + a));
                        else
                            tv1.setText(("Greatest Num is " + c));
                    } else {
                        if (b > c)
                            tv1.setText(("Greatest Num is " + b));
                        else
                            tv1.setText(("Greatest Num is " + c));
                    }
                }
                else if (a==b || a==c)
                {
                    if(b>c)
                        tv1.setText(("Greatest Num is " + b));
                    else
                        tv1.setText(("Greatest Num is " + c));
                }
                else
                {
                    if(a>b)
                        tv1.setText(("Greatest Num is " + a));
                    else
                        tv1.setText(("Greatest Num is " + b));
                }
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Compare3.this,Percentage.class);
                startActivity(intent);
            }
        });

        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Compare3.this,SquareNumber.class);
                startActivity(intent);
            }
        });



    }
}