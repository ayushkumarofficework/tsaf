package com.tata.tsaf;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InstructorRegisterActivity extends AppCompatActivity {


    private EditText mName;
    private EditText mEmail;

    private Button bRegister;
    private  Button bregtolog;

    private ProgressDialog mProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instructor_registeractivity);

        mProgress=new ProgressDialog(this);

        bregtolog=(Button)findViewById(R.id.bRegToLog) ;
        bregtolog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InstructorRegisterActivity.this,InstructorLoginActivity.class));
            }
        });

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startRegister();
            }
        });
    }


    private void startRegister() {

        String name = mName.getText().toString().trim();
        String email = mEmail.getText().toString().trim();


    }


}
