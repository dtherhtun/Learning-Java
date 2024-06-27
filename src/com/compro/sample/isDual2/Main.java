package com.compro.sample.isDual2;

public class Main {
    static int isDual(int[] a) {
        if (a.length % 2 != 0) return 0;
        int prevSum = 0;
        for (int i = 0; i < a.length; i += 2) {
            if (prevSum != a[i] + a[i + 1] && i != 0) {
                return 0;
            }
            prevSum = a[i] + a[i + 1];

        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isDual(new int[]{1, 2, 3, 0}));
        System.out.println(isDual(new int[]{1, 2, 2, 1, 3, 0}));
        System.out.println(isDual(new int[]{1, 1, 2, 2}));
        System.out.println(isDual(new int[]{1, 2, 1}));
        System.out.println(isDual(new int[]{}));
    }
}
