package org.example.practice.practice1.task5;

import lombok.Data;


public class Exam {
    public String nameOfExam;
    private int rating;
    public DateOfExam dateOfExam;

    Exam(int rating, String nameOfExam, int semester, int year){
        this.rating = rating;
        this.nameOfExam = nameOfExam;
        this.dateOfExam = new DateOfExam(semester, year);
    }


    public Exam(String nameOfExam, int semester, int year) {
        this.nameOfExam = nameOfExam;
        this.dateOfExam = new DateOfExam(semester, year);
    }

    public String getNameOfExam() {
        return nameOfExam;
    }

    public void setNameOfExam(String nameOfExam) {
        this.nameOfExam = nameOfExam;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public DateOfExam getDateOfExam() {
        return dateOfExam;
    }

    public void setDateOfExam(DateOfExam dateOfExam) {
        this.dateOfExam = dateOfExam;
    }
}



