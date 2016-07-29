package com.example.android.pages;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.Resources.GlobalValue;
import com.example.android.slidingtabsbasic.R;

public class Booking extends Activity {
    TextView date;
    ListView timings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        timings = (ListView)findViewById(R.id.time_listview);
        date = (TextView)findViewById(R.id.date_textview);
        final String datestring =(((GlobalValue)getApplicationContext()).getDate());
        final String facilitystring =(((GlobalValue)getApplicationContext()).getFacility());
        date.setText(datestring);

        final String[] values = new String[] { "0000-0100",
                "0100-0200",
                "0200-0300",
                "0300-0400",
                "0400-0500",
                "0500-0600",
                "0600-0700",
                "0700-0800",
                "0800-0900",
                "0900-1000",
                "1000-1100",
                "1100-1200",
                "1200-1300",
                "1300-1400",
                "1400-1500",
                "1500-1600",
                "1600-1700",
                "1700-1800",
                "1800-1900",
                "1900-2000",
                "2000-2100",
                "2100-2200",
                "2200-2300",
                "2300-2400"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);
        timings.setAdapter(adapter);
        timings.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String time = values[position];
                ((GlobalValue) getApplicationContext()).addBooking(facilitystring+"\n"+datestring+ " {"+time+"}");
                Intent intent = new Intent(getApplication(), Home.class);
                startActivity(intent);
            }
        });
    }

}
