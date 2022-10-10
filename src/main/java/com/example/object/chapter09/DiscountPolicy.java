package com.example.object.chapter09;

import com.example.object.chapter02.movie_reservation.Money;
import com.example.object.chapter02.movie_reservation.Screening;
import com.example.object.chapter02.movie_reservation.discount.condition.DiscountCondition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DiscountPolicy {

    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    /**
     * 할인 여부를 판단해서 요금을 계산
     * @param screening
     * @return
     */
    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition each : this.conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return screening.getMovieFee();
    }

    /**
     * 할인된 요금을 계산
     * @param screening
     * @return
     */
    abstract protected Money getDiscountAmount(Screening screening);
}
