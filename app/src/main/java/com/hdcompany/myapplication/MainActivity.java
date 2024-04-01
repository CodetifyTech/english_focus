package com.hdcompany.myapplication;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPassword;
    private TextView buttonSignIn;
    private TextView buttonForgotPassword;
    private TextView buttonHaveAnAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        mapIDs();
        setOnClicks();
    }

    private void mapIDs(){
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonSignIn = findViewById(R.id.buttonSignIn);
        buttonForgotPassword = findViewById(R.id.buttonForgotPassword);
        buttonHaveAnAccount = findViewById(R.id.buttonHaveAnAccount);
    }
    private void setOnClicks(){
        buttonSignIn.setOnClickListener(view -> {
            String email = editTextEmail.getText().toString().trim();
            String password = editTextPassword.getText().toString().trim();
            if(TextUtils.isEmpty(email) || TextUtils.isEmpty(password)){
                Toast.makeText(this, "Không để trống Email hoặc Password", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Đăng nhập sẽ sớm hoàn thiện", Toast.LENGTH_SHORT).show();
            }
        });

        buttonHaveAnAccount.setOnClickListener(view->{
            Toast.makeText(this, "Sắp ra mắt", Toast.LENGTH_SHORT).show();
        });
        buttonForgotPassword.setOnClickListener(view->{
            Toast.makeText(this, "Sắp ra mắt", Toast.LENGTH_SHORT).show();
        });
    }
}