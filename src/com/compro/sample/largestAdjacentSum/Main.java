package com.compro.sample.largestAdjacentSum;

public class Main {
    public static int largestAdjacentSum(int[] a) {
        if (a.length < 2) return 0;
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < a.length - 1; i++) {
            if (result < a[i] + a[i + 1]) {
                result = a[i] + a[i + 1];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[]{1, 2, 3, 4}));
        System.out.println(largestAdjacentSum(new int[]{18, -12, 9, -10}));
        System.out.println(largestAdjacentSum(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(largestAdjacentSum(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1}));
    }
}
