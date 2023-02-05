package com.example.object.study.object.chapter06.v2;

import java.time.Duration;
import java.time.LocalDateTime;

public class Event {
    private String subject;     // 이벤트 주제
    private LocalDateTime from; // 시작 일시
    private Duration duration;  // 소요 시간

    public Event(String subject, LocalDateTime from, Duration duration) {
        this.subject = subject;
        this.from = from;
        this.duration = duration;
    }

    public boolean isSatisfied(RecurringSchedule schedule) {
        if (this.from.getDayOfWeek() != schedule.getDayOfWeek() ||
            ! this.from.toLocalTime().equals(schedule.getFrom()) ||
            ! this.duration.equals(schedule.getDuration())) {

            return false;
        }

        return true;
    }

    public void reschedule(RecurringSchedule schedule) {
        this.from = LocalDateTime.of(this.from.toLocalDate().plusDays(daysDistance(schedule)),
                schedule.getFrom());
        this.duration = schedule.getDuration();
    }

    private long daysDistance(RecurringSchedule schedule) {
        return schedule.getDayOfWeek().getValue() - this.from.getDayOfWeek().getValue();
    }

}
