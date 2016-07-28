package com.example.user.myapplicatiom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tvLog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLog = (TextView) findViewById(R.id.tvlog);
        tvLog.setOnClickListener(this);

    }

   public void onClick(View v)
   {
         if (v.getId() == R.id.tvlog){

             startActivity(new Intent(this, Login.class));

         }
   }
}
