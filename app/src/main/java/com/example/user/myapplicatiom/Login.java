package com.example.user.myapplicatiom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener{
    TextView LogReg , LogAd;
    Button LogBtn;
    EditText lMail, loPass ;
    UserLocalStore userLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        lMail = (EditText) findViewById(R.id.let);
        loPass = (EditText) findViewById(R.id.lpass);
        LogAd = (TextView) findViewById(R.id.ladd);
        LogBtn = (Button) findViewById(R.id.blog);
        LogReg = (TextView) findViewById(R.id.lreg);
        LogReg.setOnClickListener(this);
        LogAd.setOnClickListener(this);
        LogBtn.setOnClickListener(this);
        userLocalStore = new UserLocalStore(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.lreg:
                startActivity(new Intent(this, register.class));
                break;
            case R.id.ladd:
                startActivity(new Intent(this, admin.class));
                break;


            case R.id.blog:

                user use= new user(null, null);
                userLocalStore.storeUserData(use);

                userLocalStore.setUserLoggedIn(true);
                startActivity(new Intent(this, stuinterface.class));





                break;
        }

    }
}
