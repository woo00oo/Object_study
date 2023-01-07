package com.example.object.study.object.chapter04.v1;

import com.example.object.study.object.chapter02.Money;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }

}
