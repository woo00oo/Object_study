package com.example.object.chapter02.movie_reservation.discount.condition;

import com.example.object.chapter02.movie_reservation.Screening;

/**
 * 할인 조건
 */
public interface DiscountCondition {

    /**
     * 할인 가능 여부 반환
     * @param screening
     * @return
     */
    boolean isSatisfiedBy(Screening screening);
}
