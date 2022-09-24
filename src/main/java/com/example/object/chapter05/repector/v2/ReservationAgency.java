package com.example.object.chapter05.repector.v2;

import com.example.object.chapter02.movie_reservation.Money;
import com.example.object.chapter04.v1.*;

public class ReservationAgency {


    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        boolean discountable = checkDiscountable(screening);
        Money fee = calculateFee(screening, discountable, audienceCount);
        return createReservation(screening, customer, audienceCount, fee);
    }

    /**
     * 할인 조건 적용 여부 판단
     * @param screening
     * @return
     */
    private boolean checkDiscountable(Screening screening) {
        return screening.getMovie().getDiscountConditions().stream()
                .anyMatch(condition -> condition.isDiscountable(screening));
    }

    /**
     * 할인 정책에 따른 할인 요금 계산
     * @param screening
     * @param discountable
     * @param audienceCount
     * @return
     */
    private Money calculateFee(Screening screening, boolean discountable, int audienceCount) {
        if (discountable) {
            return screening.getMovie().getFee()
                    .minus(calculateDiscountedFee(screening.getMovie()))
                    .times(audienceCount);
        }

        return screening.getMovie().getFee().times(audienceCount);
    }

    /**
     * 할인 정책 타입 판단
     * @param movie
     * @return
     */
    private Money calculateDiscountedFee(Movie movie) {
        switch (movie.getMovieType()) {
            case AMOUNT_DISCOUNT:
                return calculateAmountDiscountedFee(movie);
            case PERCENT_DISCOUNT:
                return calculatePercentDiscountedFee(movie);
            case NON_DISCOUNT:
                return calculateNoneDiscountedFee(movie);
        }
        throw new IllegalArgumentException();
    }

    /**
     * 금액 할인 정책
     * @param movie
     * @return
     */
    private Money calculateAmountDiscountedFee(Movie movie) {
        return movie.getDiscountAmount();
    }

    /**
     * 비율 할인 정책
     * @param movie
     * @return
     */
    private Money calculatePercentDiscountedFee(Movie movie) {
        return movie.getFee().times(movie.getDiscountPercent());
    }

    private Money calculateNoneDiscountedFee(Movie movie) {
        return Money.ZERO;
    }

    private Reservation createReservation(Screening screening, Customer customer,
                                          int audienceCount, Money fee) {
        return new Reservation(customer, screening, fee, audienceCount);
    }
}
