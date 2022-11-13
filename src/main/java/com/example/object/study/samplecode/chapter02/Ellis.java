package com.example.object.study.samplecode.chapter02;

public class Ellis {
    private double stature;
    private String location;

    public Ellis(double stature, String location) {
        this.stature = stature;
        this.location = location;
    }

    public void drinkBeverage(Beverage beverage) {
        this.stature -= 24;
        beverage.drunken(30);
    }
}
