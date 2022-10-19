package com.example.object.chapter10.v4_abstract;

import com.example.object.chapter02.movie_reservation.Money;
import com.example.object.chapter10.v1.Call;

import java.time.Duration;


public class Phone extends AbstractPhone {
    private Money amount;
    private Duration seconds;

    public Phone(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFe(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
