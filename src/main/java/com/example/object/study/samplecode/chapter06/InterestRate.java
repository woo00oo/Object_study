package com.example.object.study.samplecode.chapter06;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class InterestRate {
    private Double rate;

    public abstract Interest createInterest(LocalDate when, BigDecimal amount);
}
