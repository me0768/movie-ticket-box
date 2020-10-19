package com.myang.movieticketbox.dto;

import com.myang.movieticketbox.domain.Screening;

public class TicketResponse {
    private Screening screening;
    private int audiences;
    private double fixedPrice;
    private double totalPrice;

    public TicketResponse(Screening screening, int audiences, double fixedPrice, double totalPrice) {
        this.screening = screening;
        this.audiences = audiences;
        this.fixedPrice = fixedPrice;
        this.totalPrice = totalPrice;
    }
}
