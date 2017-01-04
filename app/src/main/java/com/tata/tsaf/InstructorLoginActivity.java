package com.tata.tsaf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InstructorLoginActivity extends AppCompatActivity {

    private EditText mLoginEmailField;
    private EditText mLoginPasswordField;
    private Button mLogin;
    private Button mtoRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instructor_loginactivity);

        mLoginEmailField = (EditText) findViewById(R.id.emailLoginField);
        mLoginPasswordField = (EditText) findViewById(R.id.passwordLoginField);


        mLogin = (Button) findViewById(R.id.bLogin);
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startLogin();
            }
        });




        mtoRegister = (Button) findViewById(R.id.btoRegister);
        mtoRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),InstructorRegisterActivity.class);
                startActivity(intent);
            }
        });


    }

    private void startLogin() {


    }
}
