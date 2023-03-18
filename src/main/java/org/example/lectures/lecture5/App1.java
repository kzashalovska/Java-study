package org.example.lectures.lecture5;

import org.example.lectures.lecture4.Human;
import org.example.lectures.lecture4.Sex;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class App1 {
    public static void main(String[] args) {
        Map<String, Human> humanMap = new HashMap<>();
        System.out.println(humanMap.put("Vasya", new Human<>("Vasya", 24, Sex.MALE)));
        humanMap.put("Kolya", new Human<>("Kolya", 22, Sex.MALE));
        humanMap.put("Sveta", new Human<>("Sveta", 27, Sex.FEMALE));
        //Затирает предідущее
        System.out.println(humanMap.put("Sveta", new Human<>("Sveta", 29, Sex.FEMALE)));
        System.out.println(humanMap);
        // неработающий фор ич)
        for (Map.Entry<String, Human> human : humanMap.entrySet()) {
            System.out.println(human);
        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        humanMap.forEach((a, b) -> System.out.println(a + "=" + b));

        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("Hello");
        stringQueue.add("Buy");
        System.out.println(stringQueue.element());
        System.out.println(stringQueue.element());
        System.out.println(stringQueue.remove());
        System.out.println(stringQueue.element());

    }
}
