package com.example.object.chapter06.v2;

public class Bag {

    private Ticket ticket;

    public boolean hasInvitation() {
        return false;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            this.ticket = ticket;
            return 0L;
        } else {
            this.ticket = ticket;
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    public void minusAmount(Long fee) {
    }


}
