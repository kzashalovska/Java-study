package org.example.lectures.lecture4;

public class    Stats<T extends Number> {
    private T[] num;

    double average(){
        double sum = 0;
        for (T t : num){
            sum+=t.doubleValue();
        }
        return sum/num.length;
    }
    boolean sameAver(Stats <?> stats){
        return average() == stats.average();
    }
    public T[] getNum() {
        return num;
    }

    public void setNum(T[] num) {
        this.num = num;
    }

    public Stats(T[] num) {
        this.num = num;
    }
}
