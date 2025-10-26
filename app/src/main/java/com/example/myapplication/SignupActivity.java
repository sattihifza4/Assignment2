package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    EditText editTextSignupUsername, editTextSignupPassword;
    Button buttonSignupSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        editTextSignupUsername = findViewById(R.id.editTextSignupUsername);
        editTextSignupPassword = findViewById(R.id.editTextSignupPassword);
        buttonSignupSubmit = findViewById(R.id.buttonSignupSubmit);

        buttonSignupSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextSignupUsername.getText().toString().trim();
                String password = editTextSignupPassword.getText().toString().trim();

                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(SignupActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SignupActivity.this, "Signup successful! Please login.", Toast.LENGTH_SHORT).show();

                    // Go back to LoginActivity
                    Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish(); // optional
                }
            }
        });
    }
}