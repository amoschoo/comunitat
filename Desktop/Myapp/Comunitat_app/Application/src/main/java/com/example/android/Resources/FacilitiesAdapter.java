package com.example.android.Resources;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.slidingtabsbasic.R;

import java.util.ArrayList;
import java.util.List;

public class FacilitiesAdapter extends ArrayAdapter {
    DataHandler handler;
    List list = new ArrayList<>();
    public FacilitiesAdapter(Context context, int resource) {
        super(context, resource);
    }


    static class DataHandler
    {
        ImageView Picture;
        TextView name;
        TextView rating;
    }
    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row=convertView;
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row  = inflater.inflate(R.layout.row_layout,parent,false);
            handler=new DataHandler();
            handler.Picture=(ImageView)row.findViewById(R.id.picture);
            handler.name=(TextView)row.findViewById(R.id.facilities);
            row.setTag(handler);
        }
        else
        {
            handler = (DataHandler)row.getTag();
        }
        FacilitiesDataProvider dataProvider;
        dataProvider = (FacilitiesDataProvider)this.getItem(position);
        handler.Picture.setImageResource(dataProvider.getPicture_resource());
        handler.name.setText(dataProvider.getAttraction_name());
        return row;
    }
}
