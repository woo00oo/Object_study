package com.example.object.study.object.chapter01.v2;

/**
 * 관람객
 */
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        if (this.bag.hasInvitation()) {
            this.bag.setTicket(ticket);
            return 0L;
        } else {
            this.bag.minusAmount(ticket.getFee());
            this.bag.setTicket(ticket);
            return ticket.getFee();
        }
    }

}
