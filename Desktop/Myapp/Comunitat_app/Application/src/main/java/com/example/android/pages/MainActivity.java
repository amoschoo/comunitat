package com.example.android.pages;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.Resources.GlobalValue;
import com.example.android.slidingtabsbasic.R;

public class MainActivity extends Activity {
    Button signupBtn;
    Button signinBtn;
    EditText name;
    EditText pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getWindow().getDecorView().setBackgroundColor(Color.WHITE);
        setContentView(R.layout.activity_sign_in_page);
        getActionBar().hide();
        name = (EditText)findViewById(R.id.name_signin);
        pw = (EditText)findViewById(R.id.pw_signin);
        signupBtn = (Button) findViewById(R.id.toSignUpButton);
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), SignUp.class);
                startActivity(intent);
            }
        });
        signinBtn = (Button) findViewById(R.id.signin_button);
        signinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((GlobalValue)getApplicationContext()).setName(name.getText().toString());
                ((GlobalValue)getApplicationContext()).setPw(pw.getText().toString());
                Intent intent = new Intent(getApplication(), Home.class);
                startActivity(intent);
            }
        });

//        Client client = ClientBuilder.newClient();
//        Entity payload = Entity.json("{  'user': {    'first_name': 'Taher',    'last_name': 'Dhilawala',    'email': 'taher@example.com',    'contact_number': '+6500000000',    'password': '',    'user_type': 'resident'  }}");
//        Response response = client.target("http://api.comunitat.co/user")
//                .request(MediaType.APPLICATION_JSON_TYPE)
//                .header("X-API-KEY", "&#60;your-api-key&#62;")
//                .post(payload);
//
//        System.out.println("status: " + response.getStatus());
//        System.out.println("headers: " + response.getHeaders());
//        System.out.println("body:" + response.readEntity(String.class));
    }
}
