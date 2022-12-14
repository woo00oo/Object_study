package com.example.object.study.samplecode.chapter07;

public class Customer {

    public void order(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);

    }

}
