package com.example.user.myapplicatiom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class admin extends AppCompatActivity {
    EditText admail , adpass;
    Button adBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        admail = (EditText) findViewById(R.id.let);
        adpass = (EditText) findViewById(R.id.lpass);

    }
}
