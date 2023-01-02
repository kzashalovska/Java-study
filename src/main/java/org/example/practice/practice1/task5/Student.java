package org.example.practice.practice1.task5;

import lombok.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

@Data

public class Student {
    private String name;
    private String surname;
    private Group group;
    private ArrayList<Exam> exam;
    private byte MIN_NAME_LENGTH = 3;



    public Student(String name, String surname, Group group, ArrayList<Exam> exam) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.exam = exam;
    }

    protected static int searchMaxRating(String nameSubject){

        return 0;
    }

    protected static byte searchCountOfExam(int rating){
        return 0;
    }
    protected static double averageRatingOfStudent(){
        return 0;
    }

    public Student() {
    }

    public static Student createStudent() {
        Student student = new Student();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new UnClosedStream(System.in)))) {

            while (true) {
                try {
                    System.out.println("Input student`s name: ");
                    student.setName(br.readLine());
                    break;
                } catch (NameException e) {
                    e.getMessage();
                }
            }
            while (true) {
                try {
                    System.out.println("Input student`s surname: ");
                    student.setSurname(br.readLine());
                    break;
                } catch (IOException | NameException e) {
                    throw new RuntimeException(e);
                }
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
        return student;
    }

    public void setName(String name) throws NameException {
        if (name.length() > MIN_NAME_LENGTH) {
            this.name = name;
        }
        else {
            throw new NameException("Wrong name, please repeat input");
        }
    }

    public void setSurname(String surname) throws NameException {
        if (surname.length() > MIN_NAME_LENGTH) {
            this.surname = surname;
        }
        else {
            throw new NameException("Wrong surname, please repeat input");
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
