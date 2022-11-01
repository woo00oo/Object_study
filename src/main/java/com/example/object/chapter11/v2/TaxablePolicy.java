package com.example.object.chapter11.v2;

import com.example.object.chapter02.movie_reservation.Money;

public class TaxablePolicy extends AdditionalRatePolicy {
    private double taxRatio;

    public TaxablePolicy(RatePolicy next, double taxRatio) {
        super(next);
        this.taxRatio = taxRatio;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.plus(fee.times(taxRatio));
    }

}
