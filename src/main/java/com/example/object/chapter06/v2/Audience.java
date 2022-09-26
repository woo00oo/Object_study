package com.example.object.chapter06.v2;

public class Audience {
    private Bag bag;

    public Bag getBag() {
        return bag;
    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
