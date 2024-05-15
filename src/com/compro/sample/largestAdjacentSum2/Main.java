package com.compro.sample.largestAdjacentSum2;

public class Main {
    static int largestAdjacentSum(int[] a) {
        if (a.length < 2) return 0;
        int max = Integer.MIN_VALUE;
        for (int j = 1, i = 0; i < a.length - 1; i++, j++) {
            if (max < a[i] + a[j]) {
                max = a[i] + a[j];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[]{1, 2, 3, 4}));
        System.out.println(largestAdjacentSum(new int[]{18, -12, 9, -10}));
        System.out.println(largestAdjacentSum(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(largestAdjacentSum(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1}));
    }
}
