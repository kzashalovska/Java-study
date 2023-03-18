package org.example.lectures.lecture4;

import java.util.Arrays;

public class Pair<T> {
    private T first;
    private T second;
    private T[] array;


    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
        array = (T[]) new Object[5];
    }

    public T[] init(){
        array[1] = first;
        array[2] = second;
        for (T t:  array){
            System.out.println(t);
        }
        return array;
    }
    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
