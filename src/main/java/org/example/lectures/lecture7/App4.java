package org.example.lectures.lecture7;

public class App4 {
    public static void main(String[] args) {
        Chers chers = new Chers();
        Player player1 = new Player("Vasya", chers);
        Player player2 = new Player("Kolya", chers);
        new Thread(player1).start();
        new Thread(player2).start();
    }
}
