package com.example.salomoncastro.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.salomoncastro.tarealabo3.utils.AppConstants;

import static com.example.salomoncastro.tarealabo3.R.id.tv_new_user;
import static com.example.salomoncastro.tarealabo3.utils.AppConstants.USER_KEY;

public class NewActivity extends AppCompatActivity {

    public static TextView mTVuser, mTVpass, mTVemail, mTVgender;
    public static Button mBotonCompartir;

    public static String textoEnviadoUser, textoEnviadoPass,textoEnviadoEmail, textoEnviadoGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        mTVuser = findViewById(R.id.tv_new_user);
        mTVpass = findViewById(R.id.tv_new_pass);
        mTVemail = findViewById(R.id.tv_new_email);
        mTVgender = findViewById(R.id.tv_new_gender);

        mBotonCompartir = findViewById(R.id.btn_compartir);

        Intent mIntent = getIntent();
        if(mIntent != null){
            textoEnviadoUser = mIntent.getStringExtra(AppConstants.USER_KEY);
            mTVuser.setText(textoEnviadoUser);
            textoEnviadoPass = mIntent.getStringExtra(AppConstants.PASS_KEY);
            mTVpass.setText(textoEnviadoPass);
            textoEnviadoEmail = mIntent.getStringExtra(AppConstants.EMAIL_KEY);
            mTVemail.setText(textoEnviadoEmail);
            textoEnviadoGender = mIntent.getStringExtra(AppConstants.GENDER_KEY);
            mTVgender.setText(textoEnviadoGender);
        }

        mBotonCompartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mIntent = new Intent();
                mIntent.setType("text/plain");
                mIntent.setAction(Intent.ACTION_SEND);
                mIntent.putExtra(AppConstants.USER_KEY,textoEnviadoUser);
                mIntent.putExtra(AppConstants.USER_KEY,textoEnviadoPass);
                mIntent.putExtra(AppConstants.USER_KEY,textoEnviadoEmail);
                mIntent.putExtra(AppConstants.USER_KEY,textoEnviadoGender);
                startActivity(mIntent);
            }
        });
    }
}
