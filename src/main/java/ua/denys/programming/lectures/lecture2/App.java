package ua.denys.programming.lectures.lecture2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;
        System.out.println(day);
        Day.WEDNESDAY.setHoliday(true);
        System.out.println(day);
        System.out.println(Day.getByNumber(3));
        System.out.println(Day.valueOf("WEDNESDAY"));
        System.out.println(Day.WEDNESDAY.name());

        A a = new B();
        try {
            System.out.println(a.method());
        } catch (RuntimeException e) {
            e.getCause().printStackTrace();
        }
    }
}

class A {
    public String method() {
        return null;
    }
}

class B extends A {
    @Override
    public String method() {
        String s = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.in.close();
            System.out.println("Input:");
            s = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return s;
    }
}
