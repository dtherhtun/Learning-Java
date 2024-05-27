package com.compro.sample.fill;

import java.util.Arrays;

public class Main {
    static int[] fill(int[] a, int k, int n) {
        if (a.length == 0 || k < 1 || n < 1) return null;
        int[] result = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (j < k) {
                result[i] = a[j];
                j++;
            } else {
                j = 0;
                i--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fill(new int[]{1, 2, 3, 5, 9, 12, 2, 1}, 3, 10)));
        System.out.println(Arrays.toString(fill(new int[]{4, 2, 3, 12}, 1, 5)));
        System.out.println(Arrays.toString(fill(new int[]{2, 6, 9, 0, 3}, 0, 4)));
    }
}
