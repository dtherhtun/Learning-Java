package com.compro.sample.pairwiseSum;

import java.util.Arrays;

public class Main {
    static int[] pairwiseSum(int[] a) {
        if (a.length == 0 || a.length % 2 != 0) return null;
        int[] result = new int[a.length / 2];
        int j = 0;

        for (int i = 0; i < a.length; i += 2, j++) {
            result[j] = a[i] + a[i + 1];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pairwiseSum(new int[]{2, 1, 18, -5})));
        System.out.println(Arrays.toString(pairwiseSum(new int[]{2, 1, 18, -5, -5, -15, 0, 0, 1, -1})));
        System.out.println(Arrays.toString(pairwiseSum(new int[]{2, 1, 18})));
        System.out.println(Arrays.toString(pairwiseSum(new int[]{})));
    }
}
