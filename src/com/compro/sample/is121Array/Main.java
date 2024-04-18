package com.compro.sample.is121Array;

public class Main {
    public static int is121Array(int[] a) {
        if (a.length < 3) return 0;

        int mid = a.length / 2;

        for (int i = 0; i <= mid; i++) {
            if (a[i] != a[a.length - 1 - i] || a[0] == a[mid] || a[0] != 1 || a[a.length - 1] != 1 || a[mid] != 2) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1, 2, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));
    }
}
