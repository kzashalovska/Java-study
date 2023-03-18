package org.example.lectures.lecture4;

import org.example.practice.practice1.task5.Group;
import org.example.practice.practice1.task5.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("Vasya", "25");
        System.out.println(pair.getFirst().charAt(2));
        System.out.println(pair.getSecond().charAt(1));

        Human<Integer, Character> human = new Human<>("Vasya", 25, 'M');
        Human<Double, Character> human1 = new Human<>("Masha", 37., 'F');
        Human<Integer, Sex> human2 = new Human<>("Masha", 37, Sex.FEMALE);

        List<Human<? extends Number, ?>> list1 = new ArrayList<>();
        list1.add(human);
        list1.add(human1);
        list1.add(human2);
        System.out.println(list1.get(1).getAge().doubleValue());
        human.printArray(new Integer[]{1, 2, 3});
        human.<Integer>increaseArray(new Integer[]{1, 2, 3});


        Node<Integer, String> node = new Node<>(1, "Sveta");

        List<Node<Integer, String>> list = new ArrayList<>();
        list.add(node);
        // no correctly
        Node<? extends Number, String> node1 = node;
        node1 = new Node<>(1., "Svetlana");
        //  node1 = new Node<>("Sc","Svetlana");

        Node node2 = new Node<>(23, new Student("Kolya", "Shokin", new Group(2, "Finance"),
                new ArrayList<>()));
        node2.getValue();

        //App.printArray(new Integer[]{1, 2, 3});
        List<Integer> numbers = Arrays.asList(new Integer[]{1, 2, 3});
        App.printArray(numbers);
        App.printArray(Arrays.asList(new Integer[]{1, 2, 3}));

        Stats<Integer> integerStats = new Stats<>(new Integer[]{1, 2, 3});
        Stats<Double> doubleStats = new Stats<>(new Double[]{1., 2., 3.});
        System.out.println(integerStats.sameAver(doubleStats));

        E<Integer, String> stringE = new E<>();
        //stringE.var;

        pair.init();
        for (String s : pair.init()) {
            System.out.println(s);
        }

    }

    public static void printArray(List<? extends Number> arg) {
        double sum = 0;

        for (Number o : arg) {
            System.out.println(o + "\t");
            sum += o.doubleValue();

        }
        System.out.println("sum = " + sum);
    }

}

class A {
    int i;
}

class B<T> extends A {
    T var;
}

class C<T> extends B<T> {

}

class D extends B<String> {

}

class E<K, V> extends B<V> {

}
