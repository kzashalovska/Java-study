package org.example.lectures.lecture7;

public class Human extends Thread {
    private String name;
    private Telephone telephone;
    private Human friend;


    public Human(String name, Telephone telephone) {
        this.name = name;
        this.telephone = telephone;
    }


    @Override
    public void run() {
        getTelephone().makeCall(friend.getTelephone());
    }

    public Human getFriend() {
        return friend;
    }

    public void setFriend(Human friend) {
        this.friend = friend;
    }


    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }
}
