package com.compro.sample.isDual;

public class Main {
    static int isDual(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    count++;
                }
            }
            if (count != 1) {
                return 0;
            }
        }
        return 1;
    }

    static int IsDual(int[] a) {
        if (a.length == 0 || a.length % 2 != 0) return 0;
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
        return count == a.length / 2 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isDual(new int[]{1, 2, 1, 3, 3, 2}));
        System.out.println(isDual(new int[]{2, 5, 2, 5, 5}));
        System.out.println(isDual(new int[]{3, 1, 1, 2, 2}));
        System.out.println(IsDual(new int[]{1, 2, 1, 3, 3, 2}));
        System.out.println(IsDual(new int[]{2, 5, 2, 5, 5}));
    }
}
