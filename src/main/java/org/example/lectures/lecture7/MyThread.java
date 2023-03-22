package org.example.lectures.lecture7;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(10);
                System.out.println(getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
