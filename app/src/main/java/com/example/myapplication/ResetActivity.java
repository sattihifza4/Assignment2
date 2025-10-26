package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ResetActivity extends AppCompatActivity {

    EditText editTextNewPassword;
    Button buttonResetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);

        editTextNewPassword = findViewById(R.id.editTextNewPassword);
        buttonResetPassword = findViewById(R.id.buttonResetPassword);

        buttonResetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newPassword = editTextNewPassword.getText().toString().trim();

                if (newPassword.isEmpty()) {
                    Toast.makeText(ResetActivity.this, "Please enter a new password", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ResetActivity.this, "Password changed successfully!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(ResetActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish(); // optional to close reset password screen
                }
            }
        });
    }
}