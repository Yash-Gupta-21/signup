package com.yash.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.yash.signup.databinding.ActivityMainBinding;
import com.yash.signup.databinding.ActivitySignupBinding;

public class SignupActivity extends AppCompatActivity {

    ActivitySignupBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, pass, cPass, mobileNumber;

                email = binding.etUsername.getText().toString();
                pass = binding.etPassword.getText().toString();
                cPass = binding.etCPassword.getText().toString();
                mobileNumber = binding.etMobilename.getText().toString();


                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(SignupActivity.this, "Enter your Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(mobileNumber)) {
                    Toast.makeText(SignupActivity.this, "Enter your Mobile Number", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(pass)) {
                    Toast.makeText(SignupActivity.this, "Enter your Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!pass.equals(cPass)) {
                    Toast.makeText(SignupActivity.this, "Password Doesn't Match", Toast.LENGTH_SHORT).show();
                    return;
                }


                Toast.makeText(SignupActivity.this, "Signup Successfully", Toast.LENGTH_SHORT).show();
            }
        });
        binding.tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignupActivity.this, MainActivity.class));
            }
        });
    }
}