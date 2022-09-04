package com.example.object.chapter02.movie_reservation;


import java.time.LocalDateTime;

/**
 * 상영 클래스
 */
public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    /**
     * 상영 시작 시간 반환
     * @return
     */
    public LocalDateTime getStartTime() {
        return this.whenScreened;
    }

    /**
     * 순번 일치 여부 검사
     * @param sequence
     * @return
     */
    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    /**
     * 기본 요금 반환
     * @return
     */
    public Money getMovieFee() {
        return this.movie.getFee();
    }
}
