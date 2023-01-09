package com.example.object.study.object.chapter05;

public class SequenceCondition implements DiscountCondition {
    private int sequence;

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return this.sequence == screening.getSequence();    }
}
