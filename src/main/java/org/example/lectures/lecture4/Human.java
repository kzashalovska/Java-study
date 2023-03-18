package org.example.lectures.lecture4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class Human<T, S> {

    private String name;
    private T age;
    private S sex;

    public <V> void printArray(V[] objects) {
        for (V v : objects) {
            System.out.println(v);
        }
    }

    public <V extends Integer> void increaseArray(V[] objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].doubleValue() + 1);
        }

    }
}
