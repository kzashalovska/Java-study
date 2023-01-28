package org.example.practice.practice3;

import javax.swing.*;
import java.util.ArrayList;



public class App {


    public static void main(String[] args) {
        ArrayList<User> usersArrayList = new ArrayList<>();
        usersArrayList.add(new User("Mykola", " Shokin", 31, "shokk22", "qwerty1234"));
        usersArrayList.add(new User("Tetiana", "Yevdokimova", 26, "haie2", "99999999"));
        usersArrayList.add(new User("Denys", "Yevdokimova", 29, "Yeye", "00000000",
                                    true));
        usersArrayList.add(new User("Ivan", "Shokin", 6, "shoki", "12345678"));
        usersArrayList.add(new User());
        usersArrayList.add(new User("Mykyta", "Pelishenko", 29, "quasar" , "pilipili"));
        System.out.println(usersArrayList.get(5));

        Hall hallRed = new Hall(12,15, 1 );
        Hall hallBlue = new Hall(13,27,1);
        Hall hall3D = new Hall(25,55,1.2);
        Hall vipHall = new Hall(8,12, 1.5);

        
        Film film1 = new Film("Terminator", 1,30,45,"James Cameron",
                false, 16);
        Film film2 = new Film("Ring Lord", 2,20,0,"Peter Jackson",
                false, 12);
        Film film3 = new Film("Titanic", 2,5,0,"James Cameron",
                false, 12);
        Film film4 = new Film("Avatar-2", 2,45,0,"James Cameron",
                true, 5);
        Film film5 = new Film("The Lion King", 1,30,0,"Roger Allers",
                false, 3);
    }
}
