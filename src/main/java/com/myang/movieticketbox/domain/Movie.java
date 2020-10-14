package com.myang.movieticketbox.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    private long id;

    private String title;
    private int price;
}
