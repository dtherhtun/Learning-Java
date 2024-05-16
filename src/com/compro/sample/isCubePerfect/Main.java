package com.compro.sample.isCubePerfect;

public class Main {
    static boolean isCube(int n) {
        int i = 0;
        while (i <= n) {
            if (n == i * i * i) {
                return true;
            }
            i++;
        }
        return false;
    }

    static int isCubePerfect(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (!isCube(a[i] < 0 ? -a[i] : a[i])) {
                return 0;
            }
        }
        return 1;
    }

    static int IsCubePerfect(int[] a) {
        if (a.length == 0) return 1;
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] < 0 ? -a[i] : a[i];
            int j = 1;
            int cube = 0;
            while (cube < a[i]) {
                cube = j * j * j;
                j++;
            }
            if (cube != a[i]) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isCubePerfect(new int[]{1, 1, 1, 1}));
        System.out.println(isCubePerfect(new int[]{64}));
        System.out.println(isCubePerfect(new int[]{63}));
        System.out.println(isCubePerfect(new int[]{-1, 0, 1}));
        System.out.println(isCubePerfect(new int[]{}));
        System.out.println(isCubePerfect(new int[]{3, 7, 21, 36}));
        System.out.println("-------------");
        System.out.println(IsCubePerfect(new int[]{1, 1, 1, 1}));
        System.out.println(IsCubePerfect(new int[]{64}));
        System.out.println(IsCubePerfect(new int[]{63}));
        System.out.println(IsCubePerfect(new int[]{-1, 0, 1}));
        System.out.println(IsCubePerfect(new int[]{}));
        System.out.println(IsCubePerfect(new int[]{3, 7, 21, 36}));
    }
}
