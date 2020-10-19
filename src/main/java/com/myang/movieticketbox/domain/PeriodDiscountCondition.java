package com.myang.movieticketbox.domain;

import java.time.DayOfWeek;

public class PeriodDiscountCondition implements DiscountCondition {

    private DayOfWeek dayOfWeek;
    private int timeStart; // 0 to 23
    private int timeEnd; // 0 to 23

    @Override
    public boolean isDiscountable(Screening screening) {
        return screening.getStartAt().getDayOfWeek().equals(dayOfWeek) &&
            screening.getStartAt().getHour() >= timeStart &&
            screening.getStartAt().getHour() <= timeEnd;
    }
}
