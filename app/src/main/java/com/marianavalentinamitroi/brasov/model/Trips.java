package com.marianavalentinamitroi.brasov.model;

public class Trips {
    private String name;

    private int photo;

    private String location;

    public Trips(String name, int photo, String location) {
        this.name = name;
        this.photo = photo;
        this.location = location;
    }

    public String getName() {
        return name;
    }


    public int getPhoto() {
        return photo;
    }


    public String getLocation() {
        return location;
    }
}
