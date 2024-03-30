package com.compro.sample.isLegalNumber;

public class Main {
    public static int isLegalNumber(int[] a, int base) {
        if (a.length < 1) return 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > base) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isLegalNumber(new int[]{3, 2, 1}, 4));
        System.out.println(isLegalNumber(new int[]{3, 7, 1}, 6));
    }
}
