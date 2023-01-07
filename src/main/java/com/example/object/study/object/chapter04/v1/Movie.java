package com.example.object.study.object.chapter04.v1;

import com.example.object.study.object.chapter02.Money;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.util.List;

@Getter @Setter
public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;


}