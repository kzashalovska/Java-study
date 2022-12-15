package lecture5;

import java.util.ArrayList;

public class Lecture {
    public static long count = 0;
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(fibonachy2(10));
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(count);
    }
    public static int fibonachy2(int number){
        int count = 2;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        if (number >2) {
            while (number != count-1){
                list.add(count, list.get(count - 1) + list.get(count - 2));
                count++;
            }
        }
        return list.get(count);
    }
    public static int fibonachy(int number) {
        count++;
        if (number == 0)
            return 0;
        if (number == 1)
            return 1;
        return fibonachy(number - 1) + fibonachy(number - 2);
    }

}
