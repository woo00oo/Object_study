package com.example.object.chapter04.v2;

import com.example.object.chapter02.movie_reservation.Money;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, Screening screening,
                       Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}
