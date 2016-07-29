package com.example.android.common.activities;


import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import com.example.android.Resources.GlobalValue;
import com.example.android.slidingtabsbasic.R;

import java.util.ArrayList;


public class page2 extends android.support.v4.app.Fragment  {
    ArrayList<String> bookings = new ArrayList<>();
    ListView bookingList;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        getActivity().getWindow().getDecorView().setBackgroundColor(Color.WHITE);
        View myView = inflater.inflate(R.layout.activity_page2, container, false);
        bookings = ((GlobalValue) getActivity().getApplicationContext()).getBooking();
        bookingList = (ListView)myView.findViewById(R.id.bookings_listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, bookings);
        bookingList.setAdapter(adapter);


        return myView;

    }
}
