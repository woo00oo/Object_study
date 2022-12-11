package com.example.object.study.samplecode.chapter06;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Account {
    private String accountNumber;
    private BigDecimal amount;
    private InterestRate interestRate;

    public Interest calculateInterest(LocalDate when) {
        return interestRate.createInterest(when, amount);
    }
}
