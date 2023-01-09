package com.example.object.study.object.chapter05;

import com.example.object.study.object.chapter02.Money;

public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money amount;
    private int audienceCount;

    public Reservation(Customer customer, Screening screening, Money amount, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.amount = amount;
        this.audienceCount = audienceCount;
    }

}
