package com.example.user.myapplicatiom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class stuinterface extends AppCompatActivity implements View.OnClickListener {
    Button outBtn;
    TextView stu ;
    UserLocalStore userLocalStore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stuinterface);
         outBtn = (Button) findViewById(R.id.bout);
        stu = (TextView) findViewById(R.id.tvst);

        outBtn.setOnClickListener(this);

        userLocalStore = new UserLocalStore(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        if (authenticate()== true)
        {
            display();
        }
    }

    private boolean authenticate()
    {
        return userLocalStore.getUserLoggedIn();

    }
    private void display()
    {
        user use = userLocalStore.getLoggedInUser();

        stu.setText(use.email);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.bout:

                userLocalStore.clearUserData();
                userLocalStore.setUserLoggedIn(false);
                startActivity(new Intent(this , Login.class));

        }
    }
}
