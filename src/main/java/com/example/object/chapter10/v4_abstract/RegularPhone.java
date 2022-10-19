package com.example.object.chapter10.v4_abstract;

import com.example.object.chapter02.movie_reservation.Money;
import com.example.object.chapter10.v1.Call;

import java.time.Duration;


public class RegularPhone extends Phone {
    private Money amount;
    private Duration seconds;

    public RegularPhone(Money amount, Duration seconds, double taxRate) {
        super(taxRate);
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFe(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
