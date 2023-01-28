package org.example.practice.practice1.task5;


import lombok.Data;

@Data
public class DateOfExam {
   private int semester;
   private int year;
    DateOfExam(int semester, int year) {
        this.semester =semester;
        this.year = year;
    }

}
