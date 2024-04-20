package com.compro.sample.doIntegerBasedRounding;

import java.util.Arrays;

public class Main {
    static void doIntegerBasedRounding(int[] a, int n) {
        if (a.length < 1 || n <= 0) return;

        float mid = ((float) n / 2);

//        for (int i = 0; i < a.length; i++) {
//            int j = n;
//            if (a[i] > n) {
//                while (j < a[i]) {
//                    j = j + n;
//                }
//                if (a[i] - (j - n) >= mid) {
//                    a[i] = j;
//                } else {
//                    a[i] = j - n;
//                }
//            } else if (a[i] >= mid) {
//                a[i] = n;
//            } else if (a[i] > 0) {
//                a[i] = 0;
//            }
//        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > n) {
                int j = n * (a[i] / n); // Find the largest multiple of n less than or equal to a[i]
                int remainder = a[i] % n; // Calculate the remainder
                if (remainder >= mid) {
                    a[i] = j + n; // If the remainder is greater than or equal to mid, round up to the next multiple of n
                } else {
                    a[i] = j; // Otherwise, round down to the current multiple of n
                }
            } else if (a[i] >= mid) {
                a[i] = n; // If a[i] is greater than or equal to mid and less than n, set it to n
            } else if (a[i] > 0) {
                a[i] = 0; // If a[i] is less than mid, set it to 0
            }
        }

//        int mid = n / 2;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] >= 0) {
//                a[i] = ((a[i] + mid) / n) * n;
//            }
//        }
    }

    public static void main(String[] args) {
        int[][] test = new int[][]{
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {-1, -2, -3, -4, -5},
                {-18, 1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {261, 10, 50, 342, 355, 650, 849},
                {261, 10, 50, 342, 355, 650, 849}};

        int[] n = new int[]{2, 3, -3, 3, 4, 5, 100, 10, 100};
        for (int i = 0; i < n.length; i++) {
            doIntegerBasedRounding(test[i], n[i]);
            System.out.println(Arrays.toString(test[i]));
        }
        System.out.println(10 * (42 / 10));
    }
}
