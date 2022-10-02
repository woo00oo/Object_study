package com.example.object.chapter06.command_query.v2;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * 특정 일자에 실제로 발생하는 사건
 */
public class Event {
    private String subject; // 이벤트 주제
    private LocalDateTime from; // 시작 일시
    private Duration duration; // 소요 시간

    public Event(String subject, LocalDateTime from, Duration duration) {
        this.subject = subject;
        this.from = from;
        this.duration = duration;
    }

    /**
     * 명령과 쿼리의 두 가지 역할을 동시에 수행함.
     * @param schedule
     * @return
     */
    public boolean isSatisfied(RecurringSchedule schedule) {
        if (this.from.getDayOfWeek() != schedule.getDayOfWeek() ||
            !this.from.toLocalTime().equals(schedule.getFrom()) ||
            !this.duration.equals(schedule.getDuration())) {

            return false;
        }

        return true;
    }
    public void reschedule(RecurringSchedule schedule) {
        from = LocalDateTime.of(from.toLocalDate().plusDays(daysDistance(schedule)),
                schedule.getFrom());
        this.duration = schedule.getDuration();
    }




    private long daysDistance(RecurringSchedule schedule) {
        return schedule.getDayOfWeek().getValue() - from.getDayOfWeek().getValue();
    }

}
