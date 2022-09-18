package com.example.object.chapter04.v2;

import com.example.object.chapter02.movie_reservation.Money;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    /**
     * 영화 요금을 계산
     * @param audienceCount
     * @return
     */
    public Money calculateFee(int audienceCount) {
        switch (this.movie.getMovieType()) {
            case AMOUNT_DISCOUNT:
                if (this.movie.isDiscountable(whenScreened, sequence)) {
                    return movie.calculateAmountDiscountedFee().times(audienceCount);
                }
                break;
            case PERCENT_DISCOUNT:
                if (movie.isDiscountable(whenScreened, sequence)) {
                    return movie.calculatePercentDiscountedFee().times(audienceCount);
                }
                break;
            case NON_DISCOUNT:
                return movie.calculateNoneDiscountedFee().times(audienceCount);
        }
        return movie.calculateNoneDiscountedFee().times(audienceCount);
    }
}
