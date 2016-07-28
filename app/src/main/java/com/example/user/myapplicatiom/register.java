package com.example.user.myapplicatiom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity implements View.OnClickListener{
    EditText rName , rMail , rPass;
    Button rBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        rName = (EditText) findViewById(R.id.regun);
        rMail = (EditText) findViewById(R.id.regmail);
        rPass = (EditText) findViewById(R.id.regpass);
          rBtn = (Button) findViewById(R.id.breg);

        rBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.breg:
                String name = rName.getText().toString();
                String mail = rMail.getText().toString();
                String pass = rPass.getText().toString();

                user registeredData = new user(name , mail , pass);

                break;

        }
    }
}
