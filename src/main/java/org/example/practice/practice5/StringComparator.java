package org.example.practice.practice5;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        Integer i1 = Integer.parseInt(o1);
        Integer i2 = Integer.parseInt(o2);
        return i1.compareTo(i2);
    }
}
