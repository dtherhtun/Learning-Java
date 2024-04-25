package com.compro.sample.largestDifferenceOfEvens;

public class Main {
    static int largestDifferenceOfEvens(int[] a) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
                if (a[i] < min) {
                    min = a[i];
                }
                if (a[i] > max) {
                    max = a[i];
                }
            }
        }

        return count < 2 ? -1 : max - min;
    }

    public static void main(String[] args) {
        System.out.println(largestDifferenceOfEvens(new int[]{-2, 3, 4, 9}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 3, 5, 9}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 18, 5, 7, 33}));
        System.out.println(largestDifferenceOfEvens(new int[]{2, 2, 2, 2}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}));
    }
}
