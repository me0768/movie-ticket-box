package com.myang.movieticketbox.dto;

import lombok.Getter;

@Getter
public class Price {
    private double fixedPrice;
    private double discountedPrice;

    public Price(double fixedPrice, double discountedPrice) {
        this.fixedPrice = fixedPrice;
        this.discountedPrice = discountedPrice;
    }
}
