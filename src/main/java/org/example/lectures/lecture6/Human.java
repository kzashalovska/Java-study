package org.example.lectures.lecture6;

import java.io.Serializable;

public class Human implements Serializable {

    private String name;
    private int age;
    // не сериализуется поле
    private transient String password;

    public Human(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
