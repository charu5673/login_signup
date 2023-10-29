package com.example.login_signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button l,s;
        l=findViewById(R.id.login);
        s=findViewById(R.id.signup);
    }

    @Override
    public void onClick(View v) {
        Button button = (Button)v;
        String text = button.getText().toString();
        if(text.equals("Login"))
        {
            //activity main to login page
            Intent i=new Intent(getApplicationContext(),login.class);
            startActivity(i);
            setContentView(R.layout.activity_login);
        }
        else
        {
            // activity main to signup page
            Intent i=new Intent(getApplicationContext(),signup.class);
            startActivity(i);
            setContentView(R.layout.activity_signup);
        }

    }
}