package com.compro.sample.isIsolated;

import java.util.HashSet;

public class Main {
    public static int isIsolated(long n) {
        if (n < 0 || n > 2097151) {
            return -1;
        }
        long square = n * n;
        long cube = square * n;
//        if (n * n * n < Long.MAX_VALUE|| n > 0) { n = 2097155
//            square = n * n;
//            cube = square * n;  // -9223332454379552741 (n * n * n)
//        } else {
//            return -1;
//        }
        System.out.println(square + " "+ cube);
        HashSet<Long> cubeSet = new HashSet<>();
        while (cube != 0) {
            cubeSet.add(cube%10);
            cube = cube / 10;
        }
        while (square != 0) {
            if (cubeSet.contains(square%10)) {
                return 0;
            }
            square = square /10;
        }

        return 1;
    }
    public static int isIsolatedPure(long n) {
        if (n < 0 || n > 2097151) {
            return -1;
        }
        long square = n * n;
        long cube = square * n;
        while (square != 0) {
            while (cube != 0) {
                if (square%10 == cube%10){
                    return 0;
                }
                cube = cube / 10;
            }
            square = square /10;
        }
        return 1;
    }

    public static void main(String[] args) {
//        System.out.println(isIsolated(2));
//        System.out.println(isIsolated(3));
//        System.out.println(isIsolated(8));
//        System.out.println(isIsolated(9));
//        System.out.println(isIsolated(14));
//        System.out.println(isIsolated(24));
//        System.out.println(isIsolated(28));
//        System.out.println(isIsolated(34));
//        System.out.println(isIsolated(58));
//        System.out.println(isIsolated(63));
        System.out.println(isIsolatedPure(2));
        System.out.println(isIsolatedPure(3));
        System.out.println(isIsolatedPure(8));
        System.out.println(isIsolatedPure(9));
        System.out.println(isIsolatedPure(14));
        System.out.println(isIsolatedPure(24));
        System.out.println(isIsolatedPure(28));
        System.out.println(isIsolatedPure(34));
        System.out.println(isIsolatedPure(58));
        System.out.println(isIsolatedPure(2097152));
    }
}
