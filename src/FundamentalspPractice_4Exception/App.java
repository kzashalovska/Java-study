package FundamentalspPractice_4Exception;


import java.util.Arrays;

import static FundamentalspPractice_4Exception.Group.createGroupInConsoleVal;
import static FundamentalspPractice_4Exception.Group.createGroupOfStudents;

public class App {

    public static void main(String[] args) {
        Group group1 = createGroupInConsoleVal();
        Student[] students = createGroupOfStudents();
        System.out.println(group1);
        for (Student student : students) {
            System.out.println(student);
        }
        Arrays.sort(students, new StudentComparator());
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
