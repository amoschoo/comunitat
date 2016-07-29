package com.example.android.pages;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

import com.example.android.slidingtabsbasic.R;

public class CondoList extends Activity {
    Button profile_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getWindow().getDecorView().setBackgroundColor(Color.WHITE);
        setContentView(R.layout.activity_condo_list_page);

        profile_btn = (Button) findViewById(R.id.toProfileButton);
        profile_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), Profile.class);
                startActivity(intent);
            }
        });
    }
}
