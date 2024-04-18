package com.compro.sample.isDivisible;

public class Main {
    public static int isDivisible(int[] a, int divisor) {
        if (a.length < 1) return 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % divisor != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isDivisible(new int[]{3, 3, 6, 36}, 3));
        System.out.println(isDivisible(new int[]{4}, 2));
        System.out.println(isDivisible(new int[]{3, 4, 3, 6, 36}, 3));
        System.out.println(isDivisible(new int[]{6, 12, 24, 36}, 12));
        System.out.println(isDivisible(new int[]{}, 3));
    }
}
