package com.example.assignment_1_infs3634;

public class City_Time {
    private static String city;
    private static String time;



    public City_Time() {
    }

    public City_Time(String city, String time) {
        this.city= city;
        this.time = time;
    }

    public static String getCity() {
        return city;
    }

    public void setCity(String name) {
        this.city = name;
    }

    public static String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


}

