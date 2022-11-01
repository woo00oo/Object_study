package com.example.object.chapter11.v2;

import com.example.object.chapter02.movie_reservation.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
