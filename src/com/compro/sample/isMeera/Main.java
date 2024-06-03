package com.compro.sample.isMeera;

public class Main {
    static int isMeera(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j] * 2) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMeera(new int[]{3, 5, -2}));
        System.out.println(isMeera(new int[]{8, 3, 4}));
    }
}
