package org.example.practice.practice6;

public class Task1class extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(500);
                System.out.println(getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
