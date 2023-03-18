package org.example.practice.practice4.textTask;

public class Count {
    int count;

    public Count() {
        this.count = 1;
    }
    public void upCount (){
        this.count ++;
    }

    @Override
    public String toString() {
        return "Count{" +
                "count=" + count +
                '}';
    }
    public Integer getInteger(){
        Integer counter;
        return counter = count;
    }
}
