package org.example.practice.practice5;

import java.io.Serializable;

public class Student implements Serializable {
    String name;
    String surname;
    int aveRating;

    public Student(String name, String surname, int aveRating) {
        this.name = name;
        this.surname = surname;
        this.aveRating = aveRating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", aveRating=" + aveRating +
                '}';
    }
}
