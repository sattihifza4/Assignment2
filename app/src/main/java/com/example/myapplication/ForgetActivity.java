package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgetActivity extends AppCompatActivity {
    EditText editTextEmail;
    Button buttonSubmitEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);

        editTextEmail = findViewById(R.id.editTextEmail);
        buttonSubmitEmail = findViewById(R.id.buttonSubmitEmail);

        buttonSubmitEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editTextEmail.getText().toString().trim();

                if (email.isEmpty()) {
                    Toast.makeText(ForgetActivity.this, "Please enter your email", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ForgetActivity.this, "Email submitted successfully!", Toast.LENGTH_SHORT).show();

                    // Go to ResetPasswordActivity
                    Intent intent = new Intent(ForgetActivity.this, ResetActivity.class);
                    startActivity(intent);
                    finish(); // optional
                }
            }
        });
    }
}