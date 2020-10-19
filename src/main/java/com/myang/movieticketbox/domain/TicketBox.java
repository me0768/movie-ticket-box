package com.myang.movieticketbox.domain;

import com.myang.movieticketbox.dto.Price;
import com.myang.movieticketbox.dto.TicketResponse;

public class TicketBox {

    public TicketResponse sell(Screening screening, int audiences) {
        Price price = screening.calculatePrice();

        double discountedPrice = price.getDiscountedPrice();
        double fixedPrice = price.getFixedPrice();
        double totalPrice = discountedPrice * audiences;
        return new TicketResponse(screening, audiences, fixedPrice, totalPrice);
    }
}
