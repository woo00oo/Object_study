package com.example.object.chapter05.v2;

import com.example.object.chapter02.movie_reservation.Money;
import com.example.object.chapter05.Screening;
import com.example.object.chapter05.v1.MovieType;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public abstract class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    public Movie(String title, Duration runningTime, Money fee,
                 DiscountCondition... discountConditions) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountConditions = Arrays.asList(discountConditions);
    }

    public Money calculateMovieFee(Screening screening) {
        if (isDiscountable(screening)) {
            return fee.minus(calculateDiscountAmount());
        }

        return fee;
    }

    protected Money getFee() {
        return fee;
    }

    private boolean isDiscountable(Screening screening) {
        return discountConditions.stream()
                .anyMatch(c -> c.isSatisfiedBy(screening));
    }

    abstract protected Money calculateDiscountAmount();

}
