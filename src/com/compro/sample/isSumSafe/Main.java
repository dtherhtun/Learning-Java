package com.compro.sample.isSumSafe;

public class Main {
    public static int isSumSafe(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        for (int i = 0; i < a.length; i++) {
            if (sum == a[i]) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSumSafe(new int[]{5, -5, 0}));
        System.out.println(isSumSafe(new int[]{5, -2, 1}));
    }
}
