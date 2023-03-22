package org.example.lectures.lecture7;

public class App1 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    return;
                }
            }
            System.out.println("BOOM!");
        });
        thread.setDaemon(true );
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        try {
            thread.join(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         thread.interrupt();

    }
}
