package org.example.practice.practice5;

import java.io.Serializable;
import java.util.ArrayList;

public class Group implements Serializable {
    ArrayList<Student> studentsGroup;

    public Group(ArrayList<Student> studentsGroup) {
        this.studentsGroup = studentsGroup;
    }
}
