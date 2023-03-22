package org.example.practice.practice5;

import java.util.ArrayList;

import static org.example.practice.practice5.SerializationGroup.deSerObj;
import static org.example.practice.practice5.SerializationGroup.serObj;

public class App {
    public static void main(String[] args) throws InterruptedException {
        //String s = randomNumber(100, 10, 10000);
        //createFile("task5", "UTF-8", s);
        //sortFIleString("task5", "UTF-8", "newTask5", "windows-1251");
        //studentsWithRating("StudentRating.txt", "UTF-8", 90);
        //replaceWordInLine("koran.txt", "UTF-8", "koranSimpleCopy.txt", "UTF-8");
//        for (int i = 0; i < 100; i++) {
//            bufferedCharCopy("koran.txt", "UTF-8", "bufferedCharCopy.txt", "UTF-8");
//        }
//        Thread.sleep(1000);
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//
//        for (int i = 0; i < 100; i++) {
//            noBufferedCharCopy("koran.txt", "noBufferedCharCopy.txt");
//        }
//        Thread.sleep(1000);
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//
//        for (int i = 0; i < 100; i++) {
//            noBufferedByteCopy("koran.txt", "noBufferedByteCopy.txt");
//        }
//        Thread.sleep(1000);
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//
//        for (int i = 0; i < 100; i++) {
//            bufferedByteCopy("koran.txt", "bufferedByteCopy.txt");
//        }

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Evgen", "Kovalenko", 92));
        studentList.add(new Student("Denys", "Timoshuk", 82));
        studentList.add(new Student("Volodymyr", "Tatarov", 72));
        studentList.add(new Student("Anastasiya", "Pelishenko", 62));
        studentList.add(new Student("Rinat", "Talmaz", 73));
        studentList.add(new Student("Tetiana", "Levandovski", 83));
        studentList.add(new Student("Lyubov", "Kovalenko", 93));
        studentList.add(new Student("Karen", "Ogadzhanyan", 63));
        Group group = new Group(studentList);
        serObj(group, "serializableGroupObject.txt");
        Group newGroup = deSerObj("serializableGroupObject.txt");
        System.out.println(newGroup.studentsGroup.toString());
    }
}
