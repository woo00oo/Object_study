package com.example.object.chapter02.movie_reservation;

import lombok.Getter;

@Getter
public class Movie {
    private Money fee;

    /**
     * 1인당 예매 요금을 반환하는 메서드
     * @param screening
     * @return
     */
    public Money calculateMovieFee(Screening screening) {
        return this.fee;
    }
}
