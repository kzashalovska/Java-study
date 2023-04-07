package org.example.lectures.lecture7;

public class App {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        AutoRun autoRun = new AutoRun();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
