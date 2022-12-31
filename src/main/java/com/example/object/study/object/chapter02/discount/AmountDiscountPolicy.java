package com.example.object.study.object.chapter02.discount;

import com.example.object.study.object.chapter02.Money;
import com.example.object.study.object.chapter02.Screening;

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
