package com.compro.sample.isMeera4;

public class Main {
    static int isMeera(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > i) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMeera(new int[]{-4, 0, 1, 0, 2}));
        System.out.println(isMeera(new int[]{-1, 0, 0, 8, 0}));
    }
}
