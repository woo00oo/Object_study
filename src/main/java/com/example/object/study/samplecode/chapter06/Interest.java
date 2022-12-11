package com.example.object.study.samplecode.chapter06;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Interest {
    private BigDecimal amount;
    private LocalDate PaymentDate; // 지급 일자

    public Interest(BigDecimal amount, LocalDate paymentDate) {
        this.amount = amount;
        PaymentDate = paymentDate;
    }
}
