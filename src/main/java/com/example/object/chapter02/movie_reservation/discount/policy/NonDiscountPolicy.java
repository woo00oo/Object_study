package com.example.object.chapter02.movie_reservation.discount.policy;

import com.example.object.chapter02.movie_reservation.Money;
import com.example.object.chapter02.movie_reservation.Screening;

public class NonDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
