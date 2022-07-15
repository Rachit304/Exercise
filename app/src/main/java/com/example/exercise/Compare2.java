package com.example.exercise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Compare2 extends AppCompatActivity {
    EditText et1,et2;
    Button btn1,prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare2);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        btn1=findViewById(R.id.btn1);
        prev=findViewById(R.id.prev);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(et1.getText().toString());
                int b =Integer.parseInt(et2.getText().toString());

                if (a > b)
                    Toast.makeText(Compare2.this, a + " is Greater than "+b, Toast.LENGTH_SHORT).show();
                else if (a < b)
                    Toast.makeText(Compare2.this, b + " is Greater than "+a, Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(Compare2.this,  "Both are Equal", Toast.LENGTH_SHORT).show();

            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Compare2.this,CheckNumber.class);
                startActivity(intent);
            }
        });

    }
}