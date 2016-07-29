package com.example.android.common.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


import com.example.android.Resources.FacilitiesAdapter;
import com.example.android.Resources.FacilitiesDataProvider;
import com.example.android.Resources.GlobalValue;
import com.example.android.pages.Calendar;
import com.example.android.slidingtabsbasic.R;


public class page1 extends android.support.v4.app.Fragment  {
    ListView listview;
    String[] facilities_name;
    int[] picture_resource={R.drawable.bbq,R.drawable.squash,R.drawable.tennis,R.drawable.room};
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        getActivity().getWindow().getDecorView().setBackgroundColor(Color.WHITE);
        View myView = inflater.inflate(R.layout.activity_page1, container, false);
        listview = (ListView) myView.findViewById(R.id.list);
        FacilitiesAdapter adapter;
        facilities_name = getResources().getStringArray(R.array.facilities);
        int i =0;
        adapter=new FacilitiesAdapter(getActivity().getApplicationContext(),R.layout.row_layout);
        listview.setAdapter(adapter);
        for(String names:facilities_name){
            FacilitiesDataProvider dataProvider = new FacilitiesDataProvider(picture_resource[i],
                    names);
            adapter.add(dataProvider);
            i++;
        }
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String facility=facilities_name[position];
                ((GlobalValue)getActivity().getApplicationContext()).setFacility(facility);
                Intent intent = new Intent(getActivity().getApplication(), Calendar.class);
                startActivity(intent);
            }
        });
        return myView;
    }
}
