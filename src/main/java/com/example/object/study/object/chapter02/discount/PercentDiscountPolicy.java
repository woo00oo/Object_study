package com.example.object.study.object.chapter02.discount;

import com.example.object.study.object.chapter02.Money;
import com.example.object.study.object.chapter02.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(this.percent);
    }

}
