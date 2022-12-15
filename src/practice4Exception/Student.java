package practice4Exception;

//створив метод для створення елементу Студент у масиві. Необхідно додати перевірку схожості

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

import static practice4Exception.Group.readNumber;


public class Student {

    private static final byte MIN_NAME_LENGTH = 2;
    private static final byte MIN_AGE_STUDENTS = 16;
    private static final byte MAX_AGE_STUDENTS = 55;
    private static final double MIN_RATING_STUDENTS = 60;
    private static final double MAX_RATING_STUDENTS = 100;
    private String surname;
    private String name;
    private int age;
    private double aveRating;

    public Student() {
    }

    public static Student createStudent(int numberOfStudent) {
        Student student = new Student();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new UnClosedStream(System.in)))) {
            while (true) {
                try {
                    System.out.println("Input students" + numberOfStudent + " surname: ");
                    student.setSurname(br.readLine());
                    break;
                } catch (GroupNameException e) {
                    System.out.println(e.getMessage());
                }
            }
            while (true) {
                try {
                    System.out.println("Input students" + numberOfStudent + " name: ");
                    student.setName(br.readLine());
                    break;
                } catch (GroupNameException e) {
                    System.out.println(e.getMessage());
                }
            }
            while (true) {
                try {
                    student.setAge(readNumber(br, "Input age of student" + numberOfStudent + ": "));
                    break;
                } catch (AgeStudentsException e) {
                    System.out.println(e.getMessage());
                }
            }
            while (true) {
                try {
                    student.setAveRating(readNumber(br, "Input average rating of student"
                            + numberOfStudent + ": "));
                    break;
                } catch (RatingStudentsException e) {
                    System.out.println(e.getMessage());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return student;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws GroupNameException {
        if (surname.length() > MIN_NAME_LENGTH) {
            this.surname = surname;
        } else {
            throw new GroupNameException("Wrong surname length, use more than " + MIN_NAME_LENGTH);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws GroupNameException {
        if (name.length() > MIN_NAME_LENGTH) {
            this.name = name;
        } else {
            throw new GroupNameException("Wrong name length, use more than " + MIN_NAME_LENGTH);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeStudentsException {
        if (age >= MIN_AGE_STUDENTS & age <= MAX_AGE_STUDENTS) {
            this.age = age;
        } else {
            throw new AgeStudentsException("Not correctly quantity of students, please input integer between " +
                    MIN_AGE_STUDENTS + " and " + MAX_AGE_STUDENTS);
        }
    }

    public double getAveRating() {
        return aveRating;
    }

    public void setAveRating(double aveRating) throws RatingStudentsException {
        if (aveRating >= MIN_RATING_STUDENTS & age <= MAX_RATING_STUDENTS) {
            this.aveRating = aveRating;
        } else {
            throw new RatingStudentsException("Not correctly quantity of students, please input integer between " +
                    MIN_AGE_STUDENTS + " and " + MAX_AGE_STUDENTS);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.aveRating, aveRating) == 0 &&
                surname.equals(student.surname) && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, age, aveRating);
    }

    @Override
    public String toString() {
        return
                "Student = " + surname + " " + name + '\'' +
                        ", age = " + age +
                        ", aveRating = " + aveRating +
                        '}';
    }
}

