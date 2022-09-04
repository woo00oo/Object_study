package com.example.object.chapter02.movie_reservation.discount.condition;

import com.example.object.chapter02.movie_reservation.Screening;

/**
 * 순번 조건
 */
public class SequenceCondition implements DiscountCondition {

    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    /**
     * 상영 순번 일치 여부 확인
     * @param screening
     * @return
     */
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
