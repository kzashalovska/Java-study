package org.example.practice.practice1;

public class ArraySum {
    int[] arraysNumerics;
    public static int arrSum = 0;

    public ArraySum(int[] o) {
        arraysNumerics = o;
    }

    public ArraySum() {
    }

    public static int sum(int[] a) throws Exception {
        arrSum = 0;
        int i = 0;

            while (a.length > i) {
                arrSum += a[i];
                i++;
            }

        return arrSum;
    }

    public int sum() throws Exception{
        arrSum = 0;
        for (int i = 0; i < arraysNumerics.length; i++) {
            arrSum += arraysNumerics[i];
        }
        return arrSum;
    }
}
