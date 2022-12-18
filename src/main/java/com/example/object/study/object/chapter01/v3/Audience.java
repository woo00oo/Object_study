package com.example.object.study.object.chapter01.v3;

/**
 * 관람객
 */
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        return this.bag.hold(ticket);
    }

}
