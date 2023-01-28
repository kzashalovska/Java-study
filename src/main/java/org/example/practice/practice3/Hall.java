package org.example.practice.practice3;

import java.sql.Time;
import java.util.Arrays;
import java.util.Date;

public class Hall implements GenericStorage {
    private int row;
    private int seat;
    private Date date;
    private Time workTime;
    private double priceCoefficient;
    protected boolean[][] numberSeats;

    public Hall(int row, int seat, double priceCoefficient) {
        this.row = row;
        this.seat = seat;
        this.priceCoefficient = priceCoefficient;
        numberSeats = new boolean[row][seat];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < seat; j++) {
                numberSeats[i][j] = true;
            }
        }
    }

    @Override
    public String toString() {
        return "Hall{" +
                "row=" + row +
                ", seat=" + seat +
                ", numberSeats=" + Arrays.toString(numberSeats) +
                '}';
    }
}
