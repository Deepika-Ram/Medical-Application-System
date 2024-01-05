package com.example.medicalapplicationsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginbutton;

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginbutton = findViewById(R.id.loginbutton);

        loginbutton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("user") && password.getText().toString().equals("Hello"))
                {
                    Toast.makeText(MainActivity.this, "Login Successfully processed", Toast.LENGTH_SHORT).show();
                    openHomepage();

                }
                else
                {
                    Toast.makeText(MainActivity.this, "Username or Password Incorrect!", Toast.LENGTH_SHORT).show();
                }

            }

        });
    }
    public void openHomepage()
    {
        Intent intent = new Intent(this, Homepage.class);
        startActivities(new Intent[]{intent});
    }
}