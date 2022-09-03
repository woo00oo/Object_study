package com.example.object.chapter01.ticket_sales;

/**
 * 소극장 클래스
 */
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /**
     * 관람객 입장
     * @param audience
     */
    public void enter(Audience audience) {
        this.ticketSeller.sellTo(audience);
    }
}
