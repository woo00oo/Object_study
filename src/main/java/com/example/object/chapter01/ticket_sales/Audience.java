package com.example.object.chapter01.ticket_sales;

import lombok.Getter;

/**
 * 관람객 클래스
 */
@Getter
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

}
