package org.example.practice.practice3;

public class User implements GenericStorage{
    private String name;
    private String surname;
    private int age;
    private String login;
    private String password;
    private boolean administration;

    public User(String name, String surname, int age, String login, String password) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.login = login;
        this.password = password;
        this.administration = false;
    }
    public User() {
        this.administration = false;
    }
    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.administration = false;
    }
    public User(String name, String surname, int age, String login, String password, boolean administration) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.login = login;
        this.password = password;
        this.administration = administration;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
