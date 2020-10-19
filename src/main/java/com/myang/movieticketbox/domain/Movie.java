package com.myang.movieticketbox.domain;

import com.myang.movieticketbox.dto.Price;

import lombok.Getter;

@Getter
public class Movie {
    private long id;
    private String title;
    private double fixedPrice;

    private DiscountPolicy discountPolicy;
    private DiscountCondition discountCondition;

    public Price getFixedPrice() {
        double fixedPrice = this.fixedPrice;
        double discountedPrice = fixedPrice;
        return new Price(fixedPrice, discountedPrice);
    }
    public Price getDiscountedPrice() {
        double fixedPrice = this.fixedPrice;
        double discountedPrice = fixedPrice - discountPolicy.getDiscountAmount();
        return new Price(fixedPrice, discountedPrice);
    }
}
