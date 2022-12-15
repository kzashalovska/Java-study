package FundamentalsLecture_6;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(10);
        strings.add("0");
        strings.add("1");
        strings.add("3");
        System.out.println(strings);
        strings.add(2, "2");
        System.out.println(strings);
        strings.add(4, "6");
        System.out.println(strings);
        strings.set(4, "4");
        System.out.println(strings);
        System.out.println(strings.get(1));
        for (String s : strings) {
            System.out.println(s);
        }
        strings.remove(2);
        System.out.println(strings);
        strings.trimToSize();
        Integer x, y, z;
        x = 212;
        y = 212;
        z = Integer.valueOf(12);
        System.out.println(x == y);
        int i = 731248;
        String s = Integer.toBinaryString(i);
        System.out.println(s);
        int ii = Integer.parseInt(s, 2);
        System.out.println(ii);
    }
}
