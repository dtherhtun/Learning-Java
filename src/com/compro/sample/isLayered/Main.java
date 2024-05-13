package com.compro.sample.isLayered;

public class Main {
    static int isLayered(int[] a) {
        if (a.length < 2) return 0;
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return 0;
            }
            if (a[i] == a[i + 1]) {
                count++;
            } else if (i + 1 == a.length - 1 && a[i - 1] != a[i - 2]) {
                return 0;
            } else {
                if (count < 1) {
                    return 0;
                }
                count = 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isLayered(new int[]{1, 1, 2, 2, 2, 3, 3}));
        System.out.println(isLayered(new int[]{3, 3, 3, 3, 3, 3, 3}));
        System.out.println(isLayered(new int[]{1, 2, 2, 2, 3, 3}));
        System.out.println(isLayered(new int[]{2, 2, 2, 3, 3, 1, 1}));
        System.out.println(isLayered(new int[]{2}));
        System.out.println(isLayered(new int[]{}));
        System.out.println(isLayered(new int[]{1, 1, 2, 2, 2, 3, 3, 4}));
    }
}
