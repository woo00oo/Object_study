package com.example.object.chapter05.v2;

import com.example.object.chapter02.movie_reservation.Money;

import java.time.Duration;

public class PercentDiscountMovie extends Movie {
    private double discountPercent;

    public PercentDiscountMovie(String title, Duration runningTime, Money fee, double discountPercent, DiscountCondition... discountConditions) {
        super(title, runningTime, fee, discountConditions);
        this.discountPercent = discountPercent;
    }

    @Override
    protected Money calculateDiscountAmount() {
        return getFee().times(this.discountPercent);
    }
}
