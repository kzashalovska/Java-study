package org.example.lectures.lecture7;

public class App3 {
    public static void main(String[] args) {
        Human human1 = new Human("Vasya", new Telephone(12345));
        Human human2 = new Human("Kolya", new Telephone(54321));
        human1.setFriend(human2);
        human2.setFriend(human1);
        human1.start();
        human2.start();

    }


}
