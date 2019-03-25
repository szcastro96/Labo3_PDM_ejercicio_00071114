package com.example.salomoncastro.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.salomoncastro.tarealabo3.utils.AppConstants;

import static com.example.salomoncastro.tarealabo3.R.id.tv_new_user;
import static com.example.salomoncastro.tarealabo3.utils.AppConstants.USER_KEY;

public class NewActivity extends AppCompatActivity {

    public static TextView mTVuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        mTVuser = findViewById(R.id.tv_new_user);

        Intent mIntent = getIntent();
        if(mIntent != null){
            mIntent.getStringExtra(AppConstants.USER_KEY);
        }
    }
}
