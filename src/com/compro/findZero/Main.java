package com.compro.findZero;

public class Main {
    public static int arrayHasZero(int[] a) {
        for (int j : a) {
            if (j == 0) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(arrayHasZero(new int[]{3, 4, 5, 6, 6}));
        System.out.println(arrayHasZero(new int[]{3, 4, 0, 6, 6}));
    }
}
