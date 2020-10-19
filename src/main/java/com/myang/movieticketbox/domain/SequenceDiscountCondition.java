package com.myang.movieticketbox.domain;

public class SequenceDiscountCondition implements DiscountCondition {

    private int sequenceNum;

    @Override
    public boolean isDiscountable(Screening screening) {
        return screening.getSequenceNum() == sequenceNum;
    }
}
