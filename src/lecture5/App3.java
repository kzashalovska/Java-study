package lecture5;

import java.util.Arrays;

public class App3 {
    public static void main(String[] args) {
        int[] ints = new int [5];
        System.out.println(ints);
        System.out.println(Arrays.toString(ints));
        ints [2] = 5;
        System.out.println(Arrays.toString(ints));
        System.out.println((ints[0]));

        int [] ints1 = {2,4,2,5,6,67,82,5};
        System.out.println(Arrays.toString(ints1));
        int[]ints2;
        ints2 = new int [] {2,4,65,3,5,5,3};
        System.out.println(Arrays.toString(ints2));
        System.out.println(Arrays.toString(args));

        int [][] ints3 = new int[3][5];
        System.out.println(Arrays.deepToString(ints3));
        System.out.println(ints3[1][2]);
        int [][] ints4 = {{1,2,3},{4,5},{},null,{6,7,8,9}};
        System.out.println(Arrays.deepToString(ints4));
        ints4[1][1] = 10;
        System.out.println(Arrays.deepToString(ints4));
        ints4 [3] = new int []{11,12,13};
        System.out.println(Arrays.deepToString(ints4));

        for (int[] ints5 : ints4) {
            for (int i : ints5) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
