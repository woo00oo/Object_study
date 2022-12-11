package com.example.object.study.samplecode.chapter06;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CompoundInterestRate extends InterestRate {
    @Override
    public Interest createInterest(LocalDate when, BigDecimal amount) {
        return new Interest(amount, when);
    }
}
