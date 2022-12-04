package com.example.object.study.samplecode.chapter02;



public class Beverage {
    private double quantity;

    public Beverage(double quantity) {
        this.quantity = quantity;
    }

    public void drunken(int quantity) {
        this.quantity -= quantity;
    }


}
