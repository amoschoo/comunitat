package com.example.android.pages;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.Resources.GlobalValue;
import com.example.android.slidingtabsbasic.R;

public class Profile extends Activity {
    Button home_btn;
    EditText name,email,pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getWindow().getDecorView().setBackgroundColor(Color.WHITE);
        setContentView(R.layout.activity_profile);
        name = (EditText)findViewById(R.id.name_edittext);
        email = (EditText)findViewById(R.id.email_edittext);
        pw = (EditText)findViewById(R.id.password_edittext);
        name.setText(((GlobalValue)getApplicationContext()).getName());
        email.setText(((GlobalValue)getApplicationContext()).getEmail());
        pw.setText(((GlobalValue)getApplicationContext()).getPw());

        home_btn = (Button) findViewById(R.id.toHomeButton);
        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), Home.class);
                startActivity(intent);
            }
        });
        Button signout_btn = (Button) findViewById(R.id.signout);
        signout_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
