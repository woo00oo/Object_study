package com.example.object.chapter01.ticket_sales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 매표소 클래스
 */
public class TicketOffice {
    private Long amount; // 판매 금액
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket ... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    /**
     * 티켓을 판매
     * 맨 첫 번째 위치에 저장된 Ticket을 반환
     * @return
     */
    public Ticket getTicket() {
        return this.tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
