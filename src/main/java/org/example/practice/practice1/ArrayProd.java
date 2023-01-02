package org.example.practice.practice1;

public class ArrayProd {
    public static int arrProd = 1;
    public static int prod(int[] m) throws Exception{
        int i = 0;
        while (m.length > i) {
            arrProd *= m[i];
            i++;
        }
        return arrProd;
    }
}
