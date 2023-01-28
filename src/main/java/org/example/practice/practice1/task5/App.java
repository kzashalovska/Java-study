package org.example.practice.practice1.task5;


import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws NameException {
        ArrayList<Exam> exams = new ArrayList<>(Arrays.asList(
                new Exam(74, "Finance", 1, 2021),
                new Exam(60, "English", 1, 2021),
                new Exam( 90, "Philosophy", 1,2021),
                new Exam(74, "Economics", 1,2021),
                new Exam("Mathematics",1, 2021),
                new Exam(60, "Finance", 2, 2021),
                new Exam(60, "English", 2, 2021),
                new Exam( 60, "Philosophy", 2,2021),
                new Exam(90, "Economics", 2,2021),
                new Exam(74,"Mathematics",2, 2021),
                new Exam( 60,"Finance", 1, 2022),
                new Exam( "English", 1, 2022),
                new Exam( 74, "Philosophy", 1,2022),
                new Exam(74, "Economics", 1,2022),
                new Exam(74,"Mathematics",1, 2022),
                new Exam( 60,"Finance", 2, 2022),
                new Exam(90, "English", 2, 2022),
                new Exam( 60, "Philosophy", 2,2022),
                new Exam(96, "Economics", 2,2022),
                new Exam("Mathematics",2, 2022)));

        Student student =  new Student("Denys", "Yevdokimov",
                new Group(1, "Financial"), exams);
        System.out.println(student);
    }
}
