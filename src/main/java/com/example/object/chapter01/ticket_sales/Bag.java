package com.example.object.chapter01.ticket_sales;

/**
 * 소지품(초대장, 현금, 티켓)을 보관할 Bag 클래스
 */
public class Bag {
    private Long amount; // 현금
    private Invitation invitation; // 초대장
    private Ticket ticket; // 티켓

    /**
     * 이벤트에 당첨되지 않은 경우, 초대장 필드 null 처리
     * @param amount
     */
    public Bag(Long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, Long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    /**
     * 초대장 보유 여부 판단
     */
    public boolean hasInvitation() {
        return this.invitation != null;
    }

    /**
     * 티켓 소유 여부 판단
     */
    public boolean hasTicket() {
        return this.ticket != null;
    }

    /**
     * 초대장을 티켓으로 교환
     * @param ticket
     */
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    /**
     * 현금 감소
     * @param amount
     */
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    /**
     * 현금 증가
     * @param amount
     */
    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
