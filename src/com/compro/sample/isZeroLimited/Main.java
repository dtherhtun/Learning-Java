package com.compro.sample.isZeroLimited;

public class Main {
    static int isZeroLimited(int[] a) {
        int nonZeroCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < a.length; i++) {
            if ((3 * i) + 1 < a.length && a[(3 * i) + 1] == 0) {
                zeroCount++;
            }
            if (a[i] != 0) {
                nonZeroCount++;
            }
        }

        return zeroCount + nonZeroCount == a.length ? 1 : 0;
    }

    static int isZeroLimitedKnight(int[] a) {
        for (int i = 0, k = 1; i < a.length; i++) {
            if (i == k) {
                if (a[i] != 0) return 0;
                k += 3;
            } else {
                if (a[i] == 0) return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isZeroLimitedKnight(new int[]{0, 0, 0, 0, 0}));
        System.out.println(isZeroLimitedKnight(new int[]{1, 0}));
        System.out.println(isZeroLimitedKnight(new int[]{0, 1}));
        System.out.println(isZeroLimitedKnight(new int[]{5}));
        System.out.println(isZeroLimitedKnight(new int[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0}));
        System.out.println(isZeroLimitedKnight(new int[]{}));
    }
}
