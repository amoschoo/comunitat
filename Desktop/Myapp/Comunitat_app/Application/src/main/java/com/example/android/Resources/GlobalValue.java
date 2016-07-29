package com.example.android.Resources;

import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;

public class GlobalValue extends Application {
    String facility = "";
    String name = "";
    String email = "";
    String condo = "";
    String pw = "";
    String date = "";
    ArrayList<String> booking = new ArrayList<>(
            Arrays.asList("No bookings")
    );
    public void setFacility(String string){this.facility=string;}
    public String getFacility(){return this.facility;}

    public void setName(String string){this.name=string;}
    public String getName(){return this.name;}

    public void setEmail(String string){this.email=string;}
    public String getEmail(){return this.email;}

    public void setPw(String string){this.pw=string;}
    public String getPw(){return this.pw;}

    public void setCondo(String string){this.condo=string;}
    public String getCondo(){return this.condo;}

    public void setDate(String string){this.date=string;}
    public String getDate(){return this.date;}

    public void addBooking(String string){
        this.booking.remove("No bookings");
        this.booking.add(string);}
    public ArrayList<String> getBooking(){return this.booking;}

}
