package org.example.lectures.lecture5;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("0");
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        stringList.add("5");
        System.out.println(stringList);

        for (Iterator<String> stringIterator = stringList.iterator(); stringIterator.hasNext(); ) {
            String s = stringIterator.next();
            if (s.equals("3")) {
                stringIterator.remove();
            } else {
                System.out.println(s);
            }

        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (String s : stringList) {
            if (s.equals("1")) {
                //stringList.remove(s);
            } else {
                System.out.println(s);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        stringList = new LinkedList<>(stringList);
        stringList.add("6");
        System.out.println(stringList);
//        Collections.sort(stringList, (a,b) -> b.compareTo(a));
        // тоже самое, переворачивает
        //Collections.sort(stringList, Comparator.reverseOrder());
        System.out.println(stringList);

        System.out.println(Collections.binarySearch(stringList, "2"));
        // Если раскоменнтить один из кодов вище
        //System.out.println(Collections.binarySearch(stringList, "2",Comparator.reverseOrder()));

        String [] strings = {"0", "1", "2", "3", "4", "5"};
        List<String> list = Arrays.asList(strings);
        strings[2] = "7";
        System.out.println(list);
        System.out.println(Collections.max(list));
        //не добавит елемент
        //list.add("8");
        list.set(1,"8");
        System.out.println(Arrays.toString(strings));

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        stringList.add("2");
        stringList.add("3");
        stringList.add("3");
        stringList.add("3");
        stringList.add("16");
        System.out.println(stringList);
        Set<String> stringSet = new HashSet<>(stringList);
        //Сохранит порядок
        //Set<String> stringSet = new LinkedHashSet<>(stringList);
        System.out.println(stringSet);

        System.out.println("2".hashCode() & 15);
        System.out.println("0".hashCode() & 15);
        System.out.println("0".hashCode());


    }
}
