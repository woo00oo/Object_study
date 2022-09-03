package com.example.object.chapter01.ticket_sales;


/**
 * 관람객 클래스
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
            this.bag.setTicket(ticket);
            this.bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

}
