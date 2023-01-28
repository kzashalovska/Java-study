package org.example.practice.practice1.task5;

import java.util.ArrayList;

public class Student {
    private static String name;
    private static String surname;
    private Group group;
    private static ArrayList<Exam> exam;
    private final byte MIN_NAME_LENGTH = 2;


    public Student(String name, String surname, Group group, ArrayList<Exam> exam) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.exam = exam;
    }

    protected static int searchMaxRating(String nameSubject) {
        int maxRating = 0;

        for (Exam exam1 : exam) {
            System.out.println(exam1);
            if (exam1.nameOfExam == nameSubject) {
                if (exam1.getRating() > maxRating) {
                    maxRating = exam1.getRating();
                }
            }
        }
        return maxRating;
    }

    protected static byte searchCountOfExam(int rating) {
        byte countOfExam = 0;
        for (Exam exam1 : exam) {
            if (rating == exam1.getRating()) {
                countOfExam++;
            }
        }
        return countOfExam;
    }

    protected static double averageRatingOfStudent(int numberSemester, int year) {
        int count = 0;
        double sumRating = 0;
        for (Exam exam1 : exam) {
            if (exam1.dateOfExam.getSemester() == numberSemester && exam1.dateOfExam.getYear() == year) {
                sumRating = sumRating + exam1.getRating();
                count++;
            }
        }
        return sumRating / count;
    }

    public void addRating(int rating, String nameOfExam, int semester, int year) {
        for (Exam exam1 : exam) {
            if (exam1.getNameOfExam() == nameOfExam && exam1.dateOfExam.getSemester() == semester &&
                    exam1.dateOfExam.getYear() == year) {
                exam1.setRating(rating);
            }
        }
    }

    public void deleteRating(String nameOfExam, int semester, int year) {
        int marker = 0;
        for (Exam exam1 : exam) {
            if (exam1.getNameOfExam() == nameOfExam && exam1.dateOfExam.getSemester() == semester &&
                    exam1.dateOfExam.getYear() == year) {
                exam1.setRating(0);
                marker++;
            }

        }
        if (marker == 0) {
            throw new NullPointerException("wow");
        }
    }


    public void setName(String name) throws NameException {
        if (name.length() > MIN_NAME_LENGTH) {
            this.name = name;
        } else {
            throw new NameException("Wrong name, please repeat input");
        }
    }

    public void setSurname(String surname) throws NameException {
        if (surname.length() > MIN_NAME_LENGTH) {
            this.surname = surname;
        } else {
            throw new NameException("Wrong surname, please repeat input");
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Group getGroup(Group group) {
        return this.group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", group=" + group +
                ", exam=" + exam +
                '}';
    }
}
