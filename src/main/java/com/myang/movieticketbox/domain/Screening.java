package com.myang.movieticketbox.domain;

import java.time.LocalDateTime;

import com.myang.movieticketbox.dto.Price;

import lombok.Getter;

@Getter
public class Screening {
    private long id;
    private int dayNum;
    private LocalDateTime startAt;
    private LocalDateTime endAt;

    private Movie movie;

    private boolean isDiscountable() {
        return true;
    }

    public Price calculatePrice() {
        return isDiscountable() ? movie.getDiscountedPrice() : movie.getFixedPrice();
    }
}
