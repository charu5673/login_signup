package com.example.login_signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button b=findViewById(R.id.backl);
    }

    @Override
    public void onClick(View v) {
        Button button = (Button)v;
        String text = button.getText().toString();
        if(text.equals("Back"))
        {
            //back to main page
            Intent i=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
            setContentView(R.layout.activity_main);
        }
    }
}