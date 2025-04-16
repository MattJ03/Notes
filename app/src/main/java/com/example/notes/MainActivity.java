package com.example.notes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.EditText;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import androidx.core.widget.*;
import android.view.View;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    EditText email, password;
    Button logIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextTextPassword);
        logIn = findViewById(R.id.button);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.toString().isEmpty() || password.toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Log in failed", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, Compose.class);
                    startActivity(intent);
                }
            }
        });



        };
    }
