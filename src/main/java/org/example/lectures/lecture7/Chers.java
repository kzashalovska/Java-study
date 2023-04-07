package org.example.lectures.lecture7;

public class Chers {
        public synchronized void play(Player player){
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(10 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Play " + player.getName());
                this.notifyAll();
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
}
