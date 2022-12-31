package com.example.object.study.object.chapter02.discount;

import com.example.object.study.object.chapter02.Money;
import com.example.object.study.object.chapter02.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
