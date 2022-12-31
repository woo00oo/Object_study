package com.example.object.study.object.chapter02.discount;

import com.example.object.study.object.chapter02.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
