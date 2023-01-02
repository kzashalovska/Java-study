package org.example.practice.practice1.task5;


import lombok.Data;
@Data

public class Group {

    private int course;
    private String faculty;
    private static byte MIN_COURSE = 1;
    private static byte MAX_COURSE = 4;



    public Group(int course, String faculty) {
        this.course = course;
        this.faculty = faculty;
    }


}
