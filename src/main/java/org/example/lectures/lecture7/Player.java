package org.example.lectures.lecture7;

public class Player implements Runnable{
    private String name;
    private Chers chers;

    public Player(String name, Chers chers) {
        this.name = name;
        this.chers = chers;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            chers.play(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
