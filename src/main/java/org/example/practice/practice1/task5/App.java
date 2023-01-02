package org.example.practice.practice1.task5;


import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Student student = new Student("Fare", "Istanbul", new Group(1, "Financial"),
                new ArrayList<Exam>(5));
        System.out.println(student);

    }
}
