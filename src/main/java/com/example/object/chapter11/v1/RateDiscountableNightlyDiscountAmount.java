package com.example.object.chapter11.v1;

import com.example.object.chapter02.movie_reservation.Money;

import java.time.Duration;

public class RateDiscountableNightlyDiscountAmount extends NightlyDiscountPhone {
    private Money discountAmount;


    public RateDiscountableNightlyDiscountAmount(Money nightlyAmount, Money regularAmount,
                                                 Duration seconds, Money discountAmount) {
        super(nightlyAmount, regularAmount, seconds);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.minus(discountAmount);
    }

}
