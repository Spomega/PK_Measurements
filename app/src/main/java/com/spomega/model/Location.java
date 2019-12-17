package com.spomega.model;

public class Location {
    public Location(double longitude, double latitude, int accuracy) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.accuracy = accuracy;
    }

    public  final double longitude;
    public  final double latitude;
    public int accuracy;


}
