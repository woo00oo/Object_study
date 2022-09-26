package com.example.object.chapter06.v2;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }

}
