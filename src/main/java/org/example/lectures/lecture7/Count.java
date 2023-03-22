package org.example.lectures.lecture7;

public class Count {
    public static int counter = 0;

    public static void increment() {
        synchronized (Count.class) {
            counter++;
            System.out.println("counter = " + counter);
        }
    }
}
