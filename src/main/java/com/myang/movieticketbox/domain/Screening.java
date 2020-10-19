package com.myang.movieticketbox.domain;

import java.time.LocalDateTime;

import com.myang.movieticketbox.dto.Price;

import lombok.Getter;

@Getter
public class Screening {
    private long id;
    private int sequenceNum;
    private LocalDateTime startAt;
    private LocalDateTime endAt;

    private Movie movie;

    public Price calculatePrice() {
        return movie.isDiscountable(this) ? movie.getDiscountedPrice() : movie.getFixedPrice();
    }
}
