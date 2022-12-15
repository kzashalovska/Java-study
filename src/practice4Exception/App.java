package practice4Exception;


import java.util.Arrays;

import static practice4Exception.Group.createGroupInConsoleVal;
import static practice4Exception.Group.createGroupOfStudents;

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
