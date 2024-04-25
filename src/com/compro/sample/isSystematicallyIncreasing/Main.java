package com.compro.sample.isSystematicallyIncreasing;

public class Main {
    static int isSystematicallyIncreasing(int[] a) {
        int end = a.length;
        int start = a.length;
        int n = a[a.length - 1];
        int count = 0;
        while (end > 0) {
            end = end - n;
            count++;
            n--;
        }

        n = a[a.length - 1];
        if (count != n) {
            return 0;
        }

        end = a.length;
        while (end > 0) {
            end = end - n;
            int j = n;
            for (int i = start - 1; i >= end; i--) {
                if (a[i] != j--) {
                    return 0;
                }
            }

            n--;
            start = end;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6}));
        System.out.println(isSystematicallyIncreasing(new int[]{1}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 3}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 3}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 1, 2}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 3, 1, 2, 1}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 3}));
    }
}
