package com.example.object.chapter06.v2;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /**
     * 디미터 법칙 준수, 묻지 말고 시켜라
     * @param audience
     */
    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
