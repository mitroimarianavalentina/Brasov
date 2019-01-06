package com.marianavalentinamitroi.brasov.model;

public class Restaurant {

    private String name;

    private int photo;

    private String location;

    private String phoneNumber;

    private String description;


    public Restaurant(String name, int photo, String location, String phoneNumber, String description) {
        this.name = name;
        this.photo = photo;
        this.location = location;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public String getDescription() {
        return description;
    }
}
