package com.example.object.chapter09;

import com.example.object.chapter02.movie_reservation.Money;

public class ClientV2 {

    private Factory factory;

    public ClientV2(Factory factory) {
        this.factory = factory;
    }

    public Money getAvatarFee() {
        Movie movie = factory.createAvatarMovie();
        return movie.getFee();
    }

}
