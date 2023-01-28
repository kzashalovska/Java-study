package org.example.practice.practice1.task5;


import lombok.Data;
@Data

public class Group {

    private int course;
    private String faculty;
    public Group(int course, String faculty) {
        this.course = course;
        this.faculty = faculty;
    }
}
