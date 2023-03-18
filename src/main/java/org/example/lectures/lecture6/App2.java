package org.example.lectures.lecture6;

import static org.example.lectures.lecture6.App1.deSerObj;

public class App2 {
    public static void main(String[] args) {
        Human human1 = deSerObj("Human");
        System.out.println(human1);
    }
}
