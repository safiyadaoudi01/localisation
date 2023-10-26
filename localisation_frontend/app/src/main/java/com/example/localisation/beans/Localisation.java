package com.example.localisation.beans;


import java.util.Date;

public class Localisation {
    private int id;
    private double latitude;
    private double longitude;
    private Date date;
    private String imei;
    public Localisation() { }

    public Localisation(double latitude, double longitude, Date date, String imei) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
        this.imei = imei;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
}