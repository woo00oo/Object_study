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

    /**
     * 영화를 예매하는 기능을 구현하는 메서드
     * @param customer 예매자
     * @param audienceCount 인원수
     * @return Reservation 예매 정보
     */
    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    /**
     * 예매 요금을 계산하는 메서드
     * @param audienceCount
     * @return
     */
    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
