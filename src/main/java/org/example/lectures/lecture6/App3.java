package org.example.lectures.lecture6;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App3 {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();//претти делает читабельнім
        String s = gson.toJson(new Human("Vasya", 25, "asdafsf"));
        System.out.println(s);

        Human human = gson.fromJson(s, Human.class);
        System.out.println(human);
    }
}
