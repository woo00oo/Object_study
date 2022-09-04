package com.example.object.chapter02.movie_reservation.discount.policy;

import com.example.object.chapter02.movie_reservation.Money;
import com.example.object.chapter02.movie_reservation.Screening;
import com.example.object.chapter02.movie_reservation.discount.condition.DiscountCondition;

public class AmountDiscountPolicy extends DiscountPolicy {

    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return this.discountAmount;
    }
}
