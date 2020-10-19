package com.myang.movieticketbox.domain;

import java.util.List;

import com.myang.movieticketbox.dto.Price;

import lombok.Getter;

@Getter
public class Movie {
    private long id;
    private String title;
    private double fixedPrice;

    private DiscountPolicy discountPolicy;
    private List<DiscountCondition> discountConditions;

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

    public boolean isDiscountable(Screening screening) {
        return discountConditions.stream()
            .anyMatch(c -> c.isDiscountable(screening));
    }
}
