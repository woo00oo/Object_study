package com.example.object.chapter01.ticket_sales;

import lombok.Getter;

/**
 * 판매원 클래스
 * 역할 : 매표소에서 초대장을 티켓으로 교환해 주거나, 티켓을 판매
 */
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }

}
