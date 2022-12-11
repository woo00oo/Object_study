package com.example.object.study.samplecode.chapter06;

import java.time.LocalDate;
import java.time.Period;

/**
 * 정기 예금
 */
public class TermDeposit {
    private Period period; // 기간
    private Boolean closed; // 해지여부
    private Account account;

    public Interest calculateInterest(LocalDate when) {
        if (invalidDate(when)) {
            account.calculateInterest(when);
        }

        throw new IllegalStateException();
    }

    private Boolean invalidDate(LocalDate when) {
        return true;
    }
}
