package com.compro.sample.isCentered;

public class Main {
    static int isCentered(int[] a) {
        if (a.length % 2 == 0 || a[a.length / 2] % 2 != 1) {
            return 0;
        }
        int mid = a.length / 2;
        for (int i = 0; i < a.length; i++) {
            if (i != mid && a[i] <= a[mid]) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isCentered(new int[]{5, 3, 3, 4, 5}));
        System.out.println(isCentered(new int[]{3, 2, 1, 4, 1}));
        System.out.println(isCentered(new int[]{3, 2, 1, 1, 4, 6}));
        System.out.println(isCentered(new int[]{}));
        System.out.println(isCentered(new int[]{1}));
        System.out.println(isCentered(new int[]{3, 2, 1, 4, 5}));
    }
}
