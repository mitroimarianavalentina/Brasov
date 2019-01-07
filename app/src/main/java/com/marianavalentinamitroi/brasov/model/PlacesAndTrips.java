package com.marianavalentinamitroi.brasov.model;

public class PlacesAndTrips {
    private String name;

    private int photo;

    private String location;

    private String description;

    public PlacesAndTrips(String name, int photo, String location) {
        this.name = name;
        this.photo = photo;
        this.location = location;
    }

    public PlacesAndTrips(String name, int photo, String location, String description) {
        this.name = name;
        this.photo = photo;
        this.location = location;
        this.description = description;
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

    public String getDescription() {
        return description;
    }
}
