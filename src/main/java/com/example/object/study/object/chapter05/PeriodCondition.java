package com.example.object.study.object.chapter05;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition {
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return this.dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek()) &&
                this.startTime.compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
                this.endTime.compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
    }
}
