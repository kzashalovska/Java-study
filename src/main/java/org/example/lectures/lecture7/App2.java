package org.example.lectures.lecture7;

public class App2 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            Count.increment();
            Count.increment();
            Count.increment();
        };

        Thread thread3 = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread3.start();
        thread1.start();
        thread2.start();
    }
}
