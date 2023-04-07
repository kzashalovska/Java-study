package org.example.practice.practice6;

public class App1 {
    public static void main(String[] args) {
        Task1class task1class = new Task1class();
        task1class.start();
        Thread thread = new Thread(new Task1interface());
        thread.start();
    }
}
