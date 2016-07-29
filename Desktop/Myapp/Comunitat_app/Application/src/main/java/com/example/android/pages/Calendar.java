package com.example.android.pages;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.Resources.GlobalValue;
import com.example.android.slidingtabsbasic.R;

public class Calendar extends Activity {
    CalendarView calendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        getWindow().getDecorView().setBackgroundColor(Color.WHITE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        setTitle(((GlobalValue)getApplicationContext()).getFacility());
        calendarView = (CalendarView) findViewById(R.id.calendarView);



        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
                ((GlobalValue)getApplicationContext()).setDate("Date: " + i2 + " / " + i1 + " / " + i);
                startactivity();
            }
        });
    }
    private void startactivity(){
        Intent intent = new Intent(this,Booking.class);
        startActivity(intent);
    }

}
