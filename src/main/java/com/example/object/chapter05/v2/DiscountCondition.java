package com.example.object.chapter05.v2;

import com.example.object.chapter05.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
