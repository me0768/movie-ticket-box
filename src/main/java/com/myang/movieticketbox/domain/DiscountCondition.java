package com.myang.movieticketbox.domain;

public interface DiscountCondition {
    boolean isDiscountable(Screening screening);
}
