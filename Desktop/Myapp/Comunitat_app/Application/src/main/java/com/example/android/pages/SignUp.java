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

public class SignUp extends Activity {
    Button signupBtn;
    EditText name,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getWindow().getDecorView().setBackgroundColor(Color.WHITE);
        setContentView(R.layout.activity_sign_up_page);
        name = (EditText)findViewById(R.id.name_signup);
        email = (EditText)findViewById(R.id.email_signup);

        signupBtn = (Button) findViewById(R.id.signup_button);
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), CondoList.class);
                ((GlobalValue)getApplicationContext()).setName(name.getText().toString());
                ((GlobalValue)getApplicationContext()).setEmail(email.getText().toString());
                startActivity(intent);
            }
        });
    }

}
