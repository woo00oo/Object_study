package com.example.object.chapter06.command_query.v1;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

/**
 * 일주일 단위로 돌아오는 특정 시간 간격에 발생하는 사건 전체를 포괄적으로 지칭
 */
public class RecurringSchedule {
    private String subject; // 일정의 주제
    private DayOfWeek dayOfWeek; // 반복될 요일
    private LocalTime from; // 시작 시간
    private Duration duration; // 기간

    public RecurringSchedule(String subject, DayOfWeek dayOfWeek,
                             LocalTime from, Duration duration) {
        this.subject = subject;
        this.dayOfWeek = dayOfWeek;
        this.from = from;
        this.duration = duration;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public LocalTime getFrom() {
        return from;
    }

    public Duration getDuration() {
        return duration;
    }

}
