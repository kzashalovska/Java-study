package org.example.lectures.lecture7;

public class AutoRun implements Runnable{
    private Thread thread;
    public  AutoRun(){
        thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                thread.sleep(10);
                System.out.println(thread.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
