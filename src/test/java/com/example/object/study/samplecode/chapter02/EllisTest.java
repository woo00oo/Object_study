package com.example.object.study.samplecode.chapter02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EllisTest {

    @Test
    void 객체지향() {
        Ellis ellis = new Ellis(130, "통로");
        Beverage beverage = new Beverage(0.5);

        ellis.drinkBeverage(beverage);

    }

    @Test
    void 객체지향X() {
        Ellis ellis = new Ellis(130, "통로");
        Beverage beverage = new Beverage(0.5);

    }

}