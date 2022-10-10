package com.example.object.chapter09;

import com.example.object.chapter02.movie_reservation.Money;
import com.example.object.chapter02.movie_reservation.discount.condition.SequenceCondition;
import com.example.object.chapter02.movie_reservation.discount.policy.AmountDiscountPolicy;

import java.time.Duration;

public class Factory {

    public Movie createAvatarMovie() {
        return new Movie("아바타", Duration.ofMinutes(120),
                Money.wons(10000), new AmountDiscountPolicy(Money.wons(1000), new SequenceCondition(1)));
    }
}
