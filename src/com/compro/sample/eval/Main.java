package com.compro.sample.eval;

public class Main {
    static double power(double base, int pow) {
        double result = 1;
        while (pow > 0) {
            result *= base;
            pow--;
        }
        return result;
    }

    static double eval(double x, int[] a) {
        double result = 0;
        for (int i = 0; i < a.length; i++) {
            result += (power(x, i) * a[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(eval(1.0, new int[]{0, 1, 2, 3, 4}));
        System.out.println(eval(3.0, new int[]{3, 2, 1}));
        System.out.println(eval(2.0, new int[]{3, -2, -1}));
        System.out.println(eval(-3.0, new int[]{3, 2, 1}));
        System.out.println(eval(2.0, new int[]{3, 2}));
        System.out.println(eval(2.0, new int[]{4, 0, 9}));
        System.out.println(eval(2.0, new int[]{10}));
        System.out.println(eval(10.0, new int[]{0, 1}));
    }
}
