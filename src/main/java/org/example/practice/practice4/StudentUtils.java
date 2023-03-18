package org.example.practice.practice4;

import java.util.*;

public class StudentUtils {

    public static Map<String,Student> createMapFromList(List<Student> students){
        String key;
        Map<String, Student> studentMap = new HashMap<>();
        for(Student k: students){
            key = k.getFirstName()+ k.getLastName();
            studentMap.put(key,k);
        }
        return studentMap;
    }
    public static void printStudents(List<Student> students, int course){

        for(Iterator<Student> studentIterator = students.iterator(); studentIterator.hasNext(); ){
            Student student = studentIterator.next();
            if (student.getCourse() == course){
                System.out.println(student);
            }
        }
    }
    static List<Student> sortStudent (List<Student> students){
        List <Student> newStudents = students;
        newStudents.sort(Comparator.comparing(a -> a.getFirstName()));
        return newStudents;
    }

}
