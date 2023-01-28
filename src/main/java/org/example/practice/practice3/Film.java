package org.example.practice.practice3;

import java.sql.Time;

public class Film implements GenericStorage {
    protected String filmName;
    private Time time;
    private String directorName;
    public Session[] session;
    boolean premiere;
    private int minAge;
    public Film(String filmName, int hour, int minute, int second, String directorName, boolean premiere, int minAge) {
        this.filmName = filmName;
        this.time = new Time(hour, minute, second);
        this.directorName = directorName;
        this.premiere = premiere;
        this.minAge = minAge;
    }
}
