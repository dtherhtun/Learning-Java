package com.compro.sample.isDaphne2;

public class Main {
    static int isDaphne(int[] a) {
        if (a.length == 0) return 0;
        boolean oddFlag = a[a.length / 2] % 2 == 1;

        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] % 2 != a[a.length - 1 - i] % 2) {
                return 0;
            }
            if (a[i] % 2 == 1) {
                oddFlag = true;
            }
        }
        return oddFlag ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isDaphne(new int[]{4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6}));
        System.out.println(isDaphne(new int[]{2, 4, 6, 8, 6}));
        System.out.println(isDaphne(new int[]{2, 8, 7, 10, -4, 6}));
        System.out.println(isDaphne(new int[]{1}));
        System.out.println(isDaphne(new int[]{}));
    }
}
