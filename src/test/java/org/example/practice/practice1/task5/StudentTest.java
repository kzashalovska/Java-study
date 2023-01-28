package org.example.practice.practice1.task5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTest {
    String nameExam = "Economics";
    String nameOfExam = "Mathematics";
    int semester = 2;
    int year = 2022;
    String nameOfExam1 = "Economics";
    int semester1 = 2;
    int year1 = 2022;
    String nameOfExam2 = "Biology";
    int semester2 = 2;
    int year2 = 2022;
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
    @Test
    public void searchMaxRatingTest() {

        int actual = student.searchMaxRating(nameExam);
        int expected = 96;
        assertEquals(actual,expected);
    }

    @Test
    public void searchCountOfExamTest() {
        int actual = student.searchCountOfExam(90);
        int expected = 3;
        assertEquals(actual,expected);
    }

    @Test
    public void averageRatingOfStudentTest() {
        double actual = student.averageRatingOfStudent(1,2021);
        double expected = 59.6;
        assertEquals(actual,expected,0.01);

    }

    @Test
    public void addRatingTest() {

        student.addRating(80, nameOfExam, semester,year);
        int actual = 0;
        for (Exam exam1 : exams){
            if(exam1.getNameOfExam() == nameOfExam && exam1.dateOfExam.getSemester() == semester &&
                    exam1.dateOfExam.getYear() == year){
                actual = exam1.getRating();
            }
        }
        int expected = 80;
        assertEquals(actual,expected);
    }

    @Test
    public void deleteRatingTest()  {
        student.deleteRating(nameOfExam1, semester1,year1);
        int actual = 0;
        for (Exam exam1 : exams){
            if(exam1.getNameOfExam() == nameOfExam1 && exam1.dateOfExam.getSemester() == semester1 &&
                    exam1.dateOfExam.getYear() == year1){
                actual = exam1.getRating();
            }
        }
        int expected = 0;
        assertEquals(actual,expected);
    }
    @Test(expected = NullPointerException.class)
    public void expDeleteRatingTest() {
        student.deleteRating(nameOfExam2, semester2, year2);
    }
}