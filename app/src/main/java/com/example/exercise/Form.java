package com.example.exercise;

import android.content.Intent;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.TreeMap;
import java.util.regex.Pattern;

public class Form extends AppCompatActivity {
    EditText etName, etMob, etEmail, etPsswd;
    RadioButton rd1, rd2;
    CheckBox cb1, cb2, cb3, cb4;
    Button btn1;

    int i = 0;
    Handler hdlr = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        etName = findViewById(R.id.et1);
        etMob = findViewById(R.id.et2);
        etEmail = findViewById(R.id.et3);
        etPsswd = findViewById(R.id.psswd);

        rd1 = findViewById(R.id.rd1);
        rd2 = findViewById(R.id.rd2);

        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);

        btn1 = findViewById(R.id.btn1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etName.getText().toString();
                String mob = etMob.getText().toString();
                String email = etEmail.getText().toString();
                String password = etPsswd.getText().toString();

                String gender = null;
                if (rd1.isChecked())
                    gender = "Male";
                else if (rd2.isChecked())
                    gender = "Female";

                String hobby = " ";
                if (cb1.isChecked())
                    hobby += "\tDance";
                else if (cb2.isChecked())
                    hobby += "\tSing";
                else if (cb3.isChecked())
                    hobby += "\tRead";
                else if (cb4.isChecked())
                    hobby += "\tPlay";

                if (chkName() && chkNum() && chkEmail()  &&chkGender() && chkHobby() && chkPassword()) {
                    Toast.makeText(Form.this, "Submitted Successfully ", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Form.this, ViewForm.class);
                    intent.putExtra("Name", name);
                    intent.putExtra("Mobile", mob);
                    intent.putExtra("Email", email);
                    intent.putExtra("Gender", gender);
                    intent.putExtra("Hobby", hobby);
                    startActivity(intent);
                }
            }
        });
    }

    boolean chkName() {
        boolean isValid;
        if (etName.getText().toString().trim().length() <= 0) {
            etName.setError("Enter Name");
            isValid = false;
        } else {
            isValid = true;
        }
        return isValid;
    }

    boolean chkNum() {
        boolean isValid;
        if (etMob.getText().toString().trim().length() <= 0) {
            etMob.setError("Enter Mobile Number");
            isValid = false;
        } else if (etMob.getText().toString().trim().length() != 10) {
            etMob.setError("Invalid Mobile Number");
            isValid = false;
        } else {
            isValid = true;
        }
        return isValid;
    }

    boolean chkEmail() {
        boolean isValid;
        String e = etEmail.getText().toString();
        if (e.trim().length() <= 0) {
            etEmail.setError("Enter Email");
            isValid = false;
        } else if (Patterns.EMAIL_ADDRESS.matcher(e).matches()) {
            isValid = true;
        } else {
            etEmail.setError("Invalid Email Address");
            isValid = false;
        }
        return isValid;
    }


    boolean chkGender() {
        boolean isValid;
        if (rd1.isChecked() || rd2.isChecked())
            isValid =true;
        else
        {
            isValid=false;
            Toast.makeText(Form.this, "Please Select Gender", Toast.LENGTH_SHORT).show();
        }
        return isValid;
    }

    boolean chkHobby() {
        boolean isValid;
        if (cb1.isChecked() || cb2.isChecked() || cb3.isChecked() || cb4.isChecked())
            isValid =true;
        else
        {   isValid=false;
            Toast.makeText(Form.this, "Please Select atleast one Hobby", Toast.LENGTH_SHORT).show();
        }
        return isValid;
    }
    public boolean chkPassword ()
    {
        boolean isPasswordValid = false;
        final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a z])(?=.*[A Z])(?=.*[@#$%^&+=])(?= S+$).{5,}$";
        if (etPsswd.getText().toString().trim().length() <= 0)
        {
            etPsswd.setError("Enter Password");
        }
        else if ( Pattern.compile (PASSWORD_PATTERN).matcher(etPsswd.getText().toString().trim()).matches())
        {
            isPasswordValid = true;
        }
        else
            {
            etPsswd.setError("Enter at least one digit,one lower case letter,one upper case letter,one special character and length must be 5");
             }
        return isPasswordValid ;
        }
}