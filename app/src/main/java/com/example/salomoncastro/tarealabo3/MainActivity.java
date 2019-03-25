package com.example.salomoncastro.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.salomoncastro.tarealabo3.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    private EditText mUsername, mPassword, mEmail, mGender;
    private Button mBotonShare, mBotonCompartir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsername = findViewById(R.id.et_username);
        mPassword = findViewById(R.id.et_pass);
        mEmail = findViewById(R.id.et_email);
        mGender = findViewById(R.id.et_gender);

        mBotonShare = findViewById(R.id.btn_share);
        mBotonCompartir = findViewById(R.id.btn_compartir);

        mBotonShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textUser = mUsername.getText().toString();
                String textPass = mPassword.getText().toString();
                String textEmail = mEmail.getText().toString();
                String textGender = mGender.getText().toString();

                Intent mIntent = new Intent(MainActivity.this,NewActivity.class);
                mIntent.putExtra(AppConstants.USER_KEY,textUser);
                mIntent.putExtra(AppConstants.PASS_KEY,textPass);
                mIntent.putExtra(AppConstants.EMAIL_KEY,textEmail);
                mIntent.putExtra(AppConstants.GENDER_KEY,textGender);
                startActivity(mIntent);
            }
        });

    }
}