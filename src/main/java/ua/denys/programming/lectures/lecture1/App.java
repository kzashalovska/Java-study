package ua.denys.programming.lectures.lecture1;

import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("ua.denys.programming.lectures.lecture1.Human");
        Human human = new Human("Vasya", 25);
        System.out.println(human);
        System.out.println(Shape.createColor());
        Circle.Point point = new Circle().new Point(2,2);
        System.out.println(point);

        String [] strings = {"Hello", "World", "23", "Vasya"};

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings, (a,b) -> a.compareTo(b));
        System.out.println(Arrays.toString(strings));
    }
}
