package org.example.lectures.lecture7;

public class Telephone {
    private int number;

    public Telephone(int number) {
        this.number = number;
    }

    public synchronized void makeCall(Telephone telephone){
        try {
            Thread.sleep(1 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        telephone.resCall(this);
    }
    private synchronized void resCall(Telephone telephone){
        System.out.println("Call from " + telephone);
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "number=" + number +
                '}';
    }
}
