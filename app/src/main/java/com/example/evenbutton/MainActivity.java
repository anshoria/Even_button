package com.example.evenbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edemail, edpassword;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btSubmit);
        edemail=findViewById(R.id.edEmail);
        edpassword=findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nama = edemail.getText().toString();
                password = edpassword.getText().toString();

                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda: "+nama+" dan password anda:"+password+"", Toast.LENGTH_LONG);

                String email = "anshoria@gmail.com";
                String pass = "anshori123";



                if (nama.equals(email) && password.equals(pass))
                {
                    t = Toast.makeText(getApplicationContext(),
                            "Login sukses", Toast.LENGTH_LONG);
                    t.show();
                }
                else if (!nama.equals(email) && password.equals(pass))
                {
                    t = Toast.makeText(getApplicationContext(),
                            "Email salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else if (nama.equals(email) && !password.equals(pass))
                {
                    t = Toast.makeText(getApplicationContext(),
                            "Password salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else
                {
                    t = Toast.makeText(getApplicationContext(),
                            "Email dan password salah", Toast.LENGTH_LONG);
                    t.show();
                }
                t.show();
            }
        });
    }
}

