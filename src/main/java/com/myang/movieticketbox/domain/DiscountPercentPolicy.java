package com.myang.movieticketbox.domain;

public class DiscountPercentPolicy implements DiscountPolicy {
    @Override
    public double getDiscountAmount() {
        return 0;
    }
}
