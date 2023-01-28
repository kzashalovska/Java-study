package org.example.practice.practice3;

import java.sql.Date;
import java.sql.Time;

public class Session implements GenericStorage {
    private Film film;
    private Hall hall;
    private Date date;
    private Time time;


    public Session(Film film, Hall hall, Date date, Time time) {
        this.hall = hall;
        this.film = film;
        this.date = date;
        this.time = time;
    }
}
