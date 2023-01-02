package org.example.practice.practice1;

public class App {
    public static void main(String[] args) throws Exception {
        ArraySum sumCalculate = new ArraySum();
        int [] numerics= {1,2,3,4};
        int [] numerics1 = {1,2,3};
        System.out.println(sumCalculate.sum(numerics));
        ArraySum sumCalculate1 = new ArraySum(numerics1);
        System.out.println(sumCalculate1.sum());
        ArrayProd production = new ArrayProd();
        System.out.println(production.prod(numerics));
    }
}