package com.example.object.study.object.chapter01.v2;

/**
 * 판매원
 */
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        this.ticketOffice.plusAmount(
                audience.buy(ticketOffice.getTicket())
        );
    }

}
