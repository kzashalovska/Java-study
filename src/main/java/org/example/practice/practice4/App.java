package org.example.practice.practice4;

import java.util.ArrayList;
import java.util.List;

import static org.example.practice.practice4.StudentUtils.*;

public class App {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Evgen", "Kovalenko", 2));
        studentList.add(new Student("Denys", "Timoshuk", 2));
        studentList.add(new Student("Volodymyr", "Tatarov", 2));
        studentList.add(new Student("Anastasiya", "Pelishenko", 2));
        studentList.add(new Student("Rinat", "Talmaz", 3));
        studentList.add(new Student("Tetiana", "Levandovski", 3));
        studentList.add(new Student("Lyubov", "Kovalenko", 3));
        studentList.add(new Student("Karen", "Ogadzhanyan", 3));

        System.out.println(createMapFromList(studentList));
        printStudents(studentList,3);
        System.out.println(sortStudent(studentList));
    }
}
