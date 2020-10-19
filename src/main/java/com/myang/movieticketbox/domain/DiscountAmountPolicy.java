package com.myang.movieticketbox.domain;

public class DiscountAmountPolicy implements DiscountPolicy {
    @Override
    public double getDiscountAmount() {
        return 0;
    }
}
