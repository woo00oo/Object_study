package com.example.object.chapter02.movie_reservation;


import com.example.object.chapter02.movie_reservation.discount.policy.DiscountPolicy;

import java.time.Duration;

public class Movie {
    private String title; // 제목
    private Duration runningTime; // 상영시간
    private Money fee; // 기본 요금
    private DiscountPolicy discountPolicy; // 할인 정책

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return this.fee;
    }

    /**
     * 할인 요금을 반환 받는 메서드
     * @param screening
     * @return
     */
    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }

}
