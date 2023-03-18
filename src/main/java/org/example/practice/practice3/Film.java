package org.example.practice.practice3;

import javax.swing.*;
import java.sql.Time;

public class Film implements GenericStorage {
    protected String filmName;
    private ImageIcon iconFilms;
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

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    @Override
    public String toString() {
        return filmName;
    }
}
