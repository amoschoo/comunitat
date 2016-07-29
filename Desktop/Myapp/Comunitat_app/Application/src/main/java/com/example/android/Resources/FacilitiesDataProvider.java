package com.example.android.Resources;


public class FacilitiesDataProvider {
    private int picture_resource;
    private String attraction_name;

    public FacilitiesDataProvider(int picture_resource, String attraction_name){
        this.setAttraction_name(attraction_name);
        this.setPicture_resource(picture_resource);
    }

    public int getPicture_resource() {
        return picture_resource;
    }

    public void setPicture_resource(int picture_resource) {
        this.picture_resource = picture_resource;
    }

    public String getAttraction_name() {
        return attraction_name;
    }

    public void setAttraction_name(String attraction_name) {
        this.attraction_name = attraction_name;
    }

}
