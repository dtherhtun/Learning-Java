package com.compro.sample.Inertial;

public class Main {
    public static int isInertial(int[] a) {
        if (a.length < 2) return 0;
        int max = Integer.MIN_VALUE;
        int oddMin = Integer.MAX_VALUE;
        int oddCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                if (max < a[i]) {
                    max = a[i];
                }
            } else {
                if (oddMin > a[i]) {
                    oddMin = a[i];
                    oddCount++;
                }
            }
        }

        if (oddCount < 1 || oddMin > max) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {
            if (oddMin < a[i] && a[i] != max) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isInertial(new int[]{1}));
        System.out.println(isInertial(new int[]{2}));
        System.out.println(isInertial(new int[]{1, 2, 3, 4}));
        System.out.println(isInertial(new int[]{1, 1, 1, 1, 1, 1, 2}));
        System.out.println(isInertial(new int[]{2, 12, 4, 6, 8, 11}));
        System.out.println(isInertial(new int[]{2, 12, 12, 4, 6, 8, 11}));
        System.out.println(isInertial(new int[]{-2, -4, -6, -8, -11}));
        System.out.println(isInertial(new int[]{2, 3, 5, 7}));
        System.out.println(isInertial(new int[]{2, 4, 6, 8, 10}));
    }
}
