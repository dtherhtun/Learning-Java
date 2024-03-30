package com.compro.sample.matches;

public class Main {
    public static int matches(int[]a , int[] p) {
        if (a.length < 1 || p.length < 1) return 0;
//        int pSum = 0;
//        for (int i = 0; i < p.length; i++) {
//            if (p[i] < 0) {
//                pSum += p[i] * -1; // Math.abs()
//            } else {
//                pSum += p[i];
//            }
//        }
//        if (pSum != a.length) return 0;

        int index = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < (p[i] < 0 ? p[i] * -1 : p[i]); j++) {
                if ((a[index] < 0 && p[i] > 0) || (a[index] > 0 && p[i] < 0)) {
                    return 0;
                }
                index++;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{3, -2, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{4, -1, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{2, -3, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{8}));
        System.out.println(matches(new int[]{1, 2, 3, 4 , -5, 2, 3, 18}, new int[]{4, -1, 3}));
    }
}
