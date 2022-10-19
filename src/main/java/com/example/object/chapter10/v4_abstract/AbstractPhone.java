package com.example.object.chapter10.v4_abstract;

import com.example.object.chapter02.movie_reservation.Money;
import com.example.object.chapter10.v1.Call;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPhone {

    private List<Call> calls = new ArrayList<>();

    public Money calculateFee() {
        Money result = Money.ZERO;

        for(Call call : calls) {
            result = result.plus(calculateCallFe(call));
        }

        return result;
    }

    abstract protected Money calculateCallFe(Call call);

}
