package com.example.object.chapter02.movie_reservation.discount.policy;

import com.example.object.chapter02.movie_reservation.Money;
import com.example.object.chapter02.movie_reservation.Screening;
import com.example.object.chapter02.movie_reservation.discount.condition.DiscountCondition;

public class PercentDiscountPolicy extends DiscountPolicy {

    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
