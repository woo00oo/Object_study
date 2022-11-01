package com.example.object.chapter11.v2;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * 개별 통과 기간
 */
public class Call {
    // 통화 시작 시간
    private LocalDateTime from;

    // 통화 종료 시간
    private LocalDateTime to;

    public Call(LocalDateTime from, LocalDateTime to) {
        this.from = from;
        this.to = to;
    }

    public Duration getDuration() {
        return Duration.between(from, to);
    }

    public LocalDateTime getFrom() {
        return this.from;
    }

}
