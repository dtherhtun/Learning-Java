package com.compro.sample.hasNValues;

public class Main {
    static int hasNValues(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    break;
                }
            }
            if (i == j) {
                count++;
            }
        }
        return count == n ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 2));
        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 8, 1, 3, 3}, 3));
        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 3));
        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 2));
        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 20));
    }
}
