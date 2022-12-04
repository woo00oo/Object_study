package com.example.object.study.samplecode.chapter02;

import lombok.Getter;

@Getter
public class Ellis {
    private double stature;
    private String location;
    private Beverage beverage;

    public Ellis(double stature, String location) {
        this.stature = stature;
        this.location = location;
    }

    /**
     * 엘리스 키가 몇 감소, 음료량 -30 감소되어야
     * @param beverage
     */
    public void drinkBeverage(Beverage beverage) {
        this.stature -= 24;

        beverage.drunken(30);
    }
}
